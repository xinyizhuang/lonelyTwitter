package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xzhuang1 on 9/14/17.
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private ArrayList<Mood> mood = new ArrayList<Mood>();


    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

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
        }
        else {
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

}
