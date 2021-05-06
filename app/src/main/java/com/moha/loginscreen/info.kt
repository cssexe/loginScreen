package com.moha.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moha.loginscreen.databinding.ActivityInfoBinding

class info : AppCompatActivity() {
    lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var username = intent.getStringExtra(Constant.myusername)
        var passwrod = intent.getStringExtra(Constant.mypassword)

        binding.userpassing.setText(username)
        binding.passpassing.setText(passwrod)
    }
}