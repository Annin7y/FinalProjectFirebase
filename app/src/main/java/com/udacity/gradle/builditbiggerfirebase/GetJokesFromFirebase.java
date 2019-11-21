package com.udacity.gradle.builditbiggerfirebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GetJokesFromFirebase
{

    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference usersRef = rootRef.child("jokes");


}
