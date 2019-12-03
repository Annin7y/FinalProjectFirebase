package com.udacity.gradle.builditbiggerfirebase;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity
{

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

}

