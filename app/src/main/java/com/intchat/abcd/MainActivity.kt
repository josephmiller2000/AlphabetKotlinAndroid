package com.intchat.abcd

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton_A = findViewById(R.id.Button_A) as Button
        val myButton_B = findViewById(R.id.Button_B) as Button
        val myButton_C = findViewById(R.id.Button_C) as Button
        val myButton_D = findViewById(R.id.Button_D) as Button
        val myButton_E = findViewById(R.id.Button_E) as Button
        val myButton_F = findViewById(R.id.Button_F) as Button
        val myButton_G = findViewById(R.id.Button_G) as Button
        val myButton_H = findViewById(R.id.Button_H) as Button
        val myButton_I = findViewById(R.id.Button_I) as Button
        val myButton_J = findViewById(R.id.Button_J) as Button
        val myButton_K = findViewById(R.id.Button_K) as Button
        val myButton_L = findViewById(R.id.Button_L) as Button
        val myButton_M = findViewById(R.id.Button_M) as Button
        val myButton_N = findViewById(R.id.Button_N) as Button
        val myButton_O = findViewById(R.id.Button_O) as Button
        val myButton_P = findViewById(R.id.Button_P) as Button
        val myButton_Q = findViewById(R.id.Button_Q) as Button
        val myButton_R = findViewById(R.id.Button_R) as Button
        val myButton_S = findViewById(R.id.Button_S) as Button
        val myButton_T = findViewById(R.id.Button_T) as Button
        val myButton_U = findViewById(R.id.Button_U) as Button
        val myButton_V = findViewById(R.id.Button_V) as Button
        val myButton_W = findViewById(R.id.Button_W) as Button
        val myButton_X = findViewById(R.id.Button_X) as Button
        val myButton_Y = findViewById(R.id.Button_Y) as Button
        val myButton_Z = findViewById(R.id.Button_Z) as Button


        mediaPlayer = MediaPlayer()

       myButton_A.setOnClickListener {


           var audioUrl = "https://cdn.pixabay.com/download/audio/2022/03/10/audio_054d2be21b.mp3"

           mediaPlayer.setAudioAttributes(
               AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build()
           )

           try {

if (mediaPlayer.isPlaying()){

    println("lets see if the player is running")


    mediaPlayer.stop()
    mediaPlayer.release()

}

               mediaPlayer.setDataSource(audioUrl)

               mediaPlayer.prepare()

               mediaPlayer.start()



           } catch (e: Exception){



               e.printStackTrace()
           }

           Toast.makeText(applicationContext, "Audio Started Playing", Toast.LENGTH_LONG).show()


       }


    }
}