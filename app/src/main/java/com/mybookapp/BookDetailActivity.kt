package com.mybookapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mybookapp.data.BookListIntentKeys
import com.mybookapp.databinding.ActivityBookDetailBinding

class BookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book_detail)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val binding = ActivityBookDetailBinding.inflate(layoutInflater)

        setSupportActionBar(binding.appBarBookDetail.toolbar)

        // Explicitly set the status bar color
        window.statusBarColor = ContextCompat.getColor(this, R.color.md_theme_primary)

        val hehe = intent.getSerializableExtra(BookListIntentKeys.BOOK_DETAIL_DATA)
        Log.d("HAI ", hehe.toString())

    }
}