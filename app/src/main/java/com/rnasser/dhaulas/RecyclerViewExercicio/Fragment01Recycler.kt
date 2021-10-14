package com.rnasser.dhaulas.RecyclerViewExercicio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R

class Fragment01Recycler(var lDados: MutableList<CardapioItem>) : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager


    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_fragment01_recycler, container, false)

        recyclerView = view.findViewById(R.id.recycler_frag_01)

        layoutManager = LinearLayoutManager(view.context, VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = CardapioAdapter(view.context, lDados)

        return view
    }

}