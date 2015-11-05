package telematic.cl.gradleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import cl.telematic.Jokes;
import telematic.cl.activitylibrary.JokeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonListener(View view) {

        Intent intent = new Intent(this, JokeActivity.class);
        Log.d("MainActivity", "buttonListener");

        intent.putExtra(JokeActivity.JOKE_KEY, Jokes.getJoke());

        startActivity(intent);


    }
}
