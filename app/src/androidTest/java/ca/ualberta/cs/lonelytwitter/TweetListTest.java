package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

<<<<<<< HEAD
import java.util.ArrayList;


/**
 * Created by romansky on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 implements MyObserver {
    private boolean wasNotified = false;


    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testDeleteTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));

    }

    public void testAddTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testTweetCount() {

    }

    public void testGetTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        Tweet returnedTweet = tweetList.getTweet(0);
        assertTrue((tweet.date.equals(returnedTweet.date)) &&
                (tweet.getText().equals(returnedTweet.getText())));
    }

    public void testGetTweetType() {

    }


    public void testTweetListChanged() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.addObserver(this);
        wasNotified = false;
        assertFalse(wasNotified);
        tweetList.add(tweet);
        assertTrue(wasNotified);
    }

    public void myNotify() {
        wasNotified = true;
    }
}
=======
import junit.framework.Assert;
import junit.framework.TestCase;


import java.util.List;

/**
 * Created by edcarter on 9/28/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        boolean exceptionThrown = false;
        TweetList list = new TweetList();
        Tweet myTweet = new NormalTweet("test");
        list.addTweet(myTweet);
        try {
            list.addTweet(myTweet);
        } catch (IllegalArgumentException ex){
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    public void testGetTweets() {
        TweetList list = new TweetList();
        Tweet myTweet1 = new NormalTweet("test1");
        Tweet myTweet2 = new NormalTweet("test2");
        Tweet myTweet3 = new NormalTweet("test3");
        list.addTweet(myTweet1);
        list.addTweet(myTweet2);
        list.addTweet(myTweet3);

        List<Tweet> tweets = list.getTweets();
        assertEquals(myTweet1, tweets.get(0));
        assertEquals(myTweet2, tweets.get(1));
        assertEquals(myTweet3, tweets.get(2));
    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testRemoveTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        list.removeTweet(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList list = new TweetList();
        assertTrue(list.getCount() == 0);
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.getCount() == 1);
        list.removeTweet(tweet);
        assertTrue(list.getCount() == 0);
    }
}
>>>>>>> e4c0a49dcbb1371b5bf8598f105b222ade11264a
