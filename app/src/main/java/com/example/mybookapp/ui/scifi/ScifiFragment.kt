package com.example.mybookapp.ui.scifi

import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBase.BookListBaseFragment

class ScifiFragment : BookListBaseFragment(
    title = BookGenre.SCIENCE_FICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.SCIENCE_FICTION })