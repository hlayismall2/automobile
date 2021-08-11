package com.example.flylettuceautomobilesurgery.ui.home

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.flylettuceautomobilesurgery.R

//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProvider
//import com.example.flylettuceautomobilesurgery.R
//
//class HomeFragment : Fragment() {
//
//    private lateinit var homeViewModel: HomeViewModel
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
//}

class RecyclerViewAdapter : RecyclerViewAdapter<RecyclerViewAdapter.ViewAdapter>(){


    private val itemTitles = arrayOf("get quote","services")

    private val itemDetails = arrayOf("ruest quote","check our services")
    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var textTitle: TextView
        var textDes: TextView

        init {
            image = itemView.findViewById(R.id.item_image)
        textTitle=itemView.findViewById(R.id.card_title)
        textDes = itemView.findViewById(R.id.card_details)}
    }
}