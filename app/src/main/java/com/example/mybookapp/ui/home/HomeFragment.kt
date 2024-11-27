package com.example.mybookapp.ui.home


import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBaseFragment.BookListBaseFragment

class HomeFragment : BookListBaseFragment(
    title = BookGenre.FANTASY,
    bookList = booksListMockData.filter { it.genre == BookGenre.FANTASY })