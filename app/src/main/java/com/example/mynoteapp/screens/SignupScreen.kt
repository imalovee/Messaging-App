package com.example.mynoteapp.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


import com.example.mynoteapp.R
import com.example.mynoteapp.Routes

import com.example.mynoteapp.components.CheckedBox
import com.example.mynoteapp.components.ClickableLoginComponent
import com.example.mynoteapp.components.DividerTextComponents
import com.example.mynoteapp.ui.theme.Pink80
import com.example.mynoteapp.ui.theme.Purple80


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavController) {
    var userName by remember { mutableStateOf("") }
    var userEmail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var fullName by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(23.dp),

        ){
        Text(
            text = "Hey There!",
            fontSize = 24.sp,

            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 40.dp),

            )

        Text(
            text = "Create an Account",
            fontSize = 30.sp,

            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(),
        )
        OutlinedTextField(
            label ={ Text("Full name") },
            value = fullName ,
            onValueChange = {nameInput -> fullName =nameInput},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                cursorColor = Purple80
            ),

            keyboardOptions = KeyboardOptions.Default,
            modifier = Modifier
                .fillMaxWidth(),

            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_person_24) ,
                    contentDescription = null)
            }
        )

        OutlinedTextField(
            label ={ Text("Username") },
            value = userName ,
            onValueChange = {usernameInput -> userName = usernameInput},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                cursorColor = Purple80
            ),

            keyboardOptions = KeyboardOptions.Default,
            modifier = Modifier
                .fillMaxWidth(),

            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_person_24) ,
                    contentDescription = null)
            }
        )

        OutlinedTextField(
            label ={ Text("Email") },
            value = userEmail ,
            onValueChange = {userEmailInput -> userEmail = userEmailInput},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                cursorColor = Purple80
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth(),

            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_email_24) ,
                    contentDescription = null)
            }
        )

        OutlinedTextField(
            label ={ Text("Password") },
            value = password ,
            onValueChange = {pwdInput -> password = pwdInput},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                cursorColor = Purple80
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

            modifier = Modifier
                .fillMaxWidth(),

            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_password_24) ,
                    contentDescription = null)
            },

            trailingIcon = {
                val iconImage = if(passwordVisible){
                    Icons.Filled.Visibility
                }else{
                    Icons.Filled.VisibilityOff
                }
                var description = if (passwordVisible){
                    "Hide Password"
                }else{
                    "show password"
                }

                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = iconImage, contentDescription = null )
                }
            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        )

        CheckedBox()

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {navController.navigate(Routes.NotesAppPortraitRoute)},
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(30.dp),
            contentPadding = PaddingValues(),
            colors = ButtonDefaults.buttonColors(Color.Transparent)
        )

        {
            Box(
                Modifier
                    .fillMaxWidth()
                    .heightIn(48.dp)
                    .background(
                        brush = Brush.horizontalGradient(listOf(Pink80, Purple80)),
                        shape = RoundedCornerShape(40.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(text="Sign-Up",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        DividerTextComponents()
        Spacer(modifier = Modifier.height(10.dp))

//            Image(
//                painter = painterResource(id = R.drawable.twitter),
//                contentDescription = "Clickable facebook icon",
//                modifier = Modifier.size(35.dp)
//            )
        Spacer(modifier = Modifier.width(20.dp))
        Image(
            painter =  painterResource(id = R.drawable.google_svg),
            contentDescription = "Clickable Google Icon",
            modifier = Modifier.size(45.dp)

        )


        Spacer(modifier = Modifier.height(45.dp))
        ClickableLoginComponent()




    }

}