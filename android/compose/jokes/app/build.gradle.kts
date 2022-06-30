plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.bootstrap"
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        jvmTarget = "1.8"
    }
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
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:${ver("ComposeLifecycleViewModel")}")
    implementation("com.google.accompanist:accompanist-pager:${ver("accompanistPager")}")
    implementation("com.google.accompanist:accompanist-pager-indicators:${ver("accompanistPager")}")
    implementation("com.google.android.material:material:${ver("material")}")
    implementation("com.google.code.gson:gson:${ver("gson")}")
    implementation("com.squareup.retrofit2:converter-gson:${ver("retrofit2")}")
    implementation("com.squareup.retrofit2:retrofit:${ver("retrofit2")}")

    debugImplementation("androidx.compose.ui:ui-tooling:${ver("ComposeUi")}")

    testImplementation("junit:junit:${ver("junit")}")

    androidTestImplementation("androidx.test.ext:junit:${ver("TestJunit")}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${ver("TestEspressoCore")}") {
        exclude("com.android.support", "support-annotations")
    }
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${ver("ComposeJunit4")}")
}

fun ver(prop: String): Any {
    return findProperty(prop)
        ?: findProperty("ver.${prop}")
        ?: findProperty("ver.a6x${prop}")
        ?: throw StopExecutionException("${prop} not in gradle.properties")
}