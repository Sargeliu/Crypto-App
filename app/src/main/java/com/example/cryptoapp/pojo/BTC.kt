package com.example.cryptoapp.pojo
import com.google.gson.annotations.SerializedName

data class BTC(

	@field:SerializedName("USD")
	val usd: CoinPriceInfo? = null
)