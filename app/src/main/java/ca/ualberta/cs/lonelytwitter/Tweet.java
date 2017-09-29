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

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 * @author xzhuang
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private ArrayList<Mood> mood = new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     * @param date teweet date
     */


    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public void setMoods(ArrayList<Mood> mood){
        this.mood = mood;
    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }
    @Override
    public String toString(){
        return date.toString() + " | " + message;
     }

    public ArrayList<Mood> getMoods(){
        return mood;
    }

    public abstract Boolean isImportant();

    /**
     * Sets tweet messages
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */

}
