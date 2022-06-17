package com.serdar.horoscopeapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL ="https://sameer-kumar-aztro-v1.p.rapidapi.com/"
class MainActivity : AppCompatActivity() {

    private lateinit var horosocopeAdapter: HoroscopeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHoroscope.setHasFixedSize(true)
        rvHoroscope.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        getMyData();
    }

    private fun getMyData() {
        val retrofitBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(HoroscopeApi::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<HoroscopeModel>> {

            override fun onResponse(call: Call<List<HoroscopeModel>>, response: Response<List<HoroscopeModel>>) {


                rvHoroscope.adapter=horosocopeAdapter


            }

            override fun onFailure(call: Call<List<HoroscopeModel>>, t: Throwable) {
            }


        })
    }
}