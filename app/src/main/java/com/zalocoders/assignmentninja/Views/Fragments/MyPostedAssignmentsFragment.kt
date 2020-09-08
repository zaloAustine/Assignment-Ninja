package com.zalocoders.assignmentninja.Views.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zalocoders.assignmentninja.Adapters.PostedAssignmentsAdapter
import com.zalocoders.assignmentninja.Data.Models.Assignment
import com.zalocoders.assignmentninja.R



class MyPostedAssignmentsFragment : Fragment() {

    lateinit var c:Context
    lateinit var v:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_my_posted_assignments, container, false)
        loadPostedAssignments()
        return v;
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        c = context
    }



    fun loadPostedAssignments(){


        val assignmentList = mutableListOf<Assignment>()

        val ass1 = Assignment("1","Financial Accounting","Active","Need a work around this assignment due tomorrow","2","ksh 1000","08.08.2020")

        for(i in 1..900){

            assignmentList.add(ass1)

        }
        


        val postedAssignmentRecyclerView = v.findViewById(R.id.postedAssignmentRecyclerView) as RecyclerView

        val adapter = PostedAssignmentsAdapter(assignmentList,c)

        postedAssignmentRecyclerView.layoutManager = LinearLayoutManager(c)

        postedAssignmentRecyclerView.adapter = adapter





    }
}