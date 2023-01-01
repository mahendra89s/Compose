package com.example.yelpbusinessapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.yelpbusinessapp.ui.viewmodel.MainViewModel

@Composable
fun MainScreen(
    mainViewModel : MainViewModel = viewModel()
){
    Column {
        RadiusSelector{

        }
        LazyColumn(){
            items(){
                RestaurantItem()
            }
        }
    }
}