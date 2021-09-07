package com.example.news.views

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.databinding.FragmentBarBinding


class BarFragment : Fragment() {
    private  var _binding : FragmentBarBinding? = null
    val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBarBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbar.inflateMenu(R.menu.toolbarm)



    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        inflater.inflate(R.menu.toolbarm,menu)
        super.onCreateOptionsMenu(menu, inflater)


    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}