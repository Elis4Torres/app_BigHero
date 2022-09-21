package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honey);
    }

    //Declarando funções dos botões

    public void Back(View view) {
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

    public void Personagem(View view){
        Intent personagens = new Intent(this, PersonagensActivity.class);
        startActivity(personagens);
    }

    //Declarando intent implicita - Pesquisa na web

    public void Sobre (View view){
        Intent sobre = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "operação big hero Honey Lemon";
        sobre.putExtra(SearchManager.QUERY, query);
        startActivity(sobre);
    }
}