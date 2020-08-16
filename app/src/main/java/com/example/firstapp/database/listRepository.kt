package com.example.firstapp.database

import androidx.lifecycle.LiveData

class listRepository (private val ListdataDAO: listdataDAO){

    val readAllData: LiveData<List<list>> = ListdataDAO.readAllData()

    suspend fun addUser(List:list){
        ListdataDAO.addUser(List)
    }
}