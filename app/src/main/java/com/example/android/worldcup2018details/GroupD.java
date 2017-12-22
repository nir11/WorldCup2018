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

public class GroupD extends AppCompatActivity {

    public static final String GROUP_A="בית א", GROUP_B="בית ב", GROUP_C="בית ג", GROUP_D="בית ד",
            GROUP_E="בית ה", GROUP_F="בית ו", GROUP_G="בית ז", GROUP_H="בית ח";
    public static final String ONE_OCLOCK="13:00", THREE_OCLOCK="15:00", FOUR_OCLOCK="16:00", FIVE_OCLOCK="17:00", SIX_OCLOCK="18:00",
            SEVEN_OCLOCK="19:00", NINE_OCLOCK="21:00", TEN_OCLOCK="22:00";

    @Override
    public void onBackPressed(){
        Intent numbersIntent = new Intent(GroupD.this, MainActivity.class);
        startActivity(numbersIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_for_groups);

        // GROUP D
        Team ARGENTINA = new Team("ארגנטינה", R.mipmap.argentina, GROUP_D, 1, 0, 0, 0, 0, "-", 0 );
        Team CROATIA = new Team("קרואטיה", R.mipmap.croatia, GROUP_D, 2, 0, 0, 0, 0, "-", 0 );
        Team ICELAND = new Team("איסלנד", R.mipmap.iceland, GROUP_D, 3, 0, 0, 0, 0, "-", 0 );
        Team NIGERIA = new Team("ניגריה", R.mipmap.nigeria, GROUP_D, 4, 0, 0, 0, 0, "-", 0 );

        // STADIUMS
        Stadium OTKRYTIE_ARENA = new Stadium("אוטקריטיה ארנה"  , "מוסקבה", "42,929", 1);
        Stadium ROSTOV_ARENA = new Stadium("רוסטוב ארנה", "רוסטוב על הדון", "43,705", 1);
        Stadium VOLGOGRAD_ARENA = new Stadium("וולגוגרד ארנה", "וולגוגרד", "45,015", 1);
        Stadium NIZHNY_NOVYGOROD_STADIUM = new Stadium("אצטדיון ניז'ני נובגורוד", "ניז'ני נובגורוד", "44,899", 1);
        Stadium KALININGRAD_STADIUM = new Stadium("אצטדיון קלינינגרד", "קלינינגרד", "35,000", 1);
        Stadium KRESTOVSKY_STADIUM = new Stadium("אצטדיון קרסטובסקי", "סנט פטרסבורג", "66,881", 1);



        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new Game(ARGENTINA, ICELAND, GROUP_D ,OTKRYTIE_ARENA,"16/6/18" ,FOUR_OCLOCK, false, true,
                true, 1, "-", 1));
        games.add(new Game(CROATIA, NIGERIA, GROUP_D ,KALININGRAD_STADIUM,"16/6/18" ,TEN_OCLOCK, false, false,
                false, 1, "-", 2));
        games.add(new Game(ARGENTINA, CROATIA, GROUP_D ,NIZHNY_NOVYGOROD_STADIUM,"21/6/18" ,NINE_OCLOCK, false, true,
                true, 2, "-", 3));
        games.add(new Game(NIGERIA, ICELAND, GROUP_D ,VOLGOGRAD_ARENA,"22/6/18" ,SIX_OCLOCK, true, true,
                true, 2, "-", 4));
        games.add(new Game(NIGERIA, ARGENTINA, GROUP_D ,KRESTOVSKY_STADIUM,"26/6/18" ,NINE_OCLOCK, false, true,
                true, 3, "-", 5));
        games.add(new Game(ICELAND, CROATIA, GROUP_D ,ROSTOV_ARENA,"26/6/18" ,NINE_OCLOCK, false, false,
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
                Intent numbersIntent = new Intent(GroupD.this, GroupE.class);
                startActivity(numbersIntent);
            }
        });

        ImageButton backwardButton = (ImageButton) findViewById(R.id.backward_button);
        backwardButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(GroupD.this, GroupC.class);
                startActivity(numbersIntent);
            }
        });

        Team[] teams = new Team[4];
        teams[0] = ARGENTINA;
        teams[1] = CROATIA;
        teams[2] = ICELAND;
        teams[3] = NIGERIA;
        Table groupD = new Table(teams);

        TextView groupNumberTextView = (TextView)findViewById(R.id.group_number_text);
        groupNumberTextView.setText(groupD.getFirstPlace().getGroupNumber());

        //First Place table
        TextView firstPositionNameTextView = (TextView) findViewById(R.id.first_position_name);
        firstPositionNameTextView.setText(groupD.getFirstPlace().getName());

        ImageView firstPositionImageView = (ImageView) findViewById(R.id.first_position_image);
        firstPositionImageView.setImageResource(groupD.getFirstPlace().getImage());

        TextView firstPositionPlceTextView = (TextView) findViewById(R.id.first_position_place);
        firstPositionPlceTextView.setText(String.valueOf(groupD.getFirstPlace().getPosition()));

        TextView firstPositionGamesAmountTextView = findViewById(R.id.first_position_games_amount);
        firstPositionGamesAmountTextView.setText(String.valueOf(groupD.getFirstPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView = (TextView) findViewById(R.id.first_position_wins_amount);
        firstPositionWinsAmountTextView.setText(String.valueOf(groupD.getFirstPlace().getWins()));


        TextView firstPositionDrawsAmountTextView = (TextView) findViewById(R.id.first_position_draws_amount);
        firstPositionDrawsAmountTextView.setText(String.valueOf(groupD.getFirstPlace().getDraws()));

        TextView firstPositionLossesAmountTextView = (TextView) findViewById(R.id.first_position_losses_amount);
        firstPositionLossesAmountTextView.setText(String.valueOf(groupD.getFirstPlace().getLosses()));

        TextView firstPositionRatioTextView = (TextView) findViewById(R.id.first_position_ratio);
        firstPositionRatioTextView.setText(groupD.getFirstPlace().getRatio());

        TextView firstPositionPoints = (TextView) findViewById(R.id.first_position_points);
        firstPositionPoints.setText(String.valueOf(groupD.getFirstPlace().getPoints()));


        //Second Place table
        TextView firstPositionNameTextView2 = (TextView) findViewById(R.id.second_position_name);
        firstPositionNameTextView2.setText(groupD.getSecondPlace().getName());

        ImageView firstPositionImageView2 = (ImageView) findViewById(R.id.second_position_image);
        firstPositionImageView2.setImageResource(groupD.getSecondPlace().getImage());

        TextView firstPositionPlceTextView2 = (TextView) findViewById(R.id.second_position_place);
        firstPositionPlceTextView2.setText(String.valueOf(groupD.getSecondPlace().getPosition()));

        TextView firstPositionGamesAmountTextView2 = findViewById(R.id.second_position_games);
        firstPositionGamesAmountTextView2.setText(String.valueOf(groupD.getSecondPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView2 = (TextView) findViewById(R.id.second_position_wins);
        firstPositionWinsAmountTextView2.setText(String.valueOf(groupD.getSecondPlace().getWins()));


        TextView firstPositionDrawsAmountTextView2 = (TextView) findViewById(R.id.second_position_draws);
        firstPositionDrawsAmountTextView2.setText(String.valueOf(groupD.getSecondPlace().getDraws()));

        TextView firstPositionLossesAmountTextView2 = (TextView) findViewById(R.id.second_position_losses);
        firstPositionLossesAmountTextView2.setText(String.valueOf(groupD.getSecondPlace().getLosses()));

        TextView firstPositionRatioTextView2 = (TextView) findViewById(R.id.second_position_ratio);
        firstPositionRatioTextView2.setText(groupD.getSecondPlace().getRatio());

        TextView firstPositionPoints2 = (TextView) findViewById(R.id.second_position_points);
        firstPositionPoints2.setText(String.valueOf(groupD.getSecondPlace().getPoints()));



        //Third Place table
        TextView firstPositionNameTextView3 = (TextView) findViewById(R.id.third_place_name);
        firstPositionNameTextView3.setText(groupD.getThirdPlace().getName());

        ImageView firstPositionImageView3 = (ImageView) findViewById(R.id.third_place_image);
        firstPositionImageView3.setImageResource(groupD.getThirdPlace().getImage());

        TextView firstPositionPlceTextView3 = (TextView) findViewById(R.id.third_position_place);
        firstPositionPlceTextView3.setText(String.valueOf(groupD.getThirdPlace().getPosition()));

        TextView firstPositionGamesAmountTextView3 = findViewById(R.id.third_place_games);
        firstPositionGamesAmountTextView3.setText(String.valueOf(groupD.getThirdPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView3 = (TextView) findViewById(R.id.third_place_wins);
        firstPositionWinsAmountTextView3.setText(String.valueOf(groupD.getThirdPlace().getWins()));


        TextView firstPositionDrawsAmountTextView3 = (TextView) findViewById(R.id.third_place_draws);
        firstPositionDrawsAmountTextView3.setText(String.valueOf(groupD.getThirdPlace().getDraws()));

        TextView firstPositionLossesAmountTextView3 = (TextView) findViewById(R.id.third_place_losses);
        firstPositionLossesAmountTextView3.setText(String.valueOf(groupD.getThirdPlace().getLosses()));

        TextView firstPositionRatioTextView3 = (TextView) findViewById(R.id.third_place_ratio);
        firstPositionRatioTextView3.setText(groupD.getThirdPlace().getRatio());

        TextView firstPositionPoints3 = (TextView) findViewById(R.id.third_place_points);
        firstPositionPoints3.setText(String.valueOf(groupD.getThirdPlace().getPoints()));


        //Fourth Place table
        TextView firstPositionNameTextView4 = (TextView) findViewById(R.id.fourth_position_name);
        firstPositionNameTextView4.setText(groupD.getFourthPlace().getName());

        ImageView firstPositionImageView4 = (ImageView) findViewById(R.id.fourth_position_image);
        firstPositionImageView4.setImageResource(groupD.getFourthPlace().getImage());

        TextView firstPositionPlceTextView4 = (TextView) findViewById(R.id.fourth_position_place);
        firstPositionPlceTextView4.setText(String.valueOf(groupD.getFourthPlace().getPosition()));

        TextView firstPositionGamesAmountTextView4 = findViewById(R.id.fourth_position_games);
        firstPositionGamesAmountTextView4.setText(String.valueOf(groupD.getFourthPlace().getGamesAmount()));

        TextView firstPositionWinsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_wins);
        firstPositionWinsAmountTextView4.setText(String.valueOf(groupD.getFourthPlace().getWins()));


        TextView firstPositionDrawsAmountTextView4 = (TextView) findViewById(R.id.fourth_position_draws);
        firstPositionDrawsAmountTextView4.setText(String.valueOf(groupD.getFourthPlace().getDraws()));

        TextView firstPositionLossesAmountTextView4 = (TextView) findViewById(R.id.fourth_position_losses);
        firstPositionLossesAmountTextView4.setText(String.valueOf(groupD.getFourthPlace().getLosses()));

        TextView firstPositionRatioTextView4 = (TextView) findViewById(R.id.fourth_position_ratio);
        firstPositionRatioTextView4.setText(groupD.getFourthPlace().getRatio());

        TextView firstPositionPoints4 = (TextView) findViewById(R.id.fourth_position_points);
        firstPositionPoints4.setText(String.valueOf(groupD.getFourthPlace().getPoints()));

    }
}
