package com.example.cryptoapp.pojo

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class BTC(

	@field:SerializedName("USD")
	val uSD: CoinPriceInfo? = null
) : Parcelable