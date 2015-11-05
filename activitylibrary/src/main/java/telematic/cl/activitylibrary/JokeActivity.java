package telematic.cl.activitylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by crised on 05-11-15.
 */
public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("JokeActivity", "onCreate");

        setContentView(R.layout.joke_main);

        TextView textView = (TextView) findViewById(R.id.joke_text);
        textView.setText(getIntent().getStringExtra(JOKE_KEY));
    }
}
