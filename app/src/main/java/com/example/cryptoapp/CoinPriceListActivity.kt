package com.example.cryptoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cryptoapp.adapters.CoinInfoAdapter
import com.example.cryptoapp.databinding.ActivityCoinPriceListBinding
import com.example.cryptoapp.databinding.ItemCoinInfoBinding

class CoinPriceListActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    private lateinit var binding: ActivityCoinPriceListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)
        binding = ActivityCoinPriceListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = CoinInfoAdapter()
        binding.rvCoinPriceList.adapter = adapter
        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        viewModel.priceList.observe(this, Observer {
            adapter.coinInfoList = it
        })

    }
}
