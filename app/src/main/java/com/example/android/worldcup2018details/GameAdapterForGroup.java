package com.example.android.worldcup2018details;

/**
 * Created by Nir on 15/12/2017.
 */
import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;


import java.util.ArrayList;

public class GameAdapterForGroup extends ArrayAdapter<Game> {
    private int mColorResourceId;


    public GameAdapterForGroup(Activity context, ArrayList<Game> games, int colorResourceId) {
        super(context, 0, games);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_game_list_for_group, parent, false);

        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Game currentGame = getItem(position);








        TextView matchNumberTextView = (TextView) listItemView.findViewById(R.id.match_number_for_group);
        if(currentGame.getTotalGameNum()%2 == 1)
            matchNumberTextView.setVisibility(View.VISIBLE);
        {
            if (currentGame.getTotalGameNum() == 1)
                matchNumberTextView.setText(currentGame.getMatchDayNumber());
            else if (currentGame.getTotalGameNum() == 3)
                matchNumberTextView.setText(currentGame.getMatchDayNumber());
            else if (currentGame.getTotalGameNum() == 5)
                matchNumberTextView.setText(currentGame.getMatchDayNumber());
        }

        TextView matchDateTextView = (TextView) listItemView.findViewById(R.id.match_date_for_group);
        if (currentGame.getOpenDayGameInGroup() == true) {
            matchDateTextView.setVisibility(View.VISIBLE);
            matchDateTextView.setText(currentGame.getDate());
        }


        ImageView homeTeamImageView = (ImageView) listItemView.findViewById(R.id.home_team_image_for_group);
        homeTeamImageView.setImageResource(currentGame.mHomeTeam.getImage());

        TextView homeTeamTextView = (TextView) listItemView.findViewById(R.id.home_team_for_group);
        homeTeamTextView.setText(currentGame.mHomeTeam.getName());

        ImageView awayTeamImageView = (ImageView) listItemView.findViewById(R.id.away_team_image_for_group);
        awayTeamImageView.setImageResource(currentGame.mAwayTeam.getImage());

        TextView awayTeamTextView = (TextView) listItemView.findViewById(R.id.away_team_for_group);
        awayTeamTextView.setText(currentGame.mAwayTeam.getName());

        TextView scoreTextView = (TextView)listItemView.findViewById(R.id.score_for_group);
        scoreTextView.setText(currentGame.getScore());

        TextView timeTextView = (TextView)listItemView.findViewById(R.id.match_time_for_group);
        timeTextView.setText(currentGame.getTime());

        TextView cityTextView = (TextView)listItemView.findViewById(R.id.city_and_stadium_for_groups);
        cityTextView.setText(currentGame.mStadium.getStadium());
        cityTextView.setVisibility(View.VISIBLE);





        View textContainer = listItemView.findViewById(R.id.match_teams);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

    @Override
    public int getViewTypeCount() {

        return getCount();
    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }
}
