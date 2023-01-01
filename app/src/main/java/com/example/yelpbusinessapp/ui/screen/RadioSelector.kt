package com.example.yelpbusinessapp.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RadiusSelector(
    radius : (Float) -> Unit
){
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Radius Selector",
                fontSize = 20.sp,
                letterSpacing = 1.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "1KM",
                fontSize = 20.sp,
                letterSpacing = 1.sp,
                fontWeight = FontWeight.Bold
            )
        }
        RadioSelector(
            radius
        )
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = "100M")
            Text(text = "5KM")
        }
    }
}

@Composable
fun RadioSelector(
    radius: (Float) -> Unit
) {
    var sliderPosition by remember { mutableStateOf(0f) }
    Slider(
        value = sliderPosition,
        onValueChange = { sliderPosition = it },
        valueRange = 100f..5000f,
        steps = 1,
        colors = SliderDefaults.colors(
            thumbColor = Color.Black,
            activeTickColor = Color.Black,
            inactiveTrackColor = Color.Black,
            activeTrackColor = Color.Black
        )
    )
}

/*
@Preview
@Composable
fun preview(){
    RadiusSelector()
}*/
