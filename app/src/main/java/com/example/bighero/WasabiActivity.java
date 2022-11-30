package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class WasabiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wasabi);
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

    //Declarando intent implicita - Abrir site web

    public void Receitas (View view) {
        Uri uri = Uri.parse("https://www.receitasnestle.com.br/receitas/ratatouille-legumes-assados");
        Intent receitas = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.receitasnestle.com.br/receitas/ratatouille-legumes-assados"));
        startActivity(receitas);
    }
}