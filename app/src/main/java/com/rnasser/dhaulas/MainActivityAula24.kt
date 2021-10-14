package com.rnasser.dhaulas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivityAula24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_aula24)

        val btnConfirmacao = findViewById<Button>(R.id.btn_confirmacao)
        val txtNome = findViewById<TextView>(R.id.txt_nome)
        val txtEmail = findViewById<TextView>(R.id.txt_email)


        btnConfirmacao.setOnClickListener {
            val intent = Intent(this, MainActivityAula24_2::class.java)
            intent.putExtra("nome", txtNome.text.toString())
            intent.putExtra("email", txtEmail.text.toString())
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()


        }

    }


}