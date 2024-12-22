package com.mybookapp.ui.allBooks


import com.mybookapp.data.booksListMockData
import com.mybookapp.ui.bookListBase.BookListBaseFragment

class AllBooksFragment : BookListBaseFragment(
    title = "All Books", bookList = booksListMockData
)