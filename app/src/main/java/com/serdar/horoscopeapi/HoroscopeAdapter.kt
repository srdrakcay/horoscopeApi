package com.serdar.horoscopeapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_view.view.*

class HoroscopeAdapter(val contex:Context, val horoscopeList:List<HoroscopeModel>):
    RecyclerView.Adapter<HoroscopeAdapter.ViewHolder>() {


    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val mood : TextView
         val description: TextView
        val compatibility: TextView
        val current_date: TextView
        val lucky_time: TextView
        val color: TextView
        val lucky_number: TextView
        val date_range :TextView

        init {
             mood = itemView.textView1
             description= itemView.textView2
             compatibility= itemView.textView3
             current_date= itemView.textView4
             date_range= itemView.textView5
             lucky_time= itemView.textView6
             color= itemView.textView7
             lucky_number= itemView.textView8
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    val itemView=LayoutInflater.from(contex).inflate(R.layout.row_view,parent,false)


         return ViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.color.text=horoscopeList[position].color.toString()
        holder.compatibility.text=horoscopeList[position].compatibility.toString()
        holder.description.text=horoscopeList[position].description.toString()
        holder.date_range.text=horoscopeList[position].date_range.toString()
        holder.mood.text=horoscopeList[position].mood.toString()
        holder.lucky_time.text=horoscopeList[position].lucky_time.toString()
        holder.lucky_number.text=horoscopeList[position].lucky_number.toString()
        holder.current_date.text=horoscopeList[position].current_date.toString()

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}