package com.androiddevs.mvvmnewsapp.models

data class NewestResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)