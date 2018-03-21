package harshada.iss.com.demo.Activity;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import harshada.iss.com.demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Amit on 3/20/2018.
 */
public class SplashActivityTest {
    @Rule
    public ActivityTestRule<SplashActivity> splashActivityActivityTestRule = new ActivityTestRule<SplashActivity>(SplashActivity.class);
    private SplashActivity sActivity = null;
    @Before
    public void setUp() throws Exception {
        sActivity = splashActivityActivityTestRule.getActivity();
    }
    @Test
    public void onCreate() throws Exception {
        View view = sActivity.findViewById(R.id.progressBar2);
//        assertThat(view, is(not(null)));
        onView(withId(R.id.progressBar2));


    }
    @After
    public void tearDown() throws Exception {
        sActivity = null;
    }

}