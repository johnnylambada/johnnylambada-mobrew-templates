package app

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import app.data.Winery
import app.databinding.ActivityRvRowsBinding
import app.databinding.RowRvRowsImageBinding
import app.databinding.RowRvRowsTextBinding
import app.util.contentView
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.ColorFilterTransformation
import kotlin.streams.toList

class RvRowsActivity : AppCompatActivity() {
    private val binding by contentView<RvRowsActivity, ActivityRvRowsBinding>(R.layout.activity_rv_rows)

    sealed class Item(val winery: Winery) {
        class Image(w: Winery ): Item(w)
        class Text(w: Winery ): Item(w)
    }

    private val adapter by lazy {
        val picasso = Picasso.get()
        abstract class UpdatableViewHolder(view: View) : RecyclerView.ViewHolder(view) { abstract fun update(item: Item) }
        class ImageViewHolder(view: View) : UpdatableViewHolder(view) {
            val binding = DataBindingUtil.bind<RowRvRowsImageBinding>(view)!!
            override fun update(item: Item) {
                val winery = item.winery
                with(binding) {
                    title.text = winery.name
                    subtitle.text = winery.phone
                    winery.logo?.let {
                        if (it.startsWith("http"))
                            picasso.load(it).transform(ColorFilterTransformation(0x70000000)).into(image)
                    }
                }
            }
        }
        class TextViewHolder(view: View) : UpdatableViewHolder(view) {
            val binding = DataBindingUtil.bind<RowRvRowsTextBinding>(view)!!
            override fun update(item: Item) {
                binding.title.text = item.winery.name
                binding.subtitle.text = item.winery.phone
            }
        }
        object: RecyclerView.Adapter<UpdatableViewHolder>() {
            val items: MutableList<Item> = mutableListOf()
            fun update(update: List<Item>) {
                items.clear()
                items.addAll(update)
                notifyDataSetChanged()
            }
            override fun getItemCount() = items.size
            override fun onBindViewHolder(holder: UpdatableViewHolder, position: Int) = holder.update(items[position])
            override fun getItemViewType(position: Int): Int {
                return when (items[position]){
                    is Item.Image -> R.layout.row_rv_rows_image
                    is Item.Text -> R.layout.row_rv_rows_text
                }
            }
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpdatableViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
                return when (viewType) {
                    R.layout.row_rv_rows_image-> ImageViewHolder(view)
                    R.layout.row_rv_rows_text -> TextViewHolder(view)
                    else->throw IllegalStateException("invalid type")
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.rows.adapter = adapter
        binding.rows.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL).also { deco ->
            with (ShapeDrawable(RectShape())){
                intrinsicHeight = (resources.displayMetrics.density * 8).toInt()
                alpha = 0
                deco.setDrawable(this)
            }
        })
        adapter.update(
            Winery.data
                .stream()
                .map { if (it.name.length%2==0) Item.Image(it) else Item.Text(it) }
                .toList()
        )
    }

    companion object {
        fun intent(ctx: Context) = Intent(ctx, RvRowsActivity::class.java)
    }
}
