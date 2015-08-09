package com.psicologia.proyecto.psicologiatesis;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by jairo on 08/08/2015.
 */
public class ResultadosTokenTestActivity extends ActionBarActivity {

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }
    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;

    EditText txt_nivel;
    EditText txt_aciertos;
    EditText txt_puntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if (b != null) {
            id = b.getString("Id");
            Vmemoria = b.getString("VMemoria");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");
            setContentView(R.layout.datos_token_test);
            txt_nivel =(EditText) findViewById(R.id.nivel_alcance);
            txt_aciertos =(EditText) findViewById(R.id.frases_acertadas);
            txt_puntaje=(EditText) findViewById(R.id.puntaje);
        }
    }


    public void btnSiguienteOnClickTT(View v) {
        String nive =txt_nivel.getText().toString();
        String aciert=txt_aciertos.getText().toString();
        String punt=txt_puntaje.getText().toString();
        int nivel=Integer.parseInt(nive);
        int aciertos=Integer.parseInt(aciert);
        int puntaje=Integer.parseInt(punt);
        UsuariosHelper usuariosHelper = new UsuariosHelper(this, "Psicologia22", null, 1);
        SQLiteDatabase db = usuariosHelper.getWritableDatabase();
        if (db != null) {
            ContentValues registroNuevos = new ContentValues();
            registroNuevos.put("Id", id);
            registroNuevos.put("Nivel", nivel);
            registroNuevos.put("Aciertos", aciertos);
            registroNuevos.put("Puntaje", puntaje);
            long i = db.insert("TokenTest", null, registroNuevos);
            if (i > 0) {
                Toast.makeText(this, "resultados Token test registrados", Toast.LENGTH_SHORT).show();
                Intent data = new Intent(this, memoriaResultadoActivity3.class);
                data.putExtra("Id",id);
                data.putExtra("VMemoria",Vmemoria);
                data.putExtra("VFunciones",Vfunciones);
                data.putExtra("VLenguaje",Vlenguaje);
                data.putExtra("VAtencion",Vatencion);
                startActivity(data);
            }
        }

    }

}
