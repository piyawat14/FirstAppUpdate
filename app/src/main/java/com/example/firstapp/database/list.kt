package com.example.firstapp.database


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "listname_table")
data class list(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val nickname: String,

    val phoneNumber: Int
)