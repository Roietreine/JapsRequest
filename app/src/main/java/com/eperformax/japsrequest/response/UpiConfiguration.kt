package com.eperformax.japsrequest.response

import com.eperformax.japsrequest.response.FcMerchant

data class UpiConfiguration(
    val fcMerchantName: String,
    val fcMerchantVpa: String,
    val fcMerchants: List<FcMerchant>,
    val registrationAggregators: List<String>
)