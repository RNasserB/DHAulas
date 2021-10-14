package com.rnasser.dhaulas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityAula24_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_aula242)

        var recebeNome = findViewById<TextView>(R.id.txt_recebeNome)
        var recebeEmail = findViewById<TextView>(R.id.txt_recebeEmail)

        val dadosNome = intent.getStringExtra("nome")
        val dadosEmail = intent.getStringExtra("email")

        recebeNome.text = "Nome do Usuário: $dadosNome"
        recebeEmail.text = "Nome do Usuário: $dadosEmail"

    }


}