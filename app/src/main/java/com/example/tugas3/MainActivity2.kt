package com.example.tugas3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {

    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonSwitchPage = findViewById<Button>(R.id.button_back)
        val buttonCountUp = findViewById<Button>(R.id.button_count2)
        val mShowCount = findViewById<TextView>(R.id.show_count2)

        // Explicit Intent -> ke Activity 2
        buttonSwitchPage.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Count
        buttonCountUp.setOnClickListener {
            mCount++
            mShowCount.text = mCount.toString()
        }

    }
}