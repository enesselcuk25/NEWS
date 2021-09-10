package com.example.news.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.R
import com.example.news.databinding.FragmentContent4Binding
import com.example.news.databinding.FragmentContent5Binding
import com.example.news.userDataModel.contentModel.content5detail.ContentDataFiveText
import com.example.news.userDataModel.contentModel.content5detail.ContentDetailImage


class content5Fragment : Fragment() {

    private  lateinit var binding: FragmentContent5Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContent5Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cFiveText = ContentDataFiveText("10 Eylül Cuma Koronavirüs tablosu! Bugünkü korona vefat ve vaka sayısı kaç? İşte koronavirüs son durum")
        binding.cFiveImage = ContentDetailImage(R.drawable.vaka)
    }

}