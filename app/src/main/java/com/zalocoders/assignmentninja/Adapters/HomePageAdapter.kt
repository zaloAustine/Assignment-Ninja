package com.zalocoders.assignmentninja.Adapters;

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zalocoders.assignmentninja.Views.Fragments.MyContractsFragment
import com.zalocoders.assignmentninja.Views.Fragments.MyPostedAssignmentsFragment
import com.zalocoders.assignmentninja.Views.Fragments.PendingBidsFragment


class HomePageAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {


     override fun getItem(position: Int): Fragment {

         return when (position) {
             0 -> MyPostedAssignmentsFragment()
             1 -> PendingBidsFragment()
             2 -> MyContractsFragment()

             else -> MyPostedAssignmentsFragment()
         }

     }

     override fun getCount(): Int {

    return 3
     }


 }
