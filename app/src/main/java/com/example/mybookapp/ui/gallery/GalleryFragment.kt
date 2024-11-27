package com.example.mybookapp.ui.gallery

import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBaseFragment.BookListBaseFragment

class GalleryFragment : BookListBaseFragment(
    title = BookGenre.SCIENCE_FICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.SCIENCE_FICTION })