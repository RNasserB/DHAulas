package com.rnasser.dhaulas.RecyclerViewExemplo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView



class RecyclerViewAdapter(
    private var lContatos: List<Contato>,
    private val contatoView: MainActivityRecyclerViewExemplo
): RecyclerView.Adapter<RecyclerViewAdapter.ContatoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)

        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {

        Picasso.get()
            .load(lContatos[position].imagemUrlContato)
            .placeholder(R.drawable.ic_launcher_background)
            .into((holder.imagem))

        holder.nome.text = lContatos[position].nomeContato

    }

    override fun getItemCount(): Int {
        return lContatos.size
    }

    class ContatoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var imagem: CircleImageView = itemView.findViewById(R.id.item_imagem)
        var nome: TextView = itemView.findViewById(R.id.item_nome)

    }



}