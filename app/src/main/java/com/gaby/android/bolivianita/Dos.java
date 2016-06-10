package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dos extends AppCompatActivity {

    Button LaPaz, oruro, pando, potosi, santa, tarija, beni, cochabamba, chuquisaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //LaPaz = (Button) findViewById(R.id.btLapaz);
        //oruro = (Button) findViewById(R.id.btOruro);




            LaPaz = (Button)findViewById(R.id.btLapaz);

            LaPaz.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent menu1 = new Intent(Dos.this, com.gaby.android.bolivianita.LaPaz.class);
                    startActivity(menu1);
                }
            });

        oruro = (Button)findViewById(R.id.btOruro);

        oruro.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, Oruro.class);
                startActivity(menu1);
            }
        });

        pando = (Button)findViewById(R.id.btPando);

        pando.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, Pando.class);
                startActivity(menu1);
            }
        });

        potosi = (Button)findViewById(R.id.btPotosi);

        potosi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, Potosi.class);
                startActivity(menu1);
            }
        });

        santa = (Button)findViewById(R.id.btSanta);

        santa.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, SantaCruz.class);
                startActivity(menu1);
            }
        });

        tarija = (Button)findViewById(R.id.btTarija);

        tarija.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, Tarija.class);
                startActivity(menu1);
            }
        });

        beni = (Button)findViewById(R.id.btBeni);

        beni.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, Beni.class);
                startActivity(menu1);
            }
        });

        cochabamba = (Button)findViewById(R.id.btCocha);

        cochabamba.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, Cochabamba.class);
                startActivity(menu1);
            }
        });

        chuquisaca = (Button)findViewById(R.id.btChuqui);

        chuquisaca.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Dos.this, Chuquisaca.class);
                startActivity(menu1);
            }
        });

    }
}
