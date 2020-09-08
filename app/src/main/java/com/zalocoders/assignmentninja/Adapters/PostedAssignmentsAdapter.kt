package com.zalocoders.assignmentninja.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.zalocoders.assignmentninja.Data.Models.Assignment
import com.zalocoders.assignmentninja.R


class PostedAssignmentsAdapter(val postedAssignmentList:List<Assignment>,val context: Context)  : RecyclerView.Adapter<PostedAssignmentsAdapter.ViewHolder>() {



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(postedAssignment : Assignment, context: Context){



            val name  = itemView.findViewById(R.id.name) as TextView
            name.text = postedAssignment.name


            val description = itemView.findViewById(R.id.description) as TextView
            description.text = postedAssignment.Description

            val dueDate = itemView.findViewById(R.id.dueDate) as TextView
            dueDate.text = postedAssignment.dueDate

            val price = itemView.findViewById(R.id.price) as TextView
            price.text = postedAssignment.price
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       val view = LayoutInflater.from(parent.context).inflate(R.layout.assignment_item, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return postedAssignmentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            holder.bind(postedAssignmentList[position],context)
    }


}

