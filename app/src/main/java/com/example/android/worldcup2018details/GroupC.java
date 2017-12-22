package com.example.android.worldcup2018details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GroupC extends AppCompatActivity {

    public static final String GROUP_A="בית א", GROUP_B="בית ב", GROUP_C="בית ג", GROUP_D="בית ד",
            GROUP_E="בית ה", GROUP_F="בית ו", GROUP_G="בית ז", GROUP_H="בית ח";
    public static final String ONE_OCLOCK="13:00", THREE_OCLOCK="15:00", FOUR_OCLOCK="16:00", FIVE_OCLOCK="17:00", SIX_OCLOCK="18:00",
            SEVEN_OCLOCK="19:00", NINE_OCLOCK="21:00", TEN_OCLOCK="22:00";

    @Override
    public void onBackPressed(){
        Intent numbersIntent = new Intent(GroupC.this, MainActivity.class);
        startActivity(numbersIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_for_groups);

        // GROUP C
        Team FRANCE = new Team("צרפת", R.mipmap.france, GROUP_C, 1, 0, 0, 0, 0, "-", 0 );
        Team DENMARK = new Team("דנמרק", R.mipmap.denmark, GROUP_C, 2, 0, 0, 0, 0, "-", 0 );
        Team AUSTRALIA = new Team("אוסטרליה", R.mipmap.australia, GROUP_C, 3, 0, 0, 0, 0, "-", 0 );
        Team PERU = new Team("פרו", R.mipmap.peru, GROUP_C, 4, 0, 0, 0, 0, "-", 0 );

        // STADIUMS
        Stadium LUZHNIKI_STADIUM = new Stadium("אצטדיון לוז'ניקי", "מוסקבה", "81,000", 1);
        Stadium KAZAN_ARENA = new Stadium("קאזאן ארנה", "קאזאן", "45,105", 1);
        Stadium COSMOS_ARENA = new Stadium("קוסמוס ארנה", "סמארה", "44,918", 1);
        Stadium MORDOVIA_ARENA = new Stadium("מורדוביה ארנה", "סרנסק", "45,015", 1);
        Stadium FISHT_OLYMPIC_STADIUM = new Stadium("האצטדיון האולימפי פישט","סוצ'י", "47,659", 1);
        Stadium CENTRAL_STADIUM = new Stadium("האצטדיון המרכזי", "יקטרינבורג", "35,000", 1);


        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new Game(FRANCE, AUSTRALIA, GROUP_C ,KAZAN_ARENA,"16/6/18" ,ONE_OCLOCK, true, true,
                true, 1, "-", 1));
        games.add(new Game(PERU, DENMARK, GROUP_C ,MORDOVIA_ARENA,"16/6/18" ,SEVEN_OCLOCK, false, false,
                false, 1, "-", 2));
        games.add(new Game(DENMARK, AUSTRALIA, GROUP_C ,COSMOS_ARENA,"21/6/18" ,THREE_OCLOCK, true, true,
                true, 2, "-", 3));
        games.add(new Game(FRANCE, PERU, GROUP_C ,CENTRAL_STADIUM,"21/6/18" ,SIX_OCLOCK, false, false,
                false, 2, "-", 4));
        games.add(new Game(DENMARK, FRANCE, GROUP_C ,LUZHNIKI_STADIUM,"26/6/18" ,FIVE_OCLOCK, true, true,
                true, 3, "-", 5));
        games.add(new Game(AUSTRALIA, PERU, GROUP_C ,FISHT_OLYMPIC_STADIUM,"26/6/18" ,FIVE_OCLOCK, false, false,
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
                Intent numbersIntent = new Intent(GroupC.this, GroupD.class);
                startActivity(numbersIntent);
            }
        });

        ImageButton backwardButton = (ImageButton) findViewById(R.id.backward_button);
        backwardButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupC.this, GroupB.class);
                startActivity(numbersIntent);
            }
        });


        Team[] teams = new Team[4];
        teams[0] = FRANCE;
        teams[1] = DENMARK;
        teams[2] = AUSTRALIA;
        teams[3] = PERU;
        Table groupC = new Table(teams);

        TextView groupNumberTextView = (TextView)findViewById(R.id.group_number_text);
        groupNumberTextView.setText(groupC.getFirstPlace().getGroupNumber());

        //First Place table
        TextView firstPositionNameTextView = (TextView) findViewById(R.id.first_position_name);
        firstPositionNameTextView.setText(groupC.getFirstPlace().getName());

        ImageView firstPositionImageView = (ImageView) findViewById(R.id.first_position_image);
        firstPositionImageView.setImageResource(groupC.getFirstPlace().getImage());

        TextView firstPositionPlceTextView = (TextView) findViewById(R.id.first_position_place);
        firstPositionPlceTextView.setText(String.valueOf(groupC.getFirstPlace().getPosition()));

        TextView firstPositionGamesAmountTextView = findViewById(R.id.first_position_games_amount);
        firstPositionGamesAmountTextView.setText(String.valueOf(groupC.getFirstPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView = (TextView) findViewById(R.id.first_position_wins_amount);
        firstPositionWinsAmountTextView.setText(String.valueOf(groupC.getFirstPlace().getWins()));


        TextView firstPositionDrawsAmountTextView = (TextView) findViewById(R.id.first_position_draws_amount);
        firstPositionDrawsAmountTextView.setText(String.valueOf(groupC.getFirstPlace().getDraws()));

        TextView firstPositionLossesAmountTextView = (TextView) findViewById(R.id.first_position_losses_amount);
        firstPositionLossesAmountTextView.setText(String.valueOf(groupC.getFirstPlace().getLosses()));

        TextView firstPositionRatioTextView = (TextView) findViewById(R.id.first_position_ratio);
        firstPositionRatioTextView.setText(groupC.getFirstPlace().getRatio());

        TextView firstPositionPoints = (TextView) findViewById(R.id.first_position_points);
        firstPositionPoints.setText(String.valueOf(groupC.getFirstPlace().getPoints()));


        //Second Place table
        TextView firstPositionNameTextView2 = (TextView) findViewById(R.id.second_position_name);
        firstPositionNameTextView2.setText(groupC.getSecondPlace().getName());

        ImageView firstPositionImageView2 = (ImageView) findViewById(R.id.second_position_image);
        firstPositionImageView2.setImageResource(groupC.getSecondPlace().getImage());

        TextView firstPositionPlceTextView2 = (TextView) findViewById(R.id.second_position_place);
        firstPositionPlceTextView2.setText(String.valueOf(groupC.getSecondPlace().getPosition()));

        TextView firstPositionGamesAmountTextView2 = findViewById(R.id.second_position_games);
        firstPositionGamesAmountTextView2.setText(String.valueOf(groupC.getSecondPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView2 = (TextView) findViewById(R.id.second_position_wins);
        firstPositionWinsAmountTextView2.setText(String.valueOf(groupC.getSecondPlace().getWins()));


        TextView firstPositionDrawsAmountTextView2 = (TextView) findViewById(R.id.second_position_draws);
        firstPositionDrawsAmountTextView2.setText(String.valueOf(groupC.getSecondPlace().getDraws()));

        TextView firstPositionLossesAmountTextView2 = (TextView) findViewById(R.id.second_position_losses);
        firstPositionLossesAmountTextView2.setText(String.valueOf(groupC.getSecondPlace().getLosses()));

        TextView firstPositionRatioTextView2 = (TextView) findViewById(R.id.second_position_ratio);
        firstPositionRatioTextView2.setText(groupC.getSecondPlace().getRatio());

        TextView firstPositionPoints2 = (TextView) findViewById(R.id.second_position_points);
        firstPositionPoints2.setText(String.valueOf(groupC.getSecondPlace().getPoints()));



        //Third Place table
        TextView firstPositionNameTextView3 = (TextView) findViewById(R.id.third_place_name);
        firstPositionNameTextView3.setText(groupC.getThirdPlace().getName());

        ImageView firstPositionImageView3 = (ImageView) findViewById(R.id.third_place_image);
        firstPositionImageView3.setImageResource(groupC.getThirdPlace().getImage());

        TextView firstPositionPlceTextView3 = (TextView) findViewById(R.id.third_position_place);
        firstPositionPlceTextView3.setText(String.valueOf(groupC.getThirdPlace().getPosition()));

        TextView firstPositionGamesAmountTextView3 = findViewById(R.id.third_place_games);
        firstPositionGamesAmountTextView3.setText(String.valueOf(groupC.getThirdPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView3 = (TextView) findViewById(R.id.third_place_wins);
        firstPositionWinsAmountTextView3.setText(String.valueOf(groupC.getThirdPlace().getWins()));


        TextView firstPositionDrawsAmountTextView3 = (TextView) findViewById(R.id.third_place_draws);
        firstPositionDrawsAmountTextView3.setText(String.valueOf(groupC.getThirdPlace().getDraws()));

        TextView firstPositionLossesAmountTextView3 = (TextView) findViewById(R.id.third_place_losses);
        firstPositionLossesAmountTextView3.setText(String.valueOf(groupC.getThirdPlace().getLosses()));

        TextView firstPositionRatioTextView3 = (TextView) findViewById(R.id.third_place_ratio);
        firstPositionRatioTextView3.setText(groupC.getThirdPlace().getRatio());

        TextView firstPositionPoints3 = (TextView) findViewById(R.id.third_place_points);
        firstPositionPoints3.setText(String.valueOf(groupC.getThirdPlace().getPoints()));


        //Fourth Place table
        TextView firstPositionNameTextView4 = (TextView) findViewById(R.id.fourth_position_name);
        firstPositionNameTextView4.setText(groupC.getFourthPlace().getName());

        ImageView firstPositionImageView4 = (ImageView) findViewById(R.id.fourth_position_image);
        firstPositionImageView4.setImageResource(groupC.getFourthPlace().getImage());

        TextView firstPositionPlceTextView4 = (TextView) findViewById(R.id.fourth_position_place);
        firstPositionPlceTextView4.setText(String.valueOf(groupC.getFourthPlace().getPosition()));

        TextView firstPositionGamesAmountTextView4 = findViewById(R.id.fourth_position_games);
        firstPositionGamesAmountTextView4.setText(String.valueOf(groupC.getFourthPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_wins);
        firstPositionWinsAmountTextView4.setText(String.valueOf(groupC.getFourthPlace().getWins()));


        TextView firstPositionDrawsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_draws);
        firstPositionDrawsAmountTextView4.setText(String.valueOf(groupC.getFourthPlace().getDraws()));

        TextView firstPositionLossesAmountTextView4 = (TextView) findViewById(R.id.fourth_position_losses);
        firstPositionLossesAmountTextView4.setText(String.valueOf(groupC.getFourthPlace().getLosses()));

        TextView firstPositionRatioTextView4 = (TextView) findViewById(R.id.fourth_position_ratio);
        firstPositionRatioTextView4.setText(groupC.getFourthPlace().getRatio());

        TextView firstPositionPoints4 = (TextView) findViewById(R.id.fourth_position_points);
        firstPositionPoints4.setText(String.valueOf(groupC.getFourthPlace().getPoints()));

    }
}
