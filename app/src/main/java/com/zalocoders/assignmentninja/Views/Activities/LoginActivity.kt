package com.zalocoders.assignmentninja.Views.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.zalocoders.assignmentninja.Data.Models.AppModels
import com.zalocoders.assignmentninja.Data.api.ApiService
import com.zalocoders.assignmentninja.Data.api.NetworkService
import com.zalocoders.assignmentninja.R
import com.zalocoders.assignmentninja.Utils.Status
import com.zalocoders.assignmentninja.Utils.ViewModelFactory
import com.zalocoders.assignmentninja.ViewModel.AuthViewModel
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var viewModel: AuthViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //settingViewModel
        setUpViewModel()

        //observers
        setObservers()

        goSignUp.setOnClickListener {
            val i  =  Intent(this,SignUpActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
        }

        login.setOnClickListener {
            val i  =  Intent(this,MainActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
        }
    }

    fun setUpViewModel(){

        viewModel = ViewModelProvider(
            this,
            ViewModelFactory(NetworkService.apiService)
        ).get(AuthViewModel::class.java)
    }

    
    fun setObservers(){

        val user  = AppModels.LoginUser("austinezalo@gmail.com","1234")
        
        viewModel.loginUser(user).observe(this, Observer {
            it.let { resource -> 
                when(resource.status){
                    
                    Status.SUCCESS ->{
                        
                        resource.data?.let {
                            commonResponse ->
                            Toast.makeText(this,commonResponse.responseDetails,Toast.LENGTH_LONG).show()
                        }
                        
                    }

                    Status.ERROR ->{
                        resource.data?.let {
                                commonResponse ->
                            Toast.makeText(this,commonResponse.responseDetails,Toast.LENGTH_LONG).show()
                        }

                    }

                    Status.LOADING ->{

                        resource.data?.let {
                                commonResponse ->
                            Toast.makeText(this,commonResponse.responseDetails,Toast.LENGTH_LONG).show()
                        }                    }
                }
            }
        })
    }


}