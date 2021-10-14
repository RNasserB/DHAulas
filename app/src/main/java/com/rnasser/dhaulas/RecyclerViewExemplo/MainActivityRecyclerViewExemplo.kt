package com.rnasser.dhaulas.RecyclerViewExemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R

class MainActivityRecyclerViewExemplo : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler_view_exemplo)

        initComponents()

    }

    private fun initContacList(): MutableList<Contato> {

        val lContatos = mutableListOf(
            Contato(
                "Jonatas",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"
            ),
            Contato(
                "Maria",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"
            ),
            Contato(
                "João",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"
            ),
            Contato(
                "Jamilli",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"
            ),
            Contato(
                "Matheus",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"
            ),
            Contato(
                "Lara",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"
            ),
            Contato(
                "Pedro",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"
            ),
            Contato(
                "Mariana",
                "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"
            ),
            Contato("Cesar", "url")
        )
        return lContatos
    }

    private fun initComponents() {

        val lContatos = initContacList()
        recyclerView = findViewById(R.id.recycler_view)
        adapter = RecyclerViewAdapter(lContatos, this)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = adapter

    }
}