package com.zalocoders.assignmentninja.Views.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.squareup.picasso.Picasso
import com.zalocoders.assignmentninja.R
import kotlinx.android.synthetic.main.splash_activity.*


class SplashScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        goLoginScreen.setOnClickListener {
            val i  =  Intent(this,LoginActivity::class.java)
            startActivity(i)
        }


        gosignup.setOnClickListener {
            val i  =  Intent(this,SignUpActivity::class.java)
            startActivity(i)
        }
    }



}