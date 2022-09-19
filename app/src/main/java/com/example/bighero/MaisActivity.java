package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MaisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mais);

        final Context context = this;

    }

    public void Back(View view){
        Intent voltar = new Intent(this, HomeActivity.class);
        startActivity(voltar);

    }

    public void Mapas(View view){
        Intent local = new Intent(this, LocationActivity.class);
        startActivity(local);
    }

    public void Home (View view){
        Intent home = new Intent(this, HomeActivity.class);
        startActivity(home);
    }

    public void Mais(View view){
        Intent mais = new Intent(this, MaisActivity.class);
        startActivity(mais);
    }

    public void Receitas (View view) {
        Uri uri = Uri.parse("https://www.receitasnestle.com.br/receitas/ratatouille-legumes-assados");
        Intent receitas = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.receitasnestle.com.br/receitas/ratatouille-legumes-assados"));
        startActivity(receitas);
    }
}