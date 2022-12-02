package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    TextView nome ,senha;
    public static TextView email;
    Button btnsair, btnvoltar;
    DatabaseHelper myDb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nome = findViewById(R.id.txtview_nome);
        email = findViewById(R.id.txtview_email);
        senha = findViewById(R.id.txtview_senha);
        btnsair = findViewById(R.id.btn_sair);
        myDb = new DatabaseHelper(this);

        //Peguei o email
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String user_email = extras.getString("my_variable");
            Cursor cursor = myDb.getdata(user_email);
            if (cursor.moveToFirst()) {
                do {
                    String nomedb = cursor.getString(1);
                    String emaildb = cursor.getString(2);
                    String senhadb = cursor.getString(3);
                    nome.setText(nomedb);
                    email.setText(emaildb);
                    senha.setText(senhadb);
                } while (cursor.moveToNext());
            }
        }
    }
    public void Back(View view){
        Intent voltar = new Intent(this, HomeActivity.class);
        startActivity(voltar);
    }
}