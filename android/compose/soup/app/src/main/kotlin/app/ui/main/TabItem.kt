package app.ui.main

import androidx.compose.runtime.Composable
import app.R
import app.domain.model.SoupCategory

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var title: Int, var screen: ComposableFun) {
    object Creamy : TabItem(R.string.category_creamy, { SoupListScreen(SoupCategory.creamy) })
    object Watery : TabItem(R.string.category_watery, { SoupListScreen(SoupCategory.watery) })
}