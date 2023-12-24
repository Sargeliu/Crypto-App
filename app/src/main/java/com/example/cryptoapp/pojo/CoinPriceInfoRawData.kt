package com.example.cryptoapp.pojo

import android.os.Parcelable
import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

data class CoinPriceInfoRawData(
	@field:SerializedName("RAW")
	val coinPriceInfoJsonObject: JsonObject? = null
)