package com.qdreamcaller.creativeminddesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_waiting.*

/**
 * A simple [Fragment] subclass.
 */
class WaitingFragment : Fragment() {
    private lateinit var adapter: OrderAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_waiting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initAdapter()

    }

    private fun initAdapter() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = OrderAdapter(getData())
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )
        recyclerView.adapter = adapter

    }

    private fun getData() :ArrayList<OrderModel>{
        val data = ArrayList<OrderModel>()
        data.add(
            OrderModel(
                R.mipmap.type_car,
                "Baba I need your car please baba",
                "5hour",
                "men",
                "Car",
                "two"
            )
        )
        data.add(
            OrderModel(
                R.mipmap.type_food,
                "Want to go to Cinema to watch film",
                "hour",
                "woman",
                "car",
                "one"
            )
        )


        return data
    }
}
