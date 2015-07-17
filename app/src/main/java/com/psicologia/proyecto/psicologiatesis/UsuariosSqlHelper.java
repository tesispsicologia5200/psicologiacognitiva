package com.psicologia.proyecto.psicologiatesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jairo on 17/07/2015.
 */
public class UsuariosSqlHelper extends SQLiteOpenHelper {

    String tabla="CREATE TABLE Usuarios(Id INTEGER PRYMARY KEY AUTOINCREMENT,Nombres TEXT,Apellidos TEXT,Identificacion TEXT,Edad TEXT,Fecha_nac TEXT,Estrato TEXT,Curso TEXT,Aditamento TEXT," +
            "Lateralidad TEXT,Memoria TEXT,Atencion TEXT,Auditivos TEXT,Lenguaje TEXT)";

    public UsuariosSqlHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE Usuarios");
        db.execSQL(tabla);
    }
}
