package com.psicologia.proyecto.psicologiatesis;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class UsuarioActivity extends ActionBarActivity {

    String[] Estrato={"1","2","3","4","5","6"};
    Spinner psEstrato;
    String[] Curso={"3","4","5","6","7","8","9","10","11","Ninguno"};
    Spinner spCurso;
    String[] Tda={"Completa","Memoria","Atencion","Funciones Jecutivas","Lenguaje"};
    Spinner spTda;
    String[] Aditamientos={"Oculares","Auditivos","Ninguna"};
    Spinner spAditamientos;
    String[] Lateralidad={"Diestro","Zurdo","Indefinido"};
    Spinner spLateralidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        psEstrato= (Spinner)findViewById(R.id.sp_Estrato);
        cargaEstrato();
        spCurso= (Spinner)findViewById(R.id.sp_curso);
        cargaCurso();
        spTda= (Spinner)findViewById(R.id.sp_tda);
        cargaTda();
        spAditamientos= (Spinner)findViewById(R.id.sp_Aditamientos);
        cargaAditamientos();
        spLateralidad= (Spinner)findViewById(R.id.sp_Lateralidad);
        cargaLateralidad();
    }

    public void cargaLateralidad(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Lateralidad);
        psEstrato.setAdapter(adaptador);
    }

    public void cargaEstrato(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Estrato);
        psEstrato.setAdapter(adaptador);
    }
    public void cargaAditamientos(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Aditamientos);
        psEstrato.setAdapter(adaptador);
    }

    public void cargaTda(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Tda);
        spTda.setAdapter(adaptador);
    }

    public void cargaCurso(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Curso);
        spCurso.setAdapter(adaptador);
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
