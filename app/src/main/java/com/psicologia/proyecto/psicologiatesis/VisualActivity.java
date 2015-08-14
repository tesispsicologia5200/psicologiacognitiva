package com.psicologia.proyecto.psicologiatesis;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

/**
 * Created by Henry Jaramillo on 27/07/2015.
 */
public class VisualActivity extends ActionBarActivity implements DialogInterface.OnClickListener {

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }

    int contadorA = 0;
    int comision=0;
    int error=0;
    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;
    String tiempo;
    int bandera=0;

    final CounterClass timer = new CounterClass(180000, 1000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b=this.getIntent().getExtras();
        id=b.getString("Id");
        Vmemoria=b.getString("VMemoria");
        Vfunciones = b.getString("VFunciones");
        Vlenguaje = b.getString("VLenguaje");
        Vatencion = b.getString("VAtencion");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.visual_a);
        timer.start();

        final TextView cuatro_uno = (TextView) findViewById(R.id.lb_4_1);
        cuatro_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_uno);
            }
        });
        final TextView uno_uno = (TextView) findViewById(R.id.lb_1_1);
        uno_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_uno);
            }
        });
        final TextView uno_dos = (TextView) findViewById(R.id.lb_1_2);
        uno_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_dos);
            }
        });
        final TextView uno_tres = (TextView) findViewById(R.id.lb_1_3);
        uno_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_tres);
            }
        });
        final TextView uno_cuatro = (TextView) findViewById(R.id.lb_1_4);
        uno_cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_cuatro);
            }
        });
        final TextView uno_cinco = (TextView) findViewById(R.id.lb_1_5);
        uno_cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_cinco);
            }
        });
        final TextView uno_seis = (TextView) findViewById(R.id.lb_1_6);
        uno_seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_seis);
            }
        });
        final TextView uno_siete = (TextView) findViewById(R.id.lb_1_7);
        uno_siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_siete);
            }
        });
        final TextView uno_ocho = (TextView) findViewById(R.id.lb_1_8);
        uno_ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_ocho);
            }
        });
        final TextView uno_nueve = (TextView) findViewById(R.id.lb_1_9);
        uno_nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_nueve);
            }
        });
        final TextView uno_diez = (TextView) findViewById(R.id.lb_1_10);
        uno_diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_diez);
            }
        });
        final TextView uno_once = (TextView) findViewById(R.id.lb_1_11);
        uno_once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_once);
            }
        });
        final TextView uno_doce = (TextView) findViewById(R.id.lb_1_12);
        uno_doce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_doce);
            }
        });
        final TextView uno_trece = (TextView) findViewById(R.id.lb_1_13);
        uno_trece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_trece);
            }
        });
        final TextView uno_catorce = (TextView) findViewById(R.id.lb_1_14);
        uno_catorce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_catorce);
            }
        });
        final TextView uno_quince = (TextView) findViewById(R.id.lb_1_15);
        uno_quince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_quince);
            }
        });
        final TextView uno_16 = (TextView) findViewById(R.id.lb_1_16);
        uno_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_16);
            }
        });
        final TextView uno_17 = (TextView) findViewById(R.id.lb_1_17);
        uno_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_17);
            }
        });
        final TextView uno_18 = (TextView) findViewById(R.id.lb_1_18);
        uno_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_18);
            }
        });
        final TextView uno_19 = (TextView) findViewById(R.id.lb_1_19);
        uno_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_19);
            }
        });
        final TextView uno_20 = (TextView) findViewById(R.id.lb_1_20);
        uno_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_20);
            }
        });
        final TextView dos_1 = (TextView) findViewById(R.id.lb_2_1);
        dos_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_1);
            }
        });
        final TextView dos_2 = (TextView) findViewById(R.id.lb_2_2);
        dos_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_2);
            }
        });
        final TextView dos_3 = (TextView) findViewById(R.id.lb_2_3);
        dos_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_3);
            }
        });
        final TextView dos_4 = (TextView) findViewById(R.id.lb_2_4);
        dos_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_4);
            }
        });
        final TextView dos_5 = (TextView) findViewById(R.id.lb_2_5);
        dos_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_5);
            }
        });
        final TextView dos_6 = (TextView) findViewById(R.id.lb_2_6);
        dos_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_6);
            }
        });
        final TextView dos_7 = (TextView) findViewById(R.id.lb_2_7);
        dos_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_7);
            }
        });
        final TextView dos_8 = (TextView) findViewById(R.id.lb_2_8);
        dos_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_8);
            }
        });
        final TextView dos_9 = (TextView) findViewById(R.id.lb_2_9);
        dos_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_9);
            }
        });
        final TextView dos_10 = (TextView) findViewById(R.id.lb_2_10);
        dos_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_10);
            }
        });
        final TextView dos_11 = (TextView) findViewById(R.id.lb_2_11);
        dos_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_11);
            }
        });
        final TextView dos_12 = (TextView) findViewById(R.id.lb_2_12);
        dos_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_12);
            }
        });
        final TextView dos_13 = (TextView) findViewById(R.id.lb_2_13);
        dos_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_13);
            }
        });
        final TextView dos_14 = (TextView) findViewById(R.id.lb_2_14);
        dos_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_14);
            }
        });
        final TextView dos_15 = (TextView) findViewById(R.id.lb_2_15);
        dos_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_15);
            }
        });
        final TextView dos_16 = (TextView) findViewById(R.id.lb_2_16);
        dos_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_16);
            }
        });
        final TextView dos_17 = (TextView) findViewById(R.id.lb_2_17);
        dos_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_17);
            }
        });
        final TextView dos_18 = (TextView) findViewById(R.id.lb_2_18);
        dos_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_18);
            }
        });
        final TextView dos_19 = (TextView) findViewById(R.id.lb_2_19);
        dos_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_19);
            }
        });
        final TextView dos_20 = (TextView) findViewById(R.id.lb_2_20);
        dos_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(dos_20);
            }
        });
        final TextView tres_1 = (TextView) findViewById(R.id.lb_3_1);
        tres_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_1);
            }
        });
        final TextView tres_2 = (TextView) findViewById(R.id.lb_3_2);
        tres_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_2);
            }
        });
        final TextView tres_3 = (TextView) findViewById(R.id.lb_3_3);
        tres_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_3);
            }
        });
        final TextView tres_4 = (TextView) findViewById(R.id.lb_3_4);
        tres_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_4);
            }
        });
        final TextView tres_5 = (TextView) findViewById(R.id.lb_3_5);
        tres_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_5);
            }
        });
        final TextView tres_6 = (TextView) findViewById(R.id.lb_3_6);
        tres_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_6);
            }
        });
        final TextView tres_7 = (TextView) findViewById(R.id.lb_3_7);
        tres_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_7);
            }
        });
        final TextView tres_8 = (TextView) findViewById(R.id.lb_3_8);
        tres_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_8);
            }
        });
        final TextView tres_9 = (TextView) findViewById(R.id.lb_3_9);
        tres_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_9);
            }
        });
        final TextView tres_10 = (TextView) findViewById(R.id.lb_3_10);
        tres_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_10);
            }
        });
        final TextView tres_11 = (TextView) findViewById(R.id.lb_3_11);
        tres_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_11);
            }
        });
        final TextView tres_12 = (TextView) findViewById(R.id.lb_3_12);
        tres_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_12);
            }
        });
        final TextView tres_13 = (TextView) findViewById(R.id.lb_3_13);
        tres_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_13);
            }
        });
        final TextView tres_14 = (TextView) findViewById(R.id.lb_3_14);
        tres_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_14);
            }
        });
        final TextView tres_15 = (TextView) findViewById(R.id.lb_3_15);
        tres_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_15);
            }
        });
        final TextView tres_16 = (TextView) findViewById(R.id.lb_3_16);
        tres_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_16);
            }
        });
        final TextView tres_17 = (TextView) findViewById(R.id.lb_3_17);
        tres_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_17);
            }
        });
        final TextView tres_18 = (TextView) findViewById(R.id.lb_3_18);
        tres_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_18);
            }
        });
        final TextView tres_19 = (TextView) findViewById(R.id.lb_3_19);
        tres_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_19);
            }
        });
        final TextView tres_20 = (TextView) findViewById(R.id.lb_3_20);
        tres_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(tres_20);
            }
        });
        final TextView cuatro_1 = (TextView) findViewById(R.id.lb_4_1);
        cuatro_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_1);
            }
        });
        final TextView cuatro_2 = (TextView) findViewById(R.id.lb_4_2);
        cuatro_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_2);
            }
        });
        final TextView cuatro_3 = (TextView) findViewById(R.id.lb_4_3);
        cuatro_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_3);
            }
        });
        final TextView cuatro_4 = (TextView) findViewById(R.id.lb_4_4);
        cuatro_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_4);
            }
        });
        final TextView cuatro_5 = (TextView) findViewById(R.id.lb_4_5);
        cuatro_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_5);
            }
        });
        final TextView cuatro_6 = (TextView) findViewById(R.id.lb_4_6);
        cuatro_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_6);
            }
        });
        final TextView cuatro_7 = (TextView) findViewById(R.id.lb_4_7);
        cuatro_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_7);
            }
        });
        final TextView cuatro_8 = (TextView) findViewById(R.id.lb_4_8);
        cuatro_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_8);
            }
        });
        final TextView cuatro_9 = (TextView) findViewById(R.id.lb_4_9);
        cuatro_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_9);
            }
        });
        final TextView cuatro_10 = (TextView) findViewById(R.id.lb_4_10);
        cuatro_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_10);
            }
        });
        final TextView cuatro_11 = (TextView) findViewById(R.id.lb_4_11);
        cuatro_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_11);
            }
        });
        final TextView cuatro_12 = (TextView) findViewById(R.id.lb_4_12);
        cuatro_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_12);
            }
        });
        final TextView cuatro_13 = (TextView) findViewById(R.id.lb_4_13);
        cuatro_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_13);
            }
        });
        final TextView cuatro_14 = (TextView) findViewById(R.id.lb_4_14);
        cuatro_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_14);
            }
        });
        final TextView cuatro_15 = (TextView) findViewById(R.id.lb_4_15);
        cuatro_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_15);
            }
        });
        final TextView cuatro_16 = (TextView) findViewById(R.id.lb_4_16);
        cuatro_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_16);
            }
        });
        final TextView cuatro_17 = (TextView) findViewById(R.id.lb_4_17);
        cuatro_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_17);
            }
        });
        final TextView cuatro_18 = (TextView) findViewById(R.id.lb_4_18);
        cuatro_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_18);
            }
        });
        final TextView cuatro_19 = (TextView) findViewById(R.id.lb_4_19);
        cuatro_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_19);
            }
        });
        final TextView cuatro_20 = (TextView) findViewById(R.id.lb_4_20);
        cuatro_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cuatro_20);
            }
        });
        final TextView cinco_1 = (TextView) findViewById(R.id.lb_5_1);
        cinco_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_1);
            }
        });
        final TextView cinco_2 = (TextView) findViewById(R.id.lb_5_2);
        cinco_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_2);
            }
        });
        final TextView cinco_3 = (TextView) findViewById(R.id.lb_5_3);
        cinco_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_3);
            }
        });
        final TextView cinco_4 = (TextView) findViewById(R.id.lb_5_4);
        cinco_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_4);
            }
        });
        final TextView cinco_5 = (TextView) findViewById(R.id.lb_5_5);
        cinco_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_5);
            }
        });
        final TextView cinco_6 = (TextView) findViewById(R.id.lb_5_6);
        cinco_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_6);
            }
        });
        final TextView cinco_7 = (TextView) findViewById(R.id.lb_5_7);
        cinco_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_7);
            }
        });
        final TextView cinco_8 = (TextView) findViewById(R.id.lb_5_8);
        cinco_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_8);
            }
        });
        final TextView cinco_9 = (TextView) findViewById(R.id.lb_5_9);
        cinco_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_9);
            }
        });
        final TextView cinco_10 = (TextView) findViewById(R.id.lb_5_10);
        cinco_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_10);
            }
        });
        final TextView cinco_11 = (TextView) findViewById(R.id.lb_5_11);
        cinco_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_11);
            }
        });
        final TextView cinco_12 = (TextView) findViewById(R.id.lb_5_12);
        cinco_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_12);
            }
        });
        final TextView cinco_13 = (TextView) findViewById(R.id.lb_5_13);
        cinco_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_13);
            }
        });
        final TextView cinco_14 = (TextView) findViewById(R.id.lb_5_14);
        cinco_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_14);
            }
        });
        final TextView cinco_15 = (TextView) findViewById(R.id.lb_5_15);
        cinco_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_15);
            }
        });
        final TextView cinco_16 = (TextView) findViewById(R.id.lb_5_16);
        cinco_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_16);
            }
        });
        final TextView cinco_17 = (TextView) findViewById(R.id.lb_5_17);
        cinco_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_17);
            }
        });
        final TextView cinco_18 = (TextView) findViewById(R.id.lb_5_18);
        cinco_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_18);
            }
        });
        final TextView cinco_19 = (TextView) findViewById(R.id.lb_5_19);
        cinco_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_19);
            }
        });
        final TextView cinco_20 = (TextView) findViewById(R.id.lb_5_20);
        cinco_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(cinco_20);
            }
        });
        final TextView seis_1 = (TextView) findViewById(R.id.lb_6_1);
        seis_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_1);
            }
        });
        final TextView seis_2 = (TextView) findViewById(R.id.lb_6_2);
        seis_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_2);
            }
        });
        final TextView seis_3 = (TextView) findViewById(R.id.lb_6_3);
        seis_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_3);
            }
        });
        final TextView seis_4 = (TextView) findViewById(R.id.lb_6_4);
        seis_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_4);
            }
        });
        final TextView seis_5 = (TextView) findViewById(R.id.lb_6_5);
        seis_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_5);
            }
        });
        final TextView seis_6 = (TextView) findViewById(R.id.lb_6_6);
        seis_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_6);
            }
        });
        final TextView seis_7 = (TextView) findViewById(R.id.lb_6_7);
        seis_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_7);
            }
        });
        final TextView seis_8 = (TextView) findViewById(R.id.lb_6_8);
        seis_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_8);
            }
        });
        final TextView seis_9 = (TextView) findViewById(R.id.lb_6_9);
        seis_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_9);
            }
        });
        final TextView seis_10 = (TextView) findViewById(R.id.lb_6_10);
        seis_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_10);
            }
        });
        final TextView seis_11 = (TextView) findViewById(R.id.lb_6_11);
        seis_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_11);
            }
        });
        final TextView seis_12 = (TextView) findViewById(R.id.lb_6_12);
        seis_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_12);
            }
        });
        final TextView seis_13 = (TextView) findViewById(R.id.lb_6_13);
        seis_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_13);
            }
        });
        final TextView seis_14 = (TextView) findViewById(R.id.lb_6_14);
        seis_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_14);
            }
        });
        final TextView seis_15 = (TextView) findViewById(R.id.lb_6_15);
        seis_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_15);
            }
        });
        final TextView seis_16 = (TextView) findViewById(R.id.lb_6_16);
        seis_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_16);
            }
        });
        final TextView seis_17 = (TextView) findViewById(R.id.lb_6_17);
        seis_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_17);
            }
        });
        final TextView seis_18 = (TextView) findViewById(R.id.lb_6_18);
        seis_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_18);
            }
        });
        final TextView seis_19 = (TextView) findViewById(R.id.lb_6_19);
        seis_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_19);
            }
        });
        final TextView seis_20 = (TextView) findViewById(R.id.lb_6_20);
        seis_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(seis_20);
            }
        });
        final TextView siete_1 = (TextView) findViewById(R.id.lb_7_1);
        siete_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_1);
            }
        });
        final TextView siete_2 = (TextView) findViewById(R.id.lb_7_2);
        siete_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_2);
            }
        });
        final TextView siete_3 = (TextView) findViewById(R.id.lb_7_3);
        siete_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_3);
            }
        });
        final TextView siete_4 = (TextView) findViewById(R.id.lb_7_4);
        siete_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_4);
            }
        });
        final TextView siete_5 = (TextView) findViewById(R.id.lb_7_5);
        siete_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_5);
            }
        });
        final TextView siete_6 = (TextView) findViewById(R.id.lb_7_6);
        siete_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_6);
            }
        });
        final TextView siete_7 = (TextView) findViewById(R.id.lb_7_7);
        siete_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_7);
            }
        });
        final TextView siete_8 = (TextView) findViewById(R.id.lb_7_8);
        siete_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_8);
            }
        });
        final TextView siete_9 = (TextView) findViewById(R.id.lb_7_9);
        siete_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_9);
            }
        });
        final TextView siete_10 = (TextView) findViewById(R.id.lb_7_10);
        siete_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_10);
            }
        });
        final TextView siete_11 = (TextView) findViewById(R.id.lb_7_11);
        siete_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_11);
            }
        });
        final TextView siete_12 = (TextView) findViewById(R.id.lb_7_12);
        siete_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_12);
            }
        });
        final TextView siete_13 = (TextView) findViewById(R.id.lb_7_13);
        siete_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_13);
            }
        });
        final TextView siete_14 = (TextView) findViewById(R.id.lb_7_14);
        siete_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_14);
            }
        });
        final TextView siete_15 = (TextView) findViewById(R.id.lb_7_15);
        siete_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_15);
            }
        });
        final TextView siete_16 = (TextView) findViewById(R.id.lb_7_16);
        siete_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_16);
            }
        });
        final TextView siete_17 = (TextView) findViewById(R.id.lb_7_17);
        siete_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_17);
            }
        });
        final TextView siete_18 = (TextView) findViewById(R.id.lb_7_18);
        siete_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_18);
            }
        });
        final TextView siete_19 = (TextView) findViewById(R.id.lb_7_19);
        siete_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_19);
            }
        });
        final TextView siete_20 = (TextView) findViewById(R.id.lb_7_20);
        siete_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(siete_20);
            }
        });
        final TextView ocho_1 = (TextView) findViewById(R.id.lb_8_1);
        ocho_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_1);
            }
        });
        final TextView ocho_2 = (TextView) findViewById(R.id.lb_8_2);
        ocho_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_2);
            }
        });
        final TextView ocho_3 = (TextView) findViewById(R.id.lb_8_3);
        ocho_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_3);
            }
        });
        final TextView ocho_4 = (TextView) findViewById(R.id.lb_8_4);
        ocho_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_4);
            }
        });
        final TextView ocho_5 = (TextView) findViewById(R.id.lb_8_5);
        ocho_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_5);
            }
        });
        final TextView ocho_6 = (TextView) findViewById(R.id.lb_8_6);
        ocho_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_6);
            }
        });
        final TextView ocho_7 = (TextView) findViewById(R.id.lb_8_7);
        ocho_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_7);
            }
        });
        final TextView ocho_8 = (TextView) findViewById(R.id.lb_8_8);
        ocho_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_8);
            }
        });
        final TextView ocho_9 = (TextView) findViewById(R.id.lb_8_9);
        ocho_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_9);
            }
        });
        final TextView ocho_10 = (TextView) findViewById(R.id.lb_8_10);
        ocho_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_10);
            }
        });
        final TextView ocho_11 = (TextView) findViewById(R.id.lb_8_11);
        ocho_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_11);
            }
        });
        final TextView ocho_12 = (TextView) findViewById(R.id.lb_8_12);
        ocho_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_12);
            }
        });
        final TextView ocho_13 = (TextView) findViewById(R.id.lb_8_13);
        ocho_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_13);
            }
        });
        final TextView ocho_14 = (TextView) findViewById(R.id.lb_8_14);
        ocho_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_14);
            }
        });
        final TextView ocho_15 = (TextView) findViewById(R.id.lb_8_15);
        ocho_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_15);
            }
        });
        final TextView ocho_16 = (TextView) findViewById(R.id.lb_8_16);
        ocho_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_16);
            }
        });
        final TextView ocho_17 = (TextView) findViewById(R.id.lb_8_17);
        ocho_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_17);
            }
        });
        final TextView ocho_18 = (TextView) findViewById(R.id.lb_8_18);
        ocho_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_18);
            }
        });
        final TextView ocho_19 = (TextView) findViewById(R.id.lb_8_19);
        ocho_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_19);
            }
        });
        final TextView ocho_20 = (TextView) findViewById(R.id.lb_8_20);
        ocho_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(ocho_20);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }


    public void labelOnClick(TextView id){

        if(id.getText().toString().equalsIgnoreCase("a")) {
            contadorA++;
        }
        else if(id.getText().toString().equalsIgnoreCase("r")||id.getText().toString().equalsIgnoreCase("h")){
            comision++;
        }
        else{
            error++;
        }
        id.setText("");


    }


    @Override
    public void onClick(DialogInterface dialog, int which) {

    }


    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
        }


        @Override
        public void onTick(long millisUntilFinished) {
            // TODO Auto-generated method stub

            if(contadorA==16 && bandera==0)
            {
                bandera=1;
                enviarDatos();
            }
            long millis = millisUntilFinished;
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            System.out.println(hms);
            tiempo=hms;

        }




        @Override
        public void onFinish() {
            if(bandera == 0){
                enviarDatos();
            }

        }



    }

    public void imagenOnClick(View v){
        enviarDatos();
        bandera=1;
    }


    public void enviarDatos(){
        UsuariosHelper memoria1Helper= new UsuariosHelper(this,"Psicologia22",null,1);
        SQLiteDatabase db = memoria1Helper.getWritableDatabase();
        if (db != null) {
            ContentValues registroNuevos = new ContentValues();
            registroNuevos.put("Id",id);
            registroNuevos.put("Contador_a",contadorA);
            registroNuevos.put("Contador_omision",comision);
            registroNuevos.put("Errores",error);
            registroNuevos.put("Tiempo",tiempo);
            long i = db.insert("LenguajeVisual", null, registroNuevos);
            if (i > 0) {
                Toast.makeText(this, "prueba de lenguaje visual resgistrada", Toast.LENGTH_SHORT).show();
                Intent data = new Intent(this, PresentacionTokenActivity.class);
                data.putExtra("Id", id);
                data.putExtra("VMemoria",Vmemoria);
                data.putExtra("VFunciones", Vfunciones);
                data.putExtra("VLenguaje", Vlenguaje);
                data.putExtra("VAtencion", Vatencion);
                startActivity(data);
            }
        }
    }
}
