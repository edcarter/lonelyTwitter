package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by edcarter on 9/14/15.
 */
public class Lonely extends Mood {

    public Lonely(){
        super();
    }

    public Lonely(Date date){
        super(date);
    }

    @Override
    public String format() {
        return "I Really Wish I Had Someone To Share My Chocolate Chip Cookie Dough Ice Cream With...";
    }
}
