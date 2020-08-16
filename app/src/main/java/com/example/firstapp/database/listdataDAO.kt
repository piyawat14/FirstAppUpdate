package com.example.firstapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface listdataDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(List:list)

    @Query("SELECT * from listname_table ORDER BY id ASC")
    fun readAllData() : LiveData<List<list>>


}