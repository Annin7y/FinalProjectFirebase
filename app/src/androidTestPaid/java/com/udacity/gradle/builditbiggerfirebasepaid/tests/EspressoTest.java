package com.udacity.gradle.builditbiggerfirebasepaid.tests;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbiggerfirebase.MainActivity;
import com.udacity.gradle.builditbiggerfirebase.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class EspressoTest
{

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);



    @Test
    public void buttonIsEnabled()
    {
        onView(withId(R.id.joke_button)).check(matches(isClickable()));
    }

}
