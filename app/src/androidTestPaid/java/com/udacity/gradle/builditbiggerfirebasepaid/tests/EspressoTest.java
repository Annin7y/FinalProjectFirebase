package java.com.udacity.gradle.builditbiggerfirebasepaid.tests;

import androidx.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbiggerfirebase.MainActivity;
import com.udacity.gradle.builditbiggerfirebase.R;

@RunWith(AndroidJUnit4.class)
public class EspressoTest
{

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkTextView_isDisplayed_and_notEmpty() throws Exception {
        // perform a click on the button
        onView(withId(R.id.joke_button)).perform(click());

        // passes if the textView does not match the empty string
        onView(withId(R.id.joke_android)).check(matches(not(withText(""))));
    }

    //https://stackoverflow.com/questions/32906881/checking-if-a-button-is-clickable-in-espresso-test-android-studio
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void buttonIsEnabled()
    {
        onView(withId(R.id.joke_button)).check(matches(isClickable()));
    }

}
