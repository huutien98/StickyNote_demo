package com.vncoder.stickynote

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val context: Context, private val noteArray: ArrayList<NoteObject>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        return if (viewType == STYLE1){
            view = LayoutInflater.from(context).inflate(R.layout.note_style1,parent,false)
            CallNoteStyle1(view) }
        else if (viewType == STYLE2){
            view = LayoutInflater.from(context).inflate(R.layout.note_style2,parent,false)
            CallNoteStyle2(view)}
        else {
            view = LayoutInflater.from(context).inflate(R.layout.note_style3,parent,false)
            CallNoteStyle3(view)
        }

    }

    override fun getItemViewType(position: Int): Int{
        return if (TextUtils.isEmpty(noteArray[position].style2)&&TextUtils.isEmpty(noteArray[position].style3) ) {
            STYLE1
        } else if (TextUtils.isEmpty(noteArray[position].style1)&&TextUtils.isEmpty(noteArray[position].style3)){
            STYLE2
        }else if (TextUtils.isEmpty(noteArray[position].style2)&&TextUtils.isEmpty(noteArray[position].style3)){
            STYLE3
        }else{
            TYPE_DEFAULT
        }
    }

    override fun getItemCount(): Int {
        return noteArray.size
     }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position)== STYLE1){
            (holder as CallNoteStyle1).setStyle1(noteArray[position])
        }else if (getItemViewType(position) == STYLE2){
            (holder as CallNoteStyle2).setStyle2(noteArray[position])
        }else{
            (holder as CallNoteStyle3).setStyle3(noteArray[position])
        }
     }

    internal inner class CallNoteStyle1(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val txtNote: TextView
        private val txtTime: TextView
        fun setStyle1(noteStyle1: NoteObject) {
            txtNote.text = noteStyle1.note
            txtTime.text = noteStyle1.Time
        }
        init {
            txtNote = itemView.findViewById(R.id.tv_style1)
            txtTime = itemView.findViewById(R.id.tv_datetime)
        }
    }
    internal inner class CallNoteStyle2(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val txtNote: TextView
        private val txtTime: TextView
        fun setStyle2(noteStyle2: NoteObject) {
            txtNote.text = noteStyle2.note
            txtTime.text = noteStyle2.Time
        }
        init {
            txtNote = itemView.findViewById(R.id.tv_style2)
            txtTime = itemView.findViewById(R.id.tv_datetime)
        }
    }
    internal inner class CallNoteStyle3(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val txtNote: TextView
        private val txtTime: TextView
        fun setStyle3(noteStyle3: NoteObject) {
            txtNote.text = noteStyle3.note
            txtTime.text = noteStyle3.Time
        }
        init {
            txtNote = itemView.findViewById(R.id.tv_style3)
            txtTime = itemView.findViewById(R.id.tv_datetime)
        }
    }

    companion object {
        private const val STYLE1 = 1
        private const val STYLE2 = 2
        private const val STYLE3 = 3
        private const val TYPE_DEFAULT = 4


    }
}