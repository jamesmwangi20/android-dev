package com.griffo.jay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.griffo.jay.ui.theme.JayTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {

   Box(
       modifier = Modifier
           .fillMaxSize()
   ){
       Image(painter = painterResource(id = R.drawable.img),
           contentDescription ="",
           modifier = Modifier
               .fillMaxSize(),
           contentScale = ContentScale.Crop

           )
       
   }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(19.dp),
        horizontalAlignment = Alignment.CenterHorizontally


    ){

        var name by remember {
            mutableStateOf(TextFieldValue(""))

    }

        TextField(
            value = name,
            onValueChange = {name = it},
            label = { Text(text = "Name")},
            leadingIcon = { Image(imageVector = Icons.Default.Person, contentDescription = "")},
            
            )

        Spacer(modifier = Modifier.height(25.dp))


        var phone by remember {
            mutableStateOf(TextFieldValue(""))
        }

        TextField(value = phone,
            onValueChange ={phone = it},
            label = { Text(text = "phone")},
            textStyle = TextStyle(Color.Black),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            leadingIcon = { Image(imageVector = Icons.Default.Phone, contentDescription = "")},


            )

Spacer(modifier = Modifier.height(25.dp))

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }

        TextField(value = email,
            onValueChange = {email = it},
            label = { Text(text = "email")},
            textStyle = TextStyle(Color.Black),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            leadingIcon = { Image(imageVector = Icons.Default.Email, contentDescription = "" )},


            )


        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }

        OutlinedTextField(value = password,
            onValueChange = {password = it},
            label = {Text(text = "password")},
            textStyle = TextStyle(Color.Black),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            leadingIcon = { Image(imageVector = Icons.Default.Lock, contentDescription = "")},



            colors = TextFieldDefaults.outlinedTextFieldColors(

                unfocusedBorderColor = Color.Red,
                focusedBorderColor = Color.Yellow,
                unfocusedLabelColor = Color.Yellow,
                focusedLabelColor = Color.Yellow,
                cursorColor = Color.Red,
                unfocusedLeadingIconColor = Color.Yellow,
                focusedLeadingIconColor = Color.Yellow




            )
        )

      



        }
}




