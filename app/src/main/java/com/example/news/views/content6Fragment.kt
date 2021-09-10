package com.example.news.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.R
import com.example.news.databinding.FragmentContent5Binding
import com.example.news.databinding.FragmentContent6Binding
import com.example.news.userDataModel.contentModel.content6detail.ContentDataSixText
import com.example.news.userDataModel.contentModel.content6detail.ContentDetailImage


class content6Fragment : Fragment() {
    private  lateinit var binding: FragmentContent6Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContent6Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cSixText = ContentDataSixText("Ampute Milli Futbol Takımı, Avrupa Şampiyonası'na iddialı gidiyor")
        binding.cSixImage = ContentDetailImage(R.drawable.ampute)
    }


}