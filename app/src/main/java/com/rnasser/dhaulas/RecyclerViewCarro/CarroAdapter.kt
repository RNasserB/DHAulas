package com.rnasser.dhaulas.RecyclerViewCarro

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rnasser.dhaulas.R
import com.squareup.picasso.Picasso

class CarroAdapter(
    private var lCarros: List<Carros>,
    private val carroView: MainActivityRecyclerCarro
) : RecyclerView.Adapter<CarroAdapter.CarroViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarroAdapter.CarroViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout_carro, parent, false)

        return CarroAdapter.CarroViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarroAdapter.CarroViewHolder, position: Int) {

        holder.nomeCarro.text = lCarros[position].nomeCarro
        holder.descricaoCarro.text = lCarros[position].descricaoCarro
        holder.valorCarro.text = lCarros[position].valorCarro

        Picasso.get()
            .load(lCarros[position].imagemUrlCarro)
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imagemCarro)

    }

    override fun getItemCount(): Int {
        return lCarros.size
    }

    class CarroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagemCarro: ImageView = itemView.findViewById(R.id.item_imagemCarro)
        var nomeCarro: TextView = itemView.findViewById(R.id.item_nomeCarro)
        var descricaoCarro: TextView = itemView.findViewById(R.id.item_descricaoCarro)
        var valorCarro: TextView = itemView.findViewById(R.id.item_valorCarro)
    }


}