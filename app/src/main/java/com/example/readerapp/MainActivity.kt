package com.example.readerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.readerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvAuthor.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        displayAuthors()


    }

    fun displayAuthors() {
        val text1 = Profile(
            "Trevor Noah",
            "Born A Crime",
            "2000",
            "Trevor Noah's childhood and adolescence in apartheid and post-apartheid South Africa. A child of mixed heritage, Noah details the challenges he faced and the peculiarities that existed when he was growing up.","see more"
        )
        val text2 = Profile(
            "Trevor Noah",
            "Born A Crime",
            "2000",
            "Trevor Noah's childhood and adolescence in apartheid and post-apartheid South Africa. A child of mixed heritage, Noah details the challenges he faced and the peculiarities that existed when he was growing up.","see more"
        )
        val text3 = Profile(
            "Trevor Noah",
            "Born A Crime",
            "2000",
            "Trevor Noah's childhood and adolescence in apartheid and post-apartheid South Africa. A child of mixed heritage, Noah details the challenges he faced and the peculiarities that existed when he was growing up.","see more"
        )
        val text4 = Profile(
            "Trevor Noah",
            "Born A Crime",
            "2000",
            "Trevor Noah's childhood and adolescence in apartheid and post-apartheid South Africa. A child of mixed heritage, Noah details the challenges he faced and the peculiarities that existed when he was growing up.","see more"
        )

        val myText = listOf(text1, text2, text3, text4)
        val profileAdapter = profileAdapter(myText)
        binding.rvAuthor.adapter = profileAdapter


    }
}