package com.myapplication.DataLayer


import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.myapplication.DataLayer.Local.Note
import com.myapplication.DataLayer.Local.NotesDao
import java.util.concurrent.Flow

class NoteRepository(private val notesDao: NotesDao) {


    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()


    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }

    suspend fun delete(note: Note) {
        notesDao.delete(note)
    }


    suspend fun update(note: Note) {
        notesDao.update(note)
    }
}