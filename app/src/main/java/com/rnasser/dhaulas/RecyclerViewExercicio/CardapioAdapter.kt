package com.rnasser.dhaulas.RecyclerViewExercicio

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R
import com.squareup.picasso.Picasso

class CardapioAdapter(val context: Context, var lDados: MutableList<CardapioItem>) :
    RecyclerView.Adapter<CardapioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardapio, parent, false)
        return CardapioViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardapioViewHolder, position: Int) {
        val item = lDados[position]

        holder.nome.text = item.nome
        holder.descricao.text = item.descricao
        holder.valor.text = item.valor.toString()
        Picasso.get()
            .load(item.imagem)
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imagem)
    }

    override fun getItemCount(): Int {
        return lDados.size
    }


}