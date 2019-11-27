package com.udacity.gradle.builditbiggerfirebase;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity //implements EndpointsAsyncTaskInterface
{
    //Code moved to BaseMainActivityFragment after implementing an Interstitial Ad
   // public static final String JOKE_STRING = "joke_string";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //       Code commented out after saving the data in the Firebase Console
//        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
//        DatabaseReference jokesRef = rootRef.child("jokes");
//        Map<String, Object> map = new HashMap<>();
//        map.put("jokeId1","Where did Lucy go after the explosion? Everywhere." );
//        map.put("jokeId2", "What´s the stupidest animal in the jungle? The polar bear.");
//        map.put("jokeId3",  "My grandfather had the heart of lion and a lifetime ban from the New your city zoo.");
//        map.put("jokeId4","Two mice chewing on a film roll. One of them says. I think the book was better." );
//        map.put("jokeId5","What kind of bagel can fly? A plain bagel.");
//and os on
//       jokesRef.updateChildren(map);


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

