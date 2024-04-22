package com.example.musicapp.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.musicapp.R

@Composable
fun Browse() {
    val categories = listOf("Hits", "Happy", "Workout", "Metal", "Indie", "Pop", "Rock", "Hip Hop")

    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories) {
            cat ->
            BrowserItem(cat = cat, drawable = R.drawable.ic_browse)
        }
    }
}