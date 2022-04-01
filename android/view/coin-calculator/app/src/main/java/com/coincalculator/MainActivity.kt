package com.coincalculator

import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.json.JSONObject
import java.io.BufferedInputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

class MainActivity : AppCompatActivity() {

    // This is terrible. It retrieves the prices on the main thread and blocks the UI. Don't do it.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById<View>(R.id.toolbar) as Toolbar)
        val updatePrices = { // Grab the prices & show them in the list
            var urlConnection: HttpURLConnection? = null
            try {
                urlConnection = URL("https://api.coindesk.com/v1/bpi/currentprice.json")
                    .openConnection() as HttpURLConnection
                val scanner = Scanner(BufferedInputStream(urlConnection.inputStream))
                    .useDelimiter("\\A")
                val jsonString = if (scanner.hasNext()) scanner.next() else ""
                val bpi = JSONObject(jsonString).getJSONObject("bpi")
                val keys = bpi.keys()
                val rows: MutableList<String> = ArrayList()
                while (keys.hasNext()) {
                    val key = keys.next()
                    val currency = bpi.getJSONObject(key)
                    rows.add(key + " " + currency.getString("rate"))
                }
                (findViewById<View>(R.id.list) as ListView).adapter = ArrayAdapter(
                    this@MainActivity,
                    android.R.layout.simple_list_item_1,
                    rows.toTypedArray()
                )
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                urlConnection?.disconnect()
            }
        }
        (findViewById<View>(R.id.fab) as FloatingActionButton).setOnClickListener { updatePrices() }

        // Avoid pesky NetworkOnMainThreadException
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().permitAll().build())
        updatePrices()
    }
}