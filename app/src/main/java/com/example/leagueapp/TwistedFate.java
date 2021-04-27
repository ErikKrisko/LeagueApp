package com.example.leagueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.ViewFlipper;

import java.nio.channels.SelectionKey;

public class TwistedFate extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twisted_fate);
        setTitle("Twisted Fate");

        viewFlipper = findViewById(R.id.view_flipper);

        //TF Passive VIDEO
        VideoView videoView1 = findViewById(R.id.TFPassiveVideo);
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.tfpassive;
        Uri uri = Uri.parse(videoPath1);
        videoView1.setVideoURI(uri);
        MediaController mediaController1 = new MediaController(this);
        videoView1.setMediaController(mediaController1);
        mediaController1.setAnchorView(videoView1);

        //TF Q VIDEO
        VideoView videoView2 = findViewById(R.id.TFQVideo);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.tfq;
        Uri uri2 = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri2);
        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);

        //TF W VIDEO
        VideoView videoView3 = findViewById(R.id.TFWVideo);
        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.tfw;
        Uri uri3 = Uri.parse(videoPath3);
        videoView3.setVideoURI(uri3);
        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoView3);

        //TF E VIDEO
        VideoView videoView4 = findViewById(R.id.TFEVideo);
        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.tfe;
        Uri uri4 = Uri.parse(videoPath4);
        videoView4.setVideoURI(uri4);
        MediaController mediaController4 = new MediaController(this);
        videoView4.setMediaController(mediaController4);
        mediaController4.setAnchorView(videoView4);

        //TF R VIDEO
        VideoView videoView5 = findViewById(R.id.TFRVideo);
        String videoPath5 = "android.resource://" + getPackageName() + "/" + R.raw.tfr;
        Uri uri5 = Uri.parse(videoPath5);
        videoView5.setVideoURI(uri5);
        MediaController mediaController5 = new MediaController(this);
        videoView5.setMediaController(mediaController5);
        mediaController5.setAnchorView(videoView5);

        //Show / Hide Buttons
        Button showabilties = findViewById(R.id.ShowAbilities);
        showabilties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout abilties = (LinearLayout) findViewById(R.id.Abilities);
                if(abilties.getVisibility() == View.VISIBLE)
                {
                    abilties.setVisibility(View.GONE);
                }
                else
                {
                    abilties.setVisibility(View.VISIBLE);
                }
            }
        });

        Button showitems = findViewById(R.id.ShowItems);
        showitems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout items = (LinearLayout) findViewById(R.id.Items);
                if(items.getVisibility() == View.VISIBLE)
                {
                    items.setVisibility(View.GONE);
                }
                else
                {
                    items.setVisibility(View.VISIBLE);
                }
            }
        });

        Button showsummoners = findViewById(R.id.showsummoners);
        showsummoners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout summoners = (LinearLayout) findViewById(R.id.SummonerSpells);
                if(summoners.getVisibility() == View.VISIBLE)
                {
                    summoners.setVisibility(View.GONE);
                }
                else
                {
                    summoners.setVisibility(View.VISIBLE);
                }
            }
        });

        Button showrunes = findViewById(R.id.showrunes);
        showrunes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout runes = (LinearLayout) findViewById(R.id.Runes);
                if(runes.getVisibility() == View.VISIBLE)
                {
                    runes.setVisibility(View.GONE);
                }
                else
                {
                    runes.setVisibility(View.VISIBLE);
                }
            }
        });

        Button showskins = findViewById(R.id.showskins);
        showskins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout skins = (LinearLayout) findViewById(R.id.Skins);
                if(skins.getVisibility() == View.VISIBLE)
                {
                    skins.setVisibility(View.GONE);
                }
                else
                {
                    skins.setVisibility(View.VISIBLE);
                }
            }
        });



    }
    /**Image Buttons for Items*/
    private void goToUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent WebView = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(WebView);
    }

    //Starting
    public void dRingButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/dorans-ring-25");
    }
    public void bootsButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/boots-1");
    }
    public void cpotButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/corrupting-potion-307");
    }

    //Boots
    public void tabiButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/plated-steelcaps-422");
    }
    public void mercButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/mercurys-treads-82");
    }
    public void lucButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/ionian-boots-of-lucidity-113");
    }
    public void swiftButton(View view){
        goToUrl("mobafire.com/league-of-legends/item/boots-of-swiftness-38");
    }
    public void sorcButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/sorcerers-shoes-40");
    }

    //Mythic Items
    public void rocketbeltButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/hextech-rocketbelt-325");
    }
    public void ludensButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/ludens-tempest-283");
    }

    //Core Items
    public void lbaneButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/lich-bane-74");
    }
    public void hglassButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/zhonyas-hourglass-114");
    }

    //Other Items
    public void dcapButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/rabadons-deathcap-115");
    }
    public void vstaffButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/void-staff-98");
    }
    public void mejaiButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/mejais-soulstealer-50");
    }
    public void morelloButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/morellonomicon-156");
    }
    public void veilButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/banshees-veil-76");
    }
    public void qssButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/quicksilver-sash-94");
    }
    public void rfcButton(View view){
        goToUrl("https://www.mobafire.com/league-of-legends/item/rapid-firecannon-294");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tf, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.test1) {
            Intent i = new Intent(TwistedFate.this, SelectionScreen.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private ViewFlipper viewFlipper;


    public void goPrevious(View view)
    {
        viewFlipper.setInAnimation(this,R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,R.anim.slide_out_right);
        viewFlipper.showPrevious();
    }

    public void goNext(View view)
    {
        viewFlipper.setInAnimation(this,R.anim.slide_in_right);
        viewFlipper.setOutAnimation(this,R.anim.slide_out_left);
        viewFlipper.showNext();
    }


}