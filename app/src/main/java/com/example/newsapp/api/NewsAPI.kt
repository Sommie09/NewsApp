package com.example.newsapp.api

import com.example.newsapp.model.NewsResponse
import com.example.newsapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(

        //These queries are gotten from the full get request string that starts with "q"
        @Query("country")
        countryCode: String = "ng",

        @Query("page")
        pageNumber: Int = 1,

        @Query("apiKey")
        apiKey: String = API_KEY

    //This function will return our news response
    ) : Response<NewsResponse>

    @GET("v2/top-everything")
    suspend fun searchForNews(

        //These queries are gotten from the full get request string that starts with "q"
        @Query("q")
        searchQuery: String,

        @Query("page")
        pageNumber: Int = 1,

        @Query("apiKey")
        apiKey: String = API_KEY

        //This function will return our news response
    ) : Response<NewsResponse>
}