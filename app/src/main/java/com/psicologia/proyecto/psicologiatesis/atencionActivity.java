package com.psicologia.proyecto.psicologiatesis;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jairo on 23/07/2015.
 */
public class atencionActivity extends ActionBarActivity implements View.OnTouchListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);
        if(b!=null){
            String Vfunciones=b.getString("VFunciones");
            String Vatencion=b.getString("VAtencion");
            if(Vatencion.equals("1")){
                setContentView(R.layout.token_test);
                findViewById(R.id.img_circulogradeazul).setOnTouchListener(this);
                findViewById(R.id.img_circulogranderojo).setOnTouchListener(this);
                findViewById(R.id.img_circulograndeamarillo).setOnTouchListener(this);
                findViewById(R.id.img_circulograndeblanco).setOnTouchListener(this);
                findViewById(R.id.img_circulograndeverde).setOnTouchListener(this);
                findViewById(R.id.img_circulopequenioblanco).setOnTouchListener(this);
                findViewById(R.id.img_circulopequenioazul).setOnTouchListener(this);
                findViewById(R.id.img_circulopequenioamarillo).setOnTouchListener(this);
                findViewById(R.id.img_circulopequeniorojo).setOnTouchListener(this);
                findViewById(R.id.img_circulopequenioverde).setOnTouchListener(this);
                findViewById(R.id.img_cuadradograndeazul).setOnTouchListener(this);
                findViewById(R.id.img_cuadradogranderojo).setOnTouchListener(this);
                findViewById(R.id.img_cuadradograndeblanco).setOnTouchListener(this);
                findViewById(R.id.img_cuadradograndeverde).setOnTouchListener(this);
                findViewById(R.id.img_cuadradograndeamarillo).setOnTouchListener(this);
                findViewById(R.id.img_cuadradopequenioamarillo).setOnTouchListener(this);
                findViewById(R.id.img_cuadradopequenioverde).setOnTouchListener(this);
                findViewById(R.id.img_cuadradopequeniorojo).setOnTouchListener(this);
                findViewById(R.id.img_cuadradopequenioazul).setOnTouchListener(this);
                findViewById(R.id.img_cuadradopequenioblanco).setOnTouchListener(this);
                View circulograndeazul = findViewById(R.id.img_circulogradeazul);
                View circulogranderojo = findViewById(R.id.img_circulogranderojo);
                View circulograndeamarillo = findViewById(R.id.img_circulograndeamarillo);
                View circulograndeblanco = findViewById(R.id.img_circulograndeblanco);
                View circulograndeverde = findViewById(R.id.img_circulograndeverde);
                View circulopequenioblanco = findViewById(R.id.img_circulopequenioblanco);
                View circulopequenioazul = findViewById(R.id.img_circulopequenioazul);
                View circulopequenioamarillo = findViewById(R.id.img_circulopequenioamarillo);
                View circulopequeniorojo = findViewById(R.id.img_circulopequeniorojo);
                View circulopequenioverde = findViewById(R.id.img_circulopequenioverde);
                View cuadradograndeazul = findViewById(R.id.img_cuadradograndeazul);
                View cuadradogranderojo = findViewById(R.id.img_cuadradogranderojo);
                View cuadradograndeblanco = findViewById(R.id.img_cuadradograndeblanco);
                View cuadradograndeverde = findViewById(R.id.img_cuadradograndeverde);
                View cuadradograndeamarillo = findViewById(R.id.img_cuadradograndeamarillo);
                View cuadradopequenioamarillo = findViewById(R.id.img_cuadradopequenioamarillo);
                View cuadradopequenioverde = findViewById(R.id.img_cuadradopequenioverde);
                View cuadradopequeniorojo = findViewById(R.id.img_cuadradopequeniorojo);
                View cuadradopequenioazul = findViewById(R.id.img_cuadradopequenioazul);
                View cuadradopequenioblanco = findViewById(R.id.img_cuadradopequenioblanco);
                circulograndeamarillo.setOnDragListener(new MiDrag());
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouch(View objeto, MotionEvent evento) {
        boolean e;
        e= false;
        if(evento.getAction() == MotionEvent.ACTION_DOWN){
            ClipData datos = ClipData.newPlainText("","");
            View.DragShadowBuilder objeto_sombra = new View.DragShadowBuilder(objeto);
            objeto.startDrag(datos, objeto_sombra, objeto, 0);
            objeto.setVisibility(View.INVISIBLE);
            e=true;
        }
        return e;
    }
}



