package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by jairo on 29/07/2015.
 */
public class pausaMemoria extends ActionBarActivity {

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }

    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String ronda="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b = this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if (b != null) {
            ronda=b.getString("Ronda");
            id=b.getString("ID");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");

            setContentView(R.layout.pausamemoria);
        }
    }

    public void siguienteOnclick(View view)
    {
        Intent data = new Intent(this, memoriaActivity.class);
        data.putExtra("Ronda",ronda);
        data.putExtra("ID", id);
        data.putExtra("VFunciones", Vfunciones);
        data.putExtra("VLenguaje", Vlenguaje);
        data.putExtra("VAtencion", Vatencion);
        data.putExtra("VMemoria","1");
        startActivity(data);
    }
}
