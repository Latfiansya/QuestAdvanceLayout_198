package com.example.activity3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.compose.ui.graphics.Color
import com.example.activity3.ui.theme.Activity3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // agar layout bisa tembus ke status bar
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // ubah status bar jadi hitam dan ikon jadi putih
        window.statusBarColor = android.graphics.Color.BLACK
        WindowCompat.getInsetsController(window, window.decorView)
            ?.isAppearanceLightStatusBars = false

        setContent {
            Activity3Theme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black) // latar belakang full hitam
                ) { innerPadding ->
                    Profile(
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(Color.Black)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Activity3Theme {
        Greeting("Android")
    }
}