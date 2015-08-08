package com.psicologia.proyecto.psicologiatesis;

import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Henry Jaramillo on 27/07/2015.
 */
public class memoriaResultadoActivity extends ActionBarActivity {

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }

    String id;
    String banano="0";
    String conejo="0";
    String elefante="0";
    String estufa="0";
    String fresa="0";
    String guante="0";
    String jarra="0";
    String mariposa="0";
    String panuelo="0";
    String pato="0";
    String pinia="0";
    String sarten="0";
    String sombrero="0";
    String tenedor="0";
    String uvas="0";
    String zapato="0";
    int perseveracion=0;
    int intrucion=0;
    String primerarecordada="";
    String ultimaRecordad="";
    int bandera=0;
    String ronda="2";

    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b = this.getIntent().getExtras();
        super.onCreate(savedInstanceState);

        if (b != null) {
            id=b.getString("Id");
            Vmemoria=b.getString("VMemoria");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");

            setContentView(R.layout.memoria_resultado);
        }
    }

    public void imagenElefanteOnClick(View view){
        elefante="1";
        ultimaRecordad="elefante";
        if(bandera==0){
            primerarecordada="elefante";
            bandera=1;
        }
    }
    public void imagenConejoOnClick(View view){
        conejo="1";
        ultimaRecordad="conejo";
        if(bandera==0){
            primerarecordada="conejo";
            bandera=1;
        }
    }
    public void imagenPatoOnClick(View view){
        pato="1";
        ultimaRecordad="pato";
        if(bandera==0){
            primerarecordada="pato";
            bandera=1;
        }
    }
    public void imagenMariposaOnClick(View view){
        mariposa="1";
        ultimaRecordad="mariposa";
        if(bandera==0){
            primerarecordada="mariposa";
            bandera=1;
        }
    }
    public void imagenSartenOnClick(View view){
        sarten="1";
        ultimaRecordad="sarten";
        if(bandera==0){
            primerarecordada="sarten";
            bandera=1;
        }
    }
    public void imagenEstufaOnClick(View view){
        estufa="1";
        ultimaRecordad="estufa";
        if(bandera==0){
            primerarecordada="estufa";
            bandera=1;
        }
    }
    public void imagenTenedorOnClick(View view){
        tenedor="1";
        ultimaRecordad="tenedor";
        if(bandera==0){
            primerarecordada="tenedor";
            bandera=1;
        }
    }
    public void imagenJarraOnClick(View view){
        jarra="1";
        ultimaRecordad="jarra";
        if(bandera==0){
            primerarecordada="jarra";
            bandera=1;
        }
    }
    public void imagenGuanteOnClick(View view){
        guante="1";
        ultimaRecordad="guante";
        if(bandera==0){
            primerarecordada="guante";
            bandera=1;
        }
    }
    public void imagenZapatoOnClick(View view){
        zapato="1";
        ultimaRecordad="zapato";
        if(bandera==0){
            primerarecordada="zapato";
            bandera=1;
        }
    }
    public void imagenSombreroOnClick(View view){
        sombrero="1";
        ultimaRecordad="sombrero";
        if(bandera==0){
            primerarecordada="sombrero";
            bandera=1;
        }
    }
    public void imagenPanueloOnClick(View view){
        panuelo="1";
        ultimaRecordad="panuelo";
        if(bandera==0){
            primerarecordada="panuelo";
            bandera=1;
        }
    }
    public void imagenBananoOnClick(View view){
        banano="1";
        ultimaRecordad="banano";
        if(bandera==0){
            primerarecordada="banano";
            bandera=1;
        }
    }
    public void imagenUvasOnClick(View view){
        uvas="1";
        ultimaRecordad="uvas";
        if(bandera==0){
            primerarecordada="uvas";
            bandera=1;
        }
    }
    public void imagenFresaOnClick(View view){
        fresa="1";
        ultimaRecordad="fresa";
        if(bandera==0){
            primerarecordada="fresa";
            bandera=1;
        }
    }
    public void imagenPiniaOnClick(View view){
        pinia="1";
        ultimaRecordad="pinia";
        if(bandera==0){
            primerarecordada="pinia";
            bandera=1;
        }
    }
    public void btnIntrucionOnClick(View view){
        intrucion++;
    }
    public void btnPerseveracionOnClick(View view){
        perseveracion++;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_usuario, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnSiguienteOnclick(View view){
        UsuariosHelper memoria1Helper= new UsuariosHelper(this,"Psicologia21",null,1);
        SQLiteDatabase db = memoria1Helper.getWritableDatabase();
        if (db != null) {
            ContentValues registroNuevos = new ContentValues();
            registroNuevos.put("Id",id);
            registroNuevos.put("Elefante",elefante);
            registroNuevos.put("Conejo",conejo);
            registroNuevos.put("Pato",pato);
            registroNuevos.put("Mariposa",mariposa);
            registroNuevos.put("Sarten",sarten);
            registroNuevos.put("Estufa",estufa);
            registroNuevos.put("Tenedor",tenedor);
            registroNuevos.put("Jarra",jarra);
            registroNuevos.put("Guante",guante);
            registroNuevos.put("Zapato",zapato);
            registroNuevos.put("Sombrero",sombrero);
            registroNuevos.put("Panuelo",panuelo);
            registroNuevos.put("Banano",banano);
            registroNuevos.put("Uvas",uvas);
            registroNuevos.put("Fresa",fresa);
            registroNuevos.put("Pinia",pinia);
            registroNuevos.put("Primera_recordada",primerarecordada);
            registroNuevos.put("Ultima_recordada",ultimaRecordad);
            registroNuevos.put("Intrucion",intrucion);
            registroNuevos.put("Perseveracion",perseveracion);
            long i = db.insert("MemoriaUno", null, registroNuevos);
            if (i > 0) {
                Toast.makeText(this, "prueba de memoria resgistrada", Toast.LENGTH_SHORT).show();
                Intent data = new Intent(this, pausaMemoria.class);
                data.putExtra("Ronda",ronda);
                data.putExtra("Id", id);
                data.putExtra("VMemoria",Vmemoria);
                data.putExtra("VFunciones", Vfunciones);
                data.putExtra("VLenguaje", Vlenguaje);
                data.putExtra("VAtencion", Vatencion);
                startActivity(data);
            }
        }
    }


}
