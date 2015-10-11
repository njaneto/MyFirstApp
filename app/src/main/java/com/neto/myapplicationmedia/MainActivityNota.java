package com.neto.myapplicationmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityNota extends AppCompatActivity {

   EditText primeiraNota , resuldado, segundaNota, EDNota, U2Nota;

   Button buttonMedia;

     double n1,n2,ed,u2, media;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_nota);

        primeiraNota = (EditText) findViewById(R.id.ValorPrimeiraNota);
        segundaNota = (EditText) findViewById(R.id.ValorSegundaNota);
        EDNota = (EditText) findViewById(R.id.ValorEDNota);
        U2Nota = (EditText) findViewById(R.id.ValorU2Nota);

        resuldado = (EditText) findViewById(R.id.ValorMedia);


        buttonMedia = (Button) findViewById(R.id.buttonMedia);


        buttonMedia.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                n1 = Double.parseDouble(primeiraNota.getText().toString());
                n2 = Double.parseDouble(segundaNota.getText().toString());
                ed = Double.parseDouble(EDNota.getText().toString());
                u2 = Double.parseDouble(U2Nota.getText().toString());

                media = (n1+n2+ed+u2)/4;

                resuldado.setText(String.valueOf(media));


            }

        });

    }
}
