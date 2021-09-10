package com.example.news.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.databinding.FragmentContentsBinding
import com.example.news.userDataModel.rateModel.Downdata
import com.example.news.userDataModel.rateModel.Edata
import com.example.news.userDataModel.rateModel.Rdata


class contentsFragment : Fragment() {
    private  lateinit var binding: FragmentContentsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContentsBinding.inflate(inflater,container,false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.rates = Edata("BIST 1000","DOLAR","ALTIN","EURO")
        binding.ratesNum = Rdata("1.446,76","8,4160","485,58","9,9559")
        binding.ratesNumD = Downdata("%-0,41","%-0,24","%-0,25","%-0,36")
    }







}