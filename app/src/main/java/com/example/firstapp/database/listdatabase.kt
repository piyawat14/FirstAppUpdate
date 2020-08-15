package com.example.firstapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [list::class], version = 1, exportSchema = false)
abstract class listdatabase : RoomDatabase() {

    abstract fun ListdataDAO():listdataDAO

    companion object {
        @Volatile
        private var INSTANCE: listdatabase? = null

        fun getDatabase(context: Context): listdatabase {
            var tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    listdatabase::class.java,
                    "list_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}