package com.eperformax.japsrequest

import com.eperformax.japsrequest.Constant.COOKIE_VALUE
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface JapsApi {

    @POST("upistatus")
     fun getUpiStatus(
        @Body upiRequest: UpiRequest,
        @Header("Cookie") cookie: String = COOKIE_VALUE,
    ): Call<UpiResponse>

}