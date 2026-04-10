package com.example.moviecounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviecounter.ui.theme.MovieCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieCounterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {

                        Greeting(name = "Android")
                        MyButton()
                        InfoText()

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name desde MAIN!!!!!!",
        modifier = modifier
    )
}
@Composable
fun MyButton() {
    Button(onClick = {}) {
        Text("Presionar")
    }
}

@Composable
fun InfoText() {
    Text("Curso de movil reciente 1  ")
}

@Preview(showBackground = true)
@Composable
fun PreviewApp() {
    MovieCounterTheme {
        Column {
            Greeting("Android")
            MyButton()
            InfoText()
        }
    }
}