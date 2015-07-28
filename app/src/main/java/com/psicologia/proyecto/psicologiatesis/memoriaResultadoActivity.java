package com.psicologia.proyecto.psicologiatesis;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Henry Jaramillo on 27/07/2015.
 */
public class memoriaResultadoActivity extends ActionBarActivity {

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

    String Vfunciones;
    String Vlenguaje;
    String Vatencion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b = this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if (b != null) {
            id=b.getString("ID");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");

            setContentView(R.layout.memoria_resultado);
            System.out.println(id);
        }
    }

    public void imagenElefanteOnClick(View view){
        elefante="1";
    }
    public void imagenConejoOnClick(View view){
        conejo="1";
    }
    public void imagenPatoOnClick(View view){
        pato="1";
    }
    public void imagenMariposaOnClick(View view){
        mariposa="1";
    }
    public void imagenSartenOnClick(View view){
        sarten="1";
    }
    public void imagenEstufaOnClick(View view){
        estufa="1";
    }
    public void imagenTenedorOnClick(View view){
        tenedor="1";
    }
    public void imagenJarraOnClick(View view){
        jarra="1";
    }
    public void imagenGuanteOnClick(View view){
        guante="1";
    }
    public void imagenZapatoOnClick(View view){
        zapato="1";
    }
    public void imagenSombreroOnClick(View view){
        sombrero="1";
    }
    public void imagenPanueloOnClick(View view){
        panuelo="1";
    }
    public void imagenBananoOnClick(View view){
        banano="1";
    }
    public void imagenUvasOnClick(View view){
        uvas="1";
    }
    public void imagenFresaOnClick(View view){
        fresa="1";
    }
    public void imagenPiniaOnClick(View view){
        pinia="1";
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


}
