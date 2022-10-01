package com.hakancevik.landmarkbookkt.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hakancevik.landmarkbookkt.databinding.RecyclerRowBinding
import com.hakancevik.landmarkbookkt.model.Landmark

class LandmarkAdapter(val landmarkList: ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {


    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {

        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)


    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {

        holder.binding.recyclerViewTextView.text = landmarkList.get(position).landmarkName


    }

    override fun getItemCount(): Int {

        return landmarkList.size


    }


}