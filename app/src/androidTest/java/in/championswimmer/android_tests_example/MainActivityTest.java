package in.championswimmer.android_tests_example;

import android.app.Application;
import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by championswimmer on 20/3/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private MainActivity mainActivity;

    @Rule
    public final ActivityTestRule<MainActivity> act = new ActivityTestRule<MainActivity>(MainActivity.class);


    @Before
    public void setUp() throws Exception {
        mainActivity = act.getActivity();

    }

    @After
    public void tearDown() throws Exception {
        mainActivity.finish();

    }

    @Test
    public void testOnCreate() throws Exception {

        Assert.assertEquals("Fare", ((TextView) mainActivity.findViewById(R.id.textView)).getText().toString());

    }


}
