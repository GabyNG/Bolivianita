package com.gaby.android.bolivianita;

import android.app.ActionBar;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class MainActivity extends ActionBarActivity {

    // Button menu1;
    //ImageButton menu1;
    public static final int segundos = 5;
    public static final int milisegundos = segundos * 1000;
    public static final int delay=2;
    private ProgressBar pbprogreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbprogreso = (ProgressBar) findViewById(R.id.pbprogreso);
        pbprogreso.setMax(maximo_progreso());
        empezaranimacion();

    }

    public void empezaranimacion() {
        new CountDownTimer(milisegundos, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
            pbprogreso.setProgress(stablecer_progreso(millisUntilFinished));
            }

            @Override
            public void onFinish() {
            Intent nuevo=new Intent(MainActivity.this,Dos.class);
                startActivity(nuevo);
                finish();
            }


        }.start();
    }

    public int stablecer_progreso(long miliseconds){
        return (int)((milisegundos-miliseconds)/1000);
    }
    public int maximo_progreso(){
        return segundos-delay;
    }

}
