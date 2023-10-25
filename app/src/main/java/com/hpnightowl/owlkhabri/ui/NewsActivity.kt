package com.hpnightowl.owlkhabri.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.hpnightowl.owlkhabri.databinding.ActivityNewsBinding
import com.hpnightowl.owlkhabri.ui.db.ArticleDatabase
import com.hpnightowl.owlkhabri.ui.repository.NewsRepository
import com.hpnightowl.owlkhabri.ui.ui.NewsViewModel
import com.hpnightowl.owlkhabri.ui.ui.NewsViewModelProviderFactory

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel
    private lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val repository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)

        binding.bottomNavigationView.setupWithNavController(binding.newsNavHostFrag.getFragment<NavHostFragment>().navController)
    }
}