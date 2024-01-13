package com.example.cryptoapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.cryptoapp.databinding.ItemCoinInfoBinding
import com.example.cryptoapp.pojo.CoinPriceInfo
import com.squareup.picasso.Picasso

class CoinInfoAdapter : Adapter<CoinInfoAdapter.CoinInfoViewHolder>() {

    lateinit var binding: ItemCoinInfoBinding
    var coinInfoList: List<CoinPriceInfo> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinInfoViewHolder {
        val binding = ItemCoinInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CoinInfoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return coinInfoList.size
    }

    override fun onBindViewHolder(holder: CoinInfoViewHolder, position: Int) {
        val coin = coinInfoList[position]
        holder.tvSymbols.text = coin.fromSymbol + " / " + coin.toSymbol
        holder.tvPrice.text = coin.price
        holder.tvLastUpdate.text = coin.getFormattedTime()
        Picasso.get().load(coin.getFullImageUrl()).into(holder.ivLogoCoin)
    }

    inner class CoinInfoViewHolder(binding: ItemCoinInfoBinding) : ViewHolder(binding.root) {
        val ivLogoCoin = binding.ivLogoCoin
        val tvSymbols = binding.tvSymbols
        val tvPrice = binding.tvPrice
        val tvLastUpdate = binding.tvLastUpdate
    }
}