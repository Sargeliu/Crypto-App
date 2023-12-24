package com.example.cryptoapp.pojo

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class RAW(

	@field:SerializedName("BTC")
	val bTC: BTC? = null
) : Parcelable