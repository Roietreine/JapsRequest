package com.eperformax.japsrequest.response

data class UpiIntentAppSelectionDetails(
    val showAllAppsFromDeviceForIntentPayFlag: Boolean,
    val upiIntentAppsBasedOnSuccessRateList: List<UpiIntentAppsBasedOnSuccessRate>,
    val upiIntentAppsCountToShowOnDevice: Int
)