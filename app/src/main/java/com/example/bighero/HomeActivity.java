package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Home (View view){
        Intent home = new Intent(this, HomeActivity.class);
        startActivity(home);
    }

    public void Mais (View view){
        Intent mais = new Intent(this, MaisActivity.class);
        startActivity(mais);
    }

    public void Trailer (View view){
        Intent trailer = new Intent(this, TrailerActivity.class);
        startActivity(trailer);
    }
    public void Personagem (View view){
        Intent personagens = new Intent(this, PersonagensActivity.class);
        startActivity(personagens);
    }



}