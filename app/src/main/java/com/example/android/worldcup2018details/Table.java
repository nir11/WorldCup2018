package com.example.android.worldcup2018details;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Nir on 21/12/2017.
 */

public class Table extends AppCompatActivity {

    private Team mTeam1, mTeam2, mTeam3, mTeam4;
    String mGroupNumber;

    public Table(Team []teams) {

        mGroupNumber = teams[0].getGroupNumber();
        for (int i = 0; i < 4; i++) {
            if (teams[i].getPosition() == 1)
                mTeam1 = teams[i];
            else if (teams[i].getPosition() == 2)
                mTeam2 = teams[i];
            else if (teams[i].getPosition() == 3)
                mTeam3 = teams[i];
            else if (teams[i].getPosition() == 4)
                mTeam4 = teams[i];
        }
    }




    public Team getFirstPlace(){ return mTeam1; }
    public Team getSecondPlace(){ return mTeam2; }
    public Team getThirdPlace(){ return mTeam3; }
    public Team getFourthPlace(){ return mTeam4; }
    public String getGroupNumber() { return mGroupNumber; }

}
