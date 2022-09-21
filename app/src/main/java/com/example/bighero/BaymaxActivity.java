package com.example.bighero;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;


import android.graphics.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class BaymaxActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensorManagerAproximidade;
    private SensorEventListener sensorAproximidadeListener;


    boolean laterna_bool = false;
    CameraManager sensorManagerLaterna;

// Declarando código para ativação da lanterna através do sensor de proximidade

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baymax);
        sensorManagerLaterna = (CameraManager) getSystemService(CAMERA_SERVICE);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManagerAproximidade = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sensorAproximidadeListener = new SensorEventListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < sensorManagerAproximidade.getMaximumRange()){
                    try {
                        sensorManagerLaterna.setTorchMode("0", true);
                        laterna_bool = true;
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        sensorManagerLaterna.setTorchMode("0", false);
                        laterna_bool = false;
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) { }
        };
        sensorManager.registerListener(sensorAproximidadeListener, sensorManagerAproximidade, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void  onPause(){
        super.onPause();
        sensorManager.unregisterListener(sensorAproximidadeListener);
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

    public void Personagem(View view){
        Intent personagens = new Intent(this, PersonagensActivity.class);
        startActivity(personagens);
    }
}