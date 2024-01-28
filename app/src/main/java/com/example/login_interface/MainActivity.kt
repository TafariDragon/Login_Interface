package com.example.login_interface

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login_interface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnEntrar.setOnClickListener {
            var id = binding.txtID.text.toString().trim()
            var senha= binding.txtSenha.text.toString().trim()
            if(id.isEmpty()|| senha.isEmpty())
            {
                Toast.makeText(this, "Campos vazios", Toast.LENGTH_LONG).show()
            }else if(id.equals("123")&& senha.equals("Tafari")){
                Toast.makeText(this, "Seja Bem Vindo :)", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"id ou senha incorrecta",Toast.LENGTH_LONG).show()
            }
        }



        binding.btnCriar.setOnClickListener {
            startActivity(Intent(this,CreateAccount::class.java))
        }

    }
}