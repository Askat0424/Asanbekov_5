package com.example.asanbekov_5.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.asanbekov_5.remote.LoveModel
import com.example.asanbekov_5.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getPercentage(firstName, secondName)
    }
}