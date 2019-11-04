package com.udacity.gradle.builditbiggerfirebase;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity //implements EndpointsAsyncTaskInterface
{
    //Code moved to BaseMainActivityFragment after implementing an Interstitial Ad
   // public static final String JOKE_STRING = "joke_string";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    public void tellJoke(View view)
//    {
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

       // EndpointsAsyncTask myTask = new EndpointsAsyncTask(this);
       // myTask.execute();
   // }

//    @Override
//    public void returnJokeData(String result)
//    {
//        Intent intent = new Intent(this, JokesActivity.class);
//        intent.setAction(Intent.ACTION_SEND);
//        intent.putExtra(JokesActivity.JOKE_STRING, result);
//        startActivity(intent);
//    }
}

