package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.concurrent.TimeUnit;

/**
 * Created by jairo on 23/07/2015.
 */
public class lenguajeActivity extends ActionBarActivity {

    String tiempo;

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            String Vfunciones=b.getString("VFunciones");
            String Vlenguaje=b.getString("VLenguaje");
            String Vatencion=b.getString("VAtencion");
            if(Vlenguaje.equals("1")){
                setContentView(R.layout.auditiva_a);
            }
            if(Vlenguaje.equals("0")){
                Intent data = new Intent(this, atencionActivity.class);
                data.putExtra("VFunciones",Vfunciones);
                data.putExtra("VAtencion",Vatencion);
                startActivity(data);
            }
        }
    }

    public void siguienteOnClick(View view){
        Intent data = new Intent(this, VisualActivity.class);
        startActivity(data);
    }

    public void playOnClick(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.prueba_auditiva_a_mezcla);
        mp.start();
        final CounterClass timer = new CounterClass(161000, 1000);
        timer.start();
    }

    public void botonOnClick(View v){

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
        }


        @Override
        public void onTick(long millisUntilFinished) {
            // TODO Auto-generated method stub

            long millis = millisUntilFinished;
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            System.out.println(hms);
            tiempo=hms;

        }




        @Override
        public void onFinish() {
            // TODO Auto-generated method stub

        }



    }



}
