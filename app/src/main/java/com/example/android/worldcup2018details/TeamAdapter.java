package com.example.android.worldcup2018details;

import android.app.Activity;
import android.content.Intent;
import android.widget.ArrayAdapter;
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
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

import java.util.ArrayList;


/**
 * Created by Nir on 22/12/2017.
 */

public class TeamAdapter extends ArrayAdapter<Team> {
    private int mColorResourceId;

    public TeamAdapter(Activity context, ArrayList<Team> teams, int colorResourceId) {
        super(context, 0, teams);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_teams, parent, false);
        }


        Team currentTeam = getItem(position);


        ImageView imageView = (ImageView)listItemView.findViewById(R.id.team_image);
        imageView.setImageResource(currentTeam.getImage());


        TextView textView = (TextView) listItemView.findViewById(R.id.team_name);
        textView.setText(currentTeam.getName());




        View textContainer = listItemView.findViewById(R.id.text_container3);
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

