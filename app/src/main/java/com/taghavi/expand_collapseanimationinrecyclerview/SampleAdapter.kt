package com.taghavi.expand_collapseanimationinrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taghavi.expand_collapseanimationinrecyclerview.databinding.ItemSampleBinding

class SampleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        ItemViewHolder(
            ItemSampleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = 12

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    class ItemViewHolder(var viewBinding: ItemSampleBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

    }
}
