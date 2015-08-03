package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

/**
 * Created by jairo on 23/07/2015.
 */
public class lenguajeActivity extends ActionBarActivity {

    int aciertos=0;
    int errores=0;
    String tiempo;

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView aciertos=(TextView)findViewById(R.id.lb_aciertos);
        TextView errores=(TextView)findViewById(R.id.lb_errores);
        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            String Vfunciones=b.getString("VFunciones");
            String Vlenguaje=b.getString("VLenguaje");
            String Vatencion=b.getString("VAtencion");
            if(Vlenguaje.equals("1")){
                setContentView(R.layout.auditiva_a);
                aciertos.setText(String.valueOf(aciertos));
                errores.setText(String.valueOf(errores));
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
        if(tiempo.equalsIgnoreCase("00:02:38")||tiempo.equalsIgnoreCase("00:02:30")||tiempo.equalsIgnoreCase("00:02:22")||tiempo.equalsIgnoreCase("00:02:05")||tiempo.equalsIgnoreCase("00:01:55")||tiempo.equalsIgnoreCase("00:01:49")||tiempo.equalsIgnoreCase("00:01:46")||tiempo.equalsIgnoreCase("00:01:18")||tiempo.equalsIgnoreCase("00:01:14")||tiempo.equalsIgnoreCase("00:01:10")||tiempo.equalsIgnoreCase("00:01:03")||tiempo.equalsIgnoreCase("00:00:29")||tiempo.equalsIgnoreCase("00:00:23")||tiempo.equalsIgnoreCase("00:00:15")||tiempo.equalsIgnoreCase("00:00:12")||tiempo.equalsIgnoreCase("00:00:07")){
            aciertos++;
        }
        else{
            errores++;
        }

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
