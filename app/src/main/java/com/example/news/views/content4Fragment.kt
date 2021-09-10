package com.example.news.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.R
import com.example.news.databinding.FragmentContent3Binding
import com.example.news.databinding.FragmentContent4Binding
import com.example.news.userDataModel.contentModel.content4detail.ContentDataText
import com.example.news.userDataModel.contentModel.content4detail.ContentDetailImage


class content4Fragment : Fragment() {

    private  lateinit var binding: FragmentContent4Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContent4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cFourText = ContentDataText("Antalya'da çıkan orman yangını kontrol altına alındı")
        binding.cFourImage = ContentDetailImage(R.drawable.contentfire)
    }
}