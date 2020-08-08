package com.qdreamcaller.creativeminddesign

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_order.view.*

class OrderAdapter(private val orders: ArrayList<OrderModel>) :
    RecyclerView.Adapter<OrderAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(model: OrderModel) {
            itemView.apply {
                tv_title.text = model.title
                tv_time.text = model.time
                tv_gender.text = model.gender
                tv_number.text = model.number
                tv_type.text = model.type
                iv_order.setImageResource(model.icon)


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.single_order, parent, false)
        )

    override fun getItemCount(): Int = orders.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(orders[position])

    }

    fun addOrder(repoList: List<OrderModel>) {
        this.orders.apply {
            addAll(repoList)
        }

    }
}
