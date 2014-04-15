import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.espresso.androidtestapp.testapp.MainActivity;
import com.espresso.androidtestapp.testapp.ActionBarTestActivity;
import com.espresso.androidtestapp.testapp.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.openContextualActionModeOverflowMenu;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Marta on 18.01.14.
 */
public class test2 extends ActivityInstrumentationTestCase2<ActionBarTestActivity> {
    private ActionBarTestActivity mMainActivity;
    private TextView mHelloWorldTextView;

    @SuppressWarnings( "deprecation" )
    public test2() {
        super("com.espresso.androidtestapp.testapp", ActionBarTestActivity.class);
    }



    public void testStart() throws Exception{




    }

    public void testClickActionBarItem() throws Exception {
        super.setUp();
        // We make sure the contextual action bar is hidden.
        onView(withId(R.id.hide_contextual_action_bar))
                .perform(click());
        try{
        Thread.sleep(500);
        }catch(Exception e){

        }
        // Click on the icon - we can find it by the r.Id.
        onView(withId(R.id.action_save)).perform(click());
        try{
            Thread.sleep(500);
        }catch(Exception e){

        }
        // Verify that we have really clicked on the icon by checking the TextView content.

    }

    public void testFalseLabel() {
    onView(withId(R.id.text_action_bar_result))
                .check(matches(withText("Save")));
   }
}