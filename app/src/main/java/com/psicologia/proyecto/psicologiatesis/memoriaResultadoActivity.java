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
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");

            setContentView(R.layout.memoria_resultado);
        }
    }

    public void imagenElefanteOnClick(){

    }
    public void imagenConejoOnClick(){

    }
    public void imagenPatoOnClick(){

    }
    public void imagenMariposaOnClick(){

    }
    public void imagenSartenOnClick(){

    }
    public void imagenEstufaOnClick(){

    }
    public void imagenTenedorOnClick(){

    }
    public void imagenJarraOnClick(){

    }
    public void imagenGuanteOnClick(){

    }
    public void imagenZapatoOnClick(){

    }
    public void imagenSombreroOnClick(){

    }
    public void imagenPanueloOnClick(){

    }
    public void imagenBananoOnClick(){

    }
    public void imagenUvasOnClick(){

    }
    public void imagenFresaOnClick(){

    }
    public void imagenPiniaOnClick(){

    }
    public void btnIntrucionOnClick(){

    }
    public void btnPerseveracionOnClick(){

    }
}
