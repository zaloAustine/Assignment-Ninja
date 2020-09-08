package com.zalocoders.assignmentninja.Views.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zalocoders.assignmentninja.Adapters.PendingBidsAdapter
import com.zalocoders.assignmentninja.Data.Models.Assignment
import com.zalocoders.assignmentninja.R

class PendingBidsFragment : Fragment() {


    lateinit var c: Context
    lateinit var v:View

    override fun onAttach(context: Context) {
        super.onAttach(context)
        c = context
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_pending_bids, container, false)
        loadPendingBids()
        return v;
    }

    fun loadPendingBids(){


        val pendingBidsList = mutableListOf<Assignment>()

        val ass1 = Assignment("1","Financial Accounting","Active","Need a work around this assignment due tomorrow","2","ksh 1000","08.08.2020")

        for(i in 1..900){

            pendingBidsList.add(ass1)

        }



        val pendingBidRecyclerView = v.findViewById(R.id.pendingBidRecyclerView) as RecyclerView

        val adapter = PendingBidsAdapter(pendingBidsList,c)

        pendingBidRecyclerView.layoutManager = LinearLayoutManager(c)

        pendingBidRecyclerView.adapter = adapter





    }



}