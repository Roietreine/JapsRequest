package com.eperformax.japsrequest

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class JapsViewModel(
    val japsRepo: JapsRepo,
    app: Application

) : AndroidViewModel(app){

    private val upiMutableLiveData: MutableLiveData<UpiResponse> = MutableLiveData()

    fun getUpiLivedata(): LiveData<UpiResponse> {
        return upiMutableLiveData
    }

    fun getUpiValue(upiRequest: UpiRequest){
        val call = japsRepo.getUpiFun(upiRequest)
        call.enqueue(object : Callback<UpiResponse> {
            override fun onResponse(call: Call<UpiResponse>, response: Response<UpiResponse>) {
                if(response.isSuccessful){
                    upiMutableLiveData.value = response.body()

                    Log.d("ResponseSuccess",response.body().toString())
                }
            }
            override fun onFailure(call: Call<UpiResponse>, t: Throwable) {
                t.localizedMessage?.let { Log.d("NETWORK_FAILED", it) }
            }

        })
    }
}