package telematic.cl.gradleapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonListener(View view) {


        Pair<Context, String> pair = new Pair<>(getApplicationContext(), "jokepair");

        new EndPointAsyncTask().execute(pair);

     /*   Intent intent = new Intent(this, JokeActivity.class);
        Log.d("MainActivity", "buttonListener");

        intent.putExtra(JokeActivity.JOKE_KEY, Jokes.getJoke());

        startActivity(intent);*/


    }
}
