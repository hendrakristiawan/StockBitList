package com.hendra.core.network.response

data class BaseResponse<T>(
    val code: Any,
    val status: String,
    val message: String,
    val data: T
)