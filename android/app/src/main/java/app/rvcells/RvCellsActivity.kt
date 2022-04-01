package app.rvcells

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import app.R
import app.data.Winery
import app.databinding.RvCellsActivityBinding
import app.databinding.RvCellsCellImageBinding
import app.databinding.RvCellsCellTextBinding
import app.util.contentView
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.ColorFilterTransformation

class RvCellsActivity : AppCompatActivity() {
    private val binding by contentView<RvCellsActivity, RvCellsActivityBinding>(R.layout.rv_cells_activity)

    sealed class Item(val winery: Winery) {
        class Image(w: Winery ): Item(w)
        class Text(w: Winery ): Item(w)
    }

    private val adapter by lazy {
        val picasso = Picasso.get()
        abstract class UpdatableViewHolder(view: View) : RecyclerView.ViewHolder(view) { abstract fun update(item: Item) }
        class ImageViewHolder(view: View) : UpdatableViewHolder(view) {
            val binding = DataBindingUtil.bind<RvCellsCellImageBinding>(view)!!
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
            val binding = DataBindingUtil.bind<RvCellsCellTextBinding>(view)!!
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
                    is Item.Image -> R.layout.rv_cells_cell_image
                    is Item.Text -> R.layout.rv_cells_cell_text
                }
            }
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpdatableViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
                return when (viewType) {
                    R.layout.rv_cells_cell_image -> ImageViewHolder(view)
                    R.layout.rv_cells_cell_text -> TextViewHolder(view)
                    else->throw IllegalStateException("invalid type")
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.cells.adapter = adapter
        binding.cells.addItemDecoration(object: RecyclerView.ItemDecoration(){
            val px = (resources.displayMetrics.density * 8).toInt()
            val spanCount = 2
            override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
                val index = parent.getChildLayoutPosition(view)
                val isLeft = (index % spanCount == 0)
                outRect.set(
                    if (isLeft) px else px/2,
                    0,
                    if (isLeft) px/2 else px,
                    px
                )
            }
        })

        adapter.update(
            Winery.data
                .map { if (it.name.length%2==0) Item.Image(it) else Item.Text(it) }
        )
    }

    companion object {
        fun intent(ctx: Context) = Intent(ctx, RvCellsActivity::class.java)
    }
}
