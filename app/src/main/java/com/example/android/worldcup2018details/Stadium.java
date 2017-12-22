package com.example.android.worldcup2018details;

/**
 * Created by Nir on 21/12/2017.
 */

public class Stadium {

    private String mName, mCity, mCapacity;
    private int mEstablishmentYear;

    public Stadium(String name, String city, String capacity, int establishmentYear) {
        mName = name;
        mCity = city;
        mCapacity = capacity;
        mEstablishmentYear = establishmentYear;
    }

    public String getName() { return  mName; }
    public String getCity() { return mCity;}
    public String getCapacity() { return mCapacity; }
    public int getEstablishmentYear() { return mEstablishmentYear; }
    public String getStadium() { return mName + ", " + mCity; }
}
