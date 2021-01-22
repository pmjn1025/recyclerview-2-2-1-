package com.example.recyclerviewtest2_2;

public class PersonData {

    private String profile;
    private String name;
    private String day;
    private String time;


    public PersonData (String profile, String name, String day, String time){
        this.profile = profile;
        this.name = name;
        this.day = day;
        this.time = time;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
