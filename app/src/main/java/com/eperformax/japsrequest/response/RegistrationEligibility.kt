package com.eperformax.japsrequest.response

data class RegistrationEligibility(
    val errorMsg: Any,
    val isRegistrationAllowed: Boolean
)