package com.mybookapp.data

import java.io.Serializable

data class Book(
    val id: String,
    val title: String,
    val genre: String,
    val author: String,
    val rate: Double,
    val cover: String,
    val excerpt: String
) : Serializable
