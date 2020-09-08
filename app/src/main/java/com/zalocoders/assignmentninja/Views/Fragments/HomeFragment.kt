package com.zalocoders.assignmentninja.Views.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.zalocoders.assignmentninja.Adapters.HomePageAdapter2
import com.zalocoders.assignmentninja.R


class HomeFragment : Fragment() {

    lateinit var v: View
    lateinit var c: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        c = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false)
        setTabClicks()
        return v
    }




    fun setTabClicks(){
        val viewPager = v.findViewById<ViewPager>(R.id.viewPager)
        val tablayout = v.findViewById<TabLayout>(R.id.tablayout)

        val pagerAdapter = fragmentManager?.let { HomePageAdapter2(it) }

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