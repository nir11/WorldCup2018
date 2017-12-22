package com.example.android.worldcup2018details;

/**
 * Created by Nir on 14/12/2017.
 */

public class Game {

    protected Team mHomeTeam;
    protected Team mAwayTeam;
    private String mGroupNumber;
    protected Stadium mStadium;
    private String mDate;
    private String mTime;
    private boolean mOpenGroupGame;
    private boolean mOpenDayGame;
    private String mScore;
    private boolean mOpenDayGameInGroup;
    private int mMatchDayNumber;
    private int mTotalGameNum;


    public Game(Team homeTeam, Team awayTeam, String groupNumber, Stadium stadium, String date, String time ,
                boolean openDayGame,  boolean openGroupGame, boolean openDayGameInGroup, int matchDayNumber, String score, int totalGameNum)
                {
        mHomeTeam = homeTeam;
        mAwayTeam = awayTeam;
        mGroupNumber = groupNumber;
        mStadium = stadium;
        mDate = date;
        mTime = time;
        mOpenDayGame = openDayGame;
        mOpenGroupGame = openGroupGame;
        mOpenDayGameInGroup = openDayGameInGroup;
        mMatchDayNumber = matchDayNumber;
        mScore = score;
        mTotalGameNum = totalGameNum;
    }

    public Team getHomeTeam() { return mHomeTeam; }
    public Team getAwayTeam() { return mAwayTeam; }
    public String getGroupNumber() { return mGroupNumber; }
    public Stadium getStadium() { return mStadium; }
    public String getDate() { return mDate; }
    public String getTime() { return mTime; }
    public boolean getOpenDayGame() { return mOpenDayGame; }
    public boolean getOpenGroupGame() { return mOpenGroupGame; }
    public  boolean getOpenDayGameInGroup() { return  mOpenDayGameInGroup; }
    public String getMatchDayNumber() { return "מחזור " + mMatchDayNumber; }
    public String getScore() { return mScore; }
    public int getTotalGameNum() { return mTotalGameNum; }






}
