package com.example.apijson

import android.support.v7.widget.AppCompatTextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListAdaptet(val context: MainActivity.AsyncTaskHandleJson, val list: ArrayList<President>): BaseAdapter() {
    override fun getView(posisition: Int, convertView : View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false)

        val presidentId = view.findViewById(R.id.president_id)as AppCompatTextView
        val presidentName = view.findViewById(R.id.president_name)as AppCompatTextView
        val presidentPolitic = view.findViewById(R.id.president_politic)as AppCompatTextView
        val presidentTime = view.findViewById(R.id.president_time)as AppCompatTextView

        presidentId.text = list[posisition].id.toString()
        presidentName.text = list[posisition].name
        presidentPolitic.text = list[posisition].politic
        presidentTime.text = list[posisition].time

        return view


    }

    override fun getItem(posisition: Int): Any {
        return list [posisition]
            }

    override fun getItemId(posisition: Int): Long {
        return posisition.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }
}