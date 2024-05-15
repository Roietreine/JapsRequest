package com.eperformax.japsrequest.response

data class IOS(
    val UPISuccessRate: UPISuccessRate,
    val autoFetchAccountFlag: Boolean,
    val updateAppIdFlag: Boolean,
    val upiIntentAppSelectionDetails: UpiIntentAppSelectionDetails
)