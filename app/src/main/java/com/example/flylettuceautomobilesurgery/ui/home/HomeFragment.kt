package com.example.flylettuceautomobilesurgery.ui.home



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flylettuceautomobilesurgery.R

class HomeFragment : Fragment() {

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<HomeViewModel.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home,container, false)
        val recyclerView : RecyclerView = root.findViewById(R.id.recyclerView)
//        layoutManager = LinearLayout(this)
        recyclerView.layoutManager = layoutManager
        adapter = HomeViewModel ()
        recyclerView.adapter = adapter

        return root
    }
}

