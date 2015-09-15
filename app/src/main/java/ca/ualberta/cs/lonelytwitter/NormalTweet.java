package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by edcarter on 9/14/15.
 */
public class NormalTweet extends Tweet {

    public NormalTweet(String tweet) {
        super(tweet);
    }

    @Override
    public Boolean isImporant() {
        return false;
    }

    public NormalTweet(String tweet, Date date) {
        super(tweet, date);
    }
}
