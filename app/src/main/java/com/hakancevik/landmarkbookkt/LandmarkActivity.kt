package com.hakancevik.landmarkbookkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hakancevik.landmarkbookkt.databinding.ActivityLandmarkBinding

class LandmarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLandmarkBinding
    private lateinit var landmarkArrayList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandmarkBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        landmarkArrayList = ArrayList()

        val eiffelTower = Landmark(R.drawable.eiffel, "France", "Eiffel", R.string.eiffel)
        val giza = Landmark(R.drawable.giza, "Egypt", "Great Pyramid of Giza", R.string.giza)
        val greatWall = Landmark(R.drawable.greatwall, "China", "Great Wall", R.string.greatWall)
        val kremlin = Landmark(R.drawable.kremlin, "Russia", "Kremlin Wall", R.string.kremlin)
        val machuPicchu = Landmark(R.drawable.machupicchu, "Peru", "Machu Picchu", R.string.machuPicchu)
        val opera = Landmark(R.drawable.opera, "Australia", "Sydney Opera House", R.string.opera)
        val tajMahal = Landmark(R.drawable.tajmahal, "India", "Taj Mahal", R.string.tajMahal)

        landmarkArrayList.add(eiffelTower)
        landmarkArrayList.add(giza)
        landmarkArrayList.add(greatWall)
        landmarkArrayList.add(kremlin)
        landmarkArrayList.add(machuPicchu)
        landmarkArrayList.add(opera)
        landmarkArrayList.add(tajMahal)

    }
}