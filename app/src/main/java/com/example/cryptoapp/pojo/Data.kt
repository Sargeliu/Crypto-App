package com.example.cryptoapp.pojo

import com.google.gson.annotations.SerializedName

data class Data(
	@field:SerializedName("CoinInfo")
	val coinInfo: CoinInfo? = null
)