package com.eperformax.japsrequest

import retrofit2.Call

class JapsRepo {

     fun getUpiFun(upiRequest: UpiRequest): Call<UpiResponse>{
        return RetrofitHelper.api.getUpiStatus(upiRequest)
    }


}