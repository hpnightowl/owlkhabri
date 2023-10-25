package com.hpnightowl.owlkhabri.ui.ui

import androidx.lifecycle.ViewModel
import com.hpnightowl.owlkhabri.ui.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {

}