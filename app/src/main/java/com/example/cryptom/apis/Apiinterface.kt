package com.example.cryptom.apis

import com.example.cryptom.models.MarketModel
import retrofit2.Response
import retrofit2.http.GET

interface Apiinterface {
    @GET("data-api/v3/cryptocurrency/listing?start=1&limit=250")
    suspend fun getMarketData(): Response<MarketModel>

}