package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Tarija extends AppCompatActivity {

    Button siguiente4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarija);

        siguiente4 = (Button)findViewById(R.id.btSiguiente4);

        siguiente4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Tarija.this, Tarija1.class);
                startActivity(menu1);
            }
        });
    }


}
