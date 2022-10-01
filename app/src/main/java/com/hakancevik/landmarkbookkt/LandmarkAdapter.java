package com.hakancevik.landmarkbookkt;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {



    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder {

        public LandmarkHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
