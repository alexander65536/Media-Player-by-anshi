package com.example.anandshivalkar.mediaplayerbyanshi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

    }

    public void play_scom(View view){
        a="scom";
        play_song();
    }


    public void play_bj(View view) {
        a="bj";
        play_song();
    }

    public void play_sth(View view) {
        a="sth";
        play_song();
    }

    public void play_bib(View view) {
        a="bib";
        play_song();
    }

    public void play_hj(View view) {
        a="hj";
        play_song();
    }

    public void play_br(View view) {
        a="br";
        play_song();
    }

    public void play_song(){
        Intent intent = new Intent(this, Playback_page.class);
        intent.putExtra("s",a);
        startActivity(intent);
    }
}
