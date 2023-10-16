package com.hpnightowl.owlkhabri.ui.api
import com.hpnightowl.owlkhabri.BuildConfig
import com.hpnightowl.owlkhabri.ui.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
interface NewsAPI {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "in",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apikey")
        apikey: String = BuildConfig.KHABRI_API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apikey")
        apikey: String = BuildConfig.KHABRI_API_KEY
    ): Response<NewsResponse>

}