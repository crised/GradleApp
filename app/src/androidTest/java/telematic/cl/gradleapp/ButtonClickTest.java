package telematic.cl.gradleapp;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by crised on 06-11-15.
 */
public class ButtonClickTest extends ActivityInstrumentationTestCase2<MainActivity>{

    private MainActivity mMainActivity;
    private Button mButton;
    private TextView textView;
    public ButtonClickTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
        MainActivity mainActivity = getActivity();

    }
}
