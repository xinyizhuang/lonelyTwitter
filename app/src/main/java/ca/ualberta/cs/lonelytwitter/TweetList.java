package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.DuplicateFormatFlagsException;

/**
 * Created by Rebejohn on 2017-10-12.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public void add(Tweet tweet) {
        if(this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);

    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);

    }

    public int getCount(Tweet tweet) {
        return tweets.size();

    }


    public ArrayList<Tweet> getTweets() {
        return this.tweets;
    }

}
