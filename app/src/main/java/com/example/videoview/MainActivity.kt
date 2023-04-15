package com.example.videoview

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var videoPlayer: VideoView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoPlayer = findViewById(R.id.videoPlayer)
        val myVideoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.sample_video)

        videoPlayer?.setVideoURI(myVideoUri)

        /*
        videoPlayer?.setVideoPath("https://www.themoviedb.org/movie/76600-avatar-the-way-of-water")
        a*/

        val mediaController = MediaController(this)
        videoPlayer?.setMediaController(mediaController)
        mediaController.setMediaPlayer(videoPlayer)
    }

}