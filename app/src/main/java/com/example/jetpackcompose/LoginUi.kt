package com.example.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginUi(modifier: Modifier = Modifier) {

    var userName by rememberSaveable { mutableStateOf("") }
    var userEmail by rememberSaveable { mutableStateOf("") }
    var userPassword by rememberSaveable { mutableStateOf("") }

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        Card(modifier = Modifier
//            .fillMaxWidth()
//            .padding(1.dp , 20.dp)
//            .clip(RoundedCornerShape(20.dp))) {
//
//        }
        Text(
            "Login Credential",
            //fontSize = 30.sp,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(20.dp)
        )


        OutlinedTextField(
            value = userName,
            onValueChange = {
                userName = it
            },
            label = {
                Text("Name")
            },
            placeholder = { Text("Enter your name") },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Name")
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


        )


        OutlinedTextField(
            value = userEmail,
            onValueChange = {
                userEmail = it
            },
            label = {
                Text("Email")
            },
            placeholder = { Text("Enter your email") },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )


        OutlinedTextField(
            value = userPassword,
            onValueChange = {
                userPassword = it
            },
            label = {
                Text("Password")
            },
            placeholder = { Text("Enter your password") },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "Password")
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

                if (userName.isNotEmpty() && userEmail.isNotEmpty() && userPassword.isNotEmpty()) {
                    Toast.makeText(context, "Welcome $userName", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Please fill all the field", Toast.LENGTH_SHORT).show()
                }
            },
            Modifier.fillMaxWidth()
        ) {
            Text("Login")
        }


    }


}


