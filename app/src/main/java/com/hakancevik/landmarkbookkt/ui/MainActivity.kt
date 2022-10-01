package com.hakancevik.landmarkbookkt.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.recyclerview.widget.LinearLayoutManager
import com.hakancevik.landmarkbookkt.R
import com.hakancevik.landmarkbookkt.adapter.LandmarkAdapter
import com.hakancevik.landmarkbookkt.databinding.ActivityMainBinding
import com.hakancevik.landmarkbookkt.model.Landmark

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkArrayList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        landmarkArrayList = ArrayList()

        val eiffelTower = Landmark(R.drawable.eiffel, "France", "Eiffel Tower", R.string.eiffel)
        val giza = Landmark(R.drawable.giza, "Egypt", "Great Pyramid of Giza", R.string.giza)
        val greatWall = Landmark(R.drawable.greatwall, "China", "Great Wall", R.string.greatWall)
        val kremlin = Landmark(R.drawable.kremlin, "Russia", "Kremlin Wall", R.string.kremlin)
        val machuPicchu = Landmark(R.drawable.machupicchu, "Peru", "Machu Picchu", R.string.machuPicchu)
        val opera = Landmark(R.drawable.opera, "Australia", "Sydney Opera House", R.string.opera)
        val tajMahal = Landmark(R.drawable.tajmahal, "India", "Taj Mahal", R.string.tajMahal)

        // Inefficient
        // val eiffelBitmap = BitmapFactory.decodeResource(resources,R.drawable.eiffel) for Intent data to another activity


        landmarkArrayList.add(eiffelTower)
        landmarkArrayList.add(giza)
        landmarkArrayList.add(greatWall)
        landmarkArrayList.add(kremlin)
        landmarkArrayList.add(machuPicchu)
        landmarkArrayList.add(opera)
        landmarkArrayList.add(tajMahal)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkArrayList)
        binding.recyclerView.adapter = landmarkAdapter


    }


}