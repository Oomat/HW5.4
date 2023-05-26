package com.example.hw54

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hw54.remote.LoveModel

class LoveViewModel: ViewModel() {

    private val repository = Repository()

    fun getLiveLoveModel(firstname: String, secondname: String): LiveData<LoveModel>{
        return repository.getPercentage(firstname, secondname)
    }
}