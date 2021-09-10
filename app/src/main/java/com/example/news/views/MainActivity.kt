package com.example.news.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.databinding.DataBindingUtil
import com.example.news.R
import com.example.news.databinding.ActivityMainBinding
import com.example.news.userDataModel.SonikData
import com.example.news.userDataModel.SonikDataImage
import com.example.news.util.FragmentTransection
import com.example.news.views.content1.Content1DetailFragment
import com.example.news.views.content2.content2DetailFragment
import com.example.news.views.covid.CovidDetailFragment

class MainActivity : AppCompatActivity() {
    var fragmnetManeger = supportFragmentManager
    var fragmentTransaction =  fragmnetManeger.beginTransaction()

    val fragmnetTrans = FragmentTransection()

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        fragmnetManeger = supportFragmentManager

        binding.toolbar.inflateMenu(R.menu.toolbarm)
        fragments()

        binding.nameText = SonikData("SonikHaber")
        binding.nameImage = SonikDataImage(R.drawable.liveimage)

    }



    private fun fragments() {

        fragmentTransaction.replace(binding.CardFragment.id,fragmnetTrans.CardFragment,"cardFrag").addToBackStack(null)
        fragmentTransaction.replace(binding.ScrollFragment.id,fragmnetTrans.scrollFragment,"scroll").addToBackStack(null)
        fragmentTransaction.replace(binding.Scroll2Fragment.id,fragmnetTrans.scroll2Fragment,"scroll2").addToBackStack(null)
        fragmentTransaction.replace(binding.contentsFragment.id,fragmnetTrans.contentsFragment,"contentsF").addToBackStack(null)
        fragmentTransaction.replace(binding.contents1Fragment.id,fragmnetTrans.contents1Fragment,"contents1F").addToBackStack(null)
        fragmentTransaction.replace(binding.contents2Fragment.id,fragmnetTrans.contents2Fragment,"contentsF2").addToBackStack(null)
        fragmentTransaction.replace(binding.contents3Fragment.id,fragmnetTrans.contents3Fragment,"contentsF3").addToBackStack(null)
        fragmentTransaction.replace(binding.contents4Fragment.id,fragmnetTrans.contents4Fragment,"contentsF4").addToBackStack(null)
        fragmentTransaction.replace(binding.contents5Fragment.id,fragmnetTrans.contents5Fragment,"contentsF5").addToBackStack(null)
        fragmentTransaction.replace(binding.contents6Fragment.id,fragmnetTrans.contents6Fragment,"contentsF6").addToBackStack(null)

        binding.CardFragment.setOnClickListener {

            remove()
            val cardDetailFragment = CovidDetailFragment()
            fragmentTransaction.replace(R.id.CardDetailFragment,cardDetailFragment)
            fragmentTransaction.addToBackStack(null)

        }

        binding.contents1Fragment.setOnClickListener {
            remove()
            val content2DetailFragment = Content1DetailFragment()
            fragmentTransaction.replace(R.id.Content2DetailFragment,content2DetailFragment)
            fragmentTransaction.addToBackStack(null)

        }

        binding.contents2Fragment.setOnClickListener {
            remove()
            val content1DetailFragment = content2DetailFragment()
            fragmentTransaction.replace(R.id.Content1DetailFragment, content1DetailFragment)
            fragmentTransaction.addToBackStack(null)
        }
        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbarm,menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun remove() {
        val cardFragment = fragmnetManeger.findFragmentByTag("cardFrag")
        val ScrollFragment = fragmnetManeger.findFragmentByTag("scroll")
        val Scroll2Fragment = fragmnetManeger.findFragmentByTag("scroll2")
        val contentsFragment = fragmnetManeger.findFragmentByTag("contentsF")
        val contents1Fragment = fragmnetManeger.findFragmentByTag("contents1F")
        val contents2Fragment = fragmnetManeger.findFragmentByTag("contentsF2")
        val contents3Fragment = fragmnetManeger.findFragmentByTag("contentsF3")
        val contents4Fragment = fragmnetManeger.findFragmentByTag("contentsF4")
        val contents5Fragment = fragmnetManeger.findFragmentByTag("contentsF5")
        val contents6Fragment = fragmnetManeger.findFragmentByTag("contentsF6")

        fragmentTransaction = fragmnetManeger.beginTransaction()

        cardFragment?.let { fragmentTransaction.remove(it) }
        ScrollFragment?.let { fragmentTransaction.remove(it) }
        Scroll2Fragment?.let { fragmentTransaction.remove(it) }
        contentsFragment?.let { fragmentTransaction.remove(it) }
        contents1Fragment?.let { fragmentTransaction.remove(it) }
        contents2Fragment?.let { fragmentTransaction.remove(it) }
        contents3Fragment?.let { fragmentTransaction.remove(it) }
        contents4Fragment?.let { fragmentTransaction.remove(it) }
        contents5Fragment?.let { fragmentTransaction.remove(it) }
        contents6Fragment?.let { fragmentTransaction.remove(it) }
        fragmentTransaction.commit()

    }


//    override fun onBackPressed() {
//
//
//
//
//
////      val fagment =  fragmnetManeger.findFragmentById(R.id.CardFragment)
////
////        if(fagment!= null){
////            fragmentTransaction.remove(fagment)
////            fragmentTransaction.commit()
////        }
////        else {
////            super.onBackPressed()
////        }
//    }




}