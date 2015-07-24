package com.psicologia.proyecto.psicologiatesis;

import android.content.ClipData;
import android.content.Intent;
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
                View circulograndeazul = findViewById(R.id.img_circulogradeazul);
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
        if(evento.getAction() == MotionEvent.ACTION_DOWN){
            ClipData datos = ClipData.newPlainText("","");;
            View.DragShadowBuilder objeto_sombra = new View.DragShadowBuilder(objeto);
            objeto.startDrag(datos, objeto_sombra, objeto, 0);
            objeto.setVisibility(View.INVISIBLE);
            return true;
        }
        else{
            return false;
        }
    }
}
