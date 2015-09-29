package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

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