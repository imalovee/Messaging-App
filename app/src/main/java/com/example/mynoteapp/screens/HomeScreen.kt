package com.example.mynoteapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mynoteapp.R
import com.example.mynoteapp.components.BottomNavBar
import com.example.mynoteapp.components.ColumnElementColumn
import com.example.mynoteapp.components.DividerLine
import com.example.mynoteapp.components.MessageText
import com.example.mynoteapp.components.OnlineUsersRow
import com.example.mynoteapp.components.OnlineUsersSection
import com.example.mynoteapp.components.SearchBar
import com.example.mynoteapp.ui.theme.MyNoteAppTheme
import com.example.mynoteapp.ui.theme.PurpleGrey40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesAppPortrait(navController: NavController){
    MyNoteAppTheme {
        Scaffold(bottomBar = { BottomNavBar(modifier = Modifier) })
        {padding ->
            HomeScreen(Modifier.padding(padding))

        }
    }
}

@Composable
fun  HomeScreen (modifier:Modifier = Modifier) {
    Column(
        modifier
            .padding(14.dp)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        MessageText()
        Spacer(Modifier.height(16.dp))
        SearchBar()
        Spacer(Modifier.height(8.dp))
        DividerLine(color = PurpleGrey40, thickness = 1.dp)
        Spacer(Modifier.height(16.dp))
        OnlineUsersSection(title = R.string.online_users) {
            OnlineUsersRow(modifier = Modifier)
        }
        Spacer(Modifier.height(16.dp))
        ColumnElementColumn(modifier = Modifier)



    }
}