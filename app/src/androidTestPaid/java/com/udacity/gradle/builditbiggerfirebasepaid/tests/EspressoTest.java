package com.udacity.gradle.builditbiggerfirebasepaid.tests;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.idling.CountingIdlingResource;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbiggerfirebase.FirebaseAsyncTaskInterface;
import com.udacity.gradle.builditbiggerfirebase.GetJokesFromFirebase;
import com.udacity.gradle.builditbiggerfirebase.MainActivity;
import com.udacity.gradle.builditbiggerfirebase.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EspressoTest
{
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    private IdlingResource idlingResource;

    @Test
    public void buttonIsEnabled()
    {
        onView(withId
                (R.id.joke_button)).check(matches(isClickable()));
    }

        @Test
    public void testFirebase() throws Throwable
    {
        // create  a signal to let us know when our task is done.
        final CountDownLatch signal = new CountDownLatch(1);

       // final FirebaseAsyncTaskInterface jokesFromFirebase = new FirebaseAsyncTaskInterface()
       GetJokesFromFirebase jokesFromFirebase= new GetJokesFromFirebase(new FirebaseAsyncTaskInterface()
        {
            @Override
            public void returnJokeData(String result)
            {
                assertNotNull(result);
                signal.countDown();
            }
        });

        jokesFromFirebase.getJoke();

        signal.await(30,TimeUnit.SECONDS);
        }


    @Before
    public void registerIdlingResource()
    {
        idlingResource = mActivityTestRule.getActivity().getIdlingResource();
        IdlingRegistry.getInstance().register(idlingResource);
    }

    @After
    public void unregisterIdlingResource()
    {
        if (idlingResource != null) {
            IdlingRegistry.getInstance().unregister(idlingResource);
        }
    }
}