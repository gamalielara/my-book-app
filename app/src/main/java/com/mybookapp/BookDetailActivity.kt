package com.mybookapp

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mybookapp.data.Book
import com.mybookapp.data.BookListIntentKeys
import com.mybookapp.databinding.ActivityBookDetailBinding

class BookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book_detail)

        val bookDetail = intent.getSerializableExtra(BookListIntentKeys.BOOK_DETAIL_DATA) as Book

        val binding = ActivityBookDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.appBarBookDetail.toolbar

        setSupportActionBar(toolbar)
        supportActionBar!!.title = bookDetail.title
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        window.statusBarColor = ContextCompat.getColor(this, R.color.md_theme_primary)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}