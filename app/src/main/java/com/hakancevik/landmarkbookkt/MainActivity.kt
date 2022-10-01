package com.hakancevik.landmarkbookkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hakancevik.landmarkbookkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

    fun go(view : View){

        var intent = Intent(MainActivity@this,LandmarkActivity::class.java)
        startActivity(intent)

    }
}