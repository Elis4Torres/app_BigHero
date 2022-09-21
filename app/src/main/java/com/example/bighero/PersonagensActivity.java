package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonagensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);
    }

    public void Back(View view){
        Intent voltar = new Intent(this, HomeActivity.class);
        startActivity(voltar);
    }
    public void Home (View view){
        Intent home = new Intent(this, HomeActivity.class);
        startActivity(home);
    }

    public void Trailer (View view){
        Intent trailer = new Intent(this, TrailerActivity.class);
        startActivity(trailer);
    }

    public void Personagem(View view){
        Intent personagens = new Intent(this, PersonagensActivity.class);
        startActivity(personagens);
    }

    public void Tomago(View view){
        Intent tomago = new Intent(this, TomagoActivity.class);
        startActivity(tomago);
    }

    public void Wasabi(View view){
        Intent wasabi = new Intent(this, WasabiActivity.class);
        startActivity(wasabi);
    }

    public void Hiro(View view){
        Intent hiro = new Intent(this, HiroActivity.class);
        startActivity(hiro);
    }

    public void Baymax(View view){
        Intent baymax = new Intent(this, BaymaxActivity.class);
        startActivity(baymax);
    }

    public void Fred(View view){
        Intent fred = new Intent(this, FredActivity.class);
        startActivity(fred);
    }

    public void Honey(View view){
        Intent honey = new Intent(this, HoneyActivity.class);
        startActivity(honey);
    }
}