package com.rnasser.dhaulas.exercicio28

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.rnasser.dhaulas.R
import java.lang.RuntimeException

class FragmentExer2803 : Fragment() {

    private lateinit var callback: IComunicadorExer
    private lateinit var botaoMenos: Button

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
        val view: View = inflater.inflate(R.layout.fragment_exer2803, container, false)

        botaoMenos = view.findViewById(R.id.bt_menos)

        botaoMenos.setOnClickListener {
            callback.setContador(-1)
            callback.contarClicks()
        }
        return view
    }

}