package in.championswimmer.android_tests_example;

import android.app.Application;
import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by championswimmer on 20/3/16.
 */

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    private Application app;
    public final InstrumentationTestCase instRunner = new InstrumentationTestCase();

    @Before
    public void setUp() throws Exception {

        instRunner.injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        app = Instrumentation.newApplication(Application.class, instRunner.getInstrumentation().getTargetContext());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void appTest() throws Exception {
        // Dummy
        Assert.assertEquals(1,1);

    }

}
