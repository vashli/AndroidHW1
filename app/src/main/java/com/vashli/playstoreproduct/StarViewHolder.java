package com.vashli.playstoreproduct;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class StarViewHolder extends RecyclerView.ViewHolder {

    private ImageView star;
    public StarViewHolder(@NonNull View itemView) {
        super(itemView);
        star = itemView.findViewById(R.id.cell_star_icon_star);
    }

    public void setStar(boolean colored){
        if (colored){
            star.setImageDrawable(ContextCompat.getDrawable(star.getContext(), R.drawable.icons8_star_filled_500));
        }else{
            star.setImageDrawable(ContextCompat.getDrawable(star.getContext(), R.drawable.icons8_star_500));
        }
    }
}
