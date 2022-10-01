package com.hakancevik.landmarkbookkt.adapter


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hakancevik.landmarkbookkt.databinding.RecyclerRowBinding
import com.hakancevik.landmarkbookkt.model.Landmark
import com.hakancevik.landmarkbookkt.ui.LandmarkActivity

class LandmarkAdapter(val landmarkList: ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {


    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {

        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)


    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {

        holder.binding.recyclerViewTextView.text = landmarkList.get(position).landmarkName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,LandmarkActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)

        }


    }

    override fun getItemCount(): Int {

        return landmarkList.size


    }


}