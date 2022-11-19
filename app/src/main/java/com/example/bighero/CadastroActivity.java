package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    EditText txt_nome, txt_email ,txt_senha;
    Button btn_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        txt_nome = findViewById(R.id.txt_nome);
        txt_email = findViewById(R.id.txt_email);
        txt_senha = findViewById(R.id.txt_senha);
        btn_cadastrar = findViewById(R.id.btn_cadastrar);

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper myDb = new DatabaseHelper(CadastroActivity.this);
                myDb.Cadastrar(txt_nome.getText().toString().trim(),
                        txt_email.getText().toString().trim(),
                        txt_senha.getText().toString().trim());
            }
        });
    }

    public void Back(View view){
        Intent voltar = new Intent(this, PersonagensActivity.class);
        startActivity(voltar);
    }
}