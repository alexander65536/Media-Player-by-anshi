package com.example.anandshivalkar.mediaplayerbyanshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afterEnter(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }
}
