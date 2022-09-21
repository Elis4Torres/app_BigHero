package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;

public class TrailerActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);

    }

    //Declarando funções dos botões

    public void Back(View view) {
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

    public void Personagem (View view){
        Intent personagens = new Intent(this, PersonagensActivity.class);
        startActivity(personagens);
    }

    //Declarando intent implicita - Abrir site web

    public void Video (View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=Zx3xEc6-mU4");
        Intent video = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Zx3xEc6-mU4"));
        startActivity(video);
    }

    //Declarando intent implicita - Abrir site web

    public void Ler (View view) {
        Uri uri = Uri.parse("https://www.rottentomatoes.com/m/big_hero_6");
        Intent ler = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rottentomatoes.com/m/big_hero_6"));
        startActivity(ler);
    }
}