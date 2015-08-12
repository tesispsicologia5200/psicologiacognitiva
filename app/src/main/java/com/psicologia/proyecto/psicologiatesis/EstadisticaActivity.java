package com.psicologia.proyecto.psicologiatesis;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Henry Jaramillo on 06/08/2015.
 */
public class EstadisticaActivity extends ActionBarActivity {


    //variables

    EditText txt_identificacion;
    Number[] serieLenguajeAuditivo,serieLenguajeVisual,series1Numbers,serieTokenTest;
    String id;
    String banano,conejo,elefante,estufa,fresa,guante,jarra,mariposa,panuelo,pato,pinia,sarten,sombrero,tenedor,uvas,zapato;
    String banano2,conejo2,elefante2,estufa2,fresa2,guante2,jarra2,mariposa2,panuelo2,pato2,pinia2,sarten2,sombrero2,tenedor2,uvas2,zapato2;
    String banano3,conejo3,elefante3,estufa3,fresa3,guante3,jarra3,mariposa3,panuelo3,pato3,pinia3,sarten3,sombrero3,tenedor3,uvas3,zapato3;
    String banano4,conejo4,elefante4,estufa4,fresa4,guante4,jarra4,mariposa4,panuelo4,pato4,pinia4,sarten4,sombrero4,tenedor4,uvas4,zapato4;
    String test1s,test2s,test3s,test4s;
    int aciertos,errores,omisiones,intrusiones;
    int contador,omision,erroresvisual;
    int nivel,aciertostoken,puntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estadistica);
    }

    //busca los datos segun el id y los muestra
    public void buscarOnClick(View v) {
        txt_identificacion = (EditText) findViewById(R.id.txt_identificacionestadistica);
        id = txt_identificacion.getText().toString();
        UsuariosHelper usuariosHelper = new UsuariosHelper(this, "Psicologia22", null, 1);
        SQLiteDatabase db = usuariosHelper.getReadableDatabase();
        Cursor k = db.rawQuery("SELECT Identificacion FROM Usuarios where Identificacion='" + id + "'", null);
        if (k.moveToFirst()) {
            if (db != null) {
                Cursor c = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaUno where Id='" + id + "'", null);
                if (c.moveToFirst()) {
                    elefante = c.getString(0);
                    conejo = c.getString(1);
                    pato = c.getString(2);
                    mariposa = c.getString(3);
                    sarten = c.getString(4);
                    estufa = c.getString(5);
                    tenedor = c.getString(6);
                    jarra = c.getString(7);
                    guante = c.getString(8);
                    zapato = c.getString(9);
                    sombrero = c.getString(10);
                    panuelo = c.getString(11);
                    banano = c.getString(12);
                    uvas = c.getString(13);
                    fresa = c.getString(14);
                    pinia = c.getString(15);
                    int ielefante = Integer.parseInt(elefante);
                    int iconejo = Integer.parseInt(conejo);
                    int ipato = Integer.parseInt(pato);
                    int imariposa = Integer.parseInt(mariposa);
                    int isarten = Integer.parseInt(sarten);
                    int iestufa = Integer.parseInt(estufa);
                    int itenedor = Integer.parseInt(tenedor);
                    int ijarra = Integer.parseInt(jarra);
                    int iguante = Integer.parseInt(guante);
                    int izapato = Integer.parseInt(zapato);
                    int isombrero = Integer.parseInt(sombrero);
                    int ipanuelo = Integer.parseInt(panuelo);
                    int ibanano = Integer.parseInt(banano);
                    int iuvas = Integer.parseInt(uvas);
                    int ifresa = Integer.parseInt(fresa);
                    int ipinia = Integer.parseInt(pinia);
                    int test1 = ielefante + iconejo + ipato + imariposa + isarten + iestufa + itenedor + ijarra + iguante + izapato + isombrero + ipanuelo + ibanano + iuvas + ifresa + ipinia;
                    test1s = String.valueOf(test1);
                }
                else{
                    test1s="0";
                }
                Cursor d = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaDos where Id='" + id + "'", null);
                if (d.moveToFirst()) {
                    elefante2 = d.getString(0);
                    conejo2 = d.getString(1);
                    pato2 = d.getString(2);
                    mariposa2 = d.getString(3);
                    sarten2 = d.getString(4);
                    estufa2 = d.getString(5);
                    tenedor2 = d.getString(6);
                    jarra2 = d.getString(7);
                    guante2 = d.getString(8);
                    zapato2 = d.getString(9);
                    sombrero2 = d.getString(10);
                    panuelo2 = d.getString(11);
                    banano2 = d.getString(12);
                    uvas2 = d.getString(13);
                    fresa2 = d.getString(14);
                    pinia2 = d.getString(15);
                    int i2elefante = Integer.parseInt(elefante2);
                    int i2conejo = Integer.parseInt(conejo2);
                    int i2pato = Integer.parseInt(pato2);
                    int i2mariposa = Integer.parseInt(mariposa2);
                    int i2sarten = Integer.parseInt(sarten2);
                    int i2estufa = Integer.parseInt(estufa2);
                    int i2tenedor = Integer.parseInt(tenedor2);
                    int i2jarra = Integer.parseInt(jarra2);
                    int i2guante = Integer.parseInt(guante2);
                    int i2zapato = Integer.parseInt(zapato2);
                    int i2sombrero = Integer.parseInt(sombrero2);
                    int i2panuelo = Integer.parseInt(panuelo2);
                    int i2banano = Integer.parseInt(banano2);
                    int i2uvas = Integer.parseInt(uvas2);
                    int i2fresa = Integer.parseInt(fresa2);
                    int i2pinia = Integer.parseInt(pinia2);
                    int test2 = i2elefante + i2conejo + i2pato + i2mariposa + i2sarten + i2estufa + i2tenedor + i2jarra + i2guante + i2zapato + i2sombrero + i2panuelo + i2banano + i2uvas + i2fresa + i2pinia;
                    test2s = String.valueOf(test2);
                }
                else{
                    test2s="0";
                }

                Cursor e = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaDosM where Id='" + id + "'", null);
                if (e.moveToFirst()) {
                    elefante3 = e.getString(0);
                    conejo3 = e.getString(1);
                    pato3 = e.getString(2);
                    mariposa3 = e.getString(3);
                    sarten3 = e.getString(4);
                    estufa3 = e.getString(5);
                    tenedor3 = e.getString(6);
                    jarra3 = e.getString(7);
                    guante3 = e.getString(8);
                    zapato3 = e.getString(9);
                    sombrero3 = e.getString(10);
                    panuelo3 = e.getString(11);
                    banano3 = e.getString(12);
                    uvas3 = e.getString(13);
                    fresa3 = e.getString(14);
                    pinia3 = e.getString(15);
                    int i3elefante = Integer.parseInt(elefante3);
                    int i3conejo = Integer.parseInt(conejo3);
                    int i3pato = Integer.parseInt(pato3);
                    int i3mariposa = Integer.parseInt(mariposa3);
                    int i3sarten = Integer.parseInt(sarten3);
                    int i3estufa = Integer.parseInt(estufa3);
                    int i3tenedor = Integer.parseInt(tenedor3);
                    int i3jarra = Integer.parseInt(jarra3);
                    int i3guante = Integer.parseInt(guante3);
                    int i3zapato = Integer.parseInt(zapato3);
                    int i3sombrero = Integer.parseInt(sombrero3);
                    int i3panuelo = Integer.parseInt(panuelo3);
                    int i3banano = Integer.parseInt(banano3);
                    int i3uvas = Integer.parseInt(uvas3);
                    int i3fresa = Integer.parseInt(fresa3);
                    int i3pinia = Integer.parseInt(pinia3);
                    int test3 = i3elefante + i3conejo + i3pato + i3mariposa + i3sarten + i3estufa + i3tenedor + i3jarra + i3guante + i3zapato + i3sombrero + i3panuelo + i3banano + i3uvas + i3fresa + i3pinia;
                    test3s = String.valueOf(test3);
                }
                else{
                    test3s="0";
                }

                Cursor r = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaTres where Id='" + id + "'", null);
                if (r.moveToFirst()) {
                    elefante4 = r.getString(0);
                    conejo4 = r.getString(1);
                    pato4 = r.getString(2);
                    mariposa4 = r.getString(3);
                    sarten4 = r.getString(4);
                    estufa4 = r.getString(5);
                    tenedor4 = r.getString(6);
                    jarra4 = r.getString(7);
                    guante4 = r.getString(8);
                    zapato4 = r.getString(9);
                    sombrero4 = r.getString(10);
                    panuelo4 = r.getString(11);
                    banano4 = r.getString(12);
                    uvas4 = r.getString(13);
                    fresa4 = r.getString(14);
                    pinia4 = r.getString(15);
                    int i4elefante = Integer.parseInt(elefante4);
                    int i4conejo = Integer.parseInt(conejo4);
                    int i4pato = Integer.parseInt(pato4);
                    int i4mariposa = Integer.parseInt(mariposa4);
                    int i4sarten = Integer.parseInt(sarten4);
                    int i4estufa = Integer.parseInt(estufa4);
                    int i4tenedor = Integer.parseInt(tenedor4);
                    int i4jarra = Integer.parseInt(jarra4);
                    int i4guante = Integer.parseInt(guante4);
                    int i4zapato = Integer.parseInt(zapato4);
                    int i4sombrero = Integer.parseInt(sombrero4);
                    int i4panuelo = Integer.parseInt(panuelo4);
                    int i4banano = Integer.parseInt(banano4);
                    int i4uvas = Integer.parseInt(uvas4);
                    int i4fresa = Integer.parseInt(fresa4);
                    int i4pinia = Integer.parseInt(pinia4);
                    int test4 = i4elefante + i4conejo + i4pato + i4mariposa + i4sarten + i4estufa + i4tenedor + i4jarra + i4guante + i4zapato + i4sombrero + i4panuelo + i4banano + i4uvas + i4fresa + i4pinia;
                    test4s = String.valueOf(test4);
                }
                else{
                    test4s="0";
                }


                Cursor t = db.rawQuery("SELECT Aciertos ,Errores ,Omisiones ,Intrusion FROM LenguajeAuditivo WHERE Id='" + id + "'", null);
                if (t.moveToFirst()) {
                    aciertos = t.getInt(0);
                    errores = t.getInt(1);
                    omisiones = t.getInt(2);
                    intrusiones = t.getInt(3);
                }
                serieLenguajeAuditivo = new Number[]{aciertos, errores, omisiones, intrusiones};


                Cursor p = db.rawQuery("SELECT Contador_a ,Contador_omision ,Errores  FROM LenguajeVisual WHERE Id='" + id + "'", null);
                if (p.moveToFirst()) {
                    contador = p.getInt(0);
                    omision = p.getInt(1);
                    erroresvisual = p.getInt(2);
                }
                serieLenguajeVisual = new Number[]{contador, omision, erroresvisual};


                Cursor o = db.rawQuery("SELECT Nivel,Aciertos,Puntaje FROM TokenTest WHERE Id='" + id + "'", null);
                if (o.moveToFirst()) {
                    nivel = o.getInt(0);
                    aciertostoken = o.getInt(1);
                    puntaje = o.getInt(2);
                }

                serieTokenTest = new Number[]{nivel, aciertostoken, puntaje};



                String aciertoss = String.valueOf(aciertos);
                if (aciertoss.equals(null)) {
                    aciertos = 0;
                    errores = 0;
                    omisiones = 0;
                    intrusiones = 0;
                    contador = 0;
                    omision = 0;
                    erroresvisual = 0;
                }

                String nivell = String.valueOf(nivel);
                if (nivell.equals(null)) {
                    nivel = 0;
                    aciertostoken = 0;
                    puntaje = 0;
                }

            }

            //fijar textviews, definir texto y visibles
            TextView memoria = (TextView) findViewById(R.id.lb_memoriamemoria);
            memoria.setVisibility(View.VISIBLE);
            TextView visual = (TextView) findViewById(R.id.lb_auditivaaaaaa);
            visual.setVisibility(View.VISIBLE);
            TextView auditiva = (TextView) findViewById(R.id.lb_visualllll);
            auditiva.setVisibility(View.VISIBLE);
            TextView token = (TextView) findViewById(R.id.lb_tokentest);
            token.setVisibility(View.VISIBLE);

            TextView test1ya = (TextView) findViewById(R.id.lb_test1);
            test1ya.setVisibility(View.VISIBLE);
            test1ya.setText("Recobro 1: " + test1s);
            TextView test2ya = (TextView) findViewById(R.id.lb_test2);
            test2ya.setVisibility(View.VISIBLE);
            test2ya.setText("Recobro 2: " + test2s);
            TextView test3ya = (TextView) findViewById(R.id.lb_test3);
            test3ya.setVisibility(View.VISIBLE);
            test3ya.setText("Recobro 3: " + test3s);
            TextView test4ya = (TextView) findViewById(R.id.lb_test4);
            test4ya.setVisibility(View.VISIBLE);
            test4ya.setText("Recobro 4: " + test4s);

            TextView aciertoss = (TextView) findViewById(R.id.lb_aciertos);
            aciertoss.setVisibility(View.VISIBLE);
            aciertoss.setText("Aciertos: " + String.valueOf(aciertos));
            TextView erroress = (TextView) findViewById(R.id.lb_errores);
            erroress.setVisibility(View.VISIBLE);
            erroress.setText("Errores: " + String.valueOf(errores));
            TextView intrusionn = (TextView) findViewById(R.id.lb_intrusiones);
            intrusionn.setVisibility(View.VISIBLE);
            intrusionn.setText("Intrusiones: " + String.valueOf(intrusiones));
            TextView omisioness = (TextView) findViewById(R.id.lb_omisiones);
            omisioness.setVisibility(View.VISIBLE);
            omisioness.setText("Omisiones: " + String.valueOf(omisiones));

            TextView aciertosvisuales = (TextView) findViewById(R.id.lb_corractasvisual);
            aciertosvisuales.setVisibility(View.VISIBLE);
            aciertosvisuales.setText("Aciertos: " + String.valueOf(contador));
            TextView erroresvisuales = (TextView) findViewById(R.id.lb_erroresvisual);
            erroresvisuales.setVisibility(View.VISIBLE);
            erroresvisuales.setText("Errores: " + String.valueOf(erroresvisual));
            TextView comision = (TextView) findViewById(R.id.lb_comision);
            comision.setVisibility(View.VISIBLE);
            comision.setText("Comisiones: " + String.valueOf(omision));

            TextView aciertostokenn = (TextView) findViewById(R.id.lb_aciertostoken);
            aciertostokenn.setVisibility(View.VISIBLE);
            aciertostokenn.setText("Aciertos: " + String.valueOf(aciertostoken));
            TextView nivelll = (TextView) findViewById(R.id.lb_comisiontoken);
            nivelll.setVisibility(View.VISIBLE);
            nivelll.setText("Nivel: " + String.valueOf(nivel));
            TextView puntajee = (TextView) findViewById(R.id.lb_errorestoken);
            puntajee.setVisibility(View.VISIBLE);
            puntajee.setText("Puntaje: " + String.valueOf(puntaje));
        }
        else{
            Toast.makeText(this, "el usuario no existe", Toast.LENGTH_SHORT).show();
        }
    }

}
