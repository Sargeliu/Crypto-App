package com.example.cryptoapp.pojo

import com.google.gson.annotations.SerializedName

data class RAW(
	@field:SerializedName("BTC")
	val bTC: BTC? = null
)