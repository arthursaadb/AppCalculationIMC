package com.example.arthu.calculoimc;

import android.app.Activity;
import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void btnOnClick(View v){
        EditText altura = (EditText)findViewById(R.id.textHeight);
        EditText peso = (EditText)findViewById(R.id.textWeight);

        float valorAltura = Float.parseFloat(altura.getText().toString());
        float valorPeso = Float.parseFloat(peso.getText().toString());
        valorAltura = valorAltura/100;
        float resultado = valorPeso / (valorAltura * valorAltura);

        Intent intent = new Intent(MainActivity.this,ResultadoIMC.class);
        intent.putExtra("imc",resultado);
        startActivity(intent);
    }
 }
