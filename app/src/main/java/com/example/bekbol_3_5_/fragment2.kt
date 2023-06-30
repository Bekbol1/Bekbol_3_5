package com.example.bekbol_3_5_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bekbol_3_5_.databinding.FragmentFragment2Binding

class fragment2 : Fragment() {
    private lateinit var binding: FragmentFragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false)
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            val result = arguments?.getString("Bekbol")
            binding.tvmeaning2.text = result
        }
    }

