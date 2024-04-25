package com.cimbquiz.app.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cimbquiz.app.R
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
    Column(modifier = Modifier.padding(16.dp)){
        QuizCompareVersion(
            title = "Quiz #2",
            description = stringResource(id = R.string.quiz_2) ,
            version1 = vmQuiz2.version1,
            version2 = vmQuiz2.version2,
            output = vmQuiz2.output()
        )
        HorizontalDivider(modifier = Modifier.padding(8.dp))
        QuizSection(
            title = "Quiz #3",
            description = stringResource(id = R.string.quiz_3) ,
            input = vmQuiz3.input(),
            output = vmQuiz3.output()
        )

    }
}

@Composable
 fun QuizSection(
     title: String,
     description: String,
     input: String,
     output: String,
 ){
    Text(
        text = title,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )
    )
    Text(
        modifier = Modifier.padding(top = 4.dp),
        text = description,
        style = TextStyle(
            color = Color.Gray,
            fontSize = 14.sp,
        )
    )
    Box(modifier = Modifier.height(8.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Input :",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = input,
            modifier = Modifier.padding(start = 4.dp)
        )
    }

    Row(verticalAlignment = Alignment.CenterVertically){
        Text(
            text = "Output :",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = output,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}

@Composable
fun QuizCompareVersion(
    title: String,
    description: String,
    version1: String,
    version2: String,
    output: String,
){
    Text(
        text = title,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )
    )
    Text(
        modifier = Modifier.padding(top = 4.dp),
        text = description,
        style = TextStyle(
            color = Color.Gray,
            fontSize = 14.sp,
        )
    )
    Box(modifier = Modifier.height(8.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Version 1 :",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = version1,
            modifier = Modifier.padding(start = 4.dp)
        )
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Version 2 :",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = version2,
            modifier = Modifier.padding(start = 4.dp)
        )
    }

    Row(verticalAlignment = Alignment.CenterVertically){
        Text(
            text = "Output :",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = output,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CIMBQuizTheme {
        MainScreen()
    }
}