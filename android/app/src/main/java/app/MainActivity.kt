package app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.databinding.ActivityMainBinding
import app.util.contentView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val binding by contentView<MainActivity, ActivityMainBinding>(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // binding MUST be mentioned because contentView is lazy
        Snackbar.make(binding.root,"Welcome!",Snackbar.LENGTH_SHORT).show()
        binding.rows.setOnClickListener { startActivity(RvRowsActivity.intent(this)) }
        binding.cells.setOnClickListener { startActivity(RvCellsActivity.intent(this)) }
    }
}
