package com.mybookapp.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mybookapp.R


class BookListAdapter(
    private val context: Context,
    private val bookList: List<Book>,
    private val onClick: () -> Unit
) : RecyclerView.Adapter<BookListAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener { onClick() }
        }

        fun bindData(title: String, author: String, cover: String) {
            val bookTitleText = itemView.findViewById<TextView>(R.id.bookTitleText)
            val bookAuthorText = itemView.findViewById<TextView>(R.id.bookAuthorText)
            val bookCoverImage = itemView.findViewById<ImageView>(R.id.bookCoverImg)

            bookTitleText.text = title
            bookAuthorText.text = author

            Glide.with(context).load(cover).into(bookCoverImage)
        }
    }

    override fun getItemCount(): Int = bookList.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.book_item_card, parent, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = bookList[position]

        holder.bindData(
            title = data.title,
            author = data.author,
            cover = data.cover
        )
    }
}