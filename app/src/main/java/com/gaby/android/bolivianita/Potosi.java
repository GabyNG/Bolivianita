package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Potosi extends AppCompatActivity {

    Button siguiente2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potosi);


        siguiente2 = (Button) findViewById(R.id.btSiguiente2);

        siguiente2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Potosi.this, Potosi1.class);
                startActivity(menu1);
            }
        });
    }
}
