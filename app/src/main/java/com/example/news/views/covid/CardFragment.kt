package com.example.news.views.covid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.news.databinding.FragmentCardBinding


import com.example.news.userDataModel.covid.CovidData


class CardFragment : Fragment() {

    private  lateinit var binding: FragmentCardBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCardBinding.inflate(inflater, container, false)

        val covidDetailFragment= CovidDetailFragment()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


      binding.covid = user()

    }


    private fun user(): CovidData {
        return CovidData("COVİD-19 haberleri : ","Koronavirüs ile ilgili son haberleri görün")
    }




}