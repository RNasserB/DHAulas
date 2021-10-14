package com.rnasser.dhaulas.RecicleViewAula

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout.VERTICAL
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R

@SuppressLint("WrongConstant")
class ActRecycler : AppCompatActivity(), IOnClick {

    private var itensClicados = mutableListOf<Int>()
    private var totalClicks: Int = 0

    private val recycler by lazy {
        RecyclerView(this)
    }

    private val manager by lazy {
        LinearLayoutManager(this, VERTICAL, false )
    }

    private val alunos = listOf(
        "Rafinha",
        "Henrique",
        "Andreia",
        "Daniel",
        "Pedro",
        "Giulia",
        "Felipe"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_act_recycler)
        setContentView(recycler)

        recycler.layoutManager = manager
        recycler.adapter = AdapterAlunos(this, alunos)
    }

    override fun onClickElement(position: Int) {
        if (!itensClicados.contains(position)) {
            itensClicados.add(position)
        }
        Toast.makeText(
            this,
            "Itens: $itensClicados" + "\n Clicks: ${++totalClicks}",
            Toast.LENGTH_SHORT
        ).show()
    }
}