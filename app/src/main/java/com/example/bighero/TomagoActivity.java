package com.example.bighero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;


public class TomagoActivity extends AppCompatActivity {


    FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomago);

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        getLocation();
    }

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

    public void Personagem(View view){
        Intent personagens = new Intent(this, PersonagensActivity.class);
        startActivity(personagens);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 10){
            if(grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                getLocation();
            }
            else{
                {
                    Toast.makeText(TomagoActivity.this, "Permissão negada.",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public void getLocation(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
        }
        else{
            requestPermission();
        }
    }

    private void requestPermission(){
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 10);
    }

    public void Localização (View view){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "Parque Villa Lobos";
        intent.putExtra(SearchManager.QUERY, query);
        startActivity(intent);
    }

}