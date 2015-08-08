package com.psicologia.proyecto.psicologiatesis;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Henry Jaramillo on 05/08/2015.
 */
public class ExplicacionVisualActivity extends ActionBarActivity {

    String id;
    String Vfunciones;
    String Vlenguaje;
    String Vatencion;
    String Vmemoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b=this.getIntent().getExtras();

        id=b.getString("Id");
        Vmemoria=b.getString("VMemoria");
        Vfunciones = b.getString("VFunciones");
        Vlenguaje = b.getString("VLenguaje");
        Vatencion = b.getString("VAtencion");

        setContentView(R.layout.explicacion_visual);
        final TextView lb1 = (TextView) findViewById(R.id.lba);
        lb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb1);
            }
        });
        final TextView lb2 = (TextView) findViewById(R.id.lbaa);
        lb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb2);
            }
        });
        final TextView lb3 = (TextView) findViewById(R.id.lbb);
        lb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb3);
            }
        });
        final TextView lb4 = (TextView) findViewById(R.id.lbn);
        lb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb4);
            }
        });
        final TextView lb5 = (TextView) findViewById(R.id.lbw);
        lb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb5);
            }
        });
        final TextView lb6 = (TextView) findViewById(R.id.lbq);
        lb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb6);
            }
        });
        final TextView lb7 = (TextView) findViewById(R.id.lby);
        lb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb7);
            }
        });
        final TextView lb8 = (TextView) findViewById(R.id.lbt);
        lb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb8);
            }
        });
        final TextView lb9 = (TextView) findViewById(R.id.lbd);
        lb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb9);
            }
        });
        final TextView lb10 = (TextView) findViewById(R.id.lbp);
        lb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb10);
            }
        });
        final TextView lb11 = (TextView) findViewById(R.id.lbe);
        lb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb11);
            }
        });
        final TextView lb12 = (TextView) findViewById(R.id.lbee);
        lb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb12);
            }
        });
        final TextView lb13 = (TextView) findViewById(R.id.lbl);
        lb13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb13);
            }
        });
        final TextView lb14 = (TextView) findViewById(R.id.lbx);
        lb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb14);
            }
        });
        final TextView lb15 = (TextView) findViewById(R.id.lbv);
        lb15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb15);
            }
        });
        final TextView lb16 = (TextView) findViewById(R.id.lbi);
        lb16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelOnClick(lb16);
            }
        });

    }


    public void btnSiguienteOnclickE(View v){
        Intent data = new Intent(this, VisualActivity.class);
        data.putExtra("Id", id);
        data.putExtra("VMemoria",Vmemoria);
        data.putExtra("VFunciones", Vfunciones);
        data.putExtra("VLenguaje", Vlenguaje);
        data.putExtra("VAtencion", Vatencion);
        startActivity(data);
    }

    public void labelOnClick(TextView id){
        id.setText("");
    }

    @Override
    public void finish() {
        Intent data = new Intent(this,UsuarioActivity.class);
        startActivity(data);
    }
}
