package com.example.mybookapp.ui.generalFiction

import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBase.BookListBaseFragment

class GeneralFictionFragment : BookListBaseFragment(
    title = BookGenre.GENERAL_FICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.GENERAL_FICTION })