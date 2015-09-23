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

import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class AtencionAuditivaActivity extends ActionBarActivity {

    int aciertos=0;
    int errores=0;
    int intrusion=0;
    int omision=0;
    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;
    float tiemporeal=0;

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
            setContentView(R.layout.auditiva_a);
        }
    }

    public void error(){
        destruir();
        Intent data = new Intent(this, AtencionAuditivaActivity.class);
        data.putExtra("Id", id);
        data.putExtra("VMemoria",Vmemoria);
        data.putExtra("VFunciones", Vfunciones);
        data.putExtra("VLenguaje", Vlenguaje);
        data.putExtra("VAtencion", Vatencion);
        startActivity(data);
    }

    public void siguienteOnClick(View view){
        if(mp != null) {
            destruir();
        }
        omision=16 - aciertos;
        SqlHelper memoria1Helper= new SqlHelper(this,"Psicologia22",null,1);
        SQLiteDatabase db = memoria1Helper.getWritableDatabase();
        if (db != null) {
            ContentValues registroNuevos = new ContentValues();
            registroNuevos.put("Id",id);
            registroNuevos.put("Aciertos",aciertos);
            registroNuevos.put("Errores", errores);
            registroNuevos.put("Omisiones", omision);
            registroNuevos.put("Intrusion", intrusion);
            long i = db.insert("LenguajeAuditivo", null, registroNuevos);
            if (i > 0) {
                Toast.makeText(this, "prueba de atencion auditiva resgistrada", Toast.LENGTH_SHORT).show();
                Intent data = new Intent(this, ExplicacionAtencionVisualActivity.class);
                data.putExtra("Id", id);
                data.putExtra("VMemoria", Vmemoria);
                data.putExtra("VFunciones", Vfunciones);
                data.putExtra("VLenguaje", Vlenguaje);
                data.putExtra("VAtencion", Vatencion);
                startActivity(data);
            }
        }

    }

    public void playOnClick(View v){
        if(mp == null) {
            destruir();
            mp = MediaPlayer.create(this, R.raw.prueba_auditiva_a_mezcla);
            mp.start();
            final CounterClass timer = new CounterClass(41000, 1000);
            timer.start();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mp != null) {
            mp.stop();
            mp.release();
        }
    }

    public void destruir(){
        if(mp != null){
            mp.release();

        }
    }

    public void botonOnClick(View v){

        tiemporeal=mp.getCurrentPosition()/1000;
        if(tiemporeal==5||tiemporeal==6||tiemporeal==21||tiemporeal==22||tiemporeal==37||tiemporeal==38||tiemporeal==71||tiemporeal==72||tiemporeal==91||tiemporeal==92||tiemporeal==103||tiemporeal==104||tiemporeal==109||tiemporeal==110||tiemporeal==145||tiemporeal==146||tiemporeal==153||tiemporeal==154||tiemporeal==161||tiemporeal==162||tiemporeal==195||tiemporeal==196||tiemporeal==243||tiemporeal==244||tiemporeal==255||tiemporeal==256||tiemporeal==271||tiemporeal==272||tiemporeal==277||tiemporeal==278||tiemporeal==287||tiemporeal==288)
        {
            aciertos++;
        }
        else if(tiemporeal==33||tiemporeal==34||tiemporeal==61||tiemporeal==62||tiemporeal==81||tiemporeal==82||tiemporeal==105||tiemporeal==106||tiemporeal==127||tiemporeal==128||tiemporeal==131||tiemporeal==132||tiemporeal==135||tiemporeal==136||tiemporeal==151||tiemporeal==152||tiemporeal==183||tiemporeal==184||tiemporeal==225||tiemporeal==226||tiemporeal==231||tiemporeal==232||tiemporeal==235||tiemporeal==236||tiemporeal==275||tiemporeal==276||tiemporeal==297||tiemporeal==298||tiemporeal==295||tiemporeal==296||tiemporeal==317||tiemporeal==318)
        {
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
        }




        @Override
        public void onFinish() {
            if(aciertos==0||errores==0||intrusion==0){
                error();
            }
        }
    }
}
