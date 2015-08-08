package com.psicologia.proyecto.psicologiatesis;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by jairo on 23/07/2015.
 */
public class atencionGrandeActivity extends ActionBarActivity implements View.OnTouchListener {

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


    public void btnSiguienteOnclickFG(View v) {
        Intent data = new Intent(this,memoriaResultadoActivity3.class);
        data.putExtra("Id", id);
        data.putExtra("VMemoria",Vmemoria);
        data.putExtra("VFunciones", Vfunciones);
        data.putExtra("VLenguaje", Vlenguaje);
        data.putExtra("VAtencion", Vatencion);
        startActivity(data);
    }

    public void btnCambiarBotones(View v){
        Intent data = new Intent(this,atencionActivity.class);
        data.putExtra("Id", id);
        data.putExtra("VMemoria",Vmemoria);
        data.putExtra("VFunciones", Vfunciones);
        data.putExtra("VLenguaje", Vlenguaje);
        data.putExtra("VAtencion", Vatencion);
        startActivity(data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        Bundle b=this.getIntent().getExtras();
        super.onCreate(savedInstanceState);

        if(b!=null){
            id=b.getString("Id");
            Vmemoria=b.getString("VMemoria");
            Vfunciones = b.getString("VFunciones");
            Vlenguaje = b.getString("VLenguaje");
            Vatencion = b.getString("VAtencion");
            if(Vatencion.equals("1")){
                setContentView(R.layout.token_test_grandes);
                findViewById(R.id.img_circulogradeazul).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_circulogranderojo).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_circulograndeamarillo).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_circulograndeblanco).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_circulograndeverde).setOnTouchListener(new imgTouchListener());

                findViewById(R.id.img_cuadradograndeazul).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_cuadradogranderojo).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_cuadradograndeblanco).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_cuadradograndeverde).setOnTouchListener(new imgTouchListener());
                findViewById(R.id.img_cuadradograndeamarillo).setOnTouchListener(new imgTouchListener());

                findViewById(R.id.img_circulogradeazul).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_circulogranderojo).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_circulograndeamarillo).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_circulograndeblanco).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_circulograndeverde).setOnDragListener(new ContainerDragListener());

                findViewById(R.id.img_cuadradograndeazul).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_cuadradogranderojo).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_cuadradograndeblanco).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_cuadradograndeverde).setOnDragListener(new ContainerDragListener());
                findViewById(R.id.img_cuadradograndeamarillo).setOnDragListener(new ContainerDragListener());

                findViewById(R.id.imagenFondo).setOnDragListener(new ContainerDragListener());
            }
            else{
                Intent data = new Intent(this,memoriaResultadoActivity3.class);
                data.putExtra("Id", id);
                data.putExtra("VMemoria",Vmemoria);
                data.putExtra("VFunciones", Vfunciones);
                data.putExtra("VLenguaje", Vlenguaje);
                data.putExtra("VAtencion", Vatencion);
                startActivity(data);
            }
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    private final class imgTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {

    	/*ACTION_DOWN -> A pressed gesture has started, the motion contains the initial position*/
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
        /*Creates an image that the system displays during the drag and drop operation. This is called a "drag shadow".*/
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
        /*while the img is moving, the view is invisible, if we comment this line, the view 'will move' when we drop it*/
                view.setVisibility(View.INVISIBLE);
                return true;
            } else {
                return false;
            }
        }
    }

    private class ContainerDragListener implements View.OnDragListener {

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
    	  /*change de background*/

                    break;
                case DragEvent.ACTION_DRAG_EXITED:

                    break;
                case DragEvent.ACTION_DROP:
                    // Dropped, reassign View to ViewGroup
                    View view = (View) event.getLocalState();
                    RelativeLayout oldContainer = (RelativeLayout) view.getParent();
                    oldContainer.removeView(view);
                    oldContainer.addView(view);
                    view.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DRAG_ENDED:

                default:
                    break;
            }
            return true;
        }
    }


}



