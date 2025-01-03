package com.mybookapp.ui.bookListBase

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mybookapp.data.Book
import com.mybookapp.data.BookListAdapter
import com.mybookapp.databinding.FragmentBookListBaseBinding

open class BookListBaseFragment(
    val title: String,
    val bookList: List<Book>
) : Fragment() {
    private var _binding: FragmentBookListBaseBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookListBaseBinding.inflate(inflater, container, false)

        val root = binding.root

        this.setupBookList()

        return root
    }

    fun setupBookList() {
        val context = requireContext()
        val bookListRecyclerView = binding.bookListView
        val bookListLayoutManager = LinearLayoutManager(context)

        bookListRecyclerView.adapter =
            BookListAdapter(
                context = requireContext(),
                bookList = bookList
            )
        bookListRecyclerView.layoutManager = bookListLayoutManager

    }

}