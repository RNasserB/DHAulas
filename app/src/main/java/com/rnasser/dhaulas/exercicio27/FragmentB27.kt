package com.rnasser.dhaulas.exercicio27

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rnasser.dhaulas.R
import java.lang.RuntimeException


class FragmentB27 : Fragment() {
    private var listener: IFragmentB27Listener? = null

    private lateinit var nomeB: TextView
    private lateinit var idadeB: TextView
    private lateinit var emailB: TextView
    private lateinit var senhaB: TextView
    private lateinit var confirmarSenhaB: TextView


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IFragmentB27Listener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + "FragmentBListener não implementado")
        }
    }

    interface IFragmentB27Listener {
        fun enviarDadosB(
            nome: String,
            idade: String,
            email: String,
            senha: String,
            confirmarSenha: String
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_b27, container, false)
        nomeB = requireView().findViewById(R.id.text_nome_fragmentB)
        idadeB = requireView().findViewById(R.id.text_idade_fragmentB)
        emailB = requireView().findViewById(R.id.text_email_fragmentB)
        senhaB = requireView().findViewById(R.id.text_senha_fragmentB)
        confirmarSenhaB = requireView().findViewById(R.id.text_confirmSenha_fragmentB)


        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_b27, container, false)
        return view
    }

    fun atualizaB(
        nome: String,
        idade: String,
        email: String,
        senha: String,
        confirmarSenha: String
    ) {
        nomeB.setText(nome)
        idadeB.setText(idade)
        emailB.setText(email)
        senhaB.setText(senha)
        confirmarSenhaB.setText(confirmarSenha)
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}