package com.example.cryptoapp.api

import com.example.cryptoapp.pojo.CoinInfoListOfData
import io.reactivex.rxjava3.core.Single

interface ApiService {

    fun getTopCoinsInfo(): Single<CoinInfoListOfData>
}