package com.rnasser.dhaulas.exercicio28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rnasser.dhaulas.R

class MainActivityExer28 : AppCompatActivity(), IComunicadorExer {

    private lateinit var fragmento01: FragmentExer2801
    private lateinit var fragmento02: FragmentExer2802
    private lateinit var fragmento03: FragmentExer2803
    private lateinit var fragmento04: FragmentExer2804
    private lateinit var fragmento05: FragmentExer2805

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_exer28)

        initFragments()
    }

    private fun initFragments() {
        fragmento01 = FragmentExer2801()
        fragmento02 = FragmentExer2802()
        fragmento03 = FragmentExer2803()
        fragmento04 = FragmentExer2804()
        fragmento05 = FragmentExer2805()

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container_01_ex03, fragmento01)
        fragmentTransaction.add(R.id.container_02_ex03, fragmento02)
        fragmentTransaction.add(R.id.container_03_ex03, fragmento03)
        fragmentTransaction.add(R.id.container_04_ex03, fragmento04)
        fragmentTransaction.add(R.id.container_05_ex03, fragmento05)
        fragmentTransaction.commit()
    }

    override fun contarClicks() {
        fragmento05.setClicks()
    }

    override fun setContador(contador: Int) {
        fragmento02.setContador(contador)
    }

    override fun ocultarFragmentoZerar(valor: Boolean) {
        fragmento04.ocultarFragmentoZerar(valor)
    }
}