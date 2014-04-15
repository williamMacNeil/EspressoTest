
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.espresso.androidtestapp.testapp.MainActivity;
import com.espresso.androidtestapp.testapp.R;


import static android.test.ViewAsserts.assertOnScreen;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;


/**
 * Created by Marta on 18.01.14.
 */
public class test extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mMainActivity;
    private TextView mHelloWorldTextView;

    @SuppressWarnings( "deprecation" )
    public test() {
        super("com.espresso.androidtestapp.testapp", MainActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();

        mMainActivity = getActivity();
        mHelloWorldTextView = (TextView) mMainActivity.findViewById(R.id.textView);
    }

    public void testTextView() {
        assertOnScreen(mMainActivity.getWindow().getDecorView(), mHelloWorldTextView);
    }

    public void testLabel() {
        onView(withId(R.id.textView)).check(matches(withText("Hello world!!")));
    }

   // public void testFalseLabel() {
   //    onView(withId(R.id.hello_world_text)).check(matches(withText("What a label!")));
   // }
}