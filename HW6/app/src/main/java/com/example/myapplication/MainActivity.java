package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie thegreatestshowman = new Movie("thegreatestshowman" , "hughjackman" , "musical" , 8.6 , 13);
        Movie snowden = new Movie("snowden" , "snowden" , "biography" , 8.6 , 16);
    }
}