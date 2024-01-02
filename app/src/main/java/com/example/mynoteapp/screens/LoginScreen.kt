package com.example.mynoteapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mynoteapp.Routes

import com.example.mynoteapp.components.ClickableAccountText

import com.example.mynoteapp.ui.theme.Pink80
import com.example.mynoteapp.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    var userEmail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier
            .fillMaxSize()
            .padding(23.dp)
    ) {
        Text(text = "Welcome Back!",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 40.dp)

        )
        Text(text = "Enter your username & password",
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 40.dp)

        )

        OutlinedTextField(
            value = userEmail,
            onValueChange = {userInput: String-> userEmail = userInput},
            label = { Text("Email")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                cursorColor = Purple80,
                focusedLeadingIconColor = Purple80
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Email" )

            },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(value = password ,
            onValueChange = {userTxt -> password= userTxt},
            label = { Text("Password")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                cursorColor = Purple80,
                focusedLeadingIconColor = Purple80
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
            leadingIcon = { Icon(imageVector = Icons.Default.Password, contentDescription = "password")
               },
            modifier = Modifier.fillMaxWidth()
            )
        Text(text = "Forgot password?",
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 40.dp)
        )
      // ForgotPasswordText()

        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {navController.navigate(Routes.NotesAppPortraitRoute) },
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 30.dp),
        contentPadding = PaddingValues(),
            colors = ButtonDefaults.buttonColors(Color.Transparent)

        ) {
            Box (modifier = Modifier
                .fillMaxWidth()
                .heightIn(48.dp)
                .background(
                    brush = Brush.horizontalGradient(listOf(Pink80, Purple80)),
                    shape = RoundedCornerShape(40.dp)
                ),
                contentAlignment = Alignment.Center)
            {
                Text(text="Login",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }

        }
        Spacer(modifier = Modifier.height(50.dp))
        ClickableAccountText()
    }

}