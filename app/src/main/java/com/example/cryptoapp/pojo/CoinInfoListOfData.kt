package com.example.cryptoapp.pojo

import com.google.gson.annotations.SerializedName

data class CoinInfoListOfData(
    @field:SerializedName("Data")
	val data: List<Data?>? = null,
)