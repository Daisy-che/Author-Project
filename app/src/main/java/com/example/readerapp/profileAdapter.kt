package com.example.readerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class profileAdapter  (var profileList: List<Profile>):RecyclerView.Adapter<profileViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): profileViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.reader_list,parent,false)
        return profileViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return profileList.size


    }

    override fun onBindViewHolder(holder: profileViewHolder, position: Int) {
        val text=profileList[position]
        holder.tvName.text=text.name
        holder.tvBook.text=text.title
        holder.tvPublication.text=text.yearOfPublication
        holder.tvtext.text=text.summary
        holder.tvSumary.text=text.summary
        holder.btseemore.text=text.name


    }
}
class profileViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvTitle)
    var tvBook=itemView.findViewById<TextView>(R.id.tvBook)
    var tvPublication=itemView.findViewById<TextView>(R.id.tvPublication)
    var tvSumary=itemView.findViewById<TextView>(R.id.tvSummary)
    var tvtext=itemView.findViewById<TextView>(R.id.tvText)
    var btseemore=itemView.findViewById<TextView>(R.id.btSeeMore)
}