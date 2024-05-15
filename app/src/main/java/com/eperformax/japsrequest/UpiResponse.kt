package com.eperformax.japsrequest

import com.eperformax.japsrequest.response.Data

data class UpiResponse(
    val code: String,
    val `data`: Data,
    val metadata: String,
    val result: String
)