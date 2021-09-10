package com.example.news.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.news.R
import com.example.news.databinding.FragmentContent2Binding
import com.example.news.userDataModel.contentModel.ContentDataTwoNewsTwo
import com.example.news.userDataModel.contentModel.DataContentImageTwo

class content2Fragment : Fragment() {


    private  lateinit var binding: FragmentContent2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContent2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val detailD = DataContentImageTwo(R.drawable.conten2image2)
        binding.images = detailD

        binding.readerNews = ContentDataTwoNewsTwo("İyi bir online derste olması gerek 5 özellik")

    }

}