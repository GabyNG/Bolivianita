package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SantaCruz extends AppCompatActivity {

    Button siguiente3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santa_cruz);


        siguiente3 = (Button) findViewById(R.id.btSiguiente3);

        siguiente3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(SantaCruz.this, SantaCruz1.class);
                startActivity(menu1);
            }
        });
    }
}
