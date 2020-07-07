package com.example.chapter6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.chapter6.R
import com.example.chapter6.model.Forbes
import kotlinx.android.synthetic.main.item_cardview_forbes.view.*

class CardViewAdapter(private val listForbes: ArrayList<Forbes>) : RecyclerView.Adapter<CardViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_forbes, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listForbes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listForbes[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(forbes: Forbes) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(forbes.photo).apply(RequestOptions().override(350, 550))
                    .into(img_photo)

                tv_name.text = forbes.name
                tv_desc.text = forbes.description
            }
        }
    }
}