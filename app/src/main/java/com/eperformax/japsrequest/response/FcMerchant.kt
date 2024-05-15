package com.eperformax.japsrequest.response

data class FcMerchant(
    val maxTxnLimit: String,
    val mcc: String,
    val merchantName: String,
    val merchantVpa: String,
    val productCode: String
)