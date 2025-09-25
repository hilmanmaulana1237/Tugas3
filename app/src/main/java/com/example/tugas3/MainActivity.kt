package com.example.tugas3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)
        val buttonSwitchPage = findViewById<Button>(R.id.button_switchpage)
        val buttonBrowser = findViewById<Button>(R.id.button_browser)

        // Count
        buttonCountUp.setOnClickListener {
            mCount++
            mShowCount.text = mCount.toString()
        }

        // Toast
        buttonToast.setOnClickListener {
            val tulisan = mShowCount.text.toString()
            Toast.makeText(this, "Angka yang dimunculkan $tulisan", Toast.LENGTH_LONG).show()
        }

        // Explicit Intent -> ke Activity 2
        buttonSwitchPage.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        // Implicit Intent -> Browser
        buttonBrowser.setOnClickListener {
            val intentBrowse = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(intentBrowse)
        }

        // (Opsional) Implicit intent lain:
        // MAP
        findViewById<Button>(R.id.button_map).setOnClickListener {
            val geoUri = Uri.parse("geo:-6.9175,107.6191?q=Alun+Alun+Bandung")
            val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
            startActivity(mapIntent)
        }

// DIAL
        findViewById<Button>(R.id.button_dial).setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:0800000000"))
            startActivity(dialIntent)
        }

// SHARE (tanpa apply)
        findViewById<Button>(R.id.button_share).setOnClickListener {
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.putExtra(Intent.EXTRA_TEXT, "Hello from Hello Toast")
            startActivity(Intent.createChooser(share, "Share via"))
        }
    }
}