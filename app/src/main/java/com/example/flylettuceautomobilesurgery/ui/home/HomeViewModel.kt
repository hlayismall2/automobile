package com.example.flylettuceautomobilesurgery.ui.home


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.flylettuceautomobilesurgery.R


class HomeViewModel : RecyclerView.Adapter<HomeViewModel.ViewHolder>(){


    private val itemTitles = arrayOf("get quote","services")

    private val itemDetails = arrayOf("request quote","check our services")

    private val itemImage = arrayOf(R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_foreground)


    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var textTitle: TextView
        var textDes: TextView

        init {
            image = itemView.findViewById(R.id.item_image)
            textTitle=itemView.findViewById(R.id.card_title)
            textDes = itemView.findViewById(R.id.card_details)}
    }

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int) :ViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.card_view_model,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder,position: Int) {
        holder.textTitle.text = itemTitles [position]
        holder.textDes.text = itemDetails [position]
        holder.image.setImageResource(itemImage [position])

        holder.itemView.setOnClickListener{ v: View ->

            Toast.makeText(v.context,"Clicked on the item", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }
}