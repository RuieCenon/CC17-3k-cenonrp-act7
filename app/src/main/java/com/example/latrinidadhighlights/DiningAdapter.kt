package com.example.latrinidadhighlights

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DiningAdapter(
	private var eatsOptions: List<Eats>,  // Change 'val' to 'var'
	private val onItemClick: (Eats) -> Unit
) : RecyclerView.Adapter<DiningAdapter.DiningViewHolder>() {

    class DiningViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
        val titleView: TextView = itemView.findViewById(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiningViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return DiningViewHolder(view)
    }

    override fun onBindViewHolder(holder: DiningViewHolder, position: Int) {
        val dining = eatsOptions[position]
        holder.imageView.setImageResource(dining.imageResId)
        holder.titleView.text = dining.name
        holder.itemView.setOnClickListener { onItemClick(dining) }
    }

    override fun getItemCount() = eatsOptions.size

    // Add this method to the DiningAdapter class
    fun updateDiningOptions(newEatsOptions: List<Eats>) {
        eatsOptions = newEatsOptions
        notifyDataSetChanged()
    }
}
