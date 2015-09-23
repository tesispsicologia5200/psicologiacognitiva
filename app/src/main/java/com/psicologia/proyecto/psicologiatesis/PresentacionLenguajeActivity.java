package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;

import java.util.concurrent.TimeUnit;

public class PresentacionLenguajeActivity extends ActionBarActivity {


    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            id=b.getString("Id");
            Vmemoria=b.getString("VMemoria");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");
            if(Vlenguaje.equals("1")){
                setContentView(R.layout.presentacionlenguaje);
                final CounterClass timer = new CounterClass(5000, 1000);
                timer.start();
            }
            if(Vlenguaje.equals("0")){
                Intent data = new Intent(this, PresentacionTokenActivity.class);
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
        Intent data = new Intent(this,AtencionAuditivaActivity.class);
        data.putExtra("Id",id);
        data.putExtra("VMemoria",Vmemoria);
        data.putExtra("VFunciones",Vfunciones);
        data.putExtra("VLenguaje",Vlenguaje);
        data.putExtra("VAtencion",Vatencion);
        startActivity(data);
    }

    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }


        @Override
        public void onTick(long millisUntilFinished) {
            long millis = millisUntilFinished;
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));


        }
        @Override
        public void onFinish() {
            enviarDatos();
        }



    }
}
