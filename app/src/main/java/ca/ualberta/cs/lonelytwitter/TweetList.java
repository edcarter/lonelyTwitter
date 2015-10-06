package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by joshua2 on 9/28/15.
 */
public class TweetList implements MyObservable, MyObserver {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private volatile ArrayList<MyObserver> observers = new ArrayList<MyObserver>(); //volatile tells serializers not to serialize this field

    public TweetList() {
    }

    private void notifyAllObserver() {
        for (MyObserver observer : observers) {
            observer.myNotify(this);
        }
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
        tweet.addObserver(this);
        notifyAllObserver();
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Boolean contains(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void addObserver(MyObserver observer){
        observers.add(observer);
    }

    public void myNotify(MyObservable observable) {
        notifyAllObserver();
    }
}
