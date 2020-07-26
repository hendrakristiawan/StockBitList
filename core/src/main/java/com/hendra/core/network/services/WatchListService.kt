package com.hendra.core.network.services

import com.hendra.core.network.response.BaseResponse
import com.hendra.core.network.response.WatchListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WatchListService {

    @GET("/data/top/totaltoptiervolfull")
    fun Getlist(
        @Query("limit") limit: Int,
        @Query("page") page: Int,
        @Query("tsym") tsym: String
    ): BaseResponse<List<WatchListResponse>>
}