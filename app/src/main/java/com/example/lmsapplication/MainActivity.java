package com.example.lmsapplication;

<<<<<<< HEAD
<<<<<<< HEAD
import android.os.Bundle;

=======
import android.content.Intent;
=======
>>>>>>> parent of f1c49b7 (Update login and Update)
import android.os.Bundle;

<<<<<<< HEAD
import com.example.lmsapplication.LoginAndRegster.LoginActivity;
import com.example.lmsapplication.databinding.ActivityMainBinding;
>>>>>>> main
=======
>>>>>>> parent of f1c49b7 (Update login and Update)
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

<<<<<<< HEAD
<<<<<<< HEAD
import com.example.lmsapplication.databinding.ActivityMainBinding;
=======

>>>>>>> main
=======
import com.example.lmsapplication.databinding.ActivityMainBinding;
>>>>>>> parent of f1c49b7 (Update login and Update)

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

<<<<<<< HEAD
<<<<<<< HEAD
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,R.id.issued_books,R.id.requested_books,R.id.requested_books,R.id.my_account)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
=======
        BottomNavigationView naviView = findViewById(R.id.nav_view);


        boolean loginStatus = getIntent().getBooleanExtra("loginStatus", false);
        if (loginStatus) {

           /* Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();*/
            // User is logged in, start the HomePageActivity
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());


            // Passing each menu ID as a set of Ids because each
            // menu should be considered as top level destinations.
            AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                    R.id.navigation_home,R.id.issued_books,R.id.requested_books,R.id.requested_books,R.id.staff,R.id.my_account)
                    .build();
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
            NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
            NavigationUI.setupWithNavController(binding.navView, navController);
        } else {
            // User is not logged in, start the LoginActivity
            setContentView(R.layout.activity_main);
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

>>>>>>> main
=======
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,R.id.issued_books,R.id.requested_books,R.id.requested_books,R.id.staff,R.id.my_account)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
>>>>>>> parent of f1c49b7 (Update login and Update)
    }

}