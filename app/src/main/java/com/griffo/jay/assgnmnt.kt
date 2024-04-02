package com.griffo.jay

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.griffo.jay.ui.theme.JayTheme
import org.w3c.dom.Text

class assgnmnt : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Assgnmnt()
    }
}



@Preview(showBackground = true)
@Composable
fun Assgnmnt() {

    Box(
        modifier = Modifier
            .fillMaxSize()
    )

   LazyColumn {
       item {

              Column(
                  horizontalAlignment = Alignment.CenterHorizontally,

                  modifier = Modifier
                      .padding()
                      .background(Color.Gray)
                      .fillMaxSize()
              ){

                  Row(
                      horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                      verticalAlignment = Alignment.CenterVertically,


                       modifier = Modifier
                           .fillMaxSize()


                  ){

                     Icon(imageVector = Icons.Default.Person, contentDescription ="")
                      Column {
                          Text(text="Current location")

                          Row {
                              Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                              Text(text="Denspar", fontWeight = FontWeight.Bold)
                          }
                      }

                  Row(
                      horizontalArrangement = Arrangement.Absolute.SpaceBetween
                      
                  )
                  {
                      Column {
                          Row(
                              modifier = Modifier
                                  .padding()
                                  .background(Color.White)
                                  .padding(12.dp)
                          )


                          {
                              Icon(imageVector = Icons.Default.Home, contentDescription = "")
                              Text(text="Hotel")
                          }
                      }
                  }






                  }

                 



                  

                  }



              }


       }
   }
}