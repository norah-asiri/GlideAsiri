package com.example.glideasiri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
//https://media.istockphoto.com/photos/adorable-scottish-straight-cat-peeking-from-behind-a-banner-picture-id1097008888?k=20&m=1097008888&s=612x612&w=0&h=7g68qF4AnyJSd3-t4jnc9MO2AqqE5kCHEX50rTLxF_Q=
//https://www.youtube.com/watch?v=hFVuMAuFSOs
        //don't forget : add internet permission
        /*
        <uses-permission android:name="android.permission.INTERNET" />
        <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
         */
        Glide.with(this)
            .load("https://media.istockphoto.com/photos/adorable-scottish-straight-cat-peeking-from-behind-a-banner-picture-id1097008888?k=20&m=1097008888&s=612x612&w=0&h=7g68qF4AnyJSd3-t4jnc9MO2AqqE5kCHEX50rTLxF_Q=")
            .into(imageView)
    }
}