package com.chuks.barcelonaclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chuks.barcelonaclub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            HomePage()
        }
    }

    private fun HomePage() {
        val username: String = binding.userName.text.toString()
        val password: String = binding.TextPassword.text.toString()
        val phoneNo: String = binding.TextPhone.text.toString()
        val Intent: Intent = Intent(this, HomeActivity::class.java)
        startActivity(Intent)
    }
    }
