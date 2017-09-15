package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Rebejohn on 2017/9/14.
 */

public abstract class Mood {

    private Date date;

    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public abstract String moodToString();
}
