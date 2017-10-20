package com.epicodus.athletetracker.Models;


import org.parceler.Parcel;

@Parcel
public class Workout {

    private String mName;
    private String mDescription;

    public Workout(){}

    public Workout(String name, String description){
        this.mName = name;
        this.mDescription = description;
    }

    public String getmName(){
        return mName;
    }
    public String getmDescription(){
        return mDescription;
    }
}
