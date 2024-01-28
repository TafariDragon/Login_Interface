package com.example.login_interface

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login_interface.databinding.ActivityCreateAccountBinding

class CreateAccount : AppCompatActivity() {

    private  lateinit var binding: ActivityCreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCriarConta.setOnClickListener {
            finish()
        }

        binding.btnSair.setOnClickListener {
            finish()
        }
    }
}