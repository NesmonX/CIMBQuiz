package com.cimbquiz.app.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Quiz1ViewModel @Inject constructor(): ViewModel(){

    private val prices = listOf(7, 1, 5, 6, 4)
//    private val prices = listOf(7, 1, 5, 6, 4)

    fun input(): String{
        val separatedPrices = prices.joinToString (separator = ", ")
        return  "[ $separatedPrices ]"
    }

    fun output(): String{
        return maxProfit(prices).toString()
    }

    private fun maxProfit(prices: List<Int>): Int{
        var buy : Int = prices.first()
        var maxProfit = 0

        for (i in prices.indices) {
            if(buy > prices[i]){
                buy = prices[i]
            }else if (prices[i] - buy > maxProfit){
                maxProfit = prices[i] - buy
            }
        }
        return maxProfit
    }
}