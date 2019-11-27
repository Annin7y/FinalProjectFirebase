package com.udacity.gradle.builditbiggerfirebase.free;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.udacity.gradle.builditbiggerfirebase.BaseMainActivityFragment;
import com.udacity.gradle.builditbiggerfirebase.JokesActivity;
import com.udacity.gradle.builditbiggerfirebase.R;


public class MainActivityFragment extends BaseMainActivityFragment
{
    //Main Activity Fragment copied from main directory
    public MainActivityFragment()
    {
    }

    TextView helloStringFree;

    private InterstitialAd interstitialAd;

    private Button jokeButton;

    private String jokeVar;

    private ProgressBar indicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        helloStringFree = (TextView) root.findViewById(R.id.hello_free_text_view);

        jokeButton = (Button) root.findViewById(R.id.joke_button);

        // Initialize the loading indicator
        indicator = (ProgressBar) root.findViewById(R.id.my_loading_indicator);

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        MobileAds.initialize(getActivity(), "ca-app-pub-4761500786576152~8215465788");
        interstitialAd = new InterstitialAd(getActivity().getApplicationContext());
        String interstitialAdId = getActivity().getApplicationContext().getString(R.string.interstitial_ad_id);
        interstitialAd.setAdUnitId(interstitialAdId);

        interstitialAd.loadAd(adRequest);

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed()
            {
                super.onAdClosed();
                Intent intent = new Intent(getActivity(), JokesActivity.class);
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(JokesActivity.JOKE_STRING, jokeVar);
                startActivity(intent);
            }
        });

        jokeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                tellJoke();

            }
        });

        return root;
    }

    @Override
    public void tellJoke()
    {
        // JokesFetch myJokesFetch = new JokesFetch();

        // default code below replaced with the code referencing JokesLibrary
        // Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
        // Message commented out after adding JokesActivity class
        // Toast.makeText(this, myJokesFetch.getRandomJoke(), Toast.LENGTH_SHORT).show();

        // Code structure below is based on the answer given on this site:
        // https://www.c-sharpcorner.com/article/how-to-send-the-data-one-activity-to-another-activity-in-android-application/
        // Code commented out after implementing GCE
//        Intent intent = new Intent(this, JokesActivity.class);
//        intent.setAction(Intent.ACTION_SEND);
//        intent.putExtra(JOKE_STRING, myJokesFetch.getRandomJoke());
//        startActivity(intent);

        // Show the loading indicator before running the AsyncTask
         indicator.setVisibility(ProgressBar.VISIBLE);

//        EndpointsAsyncTask myTask = new EndpointsAsyncTask(this);
//        myTask.execute();
    }

//    @Override
//    public void returnJokeData(String result)
//    {
//        jokeVar = result;
//        if (interstitialAd.isLoaded())
//        {
//            interstitialAd.show();
//        }

       //Debugging to see how the Loading Indicator is displayed
       // SystemClock.sleep(2000);

        // Hide it after it finishes
      // indicator.setVisibility(ProgressBar.INVISIBLE);

    }

