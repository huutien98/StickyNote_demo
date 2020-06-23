package com.vncoder.stickynote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        val listNote = ArrayList<NoteObject>()
        var note = NoteObject()

        note.note = " sticky note 1"
        note.style1 = "style1"
        note.Time = "june 17"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 2"
        note.style2 = "style2"
        note.Time = "june 11"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 3"
        note.style3 = "style3"
        note.Time = "yesterday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 3"
        note.style3 = "style3"
        note.Time = "tormorow"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 2"
        note.style2 = "style2"
        note.Time = "sunday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 2"
        note.style2 = "style2"
        note.Time = "monday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 1"
        note.style1 = "style1"
        note.Time = "today"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 3"
        note.style3 = "style3"
        note.Time = "june 20"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 3"
        note.style3 = "style3"
        note.Time = "yesterday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 2"
        note.style2 = "style2"
        note.Time = "nextday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 2"
        note.style2 = "style2"
        note.Time = "11:20"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 1"
        note.style1 = "style1"
        note.Time = "7:30"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 3"
        note.style3 = "style3"
        note.Time = "yesterday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 3"
        note.style3 = "style3"
        note.Time = "today"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 2"
        note.style2 = "style2"
        note.Time = "saturday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 2"
        note.style2 = "style2"
        note.Time = "tuesday"
        listNote.add(note)
        note = NoteObject()

        note.note = " sticky note 1"
        note.style1 = "style1"
        note.Time = "monday"
        listNote.add(note)
        note = NoteObject()

        val adapter = NoteAdapter(this, listNote)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = adapter

    }
}