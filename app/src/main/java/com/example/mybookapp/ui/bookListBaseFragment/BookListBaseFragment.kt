package com.example.mybookapp.ui.bookListBaseFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mybookapp.data.Book
import com.example.mybookapp.data.BookListAdapter
import com.example.mybookapp.databinding.FragmentBookListBaseBinding

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
        Log.d("HEHE", bookList.toString())
        val bookListRecyclerView = binding.bookListView
        val bookListLayoutManager = LinearLayoutManager(requireContext())

        bookListRecyclerView.adapter =
            BookListAdapter(
                context = requireContext(),
                bookList = bookList
            ) { TODO("Implement later") }
        bookListRecyclerView.layoutManager = bookListLayoutManager

    }

}