package com.psicologia.proyecto.psicologiatesis;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


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
        EditText identificacion = (EditText) findViewById(R.id.txt_identificacion);
        EditText fechaNac = (EditText) findViewById(R.id.txt_FechaNac);
        Spinner edad = (Spinner) findViewById(R.id.sp_Edad);
        Spinner curso = (Spinner) findViewById(R.id.sp_curso);
        Spinner lateralidad = (Spinner) findViewById(R.id.sp_Lateralidad);
        Spinner genero = (Spinner) findViewById(R.id.sp_Genero);
        Spinner estrato = (Spinner) findViewById(R.id.sp_Estrato);
        Spinner aditamento = (Spinner) findViewById(R.id.sp_Aditamientos);
        CheckBox memoria = (CheckBox) findViewById(R.id.chb_Memoria);
        CheckBox atencion = (CheckBox) findViewById(R.id.chb_Atencion);
        CheckBox auditivos = (CheckBox) findViewById(R.id.chb_Auditivo);
        CheckBox lenguaje = (CheckBox) findViewById(R.id.chb_Lenguage);
        UsuariosSqlHelper usdb = new UsuariosSqlHelper(this,"dbpsicologia",null,1);
        SQLiteDatabase db = usdb.getWritableDatabase();
        try{
            String ins ="INSERT INTO Usuarios(Nombres,Apellidos,Identificacion,Edad,Genero,Fecha_nac,Estrato,Curso,Aditamiento,Lateralidad,Memoria,Atencion,Auditivos,Lenguaje,) values ('"
                    + nombres.getText().toString() +"','"+ apellidos.getText().toString() +"','"+ identificacion.getText().toString() +"','"+ edad.getSelectedItem().toString() +"','"+ genero.getSelectedItem().toString() +"','"+fechaNac.getText().toString() +"','"
                    + estrato.getSelectedItem().toString() +"','"+ curso.getSelectedItem().toString() +"','"+ aditamento.getSelectedItem().toString() +"','"+ lateralidad.getSelectedItem().toString() +"','"+ memoria.getText().toString() +"','"+ atencion.getText().toString() +"','"
                    + auditivos.getText().toString() +"','"+ lenguaje.getText().toString() +"')";
            Toast.makeText(this, ins, Toast.LENGTH_LONG).show();
        }
        catch (Exception e){
            Toast.makeText(this, "Error:" + e.getMessage(), Toast.LENGTH_LONG).show();
        }
        finally {
            db.close();
        }
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
