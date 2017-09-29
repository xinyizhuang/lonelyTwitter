/*
 *Class Name: Tweet
 *
 * Version: version 1.0
 *
 * Date: September 28, 2017
 *
 *
 * Copyright (c) Team X, CMPUT 301, University of Alberta - All Rights
 *  Reserved. You may use, distribute or modify this code under
 * terms and conditions of the Code of Students Behavior at
 * University of Alberta
 */

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
