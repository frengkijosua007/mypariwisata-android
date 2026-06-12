package com.siswa.praktikum.pariwisata.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.siswa.praktikum.pariwisata.R
import com.siswa.praktikum.pariwisata.model.Pantai
import java.util.Locale


class PantaiAdapter(var pantaiList: ArrayList<Pantai>): RecyclerView.Adapter<PantaiAdapter.PantaiViewHolder>(), Filterable {

    lateinit var clickListener: PantaiClickListener

    var pantaiFilteredList = ArrayList<Pantai>()

    init {
        pantaiFilteredList = pantaiList
    }

    class PantaiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView
        val txt: TextView

        init {
           img = itemView.findViewById<ImageView>(R.id.imgPantai)
           txt = itemView.findViewById<TextView>(R.id.namaPantai)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PantaiViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pantai, parent, false)

        return PantaiViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pantaiFilteredList.size
    }

    override fun onBindViewHolder(holder: PantaiViewHolder, position: Int) {
        val item = pantaiFilteredList.get(position)
        holder.img.setImageResource(item.gambar)
        holder.txt.setText(item.nama)

        holder.img.setOnClickListener {
            clickListener.onPantaiClicked(it, item)
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    pantaiFilteredList = pantaiList
                } else {
                    val resultList = ArrayList<Pantai>()
                    for (row in pantaiList) {
                        if (row.nama.lowercase(Locale.ROOT).contains(charSearch.lowercase(Locale.ROOT))) {
                            resultList.add(row)
                        }
                    }
                    pantaiFilteredList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = pantaiFilteredList
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                pantaiFilteredList = results?.values as ArrayList<Pantai>
                notifyDataSetChanged()
            }
        }
    }
}