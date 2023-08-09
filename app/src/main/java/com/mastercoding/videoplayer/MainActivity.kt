package com.mastercoding.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Media
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



        //displaying video from internet
        val videoView2 = findViewById<VideoView>(R.id.videoView2)

        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/037/813/original/WH038.mp4")
        videoView2.setVideoURI(uri)

        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoView2)
        mediaController2.setMediaPlayer(videoView2)
        videoView2.setMediaController(mediaController2)

        videoView2.start()



    }
}