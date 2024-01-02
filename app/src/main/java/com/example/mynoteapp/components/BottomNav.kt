package com.example.mynoteapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BottomNavBar(modifier: Modifier){
    NavigationBar (contentColor = MaterialTheme.colorScheme.surface,
        modifier = modifier)
    {
        NavigationBarItem(selected = false, onClick = {},
            icon = {
                Icon(
            imageVector = Icons.Default.Email,
            contentDescription = "Email")
        },
            label = {
                Text(text = "Email")
            }
        )

        NavigationBarItem(selected = false, onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null)
            },
                    label ={
                Text(text = "Phone")
            }
        )

        NavigationBarItem(selected = false, onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Image,
                    contentDescription = null)
            },
                    label ={
                Text(text = "Image")
            }
        )

        NavigationBarItem(selected = false, onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Message,
                    contentDescription = null)
            },
            label ={
                Text(text = "Message")
            }
        )
        
        FloatingActionButton(onClick = { /*TODO*/ }) {
           Icon(imageVector = Icons.Default.AddCircle, contentDescription = null)
        }
    }
}