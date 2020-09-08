package com.zalocoders.assignmentninja.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.zalocoders.assignmentninja.Data.Models.Category
import com.zalocoders.assignmentninja.R

class CategotyAdapter(val context: Context, val userList: List<Category>) : RecyclerView.Adapter<CategotyAdapter.ViewHolder>() {
    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategotyAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.chip, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CategotyAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position],context)
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(subject : Category, context: Context) {
            val chip = itemView.findViewById(R.id.chip) as Chip
            chip.text = subject.name


            chip.setOnClickListener{
//              //  val goToDeadline = Intent(context, DeadlineActivity::class.java)
//                context.startActivity(goToDeadline)

            }

        }
    }
}