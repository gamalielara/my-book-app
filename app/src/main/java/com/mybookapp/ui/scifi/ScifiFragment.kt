package com.mybookapp.ui.scifi

import com.mybookapp.data.BookGenre
import com.mybookapp.data.booksListMockData
import com.mybookapp.ui.bookListBase.BookListBaseFragment

class ScifiFragment : BookListBaseFragment(
    title = BookGenre.SCIENCE_FICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.SCIENCE_FICTION })