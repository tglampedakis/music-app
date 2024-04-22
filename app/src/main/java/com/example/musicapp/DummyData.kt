package com.example.musicapp

import androidx.annotation.DrawableRes

data class DummyData(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<DummyData>(
    DummyData(R.drawable.ic_playlist, "Playlist"),
    DummyData(R.drawable.ic_artist, "Artists"),
    DummyData(R.drawable.ic_album, "Album"),
    DummyData(R.drawable.ic_music, "Songs"),
    DummyData(R.drawable.ic_genre, "Genre")
)
