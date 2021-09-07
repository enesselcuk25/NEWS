package com.example.news.views

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

    private  var _binding : FragmentScrollBinding? = null
    val binding get() = _binding!!

    val array = arrayListOf<Int>(
        R.mipmap.ic_launcher_round, R.mipmap.ic_launcher,
        R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScrollBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = adapter(array)

        binding.imageSlider.setSliderAdapter(adapter)
        binding.imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM)
        binding.imageSlider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        binding.imageSlider.startAutoCycle()

    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}