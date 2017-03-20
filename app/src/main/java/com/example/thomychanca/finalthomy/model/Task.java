package com.example.thomychanca.finalthomy.model;



/**
 * Created by thomychanca on 11/03/2017.
 */
import io.realm.RealmObject;

public class Task extends RealmObject{
    private String description;
    private int duration;
    private int type;
    private boolean isCompleted;
    public Task(){

    }

    public Task (String description, int duration, int type){
        this.description=description;
        this.duration=duration;
        this.type=type;

    }
    public String getDescription(){
        return description;

    }
    public void setDescription(String description){
        this.description=description;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
}
