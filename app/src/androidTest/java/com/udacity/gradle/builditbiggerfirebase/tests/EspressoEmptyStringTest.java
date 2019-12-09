package com.udacity.gradle.builditbiggerfirebase.tests;


import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbiggerfirebase.JokesActivity;
import com.udacity.gradle.builditbiggerfirebase.MainActivity;
import com.udacity.gradle.builditbiggerfirebase.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.core.IsNot.not;


@RunWith(AndroidJUnit4.class)
public class EspressoEmptyStringTest

    //https://stackoverflow.com/questions/46598149/test-a-textview-value-is-not-empty-using-espresso-and-fail-if-a-textview-value-i
{
//
//    @Rule
//    public ActivityTestRule<JokesActivity> mActivityTestRule =
//            new ActivityTestRule<>(JokesActivity.class);
//
//    @Test
//    public void checkTextView_isDisplayed_and_notEmpty() throws Exception {
//        // perform a click on the button
//        onView(withId(R.id.joke_button)).perform(click());
//
//        // passes if the textView does not match the empty string
//        onView(withId(R.id.joke_android)).check(matches(not(withText(""))));
//    }

//    //https://stackoverflow.com/questions/32906881/checking-if-a-button-is-clickable-in-espresso-test-android-studio
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityTestRule =
//            new ActivityTestRule<>(MainActivity.class);
//
//
//    @Test
//    public void buttonIsEnabled()
//    {
//        onView(withId(R.id.joke_button)).check(matches(isClickable()));
//    }

}