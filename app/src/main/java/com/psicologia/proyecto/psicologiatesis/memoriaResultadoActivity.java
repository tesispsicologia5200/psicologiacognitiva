package com.psicologia.proyecto.psicologiatesis;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

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

    public void imagenElefanteOnClick(){
        elefante="1";
    }
    public void imagenConejoOnClick(){
        conejo="1";
    }
    public void imagenPatoOnClick(){
        pato="1";
    }
    public void imagenMariposaOnClick(){
        mariposa="1";
    }
    public void imagenSartenOnClick(){
        sarten="1";
    }
    public void imagenEstufaOnClick(){
        estufa="1";
    }
    public void imagenTenedorOnClick(){
        tenedor="1";
    }
    public void imagenJarraOnClick(){
        jarra="1";
    }
    public void imagenGuanteOnClick(){
        guante="1";
    }
    public void imagenZapatoOnClick(){
        zapato="1";
    }
    public void imagenSombreroOnClick(){
        sombrero="1";
    }
    public void imagenPanueloOnClick(){
        panuelo="1";
    }
    public void imagenBananoOnClick(){
        banano="1";
    }
    public void imagenUvasOnClick(){
        uvas="1";
    }
    public void imagenFresaOnClick(){
        fresa="1";
    }
    public void imagenPiniaOnClick(){
        pinia="1";
    }
    public void btnIntrucionOnClick(){
        intrucion++;
    }
    public void btnPerseveracionOnClick(){
        perseveracion++;
    }


}
