plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.bootstrap"
        minSdk = (findProperty("android.minSdk") as String).toInt()
        targetSdk = (findProperty("android.targetSdk") as String).toInt()
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        buildConfigField("String", "JOKES_API_URL", "\"https://v2.jokeapi.dev/\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                file("proguard-rules.pro")
            )
        }
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    packagingOptions {
        resources.excludes.add("META-INF/*")
    }
}

configurations {
    all {
        exclude( group = "org.json", module = "json")
    }
}

kapt {
    correctErrorTypes = true
}

hilt {
    enableAggregatingTask = true
}

dependencies {

    implementation("androidx.activity:activity-compose:${ver("ComposeActivity")}")
    implementation("androidx.activity:activity-ktx:${ver("ActivityKtx")}")
    implementation("androidx.appcompat:appcompat:${ver("Appcompat")}")
    implementation("androidx.compose.foundation:foundation:${ver("ComposeFoundation")}")
    implementation("androidx.compose.material:material:${ver("ComposeMaterial")}")
    implementation("androidx.compose.material:material-icons-extended:${ver("ComposeMaterial")}")
    implementation("androidx.compose.ui:ui-tooling-preview:${ver("ComposeUi")}")
    implementation("androidx.compose.ui:ui-tooling:${ver("ComposeUi")}")
    implementation("androidx.compose.ui:ui:${ver("ComposeUi")}")
    implementation("androidx.core:core-ktx:${ver("CoreKtx")}")
    implementation("androidx.hilt:hilt-navigation-compose:${ver("a6xHiltNavigationCompose")}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:${ver("ComposeLifecycleViewModel")}")
    implementation("com.google.accompanist:accompanist-pager:${ver("accompanistPager")}")
    implementation("com.google.accompanist:accompanist-pager-indicators:${ver("accompanistPager")}")
    implementation("com.google.android.material:material:${ver("material")}")
    implementation("com.google.code.gson:gson:${ver("gson")}")
    implementation(platform("com.squareup.okhttp3:okhttp-bom:${ver("okhttp")}"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")
    implementation("com.squareup.retrofit2:converter-gson:${ver("retrofit2")}")
    implementation("com.squareup.retrofit2:retrofit:${ver("retrofit2")}")
    implementation("com.google.dagger:hilt-android:${ver("daggerHilt")}")

    debugImplementation("androidx.compose.ui:ui-tooling:${ver("ComposeUi")}")

    testImplementation("junit:junit:${ver("junit")}")

    androidTestImplementation("androidx.test.ext:junit:${ver("TestJunit")}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${ver("TestEspressoCore")}") {
        exclude("com.android.support", "support-annotations")
    }
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${ver("ComposeJunit4")}")

    kapt("com.google.dagger:hilt-android-compiler:${ver("daggerHilt")}")
}

fun ver(prop: String): Any {
    return findProperty(prop)
        ?: findProperty("ver.${prop}")
        ?: findProperty("ver.a6x${prop}")
        ?: throw StopExecutionException("${prop} not in gradle.properties")
}