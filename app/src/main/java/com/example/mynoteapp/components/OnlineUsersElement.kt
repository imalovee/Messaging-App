package com.example.mynoteapp.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mynoteapp.onlineUsersData

@Composable
fun OnlineUsersElement(
    @DrawableRes drawable : Int,
    @StringRes text : Int,
    modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier)
    {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
        )

        Text(
            text = stringResource(text),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)

        )
    }
}

@Composable
fun OnlineUsersRow(modifier: Modifier)
{
    LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = Modifier
    ) {
        items(onlineUsersData){item ->
            OnlineUsersElement(item.drawable, item.text)
        }
    }
}

@Composable
fun OnlineUsersSection(@StringRes title: Int,
                       modifier: Modifier = Modifier,
                       content : @Composable () -> Unit
){
    Column (modifier = modifier.fillMaxWidth().wrapContentHeight()){
        Text(text = stringResource(title), style = MaterialTheme.typography.bodyMedium)
        content()
    }
}