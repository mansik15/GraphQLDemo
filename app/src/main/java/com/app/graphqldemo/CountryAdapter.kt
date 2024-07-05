package com.app.graphqldemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(val context: Context, val countryList: List<FindCountriesOfAContinentQuery.Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {


    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val ItemsViewModel = countryList[position]
        holder.tv_country.text = ItemsViewModel.name
        holder.tv_currency.text = ItemsViewModel.currency
        holder.tv_phone.text = ItemsViewModel.phone
        holder.tv_emoji.text = ItemsViewModel.emoji
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    // Holds the views for adding it to image and text
    class CountryViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val tv_country: TextView = itemView.findViewById(R.id.tv_country)
        val tv_currency: TextView = itemView.findViewById(R.id.tv_currency)
        val tv_phone: TextView = itemView.findViewById(R.id.tv_phone)
        val tv_emoji: TextView = itemView.findViewById(R.id.tv_emoji)
    }

}
