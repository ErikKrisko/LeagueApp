package com.example.leagueapp;

import android.app.ListActivity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class SelectionScreen extends ListActivity {

    private static final String[] myChoice={
            "TwistedFate",
            "Ryze",
            "Kayle",
            "Yone",
            "RequestGuide2"
    };

    private static final String[] myLabels={
            "Twisted Fate",
            "Ryze",
            "Kayle",
            "Yone",
            "Request"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);

        setListAdapter(new MyOwnAdapter());
    }

    class MyOwnAdapter extends ArrayAdapter<String> {
        MyOwnAdapter() {
            super(SelectionScreen.this, R.layout.my_row, R.id.label, myLabels);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View row=super.getView(position, convertView, parent);
            ImageView icon=(ImageView)row.findViewById(R.id.icon);


            if (myChoice[position]== "TwistedFate")
                icon.setImageResource(R.drawable.twistedfatesquare);
            if (myChoice[position]== "Ryze")
                icon.setImageResource(R.drawable.ryzesquare);
            if (myChoice[position]== "Kayle")
                icon.setImageResource(R.drawable.kaylesquare);
            if (myChoice[position]== "Yone")
                icon.setImageResource(R.drawable.yonesquare);
            if (myChoice[position]== "RequestGuide2")
                icon.setImageResource(R.drawable.ic_baseline_question_answer_24);
            return(row);
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        try {
            Class myClass = Class.forName("com.example.leagueapp." + myChoice[position]);
            Intent i = new Intent(SelectionScreen.this, myClass);
            startActivity(i);
        }
        catch
        (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }


}
