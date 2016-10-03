package com.example.anandshivalkar.mediaplayerbyanshi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Playback_page extends AppCompatActivity {

    String song_name;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playback_page);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            song_name = extras.getString("s");
            //The key argument here must match that used in the other activity
        }
    }


    public void playsound (View view){
        if(mp == null){
            if(song_name.equalsIgnoreCase("scom")){
                mp = MediaPlayer.create(this,R.raw.scom);
                mp.start();
            }
            else if (song_name.equalsIgnoreCase("bj")){
                mp = MediaPlayer.create(this,R.raw.bj);
                mp.start();            }
            else if (song_name.equalsIgnoreCase("sth")){
                mp = MediaPlayer.create(this,R.raw.sth);
                mp.start();
            }
            else if (song_name.equalsIgnoreCase("bib")){
                mp = MediaPlayer.create(this,R.raw.bib);
                mp.start();
            }
            else if (song_name.equalsIgnoreCase("hj")){
                mp = MediaPlayer.create(this,R.raw.hj);
                mp.start();
            }
            else if (song_name.equalsIgnoreCase("br")){
                mp = MediaPlayer.create(this,R.raw.br);
                mp.start();
            }
        }



    }

    public void stopsound (View view){
        mp.stop();
        mp=null;
    }

    int flag = 0;
    public void pausesound (View view){
        if (flag == 0){
            mp.pause();
            flag =1;
        }
        else {
            mp.start();
            flag = 0;
        }

    }


}
