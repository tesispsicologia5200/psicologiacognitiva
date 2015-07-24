package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by jairo on 23/07/2015.
 */
public class memoriaActivity extends ActionBarActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            String Vmemoria=b.getString("VMemoria");
            String Vfunciones=b.getString("VFunciones");
            String Vlenguaje=b.getString("VLenguaje");
            String Vatencion=b.getString("VAtencion");
            if(Vmemoria.equals("1")){

                setContentView(R.layout.memoria1);
            }
            if(Vmemoria.equals("0")){
                Intent data = new Intent(this, lenguajeActivity.class);
                data.putExtra("VFunciones",Vfunciones);
                data.putExtra("VLenguaje",Vlenguaje);
                data.putExtra("VAtencion",Vatencion);
                startActivity(data);
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
