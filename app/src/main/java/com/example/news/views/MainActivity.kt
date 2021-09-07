package com.example.news.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import com.example.news.R
import com.example.news.content5Fragment
import com.example.news.content6Fragment
import com.example.news.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentTransaction =  supportFragmentManager.beginTransaction()

        binding.toolbar.inflateMenu(R.menu.toolbarm)


        val CardFragment = CardFragment()
        val scrollFragment = scrollFragment()
        val scroll2Fragment = scroll2Fragment()
        val contentsFragment = contentsFragment()
        val contents2Fragment = content2Fragment()
        val contents3Fragment = content3Fragment()
        val contents4Fragment = content4Fragment()
        val contents5Fragment = content5Fragment()
        val contents6Fragment = content6Fragment()

        fragmentTransaction.add(binding.CardFragment.id,CardFragment)
        fragmentTransaction.add(binding.ScrollFragment.id,scrollFragment)
        fragmentTransaction.add(binding.Scroll2Fragment.id,scroll2Fragment)
        fragmentTransaction.add(binding.contentsFragment.id,contentsFragment)
        fragmentTransaction.add(binding.contents2Fragment.id,contents2Fragment)
        fragmentTransaction.add(binding.contents3Fragment.id,contents3Fragment)
        fragmentTransaction.add(binding.contents4Fragment.id,contents4Fragment)
        fragmentTransaction.add(binding.contents5Fragment.id,contents5Fragment)
        fragmentTransaction.add(binding.contents6Fragment.id,contents6Fragment)
        fragmentTransaction.commit()


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbarm,menu)
        return super.onCreateOptionsMenu(menu)
    }


}