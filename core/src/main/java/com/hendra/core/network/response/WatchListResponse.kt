package com.hendra.core.network.response

import com.google.gson.annotations.SerializedName

data class WatchListResponse(
    @SerializedName("COININFO")
    val coinInfo: CoinInfo,
    @SerializedName("DISPLAY")
    val display: Display
)

data class CoinInfo(
    @SerializedName("Name")
    val name: String,
    @SerializedName("FullName")
    val fullName: String
)

data class Display(
    @SerializedName("USD")
    val currency: Currency
)

data class Currency(
    @SerializedName("Price")
    val price: String
)