package com.example.bekbol_3_5_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.bekbol_3_5_.databinding.FragmentFragment1Binding

class fragment1 : Fragment() {

    private lateinit var binding: FragmentFragment1Binding
    private var countt = false;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFragment1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        plusAndMinus()
    }

    private fun plusAndMinus() {
        var count = binding.tvmeaning.text.toString().toInt().plus(1)
        binding.btnMean.setOnClickListener {
            when (countt) {
                false -> {
                    when (count == 10) {
                        false -> {
                            binding.tvmeaning.text = count++.toString()
                        }

                        true -> {
                            countt = true
                            binding.tvmeaning.text = count--.toString()
                            binding.btnMean.text = "-"
                        }
                    }
                }

                true -> {
                    when (count == 0) {
                        false ->
                            binding.tvmeaning.text = count--.toString()

                        true -> findNavController().navigate(R.id.fragment2, bundleOf("Bekbol" to "Mean" ))
                    }
                }
            }
        }
    }
}