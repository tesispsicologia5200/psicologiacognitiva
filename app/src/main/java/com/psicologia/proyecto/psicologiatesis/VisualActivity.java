package com.psicologia.proyecto.psicologiatesis;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Henry Jaramillo on 27/07/2015.
 */
public class VisualActivity extends ActionBarActivity {

    int contadorA = 0;
    TextView validar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visual_a);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public void labelOnClick(String id){
        if(id.equalsIgnoreCase("lb_5_1")||id.equalsIgnoreCase("lb_7_2")||id.equalsIgnoreCase("lb_1_3")||id.equalsIgnoreCase("lb_8_4")||id.equalsIgnoreCase("lb_3_6")||id.equalsIgnoreCase("lb_7_8")||id.equalsIgnoreCase("lb_1_11")||id.equalsIgnoreCase("lb_3_12")||id.equalsIgnoreCase("lb_4_13")||id.equalsIgnoreCase("lb_3_15")||id.equalsIgnoreCase("lb_2_16")||id.equalsIgnoreCase("lb_7_16")||id.equalsIgnoreCase("lb_4_17")||id.equalsIgnoreCase("lb_7_19")||id.equalsIgnoreCase("lb_1_19")||id.equalsIgnoreCase("lb_5_8")){
            contadorA++;
        }
        validar.setText("");
    }

}
