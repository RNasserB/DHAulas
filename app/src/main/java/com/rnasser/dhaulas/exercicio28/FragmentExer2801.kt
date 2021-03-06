package com.rnasser.dhaulas.exercicio28

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.rnasser.dhaulas.R

class FragmentExer2801 : Fragment() {

    private lateinit var callback: IComunicadorExer
    private lateinit var botaoMais: Button

    override fun onAttach(activity: Context) {
        super.onAttach(activity)
        if (activity is IComunicadorExer) {
            callback = activity
        } else {
            throw RuntimeException(context.toString() + "Callback não implementado")
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_exer2801, container, false)

        botaoMais = view.findViewById(R.id.bt_mais)

        botaoMais.setOnClickListener {
            callback.setContador(1)
            callback.contarClicks()
        }
        return view
    }


}