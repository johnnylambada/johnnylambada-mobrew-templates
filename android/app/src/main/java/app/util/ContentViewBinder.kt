package app.util

import android.app.Activity
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import kotlin.reflect.KProperty

/**
 * Lazily inflate a data binding layout, call [Activity.setContentView] and return the binding.
 */
class ContentViewBinder<in R : Activity, out T : ViewDataBinding>(@LayoutRes private val layout: Int) {
    private var binding: T? = null
    operator fun getValue(activity: R, property: KProperty<*>): T {
        if (binding == null) {
            binding = DataBindingUtil.setContentView(activity, layout)
        }
        return binding!!
    }
}
fun <R : Activity, T : ViewDataBinding> contentView(@LayoutRes layout: Int): ContentViewBinder<R, T> = ContentViewBinder(layout)
