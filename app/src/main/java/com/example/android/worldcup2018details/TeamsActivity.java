package com.example.android.worldcup2018details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableRow;

import java.util.ArrayList;

public class TeamsActivity extends AppCompatActivity {

    public static final String GROUP_A="בית א", GROUP_B="בית ב", GROUP_C="בית ג", GROUP_D="בית ד",
            GROUP_E="בית ה", GROUP_F="בית ו", GROUP_G="בית ז", GROUP_H="בית ח";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_for_groups);


        ArrayList<Team> teams = new ArrayList<Team>();

        teams.add(new Team("אוסטרליה", R.mipmap.australia, GROUP_C, 3, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("אורוגוואי", R.mipmap.uruguay, GROUP_A, 2, 0, 0, 0, 0, "-", 0) );
        teams.add(new Team("איסלנד", R.mipmap.iceland, GROUP_D, 3, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("איראן", R.mipmap.iran, GROUP_B, 4, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("אנגליה", R.mipmap.england, GROUP_G, 2, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("ארגנטינה", R.mipmap.argentina, GROUP_D, 1, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("בלגיה", R.mipmap.belgium, GROUP_G, 1, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("ברזיל", R.mipmap.brazil, GROUP_E, 1, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("גרמניה", R.mipmap.germany, GROUP_F, 1, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("דנמרק", R.mipmap.denmark, GROUP_C, 2, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("דרום קוריאה", R.mipmap.south_korea, GROUP_F, 4, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("יפן", R.mipmap.japan, GROUP_H, 3, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("מצרים", R.mipmap.egypt, GROUP_A, 3, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("מקסיקו", R.mipmap.mexico, GROUP_F, 2, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("מרוקו", R.mipmap.morocco, GROUP_B, 3, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("ניגריה", R.mipmap.nigeria, GROUP_D, 4, 0, 0, 0, 0, "-", 0));

        teams.add(new Team("סנגל", R.mipmap.senegal, GROUP_H, 4, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("ספרד", R.mipmap.spain, GROUP_B, 2, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("סרביה", R.mipmap.serbia, GROUP_E, 4, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("ערב הסעודית", R.mipmap.saudi_arabia, GROUP_A, 4, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("פולין", R.mipmap.poland, GROUP_H, 2, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("פורטוגל", R.mipmap.portugal, GROUP_B, 1, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("פנמה", R.mipmap.panama, GROUP_G, 3, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("פרו", R.mipmap.peru, GROUP_C, 4, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("צרפת", R.mipmap.france, GROUP_C, 1, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("קולומביה", R.mipmap.colombia, GROUP_H, 1, 0, 0, 0, 0, "-", 0) );
        teams.add(new Team("קוסטה ריקה", R.mipmap.costa_rica, GROUP_E, 3, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("קרואטיה", R.mipmap.croatia, GROUP_D, 2, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("רוסיה", R.mipmap.russia, GROUP_A, 1, 0, 0, 0, 0, "-", 0 ));

        teams.add(new Team("שוודיה", R.mipmap.sweden, GROUP_F, 3, 0, 0, 0, 0, "-", 0 ));
        teams.add(new Team("שווייץ", R.mipmap.switzerland, GROUP_E, 2, 0, 0, 0, 0, "-", 00 ));
        
        teams.add(new Team("תוניסיה", R.mipmap.tunisia, GROUP_G, 4, 0, 0, 0, 0, "-", 0 ));




        TeamAdapter adapter = new TeamAdapter(this, teams, R.color.colorForGeneralGamesList);
        ListView listView = (ListView) findViewById(R.id.list_group_games);
        listView.setAdapter(adapter);




    }
}
