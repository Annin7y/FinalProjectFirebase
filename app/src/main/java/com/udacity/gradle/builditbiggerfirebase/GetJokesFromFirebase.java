package com.udacity.gradle.builditbiggerfirebase;

import android.os.StrictMode;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static android.content.ContentValues.TAG;

public class GetJokesFromFirebase
{

    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference usersRef = rootRef.child("jokes");
    private final FirebaseAsyncTaskInterface listener;

    public GetJokesFromFirebase(FirebaseAsyncTaskInterface listener) {
        this.listener = listener;
    }


    public void getJoke()
    {
        if (!isInternetAvailable())
        {
            listener.returnJokeData(null);
        }
        usersRef.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
               //String value = dataSnapshot.getValue(String.class);
                // Read the jokes from Firebase
               // HashMap<String, String> map = (HashMap) dataSnapshot.getValue();

// Used to get a random joke from the HashMap
              //  Random random = new Random();

              //  List<String> keys;

             //   if (map != null)
             //   {

                    // Extract the HashMap keys in a List
                   // keys = new ArrayList<>(map.keySet());

                    // Get a random key from the List
                   // String randomKey = keys.get(random.nextInt(keys.size()));

                    // Finally, we get a joke from the HashMap based on the random key
                  //  String value = map.get(randomKey);


                  //  listener.returnJokeData(value);
               // }
                convertHashMap(dataSnapshot);


            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                listener.returnJokeData(databaseError.getMessage());
                Log.e(TAG, "Failed to read value.", databaseError.toException());
            }
        });

    }

  public void  convertHashMap(DataSnapshot dataSnapshot)
  {
      HashMap<String, String> map = (HashMap) dataSnapshot.getValue();

// Used to get a random joke from the HashMap
      Random random = new Random();

      List<String> keys;

      if (map != null)
      {

          // Extract the HashMap keys in a List
          keys = new ArrayList<>(map.keySet());

          // Get a random key from the List
          String randomKey = keys.get(random.nextInt(keys.size()));

          // Finally, we get a joke from the HashMap based on the random key
          String value = map.get(randomKey);


          listener.returnJokeData(value);

      }
  }

    public boolean isInternetAvailable()
    {
        try {
            int SDK_INT = android.os.Build.VERSION.SDK_INT;
            if (SDK_INT > 8)
            {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build(); ;
                StrictMode.setThreadPolicy(policy);
            }
            InetAddress address = InetAddress.getByName("www.google.com");
            return !address.equals("");
        } catch (UnknownHostException e)
        {
            // Log error
        }
        return false;
    }

}
