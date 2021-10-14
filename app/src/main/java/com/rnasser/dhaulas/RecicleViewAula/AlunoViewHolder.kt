package com.rnasser.dhaulas.RecicleViewAula

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R

class AlunoViewHolder(view: View): RecyclerView.ViewHolder(view) {

    var nome: TextView = view.findViewById(R.id.item_nome)
    var card: CardView = view.findViewById(R.id.item_card)

}