package com.example.bighero;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private final Context context;
    public static final String DATABASE_NAME = "bighero.db";
    public static final int DATABASE_VERSION = 1;
    public static final String USER_TABLE_NAME = "usuario";
    public static final String USER_COLUMN_ID = "_id";
    public static final String USER_COLUMN_NAME = "nome";
    public static final String USER_COLUMN_EMAIL = "email";
    public static final String USER_COLUMN_SENHA = "senha";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table " + USER_TABLE_NAME +
                        "( " + USER_COLUMN_ID + " integer primary key autoincrement," +
                        USER_COLUMN_NAME + " text , " +
                        USER_COLUMN_EMAIL + " text, " +
                        USER_COLUMN_SENHA + " text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS tbusuario");
        onCreate(db);
    }

    void Cadastrar(String user_name, String user_email, String user_password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(USER_COLUMN_NAME, user_name);
        cv.put(USER_COLUMN_EMAIL, user_email);
        cv.put(USER_COLUMN_SENHA, user_password);

        long resultInsert = db.insert(USER_TABLE_NAME, null, cv);

        if (resultInsert == -1){
            Toast.makeText(context, "Falha ao cadastrar.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
        }

        // NECESSÁRIO VALIDAR O CADASTRO PARA GARANTIR A NÃO-DUPLICIDADE
    }
}
