package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Henry Jaramillo on 27/07/2015.
 */
public class memoriaBlanco extends ActionBarActivity {


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

            setContentView(R.layout.memoriablanco);
    }
    }

    public void siguienteOnclick(View v){
        Intent data = new Intent(this,memoriaResultadoActivity.class);
        data.putExtra("VFunciones",Vfunciones);
        data.putExtra("VLenguaje",Vlenguaje);
        data.putExtra("VAtencion",Vatencion);
        startActivity(data);

    }
}
