package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
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
public class memoriaActivity extends ActionBarActivity {
    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    String id;
    String Vmemoria;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String ronda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            ronda=b.getString("Ronda");
            id=b.getString("Id");
            Vmemoria=b.getString("VMemoria");
            Vfunciones=b.getString("VFunciones");
            Vlenguaje=b.getString("VLenguaje");
            Vatencion=b.getString("VAtencion");
            if(Vmemoria.equals("1")){

                setContentView(R.layout.memoria1);
                final CounterClass timer = new CounterClass(10000, 1000);
                timer.start();

            }
            if(Vmemoria.equals("0")){
                Intent data = new Intent(this, lenguajeActivity.class);
                data.putExtra("Id",id);
                data.putExtra("VMemoria",Vmemoria);
                data.putExtra("VFunciones",Vfunciones);
                data.putExtra("VLenguaje",Vlenguaje);
                data.putExtra("VAtencion",Vatencion);
                startActivity(data);
            }
        }


    }


    public void enviarDatos(){
        Intent data = new Intent(this,memoria2Activity.class);
        data.putExtra("Ronda",ronda);
        data.putExtra("Id",id);
        data.putExtra("VMemoria",Vmemoria);
        data.putExtra("VFunciones",Vfunciones);
        data.putExtra("VLenguaje",Vlenguaje);
        data.putExtra("VAtencion",Vatencion);
        startActivity(data);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }









    public class CounterClass extends CountDownTimer  {

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

        }




        @Override
        public void onFinish() {
            // TODO Auto-generated method stub
            enviarDatos();
        }



    }




}
