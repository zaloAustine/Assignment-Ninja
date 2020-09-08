package com.zalocoders.assignmentninja.Views.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.zalocoders.assignmentninja.Adapters.HomePageAdapter
import com.zalocoders.assignmentninja.R

class AccountFragment : Fragment() {

    lateinit var v:View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_account, container, false)
        setTabClicks()
        return v;
    }

    fun setTabClicks(){
        val viewPager = v.findViewById<ViewPager>(R.id.viewPager)
        val tablayout = v.findViewById<TabLayout>(R.id.tablayout)

        val pagerAdapter = fragmentManager?.let { HomePageAdapter(it) }

        viewPager.offscreenPageLimit = 1
        viewPager.adapter = pagerAdapter



        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })


        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout))


    }


}