package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fred);
    }

    //Declarando funções dos botões

    public void Back(View view){
        Intent voltar = new Intent(this, PersonagensActivity.class);
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

    public void Perfil(View view){
        Intent perfil = new Intent(this, PerfilActivity.class);
        startActivity(perfil);
    }

    //Declarando intent implicita - Abrir link de site web

    public void Fantasia (View view) {
        Uri uri = Uri.parse("https://www.abrakadabra.com.br/");
        Intent fantasias = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.abrakadabra.com.br/"));
        startActivity(fantasias);
    }
}