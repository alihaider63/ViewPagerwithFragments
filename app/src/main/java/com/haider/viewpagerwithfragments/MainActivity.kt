package com.haider.viewpagerwithfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haider.viewpagerwithfragments.databinding.ActivityPagerviewBinding

class PagerViewActivity: AppCompatActivity() {

    private lateinit var binding: ActivityPagerviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityPagerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Objects of fragments
        val chatsFragment = ChatsFragment()
        val callsFragment = CallsFragment()
        val statusFragment = StatusFragment()
        val profileFragment = ProfileFragment()

        String
        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(chatsFragment, "Chats")
        adapter.addFragment(callsFragment, "Calls")
        adapter.addFragment(statusFragment, "Status")
        adapter.addFragment(profileFragment, "Profile")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

    }
}