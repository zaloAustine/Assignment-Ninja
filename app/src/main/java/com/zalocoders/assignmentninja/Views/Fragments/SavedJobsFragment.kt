package com.zalocoders.assignmentninja.Views.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zalocoders.assignmentninja.Adapters.AssignmentAdapter
import com.zalocoders.assignmentninja.Data.Models.Assignment
import com.zalocoders.assignmentninja.R


class SavedJobsFragment : Fragment() {

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
        v = inflater.inflate(R.layout.fragment_saved_jobs, container, false)
        loadSaved()
        return v
    }


    fun loadSaved(){

        val assignmentlist = mutableListOf<Assignment>()

        val ass1 = Assignment("1","Financial Accounting","Active","Need a work around this assignment due tomorrow","2","ksh 1000","08.08.2020")

        for (i in 1..2){
            assignmentlist.add(ass1)

        }

        val assignmentadapter = AssignmentAdapter(c,assignmentlist)

        val savedRecycler = v.findViewById(R.id.savedRecycler) as RecyclerView
        savedRecycler.layoutManager  = LinearLayoutManager(context,
            LinearLayoutManager.VERTICAL,false)
        savedRecycler.adapter = assignmentadapter
        ViewCompat.setNestedScrollingEnabled(savedRecycler,false)
        assignmentadapter.notifyDataSetChanged()

    }


}