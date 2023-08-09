package com.mastercoding.videoplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //displaying videos from local storage
        val videoView = findViewById<VideoView>(R.id.videoView1)
        videoView.setVideoPath("android.resource://"+packageName+"/"+R.raw.mountains) //mountains is .mp4 file. add your mp4 file in raw folder in resources

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)

        videoView.start()




    }
}