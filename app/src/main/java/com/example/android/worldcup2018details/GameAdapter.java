package com.example.android.worldcup2018details;

/**
 * Created by Nir on 15/12/2017.
 */
import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;


import java.util.ArrayList;

public class GameAdapter extends ArrayAdapter<Game> {
    private int mColorResourceId;


    public GameAdapter(Activity context, ArrayList<Game> games, int colorResourceId) {
        super(context, 0, games);
        mColorResourceId = colorResourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Game currentGame = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView goupNumberTextView = (TextView) listItemView.findViewById(R.id.group_number);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        goupNumberTextView.setText(currentGame.getGroupNumber());
        if (currentGame.getOpenGroupGame() == false)
            goupNumberTextView.setVisibility(View.GONE);


        TextView matchDateTextView = (TextView) listItemView.findViewById(R.id.match_date);
        matchDateTextView.setText(currentGame.getDate());
        if (currentGame.getOpenDayGame() == false)
            matchDateTextView.setVisibility(View.GONE);

        TextView matchTimeTextView = (TextView) listItemView.findViewById(R.id.match_time);
        matchTimeTextView.setText(currentGame.getTime());

        TextView homeTeamTextView = (TextView) listItemView.findViewById(R.id.home_team);
        homeTeamTextView.setText(currentGame.mHomeTeam.getName());

        ImageView homeTeamImageView = (ImageView) listItemView.findViewById(R.id.home_team_image);
        homeTeamImageView.setImageResource(currentGame.mHomeTeam.getImage());

        TextView awayTeamTextView = (TextView) listItemView.findViewById(R.id.away_team);
        awayTeamTextView.setText(currentGame.mAwayTeam.getName());

        ImageView awayTeamImageView = (ImageView) listItemView.findViewById(R.id.away_team_image);
        awayTeamImageView.setImageResource(currentGame.mAwayTeam.getImage());

        TextView scoreTextView = (TextView)listItemView.findViewById(R.id.score);
        scoreTextView.setText(currentGame.getScore());

        View textContainer = listItemView.findViewById(R.id.text_container);
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
