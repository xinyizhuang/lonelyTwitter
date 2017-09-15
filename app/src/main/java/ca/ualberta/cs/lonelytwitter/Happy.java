package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Rebejohn on 2017/9/14.
 */

public class Happy extends Mood {

    public Happy(){
        super();
    }

    public Happy(Date date){
        super(date);
    }

    @Override
    public String moodToString(){
        return "Happy";
    }

}
