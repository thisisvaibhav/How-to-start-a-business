package com.avion.hundrem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.core.Tag;
import com.google.firebase.messaging.FirebaseMessaging;

public class New_Home extends AppCompatActivity {



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_home);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
            NotificationChannel channel = new NotificationChannel("notify","notify", NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel (channel);

            FirebaseMessaging.getInstance().subscribeToTopic("general")
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        private Object Tag;
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            String msg = "Sucess";
                            if (!task.isSuccessful()) {
                                msg = "failed";
                            }
                        }
                    });

        }


        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HacksContainer()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selected = null;


                    switch (item.getItemId()) {
                        case R.id.Category:
                            selected = new Investment();
                            break;

                        case R.id.Hacks:
                            selected = new HacksContainer();
                            break;

                        case R.id.profile:
                            selected = new bottomsheet();
                            break;


                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selected).commit();

                    return true;
                }
            };
}