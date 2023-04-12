package com.example.asanbekov_5.onBoard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.asanbekov_5.R
import com.example.asanbekov_5.databinding.ItemOnBoardBinding
import com.example.asanbekov_5.model.OnBoard


class OnBoardAdapter(private val onStartClick: () -> Unit) :
    Adapter<OnBoardAdapter.OnBoardViewHolder>() {

    private val data = arrayListOf(
        OnBoard(
            "Have a good time",
            "You should take the time to help those who need you",
            R.drawable.img_4
        ),
        OnBoard(
            "Cherishing love",
            "It is now no longer possible for you to cherish love",
            R.drawable.img_6
        ),
        OnBoard(
            "Have a break up?",
            "We have made the correction for you don't worry. Maybe someone is waiting for you",
            R.drawable.img_5
        ),
        OnBoard(
            "It's Funs and Many more", "",
            R.drawable.img_7
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardViewHolder {
        return OnBoardViewHolder(
            ItemOnBoardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size

    inner class OnBoardViewHolder(private val binding: ItemOnBoardBinding) :
        ViewHolder(binding.root) {
        fun bind(onBoard: OnBoard) {
            binding.apply {
                imgBoard.setImageResource(onBoard.image)
                tvTittle.text = onBoard.tittle
                tvDescription.text = onBoard.desc
            }
            binding.btnStart.isVisible = adapterPosition == data.lastIndex
            binding.btnStart.setOnClickListener {
                onStartClick()
            }
        }
    }
}