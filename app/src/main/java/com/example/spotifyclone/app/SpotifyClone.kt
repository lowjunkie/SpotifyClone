package com.example.spotifyclone.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.RequestManager
import com.example.spotifyclone.R
import com.example.spotifyclone.adapters.SongAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SpotifyClone : AppCompatActivity() {

    @Inject
    lateinit var glide : RequestManager


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.FullscreenTheme)
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_SpotifyClone)
        setContentView(R.layout.activity_main)



    }
}