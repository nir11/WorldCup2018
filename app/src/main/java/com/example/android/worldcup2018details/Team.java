package com.example.android.worldcup2018details;

/**
 * Created by Nir on 17/12/2017.
 */

public class Team {

    private String mName, mRatio;
    private int mPosition, mImage, mGamesAmount, mWins, mDraws, mLosses, mPoints ;
    private String mGroupNumber;
    public Team(String name, int image, String groupNumber, int position, int gamesAmount, int wins, int draws, int losses, String ratio, int points) {
        mName = name;
        mImage = image;
        mGroupNumber = groupNumber;
        mPosition = position;
        mGamesAmount = gamesAmount;
        mWins = wins;
        mDraws = draws;
        mLosses = losses;
        mRatio = ratio;
        mPoints = points;

    }

    public String getName() { return mName; }
    public int getPosition() { return mPosition; }
    public int getImage() { return mImage; }
    public int getGamesAmount() { return mGamesAmount; }
    public int getWins() { return mWins; }
    public int getDraws() { return mDraws; }
    public int getLosses() { return mLosses; }
    public String getRatio() { return mRatio; }
    public int getPoints() { return mPoints; }
    public String getGroupNumber() { return  mGroupNumber; }


}







