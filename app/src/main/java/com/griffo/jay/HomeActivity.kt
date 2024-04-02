package com.griffo.jay

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Home()
    }
 }
}


@Preview(showBackground = true)

@Composable
fun Home() {
    
    Column (
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
            .padding(15.dp)

    ){
        Text(
            text = "Welcome to Home page",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp
        )

        val input = LocalContext.current
        Button(onClick = {input.startActivity(Intent(input,InputActivity::class.java)) }) {
            Text(text = "input")
        }
        val about = LocalContext.current

        Button(onClick = {
            about.startActivity(Intent(about, MainActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Cyan),
//            shape = RectangleShape
//            shape = RoundedCornerShape(7.dp)
            shape = CutCornerShape(45),
            border = BorderStroke(1.dp, Color.Yellow)


            ) {
            
            Text(text = "Home Screen", color = Color.Black)

        }

        Spacer(modifier = Modifier.height(20.dp))
     //button as text
        val xx = LocalContext.current
        val tt = AnnotatedString("Navigate to Home screen")



     ClickableText(text = tt) {
         xx.startActivity(Intent(xx, MainActivity::class.java))

//      val yy = LocalContext.current
//         Text("navigate home screen",modifier = Modifier.clickable {
//             yy.startActivity((Intent(yy, MainActivity::class.java)))
//         })
     }
    }

    }






