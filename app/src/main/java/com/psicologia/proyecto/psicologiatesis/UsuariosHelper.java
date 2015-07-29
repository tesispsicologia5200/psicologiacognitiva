package com.psicologia.proyecto.psicologiatesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Henry Jaramillo on 22/07/2015.
 */
public class UsuariosHelper extends SQLiteOpenHelper {

    String tabla="CREATE TABLE Usuarios(Nombre text,Apellidos text,Identificacion text,Edad text,Fecha text,Estrato text,Curso text,Genero text,Aditamentos text,Lateralidad text,Atencion text,Memoria text,Auditivo text,Lenguaje text)";

    String tabla2="CREATE TABLE MemoriaUno(Id text,Elefante text,Conejo text,Pato text,Mariposa text,Sarten text,Estufa text,Tenedor text,Jarra text,Guante text,Zapato text,Sombrero text,Panuelo text,Banano text,Uvas text,Fresa text,Pinia text,Primera_recordada text,Ultima_recordada text,Intrucion INTEGER,Perseveracion INTEGER)";


    public UsuariosHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);
        db.execSQL(tabla2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
