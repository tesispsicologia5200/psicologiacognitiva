package com.psicologia.proyecto.psicologiatesis;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Henry Jaramillo on 24/07/2015.
 */
public class memoria2Activity extends ActionBarActivity {


    String Vfunciones;
    String Vlenguaje;
    String Vatencion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            Vfunciones=b.getString("VFunciones");
            Vlenguaje=b.getString("VLenguaje");
            Vatencion=b.getString("VAtencion");

        setContentView(R.layout.memoria2);
    }
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

}


