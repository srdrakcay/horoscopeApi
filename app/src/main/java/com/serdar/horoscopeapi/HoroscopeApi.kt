package com.serdar.horoscopeapi

import retrofit2.Call
import retrofit2.http.GET

interface HoroscopeApi {

    @GET("/?sign=leo&day=tomorrow")
    fun getData ():Call<List<HoroscopeModel>>
}