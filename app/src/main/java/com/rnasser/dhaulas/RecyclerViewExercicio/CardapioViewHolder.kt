package com.rnasser.dhaulas.RecyclerViewExercicio

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R

class CardapioViewHolder(view: View): RecyclerView.ViewHolder(view) {

    var nome: TextView = view.findViewById(R.id.item_nome)
    var valor: TextView = view.findViewById(R.id.item_preco)
    var descricao: TextView = view.findViewById(R.id.item_description)
    var imagem: ImageView = view.findViewById(R.id.item_imagem)


}