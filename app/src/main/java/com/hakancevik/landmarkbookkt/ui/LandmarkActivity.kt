package com.hakancevik.landmarkbookkt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hakancevik.landmarkbookkt.R
import com.hakancevik.landmarkbookkt.adapter.LandmarkAdapter
import com.hakancevik.landmarkbookkt.databinding.ActivityLandmarkBinding
import com.hakancevik.landmarkbookkt.model.Landmark

class LandmarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLandmarkBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandmarkBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)





    }
}