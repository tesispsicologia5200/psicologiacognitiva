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

/**
 * Created by jairo on 23/07/2015.
 */

public class lenguajeActivity extends ActionBarActivity {

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
        Intent data = new Intent(this, lenguajeActivity.class);
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
        UsuariosHelper memoria1Helper= new UsuariosHelper(this,"Psicologia22",null,1);
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
                Toast.makeText(this, "prueba de lenguaje auditivo resgistrada", Toast.LENGTH_SHORT).show();
                Intent data = new Intent(this, ExplicacionVisualActivity.class);
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
        if(tiemporeal==3||tiemporeal==11||tiemporeal==19||tiemporeal==36||tiemporeal==46||tiemporeal==52||tiemporeal==55||tiemporeal==73||tiemporeal==77||tiemporeal==81||tiemporeal==88||tiemporeal==122||tiemporeal==128||tiemporeal==136||tiemporeal==139||tiemporeal==144)
        {
            aciertos++;
        }
        else if(tiemporeal==17||tiemporeal==31||tiemporeal==41||tiemporeal==53||tiemporeal==64||tiemporeal==66||tiemporeal==68||tiemporeal==76||tiemporeal==92||tiemporeal==113||tiemporeal==116||tiemporeal==118||tiemporeal==138||tiemporeal==149||tiemporeal==148||tiemporeal==159)
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
}
