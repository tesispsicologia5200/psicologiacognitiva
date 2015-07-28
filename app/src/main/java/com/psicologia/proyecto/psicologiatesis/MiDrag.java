package com.psicologia.proyecto.psicologiatesis;

import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import static android.view.View.VISIBLE;

/**
 * Created by Henry Jaramillo on 24/07/2015.
 */
final class MiDrag implements View.OnDragListener{


    public boolean onDrag(View contenedor_nuevo, DragEvent evento){
        switch (evento.getAction()){
            case DragEvent.ACTION_DRAG_ENTERED:
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                break;
            case DragEvent.ACTION_DROP:
                View objeto = (View) evento.getLocalState();
                ViewGroup papa_objeto = (ViewGroup) objeto.getParent();
                papa_objeto.removeView(objeto);

                LinearLayout contenedor_nuevo2 = (LinearLayout) contenedor_nuevo;
                contenedor_nuevo2.addView(objeto);

                objeto.setVisibility(VISIBLE);
                break;
            default:
                break;
        }
        return true;
    }

}
