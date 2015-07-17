package com.psicologia.proyecto.psicologiatesis;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class UsuarioActivity extends ActionBarActivity {

    String[] Estrato={"","1","2","3","4","5","6"};
    Spinner spEstrato;
    String[] Curso={"","3","4","5","6","7","8","9","10","11","Ninguno"};
    Spinner spCurso;
    String[] Aditamientos={"","Oculares","Auditivos","Ninguna"};
    Spinner spAditamientos;
    String[] Lateralidad={"","Diestro","Zurdo","Indefinido"};
    Spinner spLateralidad;
    String[] Edad={"","5","6","7","8","9","10","11","12","13","14","15","16"};
    Spinner spEdad;
    String[] Genero={"","Hombre","Mujer"};
    Spinner spGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        spEstrato= (Spinner)findViewById(R.id.sp_Estrato);
        cargaEstrato();
        spCurso= (Spinner)findViewById(R.id.sp_curso);
        cargaCurso();
        spAditamientos= (Spinner)findViewById(R.id.sp_Aditamientos);
        cargaAditamientos();
        spLateralidad= (Spinner)findViewById(R.id.sp_Lateralidad);
        cargaLateralidad();
        spEdad= (Spinner)findViewById(R.id.sp_Edad);
        cargaEdad();
        spGenero= (Spinner)findViewById(R.id.sp_Genero);
        cargaGenero();
    }

    public void cargaLateralidad(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Lateralidad);
        spLateralidad.setAdapter(adaptador);
    }

    public void cargaGenero(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Genero);
        spGenero.setAdapter(adaptador);
    }

    public void cargaEdad(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Edad);
        spEdad.setAdapter(adaptador);
    }

    public void cargaEstrato(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Estrato);
        spEstrato.setAdapter(adaptador);
    }
    public void cargaAditamientos(){
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Aditamientos);
        spAditamientos.setAdapter(adaptador);
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

    public void siguienteOnClick(View v){
        EditText nombres = (EditText) findViewById(R.id.txt_nombres);
        EditText apellidos = (EditText) findViewById(R.id.txt_apellidos);
        EditText fechaNac = (EditText) findViewById(R.id.);
        EditText curso = (EditText) findViewById(R.id.txt_curso);
        EditText lateralidad = (EditText) findViewById(R.id.txt_lateralidad);
        EditText genero = (EditText) findViewById(R.id.txt_genero);
        EditText ciudad = (EditText) findViewById(R.id.txt_ciudad);
        EditText sensorial = (EditText) findViewById(R.id.ch_visual);
        EditText sensorial2 = (EditText) findViewById(R.id.ch_auditivo);
        EditText aditamento = (EditText) findViewById(R.id.ch_aditamento);
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
