package com.example.android.worldcup2018details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onBackPressed(){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scheduleButton = (Button) findViewById(R.id.schedule_button);
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(numbersIntent);
            }
        });

        Button gameDetailsButton = (Button) findViewById(R.id.game_details_button);
        gameDetailsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, GameScreenActivity.class);
                startActivity(numbersIntent);
            }
        });



        Button groupButton = (Button) findViewById(R.id.group_details);
        groupButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, GroupA.class);
                startActivity(numbersIntent);
            }
        });


        Button teamsButton = (Button) findViewById(R.id.teams_button);
        teamsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, TeamsActivity.class);
                startActivity(numbersIntent);
            }
        });
    }

}
