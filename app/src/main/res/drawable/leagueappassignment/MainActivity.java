package com.example.leagueappassignment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splashTread = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                    Intent i = new Intent(MainActivity.this,SelectionScreen.class);
                    startActivity(i);
                }
            }
        };
        splashTread.start();
    }
}