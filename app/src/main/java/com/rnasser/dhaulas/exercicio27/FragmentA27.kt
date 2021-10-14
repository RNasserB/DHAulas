package com.rnasser.dhaulas.exercicio27

import android.content.Context
import android.os.Bundle
import android.os.ProxyFileDescriptorCallback
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.rnasser.dhaulas.R
import java.lang.RuntimeException


class FragmentA27 : Fragment() {

    //    private var callback: IFragmentA27Listener? = null
    private var listener: FragmentA27.IFragmentA27Listener? = null

    private lateinit var nome: EditText
    private lateinit var idade: EditText
    private lateinit var email: EditText
    private lateinit var senha: EditText
    private lateinit var confirmarSenha: EditText
    private lateinit var botaoCadastrar: Button

    interface IFragmentA27Listener {
        fun enviarDadosA(
            nome: String,
            idade: String,
            email: String,
            senha: String,
            confirmarSenha: String
        )
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IFragmentA27Listener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + "FragmentAListener não implementado")
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_a27, container, false)
        nome = view.findViewById(R.id.edit_text_nome_fragmentA)
        idade = view.findViewById(R.id.edit_text_idade_fragmentA)
        email = view.findViewById(R.id.edit_text_email_fragmentA)
        senha = view.findViewById(R.id.edit_text_senha_fragmentA)
        confirmarSenha = view.findViewById(R.id.edit_text_confirmSenha_fragmentA)
        botaoCadastrar = view.findViewById(R.id.button_cadastrar)

        botaoCadastrar.setOnClickListener {
            listener?.enviarDadosA(
                nome?.text.toString(),
                idade?.text.toString(),
                email?.text.toString(),
                senha?.text.toString(),
                confirmarSenha?.text.toString()
            )
        }


        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_a27, container, false)
        return view
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}