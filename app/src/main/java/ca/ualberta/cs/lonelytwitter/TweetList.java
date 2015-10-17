package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
<<<<<<< HEAD

/**
 * Created by romansky on 9/30/15.
 */
public class TweetList implements MyObservable {
    private ArrayList<MyObserver> myObservers = new ArrayList<MyObserver>();
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {

        tweets.add(tweet);
        notifyObservers();
=======
import java.util.List;

/**
 * Created by edcarter on 9/28/15.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        if (!tweets.contains(tweet)){
            tweets.add(tweet);
        } else {
            throw new IllegalArgumentException("Cannot Add The Same Tweet Multiple Times");
        }
    }

    public boolean contains(Tweet tweet) {
        return tweets.contains(tweet);
>>>>>>> e4c0a49dcbb1371b5bf8598f105b222ade11264a
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

<<<<<<< HEAD
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public void addObserver(MyObserver observer) {
        myObservers.add(observer);
    }

    public void notifyObservers() {
        for (MyObserver observer : myObservers) {
            observer.myNotify();
        }
=======
    public List<Tweet> getTweets() {
        return tweets;
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void removeTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public int getCount() {
        return tweets.size();
>>>>>>> e4c0a49dcbb1371b5bf8598f105b222ade11264a
    }
}
