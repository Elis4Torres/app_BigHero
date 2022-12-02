package com.example.bighero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    EditText txt_email;
    EditText txt_senha;
    Button btn_login, btn_cadastrar;
    CheckBox remember;
    DatabaseHelper myDb;
    ArrayList<String> user_name, user_email, user_senha;
    public static final String SHARED_PREFS = "sharedPrefs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        remember = findViewById(R.id.remember_btn);

        txt_email = findViewById(R.id.txt_email);
        txt_senha = findViewById(R.id.txt_senha);
        btn_cadastrar = findViewById(R.id.btn_cadastrar);
        btn_login = findViewById(R.id.btn_login);
        myDb = new DatabaseHelper(this);

        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String checkbox = preferences.getString("remember", "");

        if(checkbox.equals("true")) {
            Intent home = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(home);
        }else if (checkbox.equals("false")){
            Toast.makeText(LoginActivity.this, "Insira seus dados para entrar.", Toast.LENGTH_SHORT).show();
        }

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txt_email.getText().toString();
                String senha = txt_senha.getText().toString();

                if(email.equals("") || senha.equals("")) {
                    Toast.makeText(LoginActivity.this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show();
                } else {
                    Boolean checkpassword = myDb.checkpassword(email, senha);
                    if(checkpassword == true) {
                        Toast.makeText(LoginActivity.this, "Login concluído.", Toast.LENGTH_SHORT).show();
                        Intent home = new Intent(LoginActivity.this, HomeActivity.class);
                        Intent i = new Intent(getApplicationContext(), PerfilActivity.class);
                        i.putExtra("my_variable", email);
                        startActivity(i);
                    } else {
                        Toast.makeText(LoginActivity.this, "Informações inválidas.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    SharedPreferences preferences = getSharedPreferences("ckeckbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember", "true");
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                } else if (!compoundButton.isChecked()) {
                    SharedPreferences preferences = getSharedPreferences("ckeckbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember", "false");
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }


    public void Cadastro(View view){
        Intent cadastrar = new Intent(this, CadastroActivity.class);
        startActivity(cadastrar);
    }
}