package com.example.searchtelegram.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.searchtelegram.data.User
import com.example.searchtelegram.databinding.ItemSerachBinding

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.MyViewHolder>() {

    private var oldData = emptyList<User>()

    class MyViewHolder(val binding: ItemSerachBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemSerachBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.ageTextView.imageAlpha = oldData[position].Image
        holder.binding.firstNameTextView.text = oldData[position].Name
        holder.binding.lastNameTextView.text = oldData[position].Times
    }

    override fun getItemCount(): Int {
        return oldData.size
    }

    fun setData(newData: List<User>) {
        oldData = newData
        notifyDataSetChanged()
    }


}