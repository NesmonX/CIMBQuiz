package com.cimbquiz.app.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Quiz3ViewModel @Inject constructor(): ViewModel(){

    fun invokeFunction(){
        Log.d("ViewModelQ3", "invokeFunction Quiz3")
    }
}