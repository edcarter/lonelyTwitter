package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by edcarter on 9/14/15.
 */
public abstract class Mood {

    private Date date;

    public Mood(){
        //Get the current date
        this(new Date());
    }

    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String format();
}
