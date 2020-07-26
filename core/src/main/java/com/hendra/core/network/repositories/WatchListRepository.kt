package com.hendra.core.network.repositories

import com.hendra.core.network.response.BaseResponse
import com.hendra.core.network.response.WatchListResponse
import com.hendra.core.network.services.WatchListService

class WatchListRepository(private val service: WatchListService) {
    companion object {
        const val LIMIT_LIST = 10
    }

    fun getList(page: Int): BaseResponse<List<WatchListResponse>> {
        return service.Getlist(
            LIMIT_LIST,
            page,
            "USD"
        )
    }
}