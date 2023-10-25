package com.hpnightowl.owlkhabri.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.hpnightowl.owlkhabri.R
import com.hpnightowl.owlkhabri.ui.NewsActivity
import com.hpnightowl.owlkhabri.ui.ui.NewsViewModel

class ArticleNewsFragment: Fragment(R.layout.article_news) {
    // Todo: adding comments later
    lateinit var viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}