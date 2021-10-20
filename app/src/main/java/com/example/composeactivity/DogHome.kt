package com.example.composeactivity

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

class DogHome {

    @Composable
    fun BarkHomeContent(){
        val dogsL= remember {
            ListOfDogs().dogList
        }
        LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp,vertical = 8.dp))
        {
            items(items= dogsL,itemContent= {DogsListItems(dogs = it)})

        }
    }
}