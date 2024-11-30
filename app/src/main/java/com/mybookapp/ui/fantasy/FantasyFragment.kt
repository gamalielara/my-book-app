package com.mybookapp.ui.fantasy


import com.mybookapp.data.BookGenre
import com.mybookapp.data.booksListMockData
import com.mybookapp.ui.bookListBase.BookListBaseFragment

class FantasyFragment : BookListBaseFragment(
    title = BookGenre.FANTASY,
    bookList = booksListMockData.filter { it.genre == BookGenre.FANTASY })