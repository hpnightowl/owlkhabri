package com.hpnightowl.owlkhabri.ui.repository

import com.hpnightowl.owlkhabri.ui.api.RetrofitInstance
import com.hpnightowl.owlkhabri.ui.db.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getBreakingNews(countryCode:String, pageNumber : Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}