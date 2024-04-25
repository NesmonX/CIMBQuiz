package com.cimbquiz.app.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cimbquiz.app.theme.CIMBQuizTheme
import com.cimbquiz.app.viewmodels.Quiz1ViewModel
import com.cimbquiz.app.viewmodels.Quiz2ViewModel
import com.cimbquiz.app.viewmodels.Quiz3ViewModel

@Composable
fun MainScreen(
    vmQuiz1: Quiz1ViewModel = viewModel(),
    vmQuiz2: Quiz2ViewModel = viewModel(),
    vmQuiz3: Quiz3ViewModel = viewModel()
) {

    LaunchedEffect(Unit) {
        vmQuiz1.invokeFunction()
        vmQuiz2.invokeFunction()
        vmQuiz3.invokeFunction()
    }
    Text(
        text = "CIMBQuiz"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CIMBQuizTheme {
        MainScreen()
    }
}