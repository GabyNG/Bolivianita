package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Cochabamba extends AppCompatActivity {

    Button siguiente5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cochabamba);

        siguiente5 = (Button)findViewById(R.id.btSiguiente5);

        siguiente5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(Cochabamba.this, Cochabamba1.class);
                startActivity(menu1);
            }
        });
    }


}
