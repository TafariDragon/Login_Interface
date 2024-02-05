package com.example.login_interface

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login_interface.databinding.ActivityTelaInicialBinding

class TelaInicial : AppCompatActivity() {
    private lateinit var  binding: ActivityTelaInicialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)

       var i = intent
        var nome = i.extras?.getString("usuario")

        binding.lblReceptor.setText("Seja bem Vindo ${nome}")

    }
}