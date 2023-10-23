package com.example.perminder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import android.content.res.Configuration
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           TaskCard(Task("Android", "Jetpack Compose"))
            }
        }
    }

data class Task(val title: String, val body: String)


@Composable
fun TaskCard(task: Task) {
    Column {
        Text(text = task.title)
        Text(text = task.body)
    }
}


@Preview
@Composable
fun PreviewTaskCard() {
    TaskCard(
        task = Task("Clean up", "Clean your room")
    )
}