package com.example.cryptoapp.pojo

import com.google.gson.annotations.SerializedName

data class CoinInfo(
	@field:SerializedName("ImageUrl")
	val imageUrl: String? = null,

	@field:SerializedName("Name")
	val name: String? = null,

	@field:SerializedName("FullName")
	val fullName: String? = null,

	@field:SerializedName("Id")
	val id: String? = null,
)