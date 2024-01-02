package com.example.mynoteapp

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynoteapp.components.BottomNavBar
import com.example.mynoteapp.screens.HomeScreen
import com.example.mynoteapp.screens.NotesAppPortrait
import com.example.mynoteapp.ui.theme.MyNoteAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNoteAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),

                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

val onlineUsersData = listOf(
    R.drawable.p11 to R.string.p11_kriss,
    R.drawable.p12 to R.string.p12_eugenia,
    R.drawable.pi1 to R.string.pi1_Laura,
    R.drawable.pi10 to R.string.pi10_Beverly,
    R.drawable.pi9 to  R. string.pi9_clara,
    R.drawable.aimah_jpg to R.string.aimah

).map { DrawableStringPair(it.first, it.second) }

val colunmData = listOf(
    R.drawable.pi3 to R.string.pi3_jane_gibson ,
    R.drawable.pi4 to R.string.pi4_karla_harry ,
    R.drawable.pi5 to R.string.pi5_Danny_Rice ,
    R.drawable.pi6 to  R.string.pi6_sean_potter ,
    R.drawable.pi7 to R.string.pi7_bet_schwartz ,
    R.drawable.pi8 to  R.string.pi8_rachel_frazier
).map { DrawableStringPair(it.first, it.second) }




//
//@Preview(showBackground = true)
//@Composable
//fun NotesAppPreview() {
//    MyNoteAppTheme {
//       NotesAppPortrait()
//    }
//}