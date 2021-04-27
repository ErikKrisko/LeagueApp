package com.example.leagueapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RequestGuide2 extends AppCompatActivity {

    private SharedPreferences champ_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_guide2);
        imageView = findViewById(R.id.cameraImage);
    }

    public void goSave(View v){
        champ_name = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        EditText myName =  findViewById(R.id.requestChampText);
        String txt = myName.getText().toString();
        SharedPreferences.Editor editor = champ_name.edit();
        editor.putString("key_name", txt);
        editor.commit();

        Toast.makeText(getBaseContext(), "Data Saved!!",
                Toast.LENGTH_SHORT).show();


    }

    public void goShow(View v){
        champ_name = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        String name = champ_name.getString("key_name", null);
        Toast.makeText(getBaseContext(), name,
                Toast.LENGTH_SHORT).show();

    }

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_request, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.test1) {
            Intent i = new Intent(RequestGuide2.this, SelectionScreen.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            return true;
        }
        else if (id == R.id.test2) {
            Intent i = new Intent(RequestGuide2.this, Calendar.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imageView;

    public void goTakePhoto(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        } catch (ActivityNotFoundException e) {
            // display error state to the user
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap);
        }
    }
}
