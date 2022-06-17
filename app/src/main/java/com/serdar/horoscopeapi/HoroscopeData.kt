package com.serdar.horoscopeapi

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
data class HoroscopeModel(

    @SerializedName("color")
    @Expose
    val color: String,

    @SerializedName("compatibility")
    @Expose
    val compatibility:String,

    @SerializedName("current_date")
    @Expose
    val current_date: String,

    @SerializedName("date_range")
    @Expose
    val date_range: String,

    @SerializedName("description")
    @Expose
    val description: String,

    @SerializedName("lucky_number")
    @Expose
    val lucky_number: String,

    @SerializedName("lucky_time")
    @Expose
    val lucky_time: String,

    @SerializedName("mood")
    @Expose
    val mood : String


) : Serializable