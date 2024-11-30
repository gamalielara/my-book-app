package com.mybookapp.ui.poetry

import com.mybookapp.data.BookGenre
import com.mybookapp.data.booksListMockData
import com.mybookapp.ui.bookListBase.BookListBaseFragment

class PoetryFragment : BookListBaseFragment(title = BookGenre.POETRY,
    bookList = booksListMockData.filter { it.genre == BookGenre.POETRY })