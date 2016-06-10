package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Oruro extends AppCompatActivity {

    Button siguiente1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oruro);

        siguiente1 = (Button)findViewById(R.id.btSiguiente1);

        siguiente1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent menu1 = new Intent(Oruro.this, Oruro1.class);
                startActivity(menu1);
            }
        });
    }

}
