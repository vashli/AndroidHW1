package com.vashli.playstoreproduct;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class StarsAdapter extends RecyclerView.Adapter<StarViewHolder> {
    @NonNull
    @Override
    public StarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_star, viewGroup, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w("myApp", "clicked");
                ImageView star = view.findViewById(R.id.cell_star_icon_star);
                star.setImageDrawable(ContextCompat.getDrawable(star.getContext(), R.drawable.icons8_star_filled_500));
            }
        });
        return new StarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StarViewHolder cardViewHolder, int i) {
    }

    @Override
    public int getItemCount() {
        return 5;
    }

}
