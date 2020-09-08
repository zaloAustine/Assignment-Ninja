package com.zalocoders.assignmentninja.Views.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ScrollView
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zalocoders.assignmentninja.Adapters.AssignmentAdapter
import com.zalocoders.assignmentninja.Data.Models.Assignment
import com.zalocoders.assignmentninja.R
import kotlinx.android.synthetic.main.activity_view_assignment.*

class ViewAssignmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_assignment)

        supportActionBar?.title = "Financial Accounting"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        scrollView.fullScroll(ScrollView.FOCUS_UP)

        loadRelatedAssignments()
    }

    fun loadRelatedAssignments(){

        val assignmentlist = mutableListOf<Assignment>()

        val ass1 = Assignment("1","Financial Accounting","Active","Need a work around this assignment due tomorrow","2","ksh 1000","08.08.2020")

        for (i in 1..1000){
            assignmentlist.add(ass1)

        }

        val assignmentadapter = AssignmentAdapter(this,assignmentlist)

        val relatedAssignmentRecycler = findViewById(R.id.relatedAssignmentRecycler) as RecyclerView
        relatedAssignmentRecycler.layoutManager  = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        relatedAssignmentRecycler.adapter = assignmentadapter
        ViewCompat.setNestedScrollingEnabled(relatedAssignmentRecycler,false)
        assignmentadapter.notifyDataSetChanged()

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> onBackPressed()
        }

        return true

    }

}