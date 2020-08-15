package com.example.firstapp.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface listdataDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user:list)

    @Query("SELECT * from listname_table ORDER BY id ASC")
    fun readAllData() : LiveData<List<list>>


}