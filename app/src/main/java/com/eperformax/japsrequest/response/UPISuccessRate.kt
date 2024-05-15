package com.eperformax.japsrequest.response

data class UPISuccessRate(
    val issueWarning: Boolean,
    val shouldDisable: Boolean,
    val successRate: String,
    val warningMessage: String
)