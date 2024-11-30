package com.mybookapp.ui.nonfiction

import com.mybookapp.data.BookGenre
import com.mybookapp.data.booksListMockData
import com.mybookapp.ui.bookListBase.BookListBaseFragment

class NonfictionFragment : BookListBaseFragment(
    title = BookGenre.NONFICTION,
    bookList = booksListMockData.filter { it.genre == BookGenre.NONFICTION })