package com.zalocoders.assignmentninja.Adapters;

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zalocoders.assignmentninja.Views.Fragments.*


class HomePageAdapter2(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {


     override fun getItem(position: Int): Fragment {

         return when (position) {
             0 -> MyFeedFragment()
             1 -> SavedJobsFragment()
             2 -> SearchFragment()


             else -> MyFeedFragment()
         }

     }

     override fun getCount(): Int {

    return 3
     }


 }
