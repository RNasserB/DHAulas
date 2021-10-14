package com.rnasser.dhaulas.exercicio28

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isVisible
import com.rnasser.dhaulas.R
import java.lang.RuntimeException

class FragmentExer2804 : Fragment() {

    private lateinit var callback: IComunicadorExer
    private lateinit var botaoZerar: Button

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
        val view: View = inflater.inflate(R.layout.fragment_exer2804, container, false)

        botaoZerar = view.findViewById(R.id.bt_zerar)
        view.isVisible = false

        botaoZerar.setOnClickListener {
            callback.setContador(0)
            callback.contarClicks()
        }

        return view
    }

    fun ocultarFragmentoZerar(valor: Boolean) {
        view?.isVisible = !valor
    }

}