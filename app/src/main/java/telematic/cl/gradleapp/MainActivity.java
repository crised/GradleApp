package telematic.cl.gradleapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonListener(View view) {
        Pair<Context, String> pair = new Pair<>(this.getApplicationContext(), "jokepair");
        new EndPointAsyncTask().execute(pair);
        finish();
    }
}
