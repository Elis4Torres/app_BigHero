package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class HiroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiro);
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

    //Declarando intent implicita - Abrir Gmail e mandar mensagem de e-mail padrão

    public void Email(View view) throws UnsupportedEncodingException {

        //formata o conteúdo do email
        String uriText =
                "mailto:alveselis89@gmail.com" +
                        "?subject=" + URLEncoder.encode("Precisamosﾠdeﾠajuda!", "utf-8") +
                        "&body=" + URLEncoder.encode("Minhaﾠcidadeﾠprecisaﾠdeﾠvocês.ﾠDigiteﾠsuaﾠcidade:ㅤ", "utf-8");
        Uri uri = Uri.parse(uriText);
        //inicia a Intent
        Intent email = new Intent(Intent.ACTION_SENDTO);
        //Define o conteúdo
        email.setData(uri);
        //Inicia a activity para enviar o email
        startActivity(email);

    }
}