package com.psicologia.proyecto.psicologiatesis;

import android.content.ContentValues;
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
    Spinner spEstrato,spCurso,spAditamientos,spLateralidad,spEdad,spGenero;
    String[] Curso={"","3","4","5","6","7","8","9","10","11","Ninguno"};
    String[] Aditamientos={"","Oculares","Auditivos","Ninguna"};
    String[] Lateralidad={"","Diestro","Zurdo","Indefinido"};
    String[] Edad={"","5","6","7","8","9","10","11","12","13","14","15","16"};
    String[] Genero={"","Hombre","Mujer"};

    EditText txt_nombres;
    EditText txt_apellidos;
    EditText txt_identificacion;
    EditText txt_fechanac;

    CheckBox ch_atencion;
    String Vatencion="";

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
        txt_nombres =(EditText) findViewById(R.id.txt_nombres);
        txt_apellidos =(EditText) findViewById(R.id.txt_apellidos);
        txt_identificacion=(EditText) findViewById(R.id.txt_identificacion);
        txt_fechanac=(EditText) findViewById(R.id.txt_fechanac);
        ch_atencion=(CheckBox) findViewById(R.id.chb_Atencion);
        ch_atencion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();

                if (isChecked) {
                    Vatencion="1";
                }
                else {
                    Vatencion="0";
                }
            }
        });
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



    public void GuardarDatos(View view){
        String nombre =txt_nombres.getText().toString();
        String apellidos=txt_apellidos.getText().toString();
        String identificacion=txt_identificacion.getText().toString();
        String fecha=txt_fechanac.getText().toString();
        String edad=spEdad.getSelectedItem().toString();
        String estrato=spEstrato.getSelectedItem().toString();
        String curso=spCurso.getSelectedItem().toString();
        String genero=spGenero.getSelectedItem().toString();
        String aditamientos=spAditamientos.getSelectedItem().toString();
        String lateralidad=spLateralidad.getSelectedItem().toString();
        String atencion=Vatencion;
        UsuariosHelper usuariosHelper = new UsuariosHelper(this,"Psicologia1",null,1);
        SQLiteDatabase db = usuariosHelper.getWritableDatabase();
        if(db!=null){
            ContentValues registroNuevos = new ContentValues();
            registroNuevos.put("Nombre",nombre);
            registroNuevos.put("Apellidos",apellidos);
            registroNuevos.put("Identificacion",identificacion);
            registroNuevos.put("Edad",edad);
            registroNuevos.put("Fecha",fecha);
            registroNuevos.put("Estrato",estrato);
            registroNuevos.put("Curso",curso);
            registroNuevos.put("Genero",genero);
            registroNuevos.put("Aditamentos",aditamientos);
            registroNuevos.put("Lateralidad",lateralidad);
            registroNuevos.put("Atencion",atencion);
            long i = db.insert("Usuarios",null,registroNuevos);
            if(i>0){
                Toast.makeText(this,"registro ya porfin",Toast.LENGTH_SHORT).show();
            }
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_usuario, menu);
        return true;
    }

    public void siguienteOnClick(View v){

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
