package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by edcarter on 9/14/15.
 */
public abstract class Tweet {

    private String text;
    private Date date;
    private ArrayList<Mood> moods;

    public Tweet(String tweet, Date date, Collection<Mood> moods){
        this(tweet, date);
        this.moods.addAll(moods);
    }

    public Tweet(String tweet, Date date) {
        text = tweet;
        this.date = date;
    }

    public Tweet(String tweet){
        this(tweet, new Date());

    }

    public void addMood(Mood mood){
        moods.add(mood);
    }

    public Iterator<Mood> getMoods(){
        return moods.iterator();
    }

    public void setText(String text) {
        if (text.length() <= 140){
            this.text = text;
        } else {
            throw new IllegalArgumentException("Tweet was too long!");
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {

        return text;
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImporant();

    @Override
    public String toString() {
        return date.toString() + " | " + text;
    }

}
