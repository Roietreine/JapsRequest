package com.eperformax.japsrequest.response

data class DefaultPreferenceConfig(
    val maxDebitLimitPerDay: Int,
    val maxDebitLimitPerTransaction: Int,
    val maxTxnCountPerDay: Int,
    val minDebitLimitPerDay: Int,
    val minDebitLimitPerTransaction: Int,
    val minTxnCountPerDay: Int
)