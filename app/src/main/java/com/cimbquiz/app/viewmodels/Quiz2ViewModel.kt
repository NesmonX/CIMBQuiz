package com.cimbquiz.app.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Quiz2ViewModel @Inject constructor(): ViewModel(){

    val version1 : String = "1.1"
    val version2 : String = "1.001"

    fun output(): String {
        return compareVersion(version1, version2).toString()
    }

    private fun compareVersion(version1: String, version2: String): Int{
        return check(version1, version2)
    }

    private fun check(
        version1: String = "",
        version2: String = ""
    ): Int{
        if (version1 == version2) return 0
        var v1 = version1
        var v2 = version2

        var p1 = 0
        var p2 = 0
        var n1 : Int = v1.length
        var n2 : Int = v2.length

        //check if exists to the next part
        if (v1.contains(".")) n1 = v1.indexOf('.')
        if (v2.contains(".")) n2 = v2.indexOf('.')

        var str1 = ""
        var str2 = ""

        while (p1 < n1) str1 += v1[p1++]
        while (p2 < n2)  str2 += v2[p2++]

        var st1 = 0
        var st2 = 0
        if (str1.isNotEmpty()) st1 = str1.toInt()
        if (str2.isNotEmpty()) st2 = str2.toInt()

        when {
            st1 < st2 -> return -1
            st1 > st2 -> return 1
        }

        v1 = when(n1 < v1.length){
            true -> v1.substring(n1 + 1)
            false -> ""
        }

        v2 = when(n2 < v2.length){
            true -> v2.substring(n2 + 1)
            false -> ""
        }

        //check for the next part using recursion
        return check(v1, v2);
    }
}