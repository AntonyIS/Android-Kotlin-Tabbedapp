package com.example.tabbedcoronaapp


import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var data:ArrayList<Item>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var userImg:ImageView
        var username:TextView
        var usermessage:TextView
        var usertime:TextView

        init {
            this.userImg = row?.findViewById(R.id.imguser) as ImageView
            this.username = row?.findViewById(R.id.tvusername) as TextView
            this.usermessage = row?.findViewById(R.id.tvmessage) as TextView
            this.usertime = row?.findViewById(R.id.tvtime) as TextView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View?
        val viewHolder:ViewHolder
        if (convertView == null){
            val layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.card_row_layout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        val item:Item = getItem(position) as Item
        viewHolder.username.text = item.name
        viewHolder.usermessage.text = item.message
        viewHolder.usertime.text = item.time
        viewHolder.userImg.setImageResource(item.img)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}