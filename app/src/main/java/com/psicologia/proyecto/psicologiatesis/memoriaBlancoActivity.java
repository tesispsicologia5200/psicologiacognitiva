package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class memoriaBlancoActivity extends ActionBarActivity {

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }

    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;
    String ronda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b = this.getIntent().getExtras();
        super.onCreate(savedInstanceState);

        if (b != null) {
            ronda=b.getString("Ronda");
            id=b.getString("Id");
            Vmemoria=b.getString("VMemoria");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");

            setContentView(R.layout.memoriablanco);
    }
    }

    public void siguienteOnclick(View v){
        if(ronda==null) {
            Intent data = new Intent(this, memoriaResultadoActivity.class);
            data.putExtra("Id", id);
            data.putExtra("VMemoria",Vmemoria);
            data.putExtra("VFunciones", Vfunciones);
            data.putExtra("VLenguaje", Vlenguaje);
            data.putExtra("VAtencion", Vatencion);
            startActivity(data);
        }
        else if(ronda.equalsIgnoreCase("2")){
            Intent data = new Intent(this, memoriaResultadoActivity2.class);
            data.putExtra("Id", id);
            data.putExtra("VMemoria",Vmemoria);
            data.putExtra("VFunciones", Vfunciones);
            data.putExtra("VLenguaje", Vlenguaje);
            data.putExtra("VAtencion", Vatencion);
            startActivity(data);
        }
    }
}
