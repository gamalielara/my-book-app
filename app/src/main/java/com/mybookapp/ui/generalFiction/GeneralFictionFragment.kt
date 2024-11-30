package com.mybookapp.ui.generalFiction

import com.mybookapp.data.BookGenre
import com.mybookapp.data.booksListMockData
import com.mybookapp.ui.bookListBase.BookListBaseFragment

class GeneralFictionFragment : BookListBaseFragment(
    title = BookGenre.GENERAL_FICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.GENERAL_FICTION })