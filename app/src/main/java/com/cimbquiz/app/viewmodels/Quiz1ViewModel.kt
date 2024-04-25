package com.cimbquiz.app.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Quiz1ViewModel @Inject constructor(): ViewModel(){

    fun invokeFunction(){
        Log.d("ViewModelQ1", "invokeFunction Quiz1")
    }
}