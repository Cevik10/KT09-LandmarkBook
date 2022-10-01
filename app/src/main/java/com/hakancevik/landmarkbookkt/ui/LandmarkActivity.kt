package com.hakancevik.landmarkbookkt.ui

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.hakancevik.landmarkbookkt.databinding.ActivityLandmarkBinding
import com.hakancevik.landmarkbookkt.model.Landmark


class LandmarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLandmarkBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandmarkBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.imageView.setImageResource(selectedLandmark.landmarkImage)
        binding.countryNameText.text = selectedLandmark.countryName
        binding.landmarkNameText.text = selectedLandmark.landmarkName
        binding.landmarkInfoText.text = resources.getString(selectedLandmark.landmarkInfo)

        binding.landmarkInfoText.movementMethod = ScrollingMovementMethod()


    }
}