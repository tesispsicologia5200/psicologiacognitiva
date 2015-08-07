package com.psicologia.proyecto.psicologiatesis;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Henry Jaramillo on 06/08/2015.
 */
public class EstadisticaActivity extends ActionBarActivity {

    String id="10";
    String nombre;
    String apellido;
    String identificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estadistica);
    }

    public void buscarOnClick(){

        UsuariosHelper usuariosHelper = new UsuariosHelper(this, "Psicologia21", null, 1);
        SQLiteDatabase db = usuariosHelper.getReadableDatabase();
        if(db!=null){
            Cursor c = db.rawQuery("SELECT Nombre, Apellidos, Identificacion FROM Usuarios where Identificacion='"+id+"'",null);
            if(c.moveToFirst()){
                nombre=c.getString(0);
                apellido=c.getString(1);
                identificacion=c.getString(2);
            }

        }
    }
}
