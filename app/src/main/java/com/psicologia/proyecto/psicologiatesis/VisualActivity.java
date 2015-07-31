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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visual_a);
        final TextView cuatro_uno= (TextView) findViewById(R.id.lb_4_1);
            cuatro_uno.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick(View v) {
                    labelOnClick(cuatro_uno);
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
        if(id.getText().toString().equalsIgnoreCase("lb_7_4")||id.getText().toString().equalsIgnoreCase("lb_4_6")||id.getText().toString().equalsIgnoreCase("lb_5_7")||id.getText().toString().equalsIgnoreCase("lb_4_7")||id.getText().toString().equalsIgnoreCase("lb_8_9")||id.getText().toString().equalsIgnoreCase("lb_2_11")||id.getText().toString().equalsIgnoreCase("lb_5_12")||id.getText().toString().equalsIgnoreCase("lb_5_13")||id.getText().toString().equalsIgnoreCase("lb_2_15")||id.getText().toString().equalsIgnoreCase("lb_6_16")||id.getText().toString().equalsIgnoreCase("lb_7_17")||id.getText().toString().equalsIgnoreCase("lb_6_18")){
            comision++;
        }
        id.setText("");


    }


    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
