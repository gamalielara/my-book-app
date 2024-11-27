package com.example.mybookapp.ui.nonfiction

import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBase.BookListBaseFragment

class NonfictionFragment : BookListBaseFragment(
    title = BookGenre.NONFICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.NONFICTION })