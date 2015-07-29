package com.psicologia.proyecto.psicologiatesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jairo on 28/07/2015.
 */
public class Memoria1Helper extends SQLiteOpenHelper {

    String tabla="CREATE TABLE MemoriaUno(Id text,Elefante text,Conejo text,Pato text,Mariposa text,Sarten text,Estufa text,Tenedor text,Jarra text,Guante text,Zapato text,Sombrero text,Panuelo text,Banano text,Uvas text,Fresa text,Pinia text,Primera_recordada text,Ultima_recordada text,Intrucion INTEGER,Perseveracion INTEGER)";

    public Memoria1Helper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
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
