package com.moha.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moha.loginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()

{
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginbutton.setOnClickListener{
            var password = binding.password.text.toString()
            var username = binding.username.text.toString()

            val intent = Intent(this,info::class.java)
            intent.putExtra(Constant.myusername,username)
            intent.putExtra(Constant.mypassword,password)
            startActivity(intent)
        }
    }
}