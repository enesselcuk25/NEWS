package com.example.news.views.content1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.R
import com.example.news.databinding.FragmentContent1Binding
import com.example.news.databinding.FragmentContent2Binding
import com.example.news.userDataModel.contentModel.ContentDataTwoNewsOne
import com.example.news.userDataModel.contentModel.DataContentImageOne
import com.example.news.userDataModel.contentModel.DataContentImageTwo


class content1Fragment : Fragment() {

    private  lateinit var binding: FragmentContent1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContent1Binding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.readerNews = ContentDataTwoNewsOne("Debir öcü ispanya'da piste çıkacak")

        binding.images = DataContentImageOne(R.drawable.content2image)

    }
}