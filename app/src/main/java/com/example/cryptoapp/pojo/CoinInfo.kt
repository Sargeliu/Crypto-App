package com.example.cryptoapp.pojo

import com.google.gson.annotations.SerializedName

data class CoinInfo(
	@field:SerializedName("Name")
	val name: String? = null,
)