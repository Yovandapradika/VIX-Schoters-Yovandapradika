package com.androiddevs.mvvmnewsapp.api

import com.androiddevs.mvvmnewsapp.models.NewestResponse
import com.androiddevs.mvvmnewsapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET( value = "v2/top-headlines" )
    suspend fun getBreakingNews(
        @Query(value = "country")
        countryCode: String = "id",
        @Query(value = "page")
        pageNumber: Int = 1,
        @Query(value = "apiKey")
        apiKey: String = API_KEY
    ): Response<NewestResponse>

    @GET( value = "v2/everything" )
    suspend fun searchForNews(
        @Query(value = "q")
        searchQuery: String,
        @Query(value = "page")
        pageNumber: Int = 1,
        @Query(value = "apiKey")
        apiKey: String = API_KEY
    ): Response<NewestResponse>
}