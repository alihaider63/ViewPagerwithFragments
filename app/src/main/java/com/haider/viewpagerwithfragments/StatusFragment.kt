package com.haider.viewpagerwithfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.haider.viewpagerwithfragments.databinding.FragmentStatusBinding

class StatusFragment: Fragment() {

    private lateinit var binding: FragmentStatusBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatusBinding.inflate(layoutInflater)
        return binding.root
    }
}