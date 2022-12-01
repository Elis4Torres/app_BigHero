package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    TextView nome, email ,senha;
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


//        void cursor = myDb.getdata('a');
//        if (cursor.moveToFirst() ) {
//            nome.setText(cursor.getString(cursor.getColumnIndex("nome");
//        } else {
//            nome.setText("Ooops no data extracted");
//        }
//        cursor.close();
//    }

    


//    public void Back(View view){
//        Intent voltar = new Intent(this, HomeActivity.class);
//        startActivity(voltar);
//    }
}