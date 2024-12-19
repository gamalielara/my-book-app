package com.mybookapp.data

data class User(
    val name: String,
    val email: String,
    val profileImage: String
)

val currentUser = User(
    name = "Ara Gamaliel",
    email = "aragamalielboanerges@gmail.com",
    profileImage = "https://plus.unsplash.com/premium_photo-1689977968861-9c91dbb16049?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8cHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D"
)