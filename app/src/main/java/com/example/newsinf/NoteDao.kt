package com.example.newsinf

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
suspend fun insert(note: Note)// to run in background

@Delete
   suspend fun delete(note: Note)// i/o , we want them to run in background ,we use suspend

@Query("Select * from notes_table order by id ASC")
    fun getAllNotes():LiveData<List<Note>>


}