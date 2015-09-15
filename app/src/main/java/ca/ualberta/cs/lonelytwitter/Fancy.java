package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by edcarter on 9/14/15.
 */
public class Fancy extends Mood {

    public Fancy(){
        super();
    }

    public Fancy(Date date){
        super(date);
    }

    @Override
    public String format() {
        return "Jeeves, Fetch My Finest Whisky.";
    }
}
