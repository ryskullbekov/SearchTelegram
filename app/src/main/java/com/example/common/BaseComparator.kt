package com.example.common

import androidx.recyclerview.widget.DiffUtil

class BaseComparator<T : IBaseDiffModel> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.Name == newItem.Name
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.Name == newItem.Name
    }
}