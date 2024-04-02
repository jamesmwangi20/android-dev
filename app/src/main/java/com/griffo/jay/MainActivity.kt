package com.griffo.jay

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.griffo.jay.ui.theme.JayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
      Greeting()
    }
}


@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(

        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
            .padding(15.dp)


    ) {
        Text(text = "Android project",color = Color.Cyan)
        Text(text ="Welcome to this App",color = Color.Magenta )
        Text(text = "Enjoy the features in here",color = Color.White)


        val input = LocalContext.current
        Button(onClick = { input.startActivity(Intent(input,InputActivity::class.java)) },

            shape = CutCornerShape(45),
            colors = ButtonDefaults.buttonColors(Color.Black),

            ) {
            
            Text(text = "input")
            
        }

        val home = LocalContext.current
        Button(onClick = { home.startActivity(Intent(home,HomeActivity::class.java)) }) {
            
            Text(text = "Home")

        }









    }
}}