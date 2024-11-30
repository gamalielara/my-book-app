package com.example.mybookapp.ui.poetry

import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBase.BookListBaseFragment

class PoetryFragment : BookListBaseFragment(title = BookGenre.POETRY,
    bookList = booksListMockData.filter { it.genre == BookGenre.POETRY })