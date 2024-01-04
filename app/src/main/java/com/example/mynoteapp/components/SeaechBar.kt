package com.example.mynoteapp.components

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynoteapp.ui.theme.Purple40
import com.example.mynoteapp.ui.theme.PurpleGrey40


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxWidth())
    {
        TextField(
            value = "",
            onValueChange ={},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null )
            },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = MaterialTheme.colorScheme.surface,
                focusedIndicatorColor = Purple40,
                focusedLeadingIconColor = Purple40
            ),
            placeholder = { Text(text = "Search")},

            modifier= modifier.fillMaxWidth()
        )
    }
}

@Composable
fun MessageText(){
    Text(
        text = "Message",
        fontSize = 30.sp,
        style = MaterialTheme.typography.headlineMedium)
}

@Composable
fun DividerLine(){
    Divider(
        modifier = Modifier.fillMaxWidth(),
        color = PurpleGrey40,
        thickness = 1.dp
    )
}