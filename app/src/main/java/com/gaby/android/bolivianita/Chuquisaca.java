package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Chuquisaca extends AppCompatActivity {

    Button siguiente6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuquisaca);

        siguiente6 = (Button)findViewById(R.id.btSiguiente6);

        siguiente6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Chuquisaca.this, Chuquisaca1.class);
                startActivity(menu1);
            }
        });
    }

}
