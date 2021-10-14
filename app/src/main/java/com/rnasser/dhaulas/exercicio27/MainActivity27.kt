package com.rnasser.dhaulas.exercicio27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rnasser.dhaulas.R

class MainActivity27 : AppCompatActivity(), FragmentA27.IFragmentA27Listener,
    FragmentB27.IFragmentB27Listener {

    private lateinit var fragmentA: FragmentA27
    private lateinit var fragmentB: FragmentB27


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main27)

        fragmentA = FragmentA27()
        fragmentB = FragmentB27()

        supportFragmentManager.beginTransaction()
            .add(R.id.container_a27, fragmentA)
            .add(R.id.container_b27, fragmentB)
            .commit()


    }

    override fun enviarDadosA(
        nome: String,
        idade: String,
        email: String,
        senha: String,
        confirmarSenha: String
    ) {
        fragmentB.atualizaB(
            nome,
            idade,
            email,
            senha,
            confirmarSenha
        )
    }

    override fun enviarDadosB(
        nome: String,
        idade: String,
        email: String,
        senha: String,
        confirmarSenha: String
    ) {
        TODO("Not yet implemented")
    }


}
