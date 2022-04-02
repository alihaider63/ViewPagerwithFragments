package com.haider.viewpagerwithfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.haider.viewpagerwithfragments.databinding.FragmentChatsBinding

class ChatsFragment() : Fragment() {

    companion object {
        fun newInstance() = ChatsFragment().let {

        }
    }

    private lateinit var binding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatsBinding.inflate(layoutInflater)
        return binding.root
    }
}