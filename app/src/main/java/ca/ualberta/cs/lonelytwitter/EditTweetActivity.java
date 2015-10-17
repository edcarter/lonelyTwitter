package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class EditTweetActivity extends Activity {

    private Tweet editTweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Integer tweetViewId = intent.getIntExtra(LonelyTwitterActivity.EDIT_TWEET_VIEW_ID, 0);
        Integer tweetLocaion = intent.getIntExtra(LonelyTwitterActivity.EDIT_TWEET_POSITION, 0);
        ListView tweetView = (ListView)findViewById(tweetViewId);
        editTweet = (Tweet) tweetView.getItemAtPosition(tweetLocaion);
        setContentView(R.layout.activity_edit_tweet);

    }

    public Tweet getEditTweet(){
        return editTweet;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_tweet, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
