package com.example.arthu.calculoimc;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultadoIMC extends AppCompatActivity {
    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);

        TextView resultado = (TextView)findViewById(R.id.idResultado);

        Bundle extra = getIntent().getExtras();
        imagem = (ImageView) findViewById(R.id.imagemID);
        if (extra != null) {
            float imc = extra.getFloat("imc");


            if (imc < 17) {
                resultado.setText("IMC = " + imc);
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.m0));

            } else if (imc >= 17 && imc <= 18.49) {
                resultado.setText("IMC = : " + imc);
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.m1));

            } else if (imc >= 18.5 && imc <= 24.99) {
                resultado.setText("IMC = " + imc);
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.m2));

            } else if (imc >= 25 && imc <= 29.99) {
                resultado.setText("IMC = " + imc);
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.m3));

            } else if (imc >= 30 && imc <= 34.99) {
                resultado.setText("IMC = " + imc);
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.m4));

            } else if (imc >= 35 && imc <= 39.99) {
                resultado.setText("IMC = " + imc);
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.m5));

            } else if (imc >= 40) {
                resultado.setText("IMC = " + imc);
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.m6));

            }
        }

    }
}
