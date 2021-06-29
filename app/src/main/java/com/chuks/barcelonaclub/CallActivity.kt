package com.chuks.barcelonaclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chuks.barcelonaclub.databinding.ActivityCallBinding

class CallActivity : AppCompatActivity() {
    lateinit var binding: ActivityCallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)
        binding = ActivityCallBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.CallButton.setOnClickListener {
            makeCall()
        }
    }

    fun makeCall() {
        val intent: Intent = Intent(Intent.ACTION_DIAL)
        startActivity(intent)
    }
    }
