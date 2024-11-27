package com.example.mybookapp.ui.slideshow

import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBaseFragment.BookListBaseFragment

class SlideshowFragment : BookListBaseFragment(
    title = BookGenre.NONFICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.NONFICTION })