package com.gaby.android.bolivianita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaPaz extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lapaz);

        siguiente = (Button)findViewById(R.id.btSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent menu1 = new Intent(LaPaz.this, LaPaz1.class);
                startActivity(menu1);
            }
        });


    }
}
