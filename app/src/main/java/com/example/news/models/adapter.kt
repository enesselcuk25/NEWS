package com.example.news.models
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.news.databinding.ItemPageBinding
import com.smarteist.autoimageslider.SliderViewAdapter

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Enes SELÇUK │
//│ ──────────────────────── │
//│ enesselcuk@gmail.com      │            
//│ ──────────────────────── │
//│ 7.09.2021                │
//└──────────────────────────┘

class adapter(private var imageList: ArrayList<Int>): SliderViewAdapter<adapter.holder>() {

interface Listener {
    fun onClick(imageList: ArrayList<Int>)
}

    inner class holder(val binding: ItemPageBinding):SliderViewAdapter.ViewHolder(binding.root) {
        fun bind(){
            with(binding){
            }
        }
    }

    override fun getCount(): Int {
        return imageList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): adapter.holder {
        val binding = ItemPageBinding.inflate(LayoutInflater.from(parent?.context),parent,false)
        return holder(binding)
    }

    override fun onBindViewHolder(viewHolder: adapter.holder?, position: Int) {

        with(viewHolder) {
            this?.binding?.imageView?.setImageResource(imageList[position])
        }

    }


}

