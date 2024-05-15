package com.eperformax.japsrequest.response

data class UserPreference(
    val alertOnCall: Boolean,
    val audioNotificationFlag: Boolean,
    val audioNotificationPreferredLanguage: String,
    val defaultAccountType: Any,
    val defaultPaymentOption: Any,
    val paymentOnVerifiedMerchantOnly: Boolean,
    val perTransactionLimit: Double,
    val remainingTransactionCountPerDay: Double,
    val remainingTransactionLimitPerDay: Double,
    val transactionCountPerDay: Double,
    val transactionLimitPerDay: Double
)