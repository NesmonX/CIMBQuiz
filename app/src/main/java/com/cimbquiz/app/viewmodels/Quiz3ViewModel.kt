package com.cimbquiz.app.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Quiz3ViewModel @Inject constructor(): ViewModel(){

    private val stairs = 3

    fun input(): String {
        return "$stairs stairs"
    }

    fun output(): String {
        return  when(stairs in 1..45){
            true -> "${findWaysToClimb(stairs)} ways to climb on the top"
            false -> "1 is the minimum and 45 is the maximum"
        }
    }

    private fun steps(n: Int) : Int {
        return when (n <= 1) {
            true -> n
            false -> steps(n - 1) + steps(n - 2)
        }
    }

    private fun findWaysToClimb(stairs: Int): Int {
        return steps(stairs + 1)
    }
}