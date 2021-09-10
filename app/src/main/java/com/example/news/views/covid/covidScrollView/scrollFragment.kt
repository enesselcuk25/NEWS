package com.example.news.views.covid.covidScrollView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.R
import com.example.news.databinding.FragmentScrollBinding
import com.example.news.models.adapter
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations


class scrollFragment : Fragment() {


    private  lateinit var binding: FragmentScrollBinding

    val array = arrayListOf<Int>(
        R.drawable.scroll1, R.drawable.scroll2,
        R.drawable.scroll3, R.drawable.scroll4, R.drawable.scroll5,R.drawable.scroll6,R.drawable.scroll7
    )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScrollBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scroll()




    }

    private fun scroll() {

        val adapter = adapter(array)
        binding.imageSlider.setSliderAdapter(adapter)
        binding.imageSlider.setIndicatorAnimation(IndicatorAnimationType.DROP)
        binding.imageSlider.setSliderTransformAnimation(SliderAnimations.CUBEINDEPTHTRANSFORMATION)
        binding.imageSlider.startAutoCycle()


    }



}