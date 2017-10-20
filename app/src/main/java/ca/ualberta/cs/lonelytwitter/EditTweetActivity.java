package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        String tweet = getIntent().getStringExtra("tweet");

        TextView setTextName = (TextView) findViewById(R.id.textView);
        setTextName.setText(tweet);

    }
}
