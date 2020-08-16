package com.example.firstapp.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel(application: Application): AndroidViewModel(application) {
    private val readAllData : LiveData<List<list>>
    private val repository: listRepository


    init {
        val  ListdataDAO = listdatabase.getDatabase(application).ListdataDAO()
        repository = listRepository(ListdataDAO)
        readAllData = repository.readAllData
    }

    fun addUser(List:list){
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(List)
        }
    }

}