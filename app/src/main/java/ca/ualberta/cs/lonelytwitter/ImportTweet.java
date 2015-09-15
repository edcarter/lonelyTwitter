package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by edcarter on 9/14/15.
 */
public class ImportTweet extends Tweet {
    public ImportTweet(String tweet, Date date) {
        super(tweet, date);
    }

    public ImportTweet(String tweet) {
        super(tweet);
    }

    @Override
    public Boolean isImporant() {
        return true;
    }
}
