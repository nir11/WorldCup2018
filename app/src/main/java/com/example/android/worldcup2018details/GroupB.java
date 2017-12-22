package com.example.android.worldcup2018details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GroupB extends AppCompatActivity {

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


        // GROUP B
        Team PORTUGAL = new Team("פורטוגל", R.mipmap.portugal, GROUP_B, 1, 0, 0, 0, 0, "-", 0 );
        Team SPAIN = new Team("ספרד", R.mipmap.spain, GROUP_B, 2, 0, 0, 0, 0, "-", 0 );
        Team MOROCCO = new Team("מרוקו", R.mipmap.morocco, GROUP_B, 3, 0, 0, 0, 0, "-", 0 );
        Team IRAN = new Team("איראן", R.mipmap.iran, GROUP_B, 4, 0, 0, 0, 0, "-", 0 );

        // STADIUMS
        Stadium LUZHNIKI_STADIUM = new Stadium("אצטדיון לוז'ניקי", "מוסקבה", "81,000", 1);
        Stadium KAZAN_ARENA = new Stadium("קאזאן ארנה", "קאזאן", "45,105", 1);
        Stadium MORDOVIA_ARENA = new Stadium("מורדוביה ארנה", "סרנסק", "45,015", 1);
        Stadium FISHT_OLYMPIC_STADIUM = new Stadium("האצטדיון האולימפי פישט","סוצ'י", "47,659", 1);
        Stadium KALININGRAD_STADIUM = new Stadium("אצטדיון קלינינגרד", "קלינינגרד", "35,000", 1);
        Stadium KRESTOVSKY_STADIUM = new Stadium("אצטדיון קרסטובסקי", "סנט פטרסבורג", "66,881", 1);


        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new Game(MOROCCO, IRAN, GROUP_B ,KRESTOVSKY_STADIUM,"15/6/18" ,SIX_OCLOCK, false, true,
                true, 1, "-", 1));
        games.add(new Game(PORTUGAL, SPAIN, GROUP_B ,FISHT_OLYMPIC_STADIUM,"15/6/18" ,NINE_OCLOCK, false, false,
                false, 1, "-", 2));
        games.add(new Game(PORTUGAL, MOROCCO, GROUP_B ,LUZHNIKI_STADIUM,"20/6/18" ,THREE_OCLOCK, false, true,
                true, 2, "-", 3));
        games.add(new Game(IRAN, SPAIN, GROUP_B ,KAZAN_ARENA,"20/6/18" ,NINE_OCLOCK, false, false,
                false, 2, "-", 4));
        games.add(new Game(IRAN, PORTUGAL, GROUP_B ,MORDOVIA_ARENA,"25/6/18" ,NINE_OCLOCK, false, true,
                true, 3, "-", 5));
        games.add(new Game(SPAIN, MOROCCO, GROUP_B ,KALININGRAD_STADIUM,"25/6/18" ,NINE_OCLOCK, false, false,
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
                Intent numbersIntent = new Intent(GroupB.this, GroupC.class);
                startActivity(numbersIntent);
            }
        });

        ImageButton backwardButton = (ImageButton) findViewById(R.id.backward_button);
        backwardButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupB.this, GroupA.class);
                startActivity(numbersIntent);
            }
        });





        Team[] teams = new Team[4];
        teams[0] = PORTUGAL;
        teams[1] = SPAIN;
        teams[2] = MOROCCO;
        teams[3] = IRAN;
        Table groupB = new Table(teams);

        TextView groupNumberTextView = (TextView)findViewById(R.id.group_number_text);
        groupNumberTextView.setText(groupB.getFirstPlace().getGroupNumber());

        //First Place table
        TextView firstPositionNameTextView = (TextView) findViewById(R.id.first_position_name);
        firstPositionNameTextView.setText(groupB.getFirstPlace().getName());

        ImageView firstPositionImageView = (ImageView) findViewById(R.id.first_position_image);
        firstPositionImageView.setImageResource(groupB.getFirstPlace().getImage());

        TextView firstPositionPlceTextView = (TextView) findViewById(R.id.first_position_place);
        firstPositionPlceTextView.setText(String.valueOf(groupB.getFirstPlace().getPosition()));

        TextView firstPositionGamesAmountTextView = findViewById(R.id.first_position_games_amount);
        firstPositionGamesAmountTextView.setText(String.valueOf(groupB.getFirstPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView = (TextView) findViewById(R.id.first_position_wins_amount);
        firstPositionWinsAmountTextView.setText(String.valueOf(groupB.getFirstPlace().getWins()));


        TextView firstPositionDrawsAmountTextView = (TextView) findViewById(R.id.first_position_draws_amount);
        firstPositionDrawsAmountTextView.setText(String.valueOf(groupB.getFirstPlace().getDraws()));

        TextView firstPositionLossesAmountTextView = (TextView) findViewById(R.id.first_position_losses_amount);
        firstPositionLossesAmountTextView.setText(String.valueOf(groupB.getFirstPlace().getLosses()));

        TextView firstPositionRatioTextView = (TextView) findViewById(R.id.first_position_ratio);
        firstPositionRatioTextView.setText(groupB.getFirstPlace().getRatio());

        TextView firstPositionPoints = (TextView) findViewById(R.id.first_position_points);
        firstPositionPoints.setText(String.valueOf(groupB.getFirstPlace().getPoints()));


        //Second Place table
        TextView firstPositionNameTextView2 = (TextView) findViewById(R.id.second_position_name);
        firstPositionNameTextView2.setText(groupB.getSecondPlace().getName());

        ImageView firstPositionImageView2 = (ImageView) findViewById(R.id.second_position_image);
        firstPositionImageView2.setImageResource(groupB.getSecondPlace().getImage());

        TextView firstPositionPlceTextView2 = (TextView) findViewById(R.id.second_position_place);
        firstPositionPlceTextView2.setText(String.valueOf(groupB.getSecondPlace().getPosition()));

        TextView firstPositionGamesAmountTextView2 = findViewById(R.id.second_position_games);
        firstPositionGamesAmountTextView2.setText(String.valueOf(groupB.getSecondPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView2 = (TextView) findViewById(R.id.second_position_wins);
        firstPositionWinsAmountTextView2.setText(String.valueOf(groupB.getSecondPlace().getWins()));


        TextView firstPositionDrawsAmountTextView2 = (TextView) findViewById(R.id.second_position_draws);
        firstPositionDrawsAmountTextView2.setText(String.valueOf(groupB.getSecondPlace().getDraws()));

        TextView firstPositionLossesAmountTextView2 = (TextView) findViewById(R.id.second_position_losses);
        firstPositionLossesAmountTextView2.setText(String.valueOf(groupB.getSecondPlace().getLosses()));

        TextView firstPositionRatioTextView2 = (TextView) findViewById(R.id.second_position_ratio);
        firstPositionRatioTextView2.setText(groupB.getSecondPlace().getRatio());

        TextView firstPositionPoints2 = (TextView) findViewById(R.id.second_position_points);
        firstPositionPoints2.setText(String.valueOf(groupB.getSecondPlace().getPoints()));



        //Third Place table
        TextView firstPositionNameTextView3 = (TextView) findViewById(R.id.third_place_name);
        firstPositionNameTextView3.setText(groupB.getThirdPlace().getName());

        ImageView firstPositionImageView3 = (ImageView) findViewById(R.id.third_place_image);
        firstPositionImageView3.setImageResource(groupB.getThirdPlace().getImage());

        TextView firstPositionPlceTextView3 = (TextView) findViewById(R.id.third_position_place);
        firstPositionPlceTextView3.setText(String.valueOf(groupB.getThirdPlace().getPosition()));

        TextView firstPositionGamesAmountTextView3 = findViewById(R.id.third_place_games);
        firstPositionGamesAmountTextView3.setText(String.valueOf(groupB.getThirdPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView3 = (TextView) findViewById(R.id.third_place_wins);
        firstPositionWinsAmountTextView3.setText(String.valueOf(groupB.getThirdPlace().getWins()));


        TextView firstPositionDrawsAmountTextView3 = (TextView) findViewById(R.id.third_place_draws);
        firstPositionDrawsAmountTextView3.setText(String.valueOf(groupB.getThirdPlace().getDraws()));

        TextView firstPositionLossesAmountTextView3 = (TextView) findViewById(R.id.third_place_losses);
        firstPositionLossesAmountTextView3.setText(String.valueOf(groupB.getThirdPlace().getLosses()));

        TextView firstPositionRatioTextView3 = (TextView) findViewById(R.id.third_place_ratio);
        firstPositionRatioTextView3.setText(groupB.getThirdPlace().getRatio());

        TextView firstPositionPoints3 = (TextView) findViewById(R.id.third_place_points);
        firstPositionPoints3.setText(String.valueOf(groupB.getThirdPlace().getPoints()));


        //Fourth Place table
        TextView firstPositionNameTextView4 = (TextView) findViewById(R.id.fourth_position_name);
        firstPositionNameTextView4.setText(groupB.getFourthPlace().getName());

        ImageView firstPositionImageView4 = (ImageView) findViewById(R.id.fourth_position_image);
        firstPositionImageView4.setImageResource(groupB.getFourthPlace().getImage());

        TextView firstPositionPlceTextView4 = (TextView) findViewById(R.id.fourth_position_place);
        firstPositionPlceTextView4.setText(String.valueOf(groupB.getFourthPlace().getPosition()));

        TextView firstPositionGamesAmountTextView4 = findViewById(R.id.fourth_position_games);
        firstPositionGamesAmountTextView4.setText(String.valueOf(groupB.getFourthPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_wins);
        firstPositionWinsAmountTextView4.setText(String.valueOf(groupB.getFourthPlace().getWins()));


        TextView firstPositionDrawsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_draws);
        firstPositionDrawsAmountTextView4.setText(String.valueOf(groupB.getFourthPlace().getDraws()));

        TextView firstPositionLossesAmountTextView4 = (TextView) findViewById(R.id.fourth_position_losses);
        firstPositionLossesAmountTextView4.setText(String.valueOf(groupB.getFourthPlace().getLosses()));

        TextView firstPositionRatioTextView4 = (TextView) findViewById(R.id.fourth_position_ratio);
        firstPositionRatioTextView4.setText(groupB.getFourthPlace().getRatio());

        TextView firstPositionPoints4 = (TextView) findViewById(R.id.fourth_position_points);
        firstPositionPoints4.setText(String.valueOf(groupB.getFourthPlace().getPoints()));


    }
}
