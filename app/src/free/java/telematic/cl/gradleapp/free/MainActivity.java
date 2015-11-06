package telematic.cl.gradleapp.free;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import telematic.cl.gradleapp.EndPointAsyncTask;
import telematic.cl.gradleapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Log.d("MainFreeActivity", "Free Version");

    }

    public void buttonListener(View view) {
        Pair<Context, String> pair = new Pair<>(this.getApplicationContext(), "jokepair");
        new EndPointAsyncTask().execute(pair);
        finish();
    }
}
