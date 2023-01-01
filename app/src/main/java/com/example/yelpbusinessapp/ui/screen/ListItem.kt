package com.example.yelpbusinessapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage


@Composable
fun RestaurantItem(

){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        /*AsyncImage(
            model = "url",
            contentDescription = null,
        )*/
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Name",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
            Text(
                text = "Address",
                fontSize = 12.sp,
                letterSpacing = 1.sp
            )
            Text(
                text = "Status",
                fontSize = 12.sp,
                letterSpacing = 1.sp
            )
        }
        Card(
            shape = RoundedCornerShape(50.dp),
            backgroundColor = Color(0xffec6763),
            modifier = Modifier.wrapContentWidth()
        ) {
            Text(
                text = "4.0",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
fun preview(){
    RestaurantItem()
}