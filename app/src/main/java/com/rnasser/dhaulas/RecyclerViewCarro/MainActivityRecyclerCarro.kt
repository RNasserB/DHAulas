package com.rnasser.dhaulas.RecyclerViewCarro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R
import com.rnasser.dhaulas.RecyclerViewExemplo.Contato
import com.rnasser.dhaulas.RecyclerViewExemplo.RecyclerViewAdapter

class MainActivityRecyclerCarro : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CarroAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler_carro)

        initComponents()

    }

    private fun initContacList(): MutableList<Carros> {

        val lCarros = mutableListOf(
            Carros(
                "Mustang",
                "https://icon-library.com/images/muscle-car-mustang-gt-icon_83164.png",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "R$ 150.000,00"
            ),
            Carros(
                "Ferrari",
                "https://icon-library.com/images/sport-car-icon-0.png",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "R$ 575.000,00"
            ),
            Carros(
                "Audi",
                "https://icon-library.com/images/audi-tt-icon.png",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "R$ 380.000,00"
            )
        )
        return lCarros
    }

    private fun initComponents() {

        val lCarros = initContacList()
        recyclerView = findViewById(R.id.recycler_view_carro)
        adapter = CarroAdapter(lCarros, this)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = adapter

    }


}