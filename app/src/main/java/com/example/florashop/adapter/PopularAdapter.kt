package com.example.florashop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.florashop.databinding.PopularItemsBinding

class PopularAdapter (private val item:List<String>,private val price:List<String>,private val image:List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
       return PopularViewHolder(PopularItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val items = item[position]
        val images= image [position]
        val prices=price [position]
        holder.bind(items,prices,images)
    }
    override fun getItemCount(): Int {
     return item.size
    }
    class PopularViewHolder(private val binding: PopularItemsBinding): RecyclerView.ViewHolder(binding.root) {
       private val imageView=binding.imageView6
        fun bind(item:String, price: String, images: Int) {
            binding.Flowernamepopular.text= item
            binding.pricepopular.text=price
            imageView.setImageResource(images)



        }

    }
}