package com.example.mybookapp.ui.fantasy


import com.example.mybookapp.data.BookGenre
import com.example.mybookapp.data.booksListMockData
import com.example.mybookapp.ui.bookListBase.BookListBaseFragment

class FantasyFragment : BookListBaseFragment(
    title = BookGenre.FANTASY,
    bookList = booksListMockData.filter { it.genre == BookGenre.FANTASY })