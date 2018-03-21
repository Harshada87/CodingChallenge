package harshada.iss.com.demo.UI;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import harshada.iss.com.demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Amit on 3/20/2018.
 */
public class MapsActivityTest {
    @Rule
    public ActivityTestRule<MapsActivity> mActivityTestRule = new ActivityTestRule<MapsActivity>(MapsActivity.class);
    private MapsActivity mActivity = null;
    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }



    @Test
    public void onCreate() throws Exception {
        View view = mActivity.findViewById(R.id.txinfo);
        View mapView = mActivity.findViewById(R.id.map);
        //assertThat(view, is(not(null)));
        onView(withId(R.id.txinfo)).check(matches(withText("Current ISS Pass Detail")));
        onView(withId(R.id.map));
    }
    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}