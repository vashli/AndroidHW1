package com.vashli.playstoreproduct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button uninstallButton;
    private Button openButton;
    private ImageView travelIcon;
    private ImageView similarIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uninstallButton = findViewById(R.id.activity_main_button_uninstall);
        openButton = findViewById(R.id.activity_main_button_open);
        travelIcon = findViewById(R.id.activity_main_image_view_travel);
        similarIcon = findViewById(R.id.activity_main_image_view_similars);
        addOnClickListeners();
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
