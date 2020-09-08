package com.zalocoders.assignmentninja.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.zalocoders.assignmentninja.Data.Models.Assignment
import com.zalocoders.assignmentninja.R
import com.zalocoders.assignmentninja.Views.Activities.ViewAssignmentActivity

class AssignmentAdapter(val context: Context, val assignmentrList: List<Assignment>) : RecyclerView.Adapter<AssignmentAdapter.ViewHolder>() {
    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AssignmentAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.assignment_item, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: AssignmentAdapter.ViewHolder, position: Int) {
        holder.bindItems(assignmentrList[position],context)
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return assignmentrList.size
    }

    //the class is holding the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(subject : Assignment, context: Context) {


            val name  = itemView.findViewById(R.id.name) as TextView
            name.text = subject.name
            val description = itemView.findViewById(R.id.description) as TextView
            description.text = subject.Description
            val dueDate = itemView.findViewById(R.id.dueDate) as TextView
            dueDate.text = subject.dueDate


            itemView.setOnClickListener {
                val i =  Intent(context,ViewAssignmentActivity::class.java)
                i.putExtra("assignmentId",subject.id)
                context.startActivity(i)
            }

        }
    }
}