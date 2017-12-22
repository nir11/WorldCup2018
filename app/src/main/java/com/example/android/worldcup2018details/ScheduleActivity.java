package com.example.android.worldcup2018details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileFilter;
import java.io.FileReader;
import java.util.ArrayList;

import javax.microedition.khronos.egl.EGL;

public class ScheduleActivity extends AppCompatActivity {

    public static final String GROUP_A="בית א", GROUP_B="בית ב", GROUP_C="בית ג", GROUP_D="בית ד",
            GROUP_E="בית ה", GROUP_F="בית ו", GROUP_G="בית ז", GROUP_H="בית ח";
    public static final String ONE_OCLOCK="13:00", THREE_OCLOCK="15:00", FOUR_OCLOCK="16:00", FIVE_OCLOCK="17:00", SIX_OCLOCK="18:00",
            SEVEN_OCLOCK="19:00", NINE_OCLOCK="21:00", TEN_OCLOCK="22:00";
    public static final boolean SHORT=false, LONG=true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);

        // GROUP A
        Team RUSSIA = new Team("רוסיה", R.mipmap.russia, GROUP_A, 1, 0, 0, 0, 0, "-", 0 );
        Team URUGUAY = new Team("אורוגוואי", R.mipmap.uruguay, GROUP_A, 2, 0, 0, 0, 0, "-", 0 );
        Team EGYPT = new Team("מצרים", R.mipmap.egypt, GROUP_A, 3, 0, 0, 0, 0, "-", 0 );
        Team SAUDI_ARABIA = new Team("ערב הסעודית", R.mipmap.saudi_arabia, GROUP_A, 4, 0, 0, 0, 0, "-", 0 );

        // GROUP B
        Team PORTUGAL = new Team("פורטוגל", R.mipmap.portugal, GROUP_B, 1, 0, 0, 0, 0, "-", 0 );
        Team SPAIN = new Team("ספרד", R.mipmap.spain, GROUP_B, 2, 0, 0, 0, 0, "-", 0 );
        Team MOROCCO = new Team("מרוקו", R.mipmap.morocco, GROUP_B, 3, 0, 0, 0, 0, "-", 0 );
        Team IRAN = new Team("איראן", R.mipmap.iran, GROUP_B, 4, 0, 0, 0, 0, "-", 0 );

        // GROUP C
        Team FRANCE = new Team("צרפת", R.mipmap.france, GROUP_C, 1, 0, 0, 0, 0, "-", 0 );
        Team DENMARK = new Team("דנמרק", R.mipmap.denmark, GROUP_C, 2, 0, 0, 0, 0, "-", 0 );
        Team AUSTRALIA = new Team("אוסטרליה", R.mipmap.australia, GROUP_C, 3, 0, 0, 0, 0, "-", 0 );
        Team PERU = new Team("פרו", R.mipmap.peru, GROUP_C, 4, 0, 0, 0, 0, "-", 0 );

        // GROUP D
        Team ARGENTINA = new Team("ארגנטינה", R.mipmap.argentina, GROUP_D, 1, 0, 0, 0, 0, "-", 0 );
        Team CROATIA = new Team("קרואטיה", R.mipmap.croatia, GROUP_D, 2, 0, 0, 0, 0, "-", 0 );
        Team ICELAND = new Team("איסלנד", R.mipmap.iceland, GROUP_D, 3, 0, 0, 0, 0, "-", 0 );
        Team NIGERIA = new Team("ניגריה", R.mipmap.nigeria, GROUP_D, 4, 0, 0, 0, 0, "-", 0 );

        // GROUP E
        Team BRAZIL = new Team("ברזיל", R.mipmap.brazil, GROUP_E, 1, 0, 0, 0, 0, "-", 0 );
        Team SWITZERLAND = new Team("שווייץ", R.mipmap.switzerland, GROUP_E, 2, 0, 0, 0, 0, "-", 0 );
        Team COSTA_RICA = new Team("קוסטה ריקה", R.mipmap.costa_rica, GROUP_E, 3, 0, 0, 0, 0, "-", 0 );
        Team SERBIA = new Team("סרביה", R.mipmap.serbia, GROUP_E, 4, 0, 0, 0, 0, "-", 0 );

        // GROUP F
        Team GERMANY = new Team("גרמניה", R.mipmap.germany, GROUP_F, 1, 0, 0, 0, 0, "-", 0 );
        Team MEXICO = new Team("מקסיקו", R.mipmap.mexico, GROUP_F, 2, 0, 0, 0, 0, "-", 0 );
        Team SWEDEN = new Team("שוודיה", R.mipmap.sweden, GROUP_F, 3, 0, 0, 0, 0, "-", 0 );
        Team SOUTH_KOREA = new Team("דרום קוריאה", R.mipmap.south_korea, GROUP_F, 4, 0, 0, 0, 0, "-", 0 );

        // GROUP G
        Team BELGIUM = new Team("בלגיה", R.mipmap.belgium, GROUP_G, 1, 0, 0, 0, 0, "-", 0 );
        Team ENGLAND = new Team("אנגליה", R.mipmap.england, GROUP_G, 2, 0, 0, 0, 0, "-", 0 );
        Team PANAMA = new Team("פנמה", R.mipmap.panama, GROUP_G, 3, 0, 0, 0, 0, "-", 0 );
        Team TUNISIA = new Team("תוניסיה", R.mipmap.tunisia, GROUP_G, 4, 0, 0, 0, 0, "-", 0 );

        // GROUP H
        Team COLOMBIA = new Team("קולומביה", R.mipmap.colombia, GROUP_H, 1, 0, 0, 0, 0, "-", 0 );
        Team POLAND = new Team("פולין", R.mipmap.poland, GROUP_H, 2, 0, 0, 0, 0, "-", 0 );
        Team JAPAN = new Team("יפן", R.mipmap.japan, GROUP_H, 3, 0, 0, 0, 0, "-", 0 );
        Team SENEGAL = new Team("סנגל", R.mipmap.senegal, GROUP_H, 4, 0, 0, 0, 0, "-", 0 );

        // STADIUMS
        Stadium LUZHNIKI_STADIUM = new Stadium("אצטדיון לוז'ניקי", "מוסקבה", "81,000", 1);
        Stadium OTKRYTIE_ARENA = new Stadium("אוטקריטיה ארנה"  , "מוסקבה", "42,929", 1);
        Stadium KAZAN_ARENA = new Stadium("קאזאן ארנה", "קאזאן", "45,105", 1);
        Stadium COSMOS_ARENA = new Stadium("קוסמוס ארנה", "סמארה", "44,918", 1);
        Stadium MORDOVIA_ARENA = new Stadium("מורדוביה ארנה", "סרנסק", "45,015", 1);
        Stadium ROSTOV_ARENA = new Stadium("רוסטוב ארנה", "רוסטוב על הדון", "43,705", 1);
        Stadium FISHT_OLYMPIC_STADIUM = new Stadium("האצטדיון האולימפי פישט","סוצ'י", "47,659", 1);
        Stadium CENTRAL_STADIUM = new Stadium("האצטדיון המרכזי", "יקטרינבורג", "35,000", 1);
        Stadium VOLGOGRAD_ARENA = new Stadium("וולגוגרד ארנה", "וולגוגרד", "45,015", 1);
        Stadium NIZHNY_NOVYGOROD_STADIUM = new Stadium("אצטדיון ניז'ני נובגורוד", "ניז'ני נובגורוד", "44,899", 1);
        Stadium KALININGRAD_STADIUM = new Stadium("אצטדיון קלינינגרד", "קלינינגרד", "35,000", 1);
        Stadium KRESTOVSKY_STADIUM = new Stadium("אצטדיון קרסטובסקי", "סנט פטרסבורג", "66,881", 1);




        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new Game(RUSSIA, SAUDI_ARABIA, GROUP_A ,LUZHNIKI_STADIUM,"14/6/18" ,SIX_OCLOCK, true, true,
                true, 1, "-", 1));

        games.add(new Game(EGYPT, URUGUAY, GROUP_A ,CENTRAL_STADIUM,"15/6/18" ,THREE_OCLOCK, true, true,
                true, 1, "-", 2));
        games.add(new Game(MOROCCO, IRAN, GROUP_B ,KRESTOVSKY_STADIUM,"15/6/18" ,SIX_OCLOCK, false, true,
                true, 1, "-", 1));
        games.add(new Game(PORTUGAL, SPAIN, GROUP_B ,FISHT_OLYMPIC_STADIUM,"15/6/18" ,NINE_OCLOCK, false, false,
                false, 1, "-", 2));

        games.add(new Game(FRANCE, AUSTRALIA, GROUP_C ,KAZAN_ARENA,"16/6/18" ,ONE_OCLOCK, true, true,
                true, 1, "-", 1));
        games.add(new Game(PERU, DENMARK, GROUP_C ,MORDOVIA_ARENA,"16/6/18" ,SEVEN_OCLOCK, false, false,
                false, 1, "-", 2));
        games.add(new Game(ARGENTINA, ICELAND, GROUP_D ,OTKRYTIE_ARENA,"16/6/18" ,FOUR_OCLOCK, false, true,
                true, 1, "-", 1));
        games.add(new Game(CROATIA, NIGERIA, GROUP_D ,KALININGRAD_STADIUM,"16/6/18" ,TEN_OCLOCK, false, false,
                false, 1, "-", 2));


        games.add(new Game(COSTA_RICA, SERBIA, GROUP_E ,COSMOS_ARENA,"17/6/18" ,THREE_OCLOCK, true, true,
                true, 1, "-", 1));
        games.add(new Game(BRAZIL, SWITZERLAND, GROUP_E ,ROSTOV_ARENA,"17/6/18" ,NINE_OCLOCK, false, false,
                false, 1, "-", 2));
        games.add(new Game(GERMANY, MEXICO, GROUP_F ,LUZHNIKI_STADIUM,"17/6/18" ,SIX_OCLOCK, false, true,
                true, 1, "-", 1));

        games.add(new Game(SWEDEN, SOUTH_KOREA, GROUP_F ,NIZHNY_NOVYGOROD_STADIUM,"18/6/18" ,THREE_OCLOCK, true, true,
                true, 1, "-", 2));
        games.add(new Game(BELGIUM, PANAMA, GROUP_G ,FISHT_OLYMPIC_STADIUM,"18/6/18" ,SIX_OCLOCK, false, true,
                true, 1, "-", 1));
        games.add(new Game(TUNISIA, ENGLAND, GROUP_G ,VOLGOGRAD_ARENA,"18/6/18" ,NINE_OCLOCK, false, false,
                false, 1, "-", 2));

        games.add(new Game(COLOMBIA, JAPAN, GROUP_H ,MORDOVIA_ARENA,"19/6/18" ,THREE_OCLOCK, true, true,
                true, 1, "-", 1));
        games.add(new Game(POLAND, SENEGAL, GROUP_H ,OTKRYTIE_ARENA,"19/6/18" ,SIX_OCLOCK, false, false,
                false, 1, "-", 2));
        games.add(new Game(RUSSIA, EGYPT, GROUP_A ,KRESTOVSKY_STADIUM,"19/6/18" ,NINE_OCLOCK, false, true,
                true, 2, "-", 3));

        games.add(new Game(URUGUAY, SAUDI_ARABIA, GROUP_A ,ROSTOV_ARENA,"20/6/18" ,SIX_OCLOCK, true, true,
                true, 2, "-", 4));
        games.add(new Game(PORTUGAL, MOROCCO, GROUP_B ,LUZHNIKI_STADIUM,"20/6/18" ,THREE_OCLOCK, false, true,
                true, 2, "-", 3));
        games.add(new Game(IRAN, SPAIN, GROUP_B ,KAZAN_ARENA,"20/6/18" ,NINE_OCLOCK, false, false,
                false, 2, "-", 4));

        games.add(new Game(DENMARK, AUSTRALIA, GROUP_C ,COSMOS_ARENA,"21/6/18" ,THREE_OCLOCK, true, true,
                true, 2, "-", 3));
        games.add(new Game(FRANCE, PERU, GROUP_C ,CENTRAL_STADIUM,"21/6/18" ,SIX_OCLOCK, false, false,
                false, 2, "-", 4));
        games.add(new Game(ARGENTINA, CROATIA, GROUP_D ,NIZHNY_NOVYGOROD_STADIUM,"21/6/18" ,NINE_OCLOCK, false, true,
                true, 2, "-", 3));

        games.add(new Game(NIGERIA, ICELAND, GROUP_D ,VOLGOGRAD_ARENA,"22/6/18" ,SIX_OCLOCK, true, true,
                true, 2, "-", 4));
        games.add(new Game(BRAZIL, COSTA_RICA, GROUP_E ,KRESTOVSKY_STADIUM,"22/6/18" ,THREE_OCLOCK, false, true,
                true, 2, "-", 3));
        games.add(new Game(SERBIA, SWITZERLAND, GROUP_E ,KALININGRAD_STADIUM,"22/6/18" ,NINE_OCLOCK, false, false,
                false, 2, "-", 4));

        games.add(new Game(SOUTH_KOREA, MEXICO, GROUP_F ,ROSTOV_ARENA,"23/6/18" ,SIX_OCLOCK, true, true,
                true, 2, "-", 3));
        games.add(new Game(GERMANY, SWEDEN, GROUP_F ,FISHT_OLYMPIC_STADIUM,"23/6/18" ,NINE_OCLOCK, false, false,
                false, 2, "-", 4));
        games.add(new Game(BELGIUM, TUNISIA, GROUP_G ,OTKRYTIE_ARENA,"23/6/18" ,THREE_OCLOCK, false, true,
                true, 2, "-", 3));

        games.add(new Game(ENGLAND, PANAMA, GROUP_G ,NIZHNY_NOVYGOROD_STADIUM,"24/6/18" ,THREE_OCLOCK, true, true,
                true, 2, "-", 4));
        games.add(new Game(JAPAN, SENEGAL, GROUP_H ,CENTRAL_STADIUM,"24/6/18" ,SIX_OCLOCK, false, true,
                true, 2, "-", 3));
        games.add(new Game(POLAND, COLOMBIA, GROUP_H ,KAZAN_ARENA,"24/6/18" ,NINE_OCLOCK, false, false,
                false, 2, "-", 4));

        games.add(new Game(SAUDI_ARABIA, EGYPT, GROUP_A ,VOLGOGRAD_ARENA,"25/6/18" ,FIVE_OCLOCK, true, true,
                true, 3, "-", 5));
        games.add(new Game(URUGUAY, RUSSIA, GROUP_A ,COSMOS_ARENA,"25/6/18" ,FIVE_OCLOCK, false, false,
                false, 3, "-", 6));
        games.add(new Game(IRAN, PORTUGAL, GROUP_B ,MORDOVIA_ARENA,"25/6/18" ,NINE_OCLOCK, false, true,
                true, 3, "-", 5));
        games.add(new Game(SPAIN, MOROCCO, GROUP_B ,KALININGRAD_STADIUM,"25/6/18" ,NINE_OCLOCK, false, false,
                false, 3, "-", 6));

        games.add(new Game(DENMARK, FRANCE, GROUP_C ,LUZHNIKI_STADIUM,"26/6/18" ,FIVE_OCLOCK, true, true,
                true, 3, "-", 5));
        games.add(new Game(AUSTRALIA, PERU, GROUP_C ,FISHT_OLYMPIC_STADIUM,"26/6/18" ,FIVE_OCLOCK, false, false,
                false, 3, "-", 6));
        games.add(new Game(NIGERIA, ARGENTINA, GROUP_D ,KRESTOVSKY_STADIUM,"26/6/18" ,NINE_OCLOCK, false, true,
                true, 3, "-", 5));
        games.add(new Game(ICELAND, CROATIA, GROUP_D ,ROSTOV_ARENA,"26/6/18" ,NINE_OCLOCK, false, false,
                false, 3, "-", 6));

        games.add(new Game(SERBIA, BRAZIL, GROUP_E ,OTKRYTIE_ARENA,"27/6/18" ,NINE_OCLOCK, true, true,
                true, 3, "-", 5));
        games.add(new Game(SWITZERLAND, COSTA_RICA, GROUP_E ,NIZHNY_NOVYGOROD_STADIUM,"27/6/18" ,NINE_OCLOCK, false, false,
                false, 3, "-", 6));
        games.add(new Game(SOUTH_KOREA, GERMANY, GROUP_F ,KAZAN_ARENA,"27/6/18" ,FIVE_OCLOCK, false, true,
                true, 3, "-", 5));
        games.add(new Game(MEXICO, SWEDEN, GROUP_F ,CENTRAL_STADIUM,"27/6/18" ,FIVE_OCLOCK, false, false,
                false, 3, "-", 6));

        games.add(new Game(ENGLAND, BELGIUM, GROUP_G ,KALININGRAD_STADIUM,"28/6/18" ,NINE_OCLOCK, true, true,
                true, 3, "-", 5));
        games.add(new Game(PANAMA, TUNISIA, GROUP_G ,MORDOVIA_ARENA,"28/6/18" ,NINE_OCLOCK, false, false,
                false, 3, "-", 6));
        games.add(new Game(JAPAN, POLAND, GROUP_H ,VOLGOGRAD_ARENA,"28/6/18" ,FIVE_OCLOCK, false, true,
                true, 3, "-", 5));
        games.add(new Game(SENEGAL, COLOMBIA, GROUP_H ,COSMOS_ARENA,"28/6/18" ,FIVE_OCLOCK, false, false,
                false, 3, "-", 6));




        GameAdapter adapter = new GameAdapter(this, games, R.color.colorForGeneralGamesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
