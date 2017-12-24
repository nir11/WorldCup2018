package com.example.android.worldcup2018details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GameScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        ImageButton googleMapsButton = (ImageButton) findViewById(R.id.google_maps_icon);
        googleMapsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GameScreenActivity.this, MapsActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
