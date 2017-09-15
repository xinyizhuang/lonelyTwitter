package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Rebejohn on 2017/9/14.
 */

public class Unhappy extends Mood {

    public Unhappy(){
        super();
    }

    public Unhappy(Date date){
        super(date);
    }

    @Override
    public String moodToString(){
        return "Unhappy";
    }
}
