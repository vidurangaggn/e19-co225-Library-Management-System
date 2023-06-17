package com.example.lmsapplication;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseManager {

    private static FirebaseManager instance;
    private FirebaseAuth auth;
    private FirebaseDatabase database;

    private FirebaseManager() {
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

    }

    public void logoutUser() {
        auth.signOut();
    }

    public FirebaseUser getCurrentUser() {
        return auth.getCurrentUser();
    }

    public static synchronized FirebaseManager getInstance() {
        if (instance == null) {
            instance = new FirebaseManager();
        }
        return instance;
    }
    public FirebaseAuth getAuth() {
        return auth;
    }
    public DatabaseReference getDataRef(String path) {
        return database.getReference(path);
    }

}
