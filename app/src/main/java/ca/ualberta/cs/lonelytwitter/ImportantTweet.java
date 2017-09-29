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

import android.text.BoringLayout;

import java.util.Date;

/**
 * Created by xzhuang1 on 9/14/17.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super (message);
    }

    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
