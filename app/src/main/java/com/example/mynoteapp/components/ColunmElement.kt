package com.example.mynoteapp.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynoteapp.R
import com.example.mynoteapp.colunmData
import com.example.mynoteapp.screens.SignupScreen
import com.example.mynoteapp.ui.theme.MyNoteAppTheme
import com.example.mynoteapp.ui.theme.Purple80
import com.example.mynoteapp.ui.theme.PurpleGrey40
import java.nio.file.WatchEvent

@Composable
fun ColounmElement(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier)
{
    Row (verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
    ){
        Image(
            painter = painterResource(drawable), contentDescription = "profile picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(20.dp)

        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = stringResource(text
            ),
                style = MaterialTheme.typography.bodyMedium,
//            modifier = Modifier.paddingFromBaseline()
            )
            Spacer(modifier = Modifier.height(8.dp))

            Surface(shape = MaterialTheme.shapes.small, shadowElevation = 1.dp)
            {
                Text(text = stringResource(R.string.hey_text),
                    style = MaterialTheme.typography.bodySmall,
//            modifier = Modifier.paddingFromBaseline()
                )
            }

        }

//        DividerLine(
//            modifier = Modifier
//                .fillMaxWidth(),
//
//            color = PurpleGrey40,
//            thickness = 1.dp
//        )

    }
}


@Composable
fun ColumnElementColumn(modifier: Modifier){
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(vertical = 14.dp),
        modifier = modifier.fillMaxWidth().wrapContentHeight()
    ){
        items(colunmData) {
                item -> ColounmElement(item.drawable , item.text  )
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun  ColumnElementPreview(){
//    MyNoteAppTheme {
//        ColumnElementColumn(modifier = Modifier  )
//    }
//}
