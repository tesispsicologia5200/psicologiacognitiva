package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by jairo on 23/07/2015.
 */
public class lenguajeActivity extends ActionBarActivity {


    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            id=b.getString("ID");
            Vfunciones=b.getString("VFunciones");
            Vlenguaje=b.getString("VLenguaje");
            Vatencion=b.getString("VAtencion");
            if(Vlenguaje.equals("1")){
                setContentView(R.layout.auditiva_a);
            }
            if(Vlenguaje.equals("0")){
                Intent data = new Intent(this, atencionActivity.class);
                data.putExtra("VFunciones",Vfunciones);
                data.putExtra("VAtencion",Vatencion);
                startActivity(data);
            }
        }
    }

    public void siguienteOnClick(View view){
        Intent data = new Intent(this, VisualActivity.class);
        data.putExtra("ID", id);
        data.putExtra("VFunciones", Vfunciones);
        data.putExtra("VAtencion", Vatencion);
        startActivity(data);
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
