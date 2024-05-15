package com.eperformax.japsrequest.response

data class HomePagePromotion(
    val action: String,
    val androidDeeplink: String,
    val elementName: String,
    val identifier: String,
    val iosDeeplink: String,
    val logo: String,
    val minAndroidVersion: String,
    val minIosVersion: String,
    val priority: String
)