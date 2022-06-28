package app.ui.main

import androidx.compose.runtime.Composable
import app.R
import app.domain.model.ϾSoupϿCategory

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var title: Int, var screen: ComposableFun) {
    object ϾCreamyϿ : TabItem(R.string.category_ϾcreamyϿ, { ϾSoupϿListScreen(ϾSoupϿCategory.ϾcreamyϿ) })
    object ϾWateryϿ : TabItem(R.string.category_ϾwateryϿ, { ϾSoupϿListScreen(ϾSoupϿCategory.ϾwateryϿ) })
}
