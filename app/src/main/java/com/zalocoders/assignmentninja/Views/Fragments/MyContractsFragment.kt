package com.zalocoders.assignmentninja.Views.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zalocoders.assignmentninja.Adapters.ContractsAdapter
import com.zalocoders.assignmentninja.Data.Models.Assignment
import com.zalocoders.assignmentninja.R

class MyContractsFragment : Fragment() {

    lateinit var c: Context
    lateinit var v:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.my_contracts_fragment, container, false)
        loadContracts()
        return v;

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        c = context
    }


    fun loadContracts(){


        val contractsList = mutableListOf<Assignment>()

        val ass1 = Assignment("1","Financial Accounting","Active","Need a work around this assignment due tomorrow","2","ksh 1000","08.08.2020")

        for(i in 1..900){

            contractsList.add(ass1)

        }



        val contractsListRecyclerView = v.findViewById(R.id.contractsListRecyclerView) as RecyclerView

        val adapter = ContractsAdapter(contractsList,c)

        contractsListRecyclerView.layoutManager = LinearLayoutManager(c)

        contractsListRecyclerView.adapter = adapter





    }

}