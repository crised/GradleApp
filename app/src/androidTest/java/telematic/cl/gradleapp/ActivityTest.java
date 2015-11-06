package telematic.cl.gradleapp;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;

import telematic.cl.activitylibrary.JokeActivity;


/**
 * Created by crised on 06-11-15.
 */
public class ActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mMainActivity;
    private Button mButton;

    public ActivityTest() {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
        mMainActivity = getActivity();
        mButton = (Button) mMainActivity.findViewById(R.id.button);
        TouchUtils.clickView(this, mButton);

    }

    @MediumTest
    public void testActivityMonitor() {

        // Set up an ActivityMonitor
        Instrumentation.ActivityMonitor receiverActivityMonitor =
                getInstrumentation().addMonitor(JokeActivity.class.getName(),
                        null, false);

        JokeActivity receiverActivity = (JokeActivity)
                receiverActivityMonitor.waitForActivityWithTimeout(3000);


        assertNotNull("ReceiverActivity is null", receiverActivity);
        assertEquals("Monitor for ReceiverActivity has not been called",
                1, receiverActivityMonitor.getHits());
        assertEquals("Activity is of wrong type",
                JokeActivity.class, receiverActivity.getClass());

// Remove the ActivityMonitor
        getInstrumentation().removeMonitor(receiverActivityMonitor);


    }
}
