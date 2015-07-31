package com.psicologia.proyecto.psicologiatesis;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Henry Jaramillo on 27/07/2015.
 */
public class VisualActivity extends ActionBarActivity implements DialogInterface.OnClickListener {


    int contadorA = 0;
    int comision=0;
    int error=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visual_a);
        final TextView cuatro_uno= (TextView) findViewById(R.id.lb_4_1);
            cuatro_uno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    labelOnClick(cuatro_uno);
                }
            });
        final TextView uno_uno= (TextView) findViewById(R.id.lb_1_1);
        uno_uno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_uno);
            }
        });
        final TextView uno_dos= (TextView) findViewById(R.id.lb_1_2);
        uno_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(uno_dos);
            }
        });
        final TextView uno_tres= (TextView) findViewById(R.id.lb_1_3);
        uno_tres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_tres);
            }
        });
        final TextView uno_cuatro= (TextView) findViewById(R.id.lb_1_4);
        uno_cuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_cuatro);
            }
        });
        final TextView uno_cinco= (TextView) findViewById(R.id.lb_1_5);
        uno_cinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_cinco);
            }
        });
        final TextView uno_seis= (TextView) findViewById(R.id.lb_1_6);
        uno_seis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_seis);
            }
        });
        final TextView uno_siete= (TextView) findViewById(R.id.lb_1_7);
        uno_siete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_siete);
            }
        });
        final TextView uno_ocho= (TextView) findViewById(R.id.lb_1_8);
        uno_ocho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_ocho);
            }
        });
        final TextView uno_nueve= (TextView) findViewById(R.id.lb_1_9);
        uno_nueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_nueve);
            }
        });
        final TextView uno_diez= (TextView) findViewById(R.id.lb_1_10);
        uno_diez.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_diez);
            }
        });
        final TextView uno_once= (TextView) findViewById(R.id.lb_1_11);
        uno_once.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_once);
            }
        });
        final TextView uno_doce= (TextView) findViewById(R.id.lb_1_12);
        uno_doce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_doce);
            }
        });
        final TextView uno_trece= (TextView) findViewById(R.id.lb_1_13);
        uno_trece.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_trece);
            }
        });
        final TextView uno_catorce= (TextView) findViewById(R.id.lb_1_14);
        uno_catorce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_catorce);
            }
        });
        final TextView uno_quince= (TextView) findViewById(R.id.lb_1_15);
        uno_quince.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_quince);
            }
        });
        final TextView uno_16= (TextView) findViewById(R.id.lb_1_16);
        uno_16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_16);
            }
        });
        final TextView uno_17= (TextView) findViewById(R.id.lb_1_17);
        uno_17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_17);
            }
        });
        final TextView uno_18= (TextView) findViewById(R.id.lb_1_18);
        uno_18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_18);
            }
        });
        final TextView uno_19= (TextView) findViewById(R.id.lb_1_19);
        uno_19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_19);
            }
        });
        final TextView uno_20= (TextView) findViewById(R.id.lb_1_20);
        uno_20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(uno_20);
            }
        });

        final TextView dos_1= (TextView) findViewById(R.id.lb_2_1);
        dos_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(dos_1);
            }
        });
        final TextView dos_2= (TextView) findViewById(R.id.lb_2_2);
        dos_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(dos_2);
            }
        });
        final TextView dos_3= (TextView) findViewById(R.id.lb_2_3);
        dos_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(dos_3);
            }
        });
        final TextView dos_4= (TextView) findViewById(R.id.lb_2_4);
        dos_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                labelOnClick(dos_4);
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

        if(id.getText().toString().equalsIgnoreCase("lb_5_1")||id.getText().toString().equalsIgnoreCase("lb_7_2")||id.getText().toString().equalsIgnoreCase("lb_1_3")||id.getText().toString().equalsIgnoreCase("lb_8_4")||id.getText().toString().equalsIgnoreCase("lb_3_6")||id.getText().toString().equalsIgnoreCase("lb_7_8")||id.getText().toString().equalsIgnoreCase("lb_1_11")||id.getText().toString().equalsIgnoreCase("lb_3_12")||id.getText().toString().equalsIgnoreCase("lb_4_13")||id.getText().toString().equalsIgnoreCase("lb_3_15")||id.getText().toString().equalsIgnoreCase("lb_2_16")||id.getText().toString().equalsIgnoreCase("lb_7_16")||id.getText().toString().equalsIgnoreCase("lb_4_17")||id.getText().toString().equalsIgnoreCase("lb_7_19")||id.getText().toString().equalsIgnoreCase("lb_1_19")||id.getText().toString().equalsIgnoreCase("lb_5_8")){
            contadorA++;
        }
        else if(id.getText().toString().equalsIgnoreCase("lb_7_4")||id.getText().toString().equalsIgnoreCase("lb_4_6")||id.getText().toString().equalsIgnoreCase("lb_5_7")||id.getText().toString().equalsIgnoreCase("lb_4_7")||id.getText().toString().equalsIgnoreCase("lb_8_9")||id.getText().toString().equalsIgnoreCase("lb_2_11")||id.getText().toString().equalsIgnoreCase("lb_5_12")||id.getText().toString().equalsIgnoreCase("lb_5_13")||id.getText().toString().equalsIgnoreCase("lb_2_15")||id.getText().toString().equalsIgnoreCase("lb_6_16")||id.getText().toString().equalsIgnoreCase("lb_7_17")||id.getText().toString().equalsIgnoreCase("lb_6_18")){
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
}
