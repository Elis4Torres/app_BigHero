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

    public void Mais(View view){
        Intent mais = new Intent(this, MaisActivity.class);
        startActivity(mais);
    }
    public void Personagem(View view){
        Intent personagens = new Intent(this, PersonagensActivity.class);
        startActivity(personagens);
    }
    public void Mapas(View view){
        Intent mapas = new Intent(this, LocationActivity.class);
        startActivity(mapas);
    }
    public void Receitas(View view){
        Intent receitas = new Intent(this, MaisActivity.class);
        startActivity(receitas);
    }

}