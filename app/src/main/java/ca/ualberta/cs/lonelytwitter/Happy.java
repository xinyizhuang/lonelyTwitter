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
import java.util.Scanner;

/**
 * Represents a Tweet
 * @author xzhuang
 * @version 1.0
 * @since 1.0
 *
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
