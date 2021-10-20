package com.example.composeactivity

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

    @Composable
    fun DogsListItems(dogs: Dogs){
        Row() {
         Column() {
             Text(text = dogs.name,style = MaterialTheme.typography.h6)
             Text(text = "view details",style = MaterialTheme.typography.caption)
         }

        }
    }
