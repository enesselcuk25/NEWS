package com.example.news.views.covid.covidScrollView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.databinding.FragmentScroll2Binding
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class scroll2Fragment : Fragment() {

    private  lateinit var binding: FragmentScroll2Binding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScroll2Binding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.carousel.registerLifecycle(lifecycle)

        val list = mutableListOf<CarouselItem>()
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.scroll2image1,
                caption = "Güneş üç ayda battı!"

            )
        )

        list.add(
            CarouselItem(
                imageDrawable = R.drawable.scroll2image2,
                caption = "Milli takım'da Şenol Güneş dönemi sona erdi"
        )
        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.scroll2image3,
                caption = "iki seneryo, dört aday!"
            )
        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.scroll2image4,
                caption = "Duygun yarsuvat hayatını kaybetti "
            )
        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.scroll2image5,
                caption = "Simeone nasıl kral oldu? "
            )
        )


        binding.carousel.setData(list)


    }



}