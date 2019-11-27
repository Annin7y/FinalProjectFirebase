package com.udacity.gradle.builditbiggerfirebase;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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
        usersRef.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                listener.returnJokeData(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                listener.returnJokeData(databaseError.getMessage());
                Log.e(TAG, "Failed to read value.", databaseError.toException());
            }
        });

    }

}
