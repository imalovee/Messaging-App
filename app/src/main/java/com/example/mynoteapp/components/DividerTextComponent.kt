package com.example.mynoteapp.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynoteapp.ui.theme.Purple80
import com.example.mynoteapp.ui.theme.PurpleGrey40

@Composable
fun DividerTextComponents(){
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {
        Divider(
            Modifier
                .padding(3.dp)
                .fillMaxWidth()
                .weight(1F),
            color = PurpleGrey40,
            thickness = 1.dp
        )

        Text(
            //modifier = Modifier.padding(1.dp),
            text = "or", fontSize = 18.sp, color = PurpleGrey40 )

        Divider(
            Modifier
                .padding(3.dp)
                .fillMaxWidth()
                .weight(1F),
            color = PurpleGrey40,
            thickness = 1.dp
        )

    }
}


@Composable
fun CheckedBox(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .heightIn(min = 56.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        var checkedState by remember{ mutableStateOf(false) }

        Checkbox(
            checked = checkedState,
            onCheckedChange ={newCheckedState -> checkedState = newCheckedState },

            )

        //Spacer(modifier = Modifier.width(80.dp))

        ClickableTextComponent()

//        Text(
//            text ="By continuing, you accept our privacy policy and terms of use",
//        )


    }
}

@Composable
fun ClickableTextComponent(){
    val initialText = "By continuing, you accept our"
    val privacyText = " privacy policy"
    val andText = " and"
    val termsText = " terms of use"

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Purple80,  fontSize = 18.sp)){
            pushStringAnnotation(tag = privacyText, annotation = privacyText)
            append(privacyText)
        }
        append(andText)
        withStyle(style = SpanStyle(color = Purple80,  fontSize = 18.sp)){
            pushStringAnnotation(tag =termsText, annotation = termsText)
            append(termsText)
        }
    }

    ClickableText(text =annotatedString , onClick = {offset->
        annotatedString.getStringAnnotations(offset,offset)
            .firstOrNull()?.also {span->
                Log.d("ClickableTextComponent", "{$span}")
            }
    })
}


@Composable
fun ClickableLoginComponent(){

    val initialText = " Already have an Account?"
    val loginText = " Login"

    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(fontSize = 15.sp)){
            append(initialText)
        }
        append("")

        withStyle(style = SpanStyle(color = Purple80, fontSize = 20.sp)){
            pushStringAnnotation(tag =loginText, annotation = loginText)
            append(loginText)
        }
    }

    ClickableText(text =annotatedString , onClick = {offset->
        annotatedString.getStringAnnotations(offset,offset)
            .firstOrNull()?.also {span->
                Log.d("ClickableTextComponent", "{$span}")
            }
    })
}

//@Composable
//fun ForgotPasswordText(){
//    val text = "Forgot Password?"
//
//    val annotatedString = buildAnnotatedString {
//        withStyle(style = SpanStyle(color = Purple80, fontSize = 20.sp)){
//            append(text)
//        }
//    }
//
//    ClickableText(text = annotatedString,  onClick ={
//        offset -> annotatedString.getStringAnnotations(offset,offset)
//        .firstOrNull()?.also { span -> Log.d("ForgotPasswordText", "$span") }
//    } )
//
//}

@Composable
fun ClickableAccountText(){
    val initialText = "Don't have an Account?"
    val text2 = "Sign-up"

    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(fontSize = 20.sp)){
            append(initialText)
        }

        append("")
        withStyle(style = SpanStyle(color = Color.Blue, fontSize = 22.sp)){
            append(text2)
        }
    }

    ClickableText(text = annotatedString,
        onClick = {offset-> annotatedString.getStringAnnotations(offset,offset)
            .firstOrNull()?.also { span -> Log.d("ClickableAccountText", "$span") }

    })
}