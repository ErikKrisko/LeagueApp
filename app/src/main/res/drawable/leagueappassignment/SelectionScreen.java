package com.example.leagueappassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SelectionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_screen);

        Button twistedFate = findViewById(R.id.twistedfate);

        twistedFate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SelectionScreen.this,TwistedFate.class);
                startActivity(i);
            }
        });

        Button kayle = findViewById(R.id.kayle);

        kayle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SelectionScreen.this,TwistedFate.class);
                startActivity(i);
            }
        });

        Button ryze = findViewById(R.id.ryze);

        ryze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SelectionScreen.this,TwistedFate.class);
                startActivity(i);
            }
        });

        Button yone = findViewById(R.id.yone);

        yone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SelectionScreen.this,TwistedFate.class);
                startActivity(i);
            }
        });



    }
}