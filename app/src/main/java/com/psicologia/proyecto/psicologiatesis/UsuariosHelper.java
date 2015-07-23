package com.psicologia.proyecto.psicologiatesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Henry Jaramillo on 22/07/2015.
 */
public class UsuariosHelper extends SQLiteOpenHelper {

    String tabla="CREATE TABLE Usuarios(Nombre text,Apellidos text,Identificacion text,Edad text,Fecha text)";

    public UsuariosHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
