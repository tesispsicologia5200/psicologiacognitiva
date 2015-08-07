package com.psicologia.proyecto.psicologiatesis;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

/**
 * Created by jairo on 23/07/2015.
 */
public class lenguajeActivity extends ActionBarActivity {

    int aciertos=0;
    int errores=0;
    int intrusion=0;
    int omision=0;
    String tiempo;
    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;
    TextView aciertoss;
    TextView erroress;
    MediaPlayer mp ;

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
            id=b.getString("Id");
            Vmemoria=b.getString("VMemoria");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");
            if(Vlenguaje.equals("1")){
                setContentView(R.layout.auditiva_a);
                aciertoss=(TextView)findViewById(R.id.lb_aciertos);
                erroress=(TextView)findViewById(R.id.lb_errores);
                aciertoss.setText("0");
                erroress.setText("0");
                mp = MediaPlayer.create(this, R.raw.prueba_auditiva_a_mezcla);
            }
            if(Vlenguaje.equals("0")){
                Intent data = new Intent(this, atencionActivity.class);
                data.putExtra("Id",id);
                data.putExtra("VMemoria",Vmemoria);
                data.putExtra("VFunciones",Vfunciones);
                data.putExtra("VLenguaje",Vlenguaje);
                data.putExtra("VAtencion",Vatencion);
                startActivity(data);
            }
        }
    }

    public void error(){
        mp.stop();
        Intent data = new Intent(this, lenguajeActivity.class);
        data.putExtra("Id", id);
        data.putExtra("VMemoria",Vmemoria);
        data.putExtra("VFunciones", Vfunciones);
        data.putExtra("VLenguaje", Vlenguaje);
        data.putExtra("VAtencion", Vatencion);
        startActivity(data);
    }

    public void siguienteOnClick(View view){
        mp.stop();
        omision=16 - aciertos;

        UsuariosHelper memoria1Helper= new UsuariosHelper(this,"Psicologia21",null,1);
        SQLiteDatabase db = memoria1Helper.getWritableDatabase();
        if (db != null) {
            ContentValues registroNuevos = new ContentValues();
            registroNuevos.put("Id",id);
            registroNuevos.put("Aciertos",aciertos);
            registroNuevos.put("Errores",errores);
            registroNuevos.put("Omisiones",omision);
            registroNuevos.put("Intrusion",intrusion);
            long i = db.insert("LenguajeAuditivo", null, registroNuevos);
            if (i > 0) {
                Toast.makeText(this, "prueba de lenguaje auditivo resgistrada", Toast.LENGTH_SHORT).show();
                Intent data = new Intent(this, ExplicacionVisualActivity.class);
                data.putExtra("Id", id);
                data.putExtra("VMemoria",Vmemoria);
                data.putExtra("VFunciones", Vfunciones);
                data.putExtra("VLenguaje", Vlenguaje);
                data.putExtra("VAtencion", Vatencion);
                startActivity(data);
            }
        }

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
        else if(tiempo.equalsIgnoreCase("00:02:24")||tiempo.equalsIgnoreCase("00:02:10")||tiempo.equalsIgnoreCase("00:01:48")||tiempo.equalsIgnoreCase("00:01:35")||tiempo.equalsIgnoreCase("00:01:09")||tiempo.equalsIgnoreCase("00:00:51")||tiempo.equalsIgnoreCase("00:00:45")||tiempo.equalsIgnoreCase("00:00:43")||tiempo.equalsIgnoreCase("00:00:12")||tiempo.equalsIgnoreCase("00:00:02")||tiempo.equalsIgnoreCase("00:02:00")||tiempo.equalsIgnoreCase("00:01:37")||tiempo.equalsIgnoreCase("00:01:33")||tiempo.equalsIgnoreCase("00:01:25")||tiempo.equalsIgnoreCase("00:00:48")||tiempo.equalsIgnoreCase("00:00:23")||tiempo.equalsIgnoreCase("00:00:13")){
            intrusion++;
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
            aciertoss.setText(String.valueOf(aciertos));
            erroress.setText(String.valueOf(errores));
            if(aciertos==0&&errores==0&&intrusion==0&&hms.equalsIgnoreCase("00:02:20")){
                error();
            }


        }




        @Override
        public void onFinish() {
            // TODO Auto-generated method stub

        }



    }



}
