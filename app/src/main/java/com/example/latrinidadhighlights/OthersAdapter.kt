package com.example.latrinidadhighlights

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OthersAdapter(private var othersExperiences: List<Others>, private val onItemClick: (Others) -> Unit) :
    RecyclerView.Adapter<OthersAdapter.ShoppingViewHolder>() {

    class ShoppingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
        val titleView: TextView = itemView.findViewById(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ShoppingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        val shopping = othersExperiences[position]
        holder.imageView.setImageResource(shopping.imageResId)
        holder.titleView.text = shopping.name
        holder.itemView.setOnClickListener { onItemClick(shopping) }
    }

    override fun getItemCount() = othersExperiences.size

    fun updateShoppingExperiences(newOthersExperiences: List<Others>) {
        othersExperiences = newOthersExperiences
        notifyDataSetChanged()
    }
}



