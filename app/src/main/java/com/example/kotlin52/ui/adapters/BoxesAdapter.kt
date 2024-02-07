package com.example.kotlin52.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin52.data.models.Box
import com.example.kotlin52.databinding.ItemBoxBinding

class BoxesAdapter : RecyclerView.Adapter<BoxesAdapter.BoxViewHolder>() {
    private var boxList = mutableListOf<Box>()

    fun setBoxes(boxList: MutableList<Box>) {
        this.boxList = boxList
        notifyDataSetChanged()
    }

    inner class BoxViewHolder(private val binding: ItemBoxBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(box: Box) {
            binding.imItem.setImageResource(box.image)
            binding.tvItemBox.text = box.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxViewHolder {
        val binding = ItemBoxBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BoxViewHolder(binding)
    }

    override fun getItemCount() = boxList.size

    override fun onBindViewHolder(holder: BoxViewHolder, position: Int) {
        holder.onBind(boxList[position])
    }
}