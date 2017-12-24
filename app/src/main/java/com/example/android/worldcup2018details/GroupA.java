package com.example.android.worldcup2018details;

import android.content.Intent;
import android.media.midi.MidiDevice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class GroupA extends AppCompatActivity {


    public static final String GROUP_A="בית א", GROUP_B="בית ב", GROUP_C="בית ג", GROUP_D="בית ד",
            GROUP_E="בית ה", GROUP_F="בית ו", GROUP_G="בית ז", GROUP_H="בית ח";
    public static final String ONE_OCLOCK="13:00", THREE_OCLOCK="15:00", FOUR_OCLOCK="16:00", FIVE_OCLOCK="17:00", SIX_OCLOCK="18:00",
            SEVEN_OCLOCK="19:00", NINE_OCLOCK="21:00", TEN_OCLOCK="22:00";
    @Override
    public void onBackPressed(){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_for_groups);

        // GROUP A
        Team RUSSIA = new Team("רוסיה", R.mipmap.russia, "בית א", 1, 0, 0, 0, 0, "-", 0);
        Team URUGUAY = new Team("אורוגוואי", R.mipmap.uruguay, "בית א", 2, 0, 0, 0, 0, "-", 0);
        Team EGYPT = new Team("מצרים", R.mipmap.egypt, "בית א", 3, 0, 0, 0, 0, "-", 0);
        Team SAUDI_ARABIA = new Team("ערב הסעודית", R.mipmap.saudi_arabia, "בית א", 4, 0, 0, 0, 0, "-", 0);

        // STADIUMS
        Stadium LUZHNIKI_STADIUM = new Stadium("אצטדיון לוז'ניקי", "מוסקבה", "81,000", 1);
        Stadium COSMOS_ARENA = new Stadium("קוסמוס ארנה", "סמארה", "44,918", 1);
        Stadium ROSTOV_ARENA = new Stadium("רוסטוב ארנה", "רוסטוב על הדון", "43,705", 1);
        Stadium CENTRAL_STADIUM = new Stadium("האצטדיון המרכזי", "יקטרינבורג", "35,000", 1);
        Stadium VOLGOGRAD_ARENA = new Stadium("וולגוגרד ארנה", "וולגוגרד", "45,015", 1);
        Stadium KRESTOVSKY_STADIUM = new Stadium("אצטדיון קרסטובסקי", "סנט פטרסבורג", "66,881", 1);


        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new Game(RUSSIA, SAUDI_ARABIA, GROUP_A, LUZHNIKI_STADIUM, "14/6/18", SIX_OCLOCK, true, true,
                true, 1, "-", 1));
        games.add(new Game(EGYPT, URUGUAY, GROUP_A, CENTRAL_STADIUM, "15/6/18", THREE_OCLOCK, true, false,
                true, 1, "-", 2));
        games.add(new Game(RUSSIA, EGYPT, GROUP_A, KRESTOVSKY_STADIUM, "19/6/18", NINE_OCLOCK, false, true,
                true, 2, "-", 3));
        games.add(new Game(URUGUAY, SAUDI_ARABIA, GROUP_A, ROSTOV_ARENA, "20/6/18", SIX_OCLOCK, false, false,
                true, 2, "-", 4));
        games.add(new Game(SAUDI_ARABIA, EGYPT, GROUP_A, VOLGOGRAD_ARENA, "25/6/18", FIVE_OCLOCK, true, true,
                true, 3, "-", 5));
        games.add(new Game(URUGUAY, RUSSIA, GROUP_A, COSMOS_ARENA, "25/6/18", FIVE_OCLOCK, false, false,
                false, 3, "-", 6));


        GameAdapterForGroup adapter = new GameAdapterForGroup(this, games, R.color.colorForGeneralGamesList);
        ListView listView = (ListView) findViewById(R.id.list_group_games);
        listView.setAdapter(adapter);

        View header = getLayoutInflater().inflate(R.layout.activity_group_details, null);
        View footer = getLayoutInflater().inflate(R.layout.activity_game_list_for_group, null);
        listView.addHeaderView(header);
        listView.addFooterView(footer);


        ImageButton forwardButton = (ImageButton) findViewById(R.id.forward_button);
        forwardButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupA.this, GroupB.class);
                startActivity(numbersIntent);
            }
        });

        ImageButton backwardButton = (ImageButton) findViewById(R.id.backward_button);
        backwardButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupA.this, GroupH.class);
                startActivity(numbersIntent);

            }
        });

        TableRow row1 = (TableRow) findViewById(R.id.row1);
        row1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupA.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
        TableRow row2 = (TableRow) findViewById(R.id.row2);
        row2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupA.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
        TableRow row3 = (TableRow) findViewById(R.id.row3);
        row3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupA.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
        TableRow row4 = (TableRow) findViewById(R.id.row4);
        row4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupA.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });


        Team[] teams = new Team[4];
        teams[0] = RUSSIA;
        teams[1] = URUGUAY;
        teams[2] = EGYPT;
        teams[3] = SAUDI_ARABIA;
        Table groupA = new Table(teams);



        TextView pointsToastTextView = (TextView)findViewById(R.id.toast_points);
        pointsToastTextView.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"נקודות", Toast.LENGTH_SHORT).show();
            }
        });

        TextView groupNumberTextView = (TextView) findViewById(R.id.group_number_text);
        groupNumberTextView.setText(groupA.getFirstPlace().getGroupNumber());

        //First Place table
        TextView firstPositionNameTextView = (TextView) findViewById(R.id.first_position_name);
        if (groupA.getFirstPlace().getName() == "ערב הסעודית")
            firstPositionNameTextView.setTextAppearance(this, android.R.style.TextAppearance_Medium);
        firstPositionNameTextView.setText(groupA.getFirstPlace().getName());

        ImageView firstPositionImageView = (ImageView) findViewById(R.id.first_position_image);
        firstPositionImageView.setImageResource(groupA.getFirstPlace().getImage());

        TextView firstPositionPlceTextView = (TextView) findViewById(R.id.first_position_place);
        firstPositionPlceTextView.setText(String.valueOf(groupA.getFirstPlace().getPosition()));

        TextView firstPositionGamesAmountTextView = findViewById(R.id.first_position_games_amount);
        firstPositionGamesAmountTextView.setText(String.valueOf(groupA.getFirstPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView = (TextView) findViewById(R.id.first_position_wins_amount);
        firstPositionWinsAmountTextView.setText(String.valueOf(groupA.getFirstPlace().getWins()));


        TextView firstPositionDrawsAmountTextView = (TextView) findViewById(R.id.first_position_draws_amount);
        firstPositionDrawsAmountTextView.setText(String.valueOf(groupA.getFirstPlace().getDraws()));

        TextView firstPositionLossesAmountTextView = (TextView) findViewById(R.id.first_position_losses_amount);
        firstPositionLossesAmountTextView.setText(String.valueOf(groupA.getFirstPlace().getLosses()));

        TextView firstPositionRatioTextView = (TextView) findViewById(R.id.first_position_ratio);
        firstPositionRatioTextView.setText(groupA.getFirstPlace().getRatio());

        TextView firstPositionPoints = (TextView) findViewById(R.id.first_position_points);
        firstPositionPoints.setText(String.valueOf(groupA.getFirstPlace().getPoints()));


        //Second Place table
        TextView firstPositionNameTextView2 = (TextView) findViewById(R.id.second_position_name);
        if (groupA.getSecondPlace().getName() == "ערב הסעודית")
            firstPositionNameTextView2.setTextAppearance(this, android.R.style.TextAppearance_Medium);
        firstPositionNameTextView2.setText(groupA.getSecondPlace().getName());

        ImageView firstPositionImageView2 = (ImageView) findViewById(R.id.second_position_image);
        firstPositionImageView2.setImageResource(groupA.getSecondPlace().getImage());

        TextView firstPositionPlceTextView2 = (TextView) findViewById(R.id.second_position_place);
        firstPositionPlceTextView2.setText(String.valueOf(groupA.getSecondPlace().getPosition()));

        TextView firstPositionGamesAmountTextView2 = findViewById(R.id.second_position_games);
        firstPositionGamesAmountTextView2.setText(String.valueOf(groupA.getSecondPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView2 = (TextView) findViewById(R.id.second_position_wins);
        firstPositionWinsAmountTextView2.setText(String.valueOf(groupA.getSecondPlace().getWins()));


        TextView firstPositionDrawsAmountTextView2 = (TextView) findViewById(R.id.second_position_draws);
        firstPositionDrawsAmountTextView2.setText(String.valueOf(groupA.getSecondPlace().getDraws()));

        TextView firstPositionLossesAmountTextView2 = (TextView) findViewById(R.id.second_position_losses);
        firstPositionLossesAmountTextView2.setText(String.valueOf(groupA.getSecondPlace().getLosses()));

        TextView firstPositionRatioTextView2 = (TextView) findViewById(R.id.second_position_ratio);
        firstPositionRatioTextView2.setText(groupA.getSecondPlace().getRatio());

        TextView firstPositionPoints2 = (TextView) findViewById(R.id.second_position_points);
        firstPositionPoints2.setText(String.valueOf(groupA.getSecondPlace().getPoints()));


        //Third Place table
        TextView firstPositionNameTextView3 = (TextView) findViewById(R.id.third_place_name);
        if (groupA.getThirdPlace().getName() == "ערב הסעודית")
            firstPositionNameTextView3.setTextAppearance(this, android.R.style.TextAppearance_Medium);
        firstPositionNameTextView3.setText(groupA.getThirdPlace().getName());

        ImageView firstPositionImageView3 = (ImageView) findViewById(R.id.third_place_image);
        firstPositionImageView3.setImageResource(groupA.getThirdPlace().getImage());

        TextView firstPositionPlceTextView3 = (TextView) findViewById(R.id.third_position_place);
        firstPositionPlceTextView3.setText(String.valueOf(groupA.getThirdPlace().getPosition()));

        TextView firstPositionGamesAmountTextView3 = findViewById(R.id.third_place_games);
        firstPositionGamesAmountTextView3.setText(String.valueOf(groupA.getThirdPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView3 = (TextView) findViewById(R.id.third_place_wins);
        firstPositionWinsAmountTextView3.setText(String.valueOf(groupA.getThirdPlace().getWins()));


        TextView firstPositionDrawsAmountTextView3 = (TextView) findViewById(R.id.third_place_draws);
        firstPositionDrawsAmountTextView3.setText(String.valueOf(groupA.getThirdPlace().getDraws()));

        TextView firstPositionLossesAmountTextView3 = (TextView) findViewById(R.id.third_place_losses);
        firstPositionLossesAmountTextView3.setText(String.valueOf(groupA.getThirdPlace().getLosses()));

        TextView firstPositionRatioTextView3 = (TextView) findViewById(R.id.third_place_ratio);
        firstPositionRatioTextView3.setText(groupA.getThirdPlace().getRatio());

        TextView firstPositionPoints3 = (TextView) findViewById(R.id.third_place_points);
        firstPositionPoints3.setText(String.valueOf(groupA.getThirdPlace().getPoints()));


        //Fourth Place table
        TextView firstPositionNameTextView4 = (TextView) findViewById(R.id.fourth_position_name);
        if (groupA.getFourthPlace().getName() == "ערב הסעודית")
            firstPositionNameTextView4.setTextAppearance(this, android.R.style.TextAppearance_Medium);
        firstPositionNameTextView4.setText(groupA.getFourthPlace().getName());

        ImageView firstPositionImageView4 = (ImageView) findViewById(R.id.fourth_position_image);
        firstPositionImageView4.setImageResource(groupA.getFourthPlace().getImage());

        TextView firstPositionPlceTextView4 = (TextView) findViewById(R.id.fourth_position_place);
        firstPositionPlceTextView4.setText(String.valueOf(groupA.getFourthPlace().getPosition()));

        TextView firstPositionGamesAmountTextView4 = findViewById(R.id.fourth_position_games);
        firstPositionGamesAmountTextView4.setText(String.valueOf(groupA.getFourthPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_wins);
        firstPositionWinsAmountTextView4.setText(String.valueOf(groupA.getFourthPlace().getWins()));


        TextView firstPositionDrawsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_draws);
        firstPositionDrawsAmountTextView4.setText(String.valueOf(groupA.getFourthPlace().getDraws()));

        TextView firstPositionLossesAmountTextView4 = (TextView) findViewById(R.id.fourth_position_losses);
        firstPositionLossesAmountTextView4.setText(String.valueOf(groupA.getFourthPlace().getLosses()));

        TextView firstPositionRatioTextView4 = (TextView) findViewById(R.id.fourth_position_ratio);
        firstPositionRatioTextView4.setText(groupA.getFourthPlace().getRatio());

        TextView firstPositionPoints4 = (TextView) findViewById(R.id.fourth_position_points);
        firstPositionPoints4.setText(String.valueOf(groupA.getFourthPlace().getPoints()));
    }



}

