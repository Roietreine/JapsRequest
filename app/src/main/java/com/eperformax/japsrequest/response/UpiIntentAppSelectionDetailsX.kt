package com.eperformax.japsrequest.response

data class UpiIntentAppSelectionDetailsX(
    val showAllAppsFromDeviceForIntentPayFlag: Boolean,
    val upiIntentAppsBasedOnSuccessRateList: List<String>,
    val upiIntentAppsCountToShowOnDevice: Int
)