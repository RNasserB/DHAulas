package com.rnasser.dhaulas.exercicio28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rnasser.dhaulas.R

class MainActivity28 : AppCompatActivity(), IComunicador {

    //declaração dos fragmentos que são adicionados na Activity
    private lateinit var fragment1: FragmentA28
    private lateinit var fragment2: FragmentB28


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main28)

        //função que vai inicializar e adicionar os fragmentos na activity
        initFragments()
    }

    private fun initFragments() {

        // cria objetos dos fragmentos A e B
        fragment1 = FragmentA28()
        fragment2 = FragmentB28()


        supportFragmentManager.beginTransaction()
            .add(R.id.container_a28, fragment1)
            .add(R.id.container_b28, fragment2)
            .commit()

    }

    override fun somar() {
        fragment2.setResult(1)
    }

    override fun diminuir() {
        fragment2.setResult(-1)
    }


}