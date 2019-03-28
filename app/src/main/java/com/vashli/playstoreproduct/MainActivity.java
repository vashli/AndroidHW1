package com.vashli.playstoreproduct;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button uninstallButton;
    private Button openButton;
    private ImageView travelIcon;
    private ImageView similarIcon;
    private LinearLayout starsLayout;

    private static final int NUM_STARS = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uninstallButton = findViewById(R.id.activity_main_button_uninstall);
        openButton = findViewById(R.id.activity_main_button_open);
        travelIcon = findViewById(R.id.activity_main_image_view_travel);
        similarIcon = findViewById(R.id.activity_main_image_view_similars);
        addOnClickListeners();
        initStars();
    }

    private void initStars(){
        starsLayout = findViewById(R.id.activity_main_layout_stars);
        final ArrayList<ImageView> stars = new ArrayList<>();

        for (int i = 0; i < NUM_STARS; i++){
            ImageView star = new ImageView(this);
            star.setImageDrawable(ContextCompat.getDrawable(star.getContext(), R.drawable.icons8_star_500));
            starsLayout.addView(star);
            final float scale = star.getContext().getResources().getDisplayMetrics().density;
            int pixels = (int) (64 * scale + 0.5f);
            star.getLayoutParams().height = pixels;
            star.getLayoutParams().width = pixels;
            star.setPadding(52,0,52,0);
            star.requestLayout();
            stars.add(star);
        }

        for (int i = 0; i < NUM_STARS; i++){
            final int index = i;
            stars.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for(int j = 0; j <= index; j++){
                        stars.get(j).setImageDrawable(ContextCompat.getDrawable(stars.get(j).getContext(), R.drawable.icons8_star_filled_500));
                    }

                    for(int j = index + 1; j < NUM_STARS; j++){
                        stars.get(j).setImageDrawable(ContextCompat.getDrawable(stars.get(j).getContext(), R.drawable.icons8_star_500));
                    }
                }
            });
        }


    }
    private  void addOnClickListeners(){
        uninstallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Uninstall Clicked");
            }
        });

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Open Clicked");
            }
        });

        travelIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Travel & Local Icon Clicked");
            }
        });

        similarIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Similar Icon Clicked");
            }
        });

    }


    private void showToast( String txt){
        Toast toast = Toast.makeText(this, txt, Toast.LENGTH_SHORT);
        TextView v = toast.getView().findViewById(android.R.id.message);
        if( v != null) v.setGravity(Gravity.CENTER);
        toast.show();
    }
}
