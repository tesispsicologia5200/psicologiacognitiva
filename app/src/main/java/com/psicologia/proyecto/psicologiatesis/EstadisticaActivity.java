package com.psicologia.proyecto.psicologiatesis;

import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Henry Jaramillo on 06/08/2015.
 */
public class EstadisticaActivity extends ActionBarActivity {

    EditText txt_identificacion=(EditText) findViewById(R.id.id);

    Number[] serieLenguajeAuditivo;
    Number[] serieLenguajeVisual;
    Number[] series1Numbers;

    String id=txt_identificacion.getText().toString();
    String banano;
    String conejo;
    String elefante;
    String estufa;
    String fresa;
    String guante;
    String jarra;
    String mariposa;
    String panuelo;
    String pato;
    String pinia;
    String sarten;
    String sombrero;
    String tenedor;
    String uvas;
    String zapato;

    String banano2;
    String conejo2;
    String elefante2;
    String estufa2;
    String fresa2;
    String guante2;
    String jarra2;
    String mariposa2;
    String panuelo2;
    String pato2;
    String pinia2;
    String sarten2;
    String sombrero2;
    String tenedor2;
    String uvas2;
    String zapato2;

    String banano3;
    String conejo3;
    String elefante3;
    String estufa3;
    String fresa3;
    String guante3;
    String jarra3;
    String mariposa3;
    String panuelo3;
    String pato3;
    String pinia3;
    String sarten3;
    String sombrero3;
    String tenedor3;
    String uvas3;
    String zapato3;

    String banano4;
    String conejo4;
    String elefante4;
    String estufa4;
    String fresa4;
    String guante4;
    String jarra4;
    String mariposa4;
    String panuelo4;
    String pato4;
    String pinia4;
    String sarten4;
    String sombrero4;
    String tenedor4;
    String uvas4;
    String zapato4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.estadistica);
    }

    public void buscarOnClick(View v){
        UsuariosHelper usuariosHelper = new UsuariosHelper(this, "Psicologia21", null, 1);
        SQLiteDatabase db = usuariosHelper.getReadableDatabase();
        if(db!=null){
            Cursor c = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaUno where Id='" + id + "'", null);
            if(c.moveToFirst()){
                elefante=c.getString(0);
                conejo=c.getString(1);
                pato=c.getString(2);
                mariposa=c.getString(3);
                sarten=c.getString(4);
                estufa=c.getString(5);
                tenedor=c.getString(6);
                jarra=c.getString(7);
                guante=c.getString(8);
                zapato=c.getString(9);
                sombrero=c.getString(10);
                panuelo=c.getString(11);
                banano=c.getString(12);
                uvas=c.getString(13);
                fresa=c.getString(14);
                pinia=c.getString(15);
            }
            int ielefante=Integer.parseInt(elefante);
            int iconejo=Integer.parseInt(conejo);
            int ipato=Integer.parseInt(pato);
            int imariposa=Integer.parseInt(mariposa);
            int isarten=Integer.parseInt(sarten);
            int iestufa=Integer.parseInt(estufa);
            int itenedor=Integer.parseInt(tenedor);
            int ijarra=Integer.parseInt(jarra);
            int iguante=Integer.parseInt(guante);
            int izapato=Integer.parseInt(zapato);
            int isombrero=Integer.parseInt(sombrero);
            int ipanuelo=Integer.parseInt(panuelo);
            int ibanano=Integer.parseInt(banano);
            int iuvas=Integer.parseInt(uvas);
            int ifresa=Integer.parseInt(fresa);
            int ipinia=Integer.parseInt(pinia);

            int test1=ielefante+iconejo+ipato+imariposa+isarten+iestufa+itenedor+ijarra+iguante+izapato+isombrero+ipanuelo+ibanano+iuvas+ifresa+ipinia;

            Cursor d = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaDos where Id='" + id + "'", null);
            if(d.moveToFirst()){
                elefante2=c.getString(0);
                conejo2=c.getString(1);
                pato2=c.getString(2);
                mariposa2=c.getString(3);
                sarten2=c.getString(4);
                estufa2=c.getString(5);
                tenedor2=c.getString(6);
                jarra2=c.getString(7);
                guante2=c.getString(8);
                zapato2=c.getString(9);
                sombrero2=c.getString(10);
                panuelo2=c.getString(11);
                banano2=c.getString(12);
                uvas2=c.getString(13);
                fresa2=c.getString(14);
                pinia2=c.getString(15);
            }
            int i2elefante=Integer.parseInt(elefante2);
            int i2conejo=Integer.parseInt(conejo2);
            int i2pato=Integer.parseInt(pato2);
            int i2mariposa=Integer.parseInt(mariposa2);
            int i2sarten=Integer.parseInt(sarten2);
            int i2estufa=Integer.parseInt(estufa2);
            int i2tenedor=Integer.parseInt(tenedor2);
            int i2jarra=Integer.parseInt(jarra2);
            int i2guante=Integer.parseInt(guante2);
            int i2zapato=Integer.parseInt(zapato2);
            int i2sombrero=Integer.parseInt(sombrero2);
            int i2panuelo=Integer.parseInt(panuelo2);
            int i2banano=Integer.parseInt(banano2);
            int i2uvas=Integer.parseInt(uvas2);
            int i2fresa=Integer.parseInt(fresa2);
            int i2pinia=Integer.parseInt(pinia2);

            int test2=i2elefante+i2conejo+i2pato+i2mariposa+i2sarten+i2estufa+i2tenedor+i2jarra+i2guante+i2zapato+i2sombrero+i2panuelo+i2banano+i2uvas+i2fresa+i2pinia;

            Cursor e = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaDosM where Id='" + id + "'", null);
            if(e.moveToFirst()){
                elefante3=c.getString(0);
                conejo3=c.getString(1);
                pato3=c.getString(2);
                mariposa3=c.getString(3);
                sarten3=c.getString(4);
                estufa3=c.getString(5);
                tenedor3=c.getString(6);
                jarra3=c.getString(7);
                guante3=c.getString(8);
                zapato3=c.getString(9);
                sombrero3=c.getString(10);
                panuelo3=c.getString(11);
                banano3=c.getString(12);
                uvas3=c.getString(13);
                fresa3=c.getString(14);
                pinia3=c.getString(15);
            }
            int i3elefante=Integer.parseInt(elefante3);
            int i3conejo=Integer.parseInt(conejo3);
            int i3pato=Integer.parseInt(pato3);
            int i3mariposa=Integer.parseInt(mariposa3);
            int i3sarten=Integer.parseInt(sarten3);
            int i3estufa=Integer.parseInt(estufa3);
            int i3tenedor=Integer.parseInt(tenedor3);
            int i3jarra=Integer.parseInt(jarra3);
            int i3guante=Integer.parseInt(guante3);
            int i3zapato=Integer.parseInt(zapato3);
            int i3sombrero=Integer.parseInt(sombrero3);
            int i3panuelo=Integer.parseInt(panuelo3);
            int i3banano=Integer.parseInt(banano3);
            int i3uvas=Integer.parseInt(uvas3);
            int i3fresa=Integer.parseInt(fresa3);
            int i3pinia=Integer.parseInt(pinia3);

            int test3=i3elefante+i3conejo+i3pato+i3mariposa+i3sarten+i3estufa+i3tenedor+i3jarra+i3guante+i3zapato+i3sombrero+i3panuelo+i3banano+i3uvas+i3fresa+i3pinia;

            Cursor r = db.rawQuery("SELECT Elefante ,Conejo ,Pato ,Mariposa ,Sarten ,Estufa ,Tenedor ,Jarra ,Guante ,Zapato ,Sombrero ,Panuelo ,Banano ,Uvas ,Fresa ,Pinia FROM MemoriaTres where Id='" + id + "'", null);
            if(r.moveToFirst()){
                elefante4=c.getString(0);
                conejo4=c.getString(1);
                pato4=c.getString(2);
                mariposa4=c.getString(3);
                sarten4=c.getString(4);
                estufa4=c.getString(5);
                tenedor4=c.getString(6);
                jarra4=c.getString(7);
                guante4=c.getString(8);
                zapato4=c.getString(9);
                sombrero4=c.getString(10);
                panuelo4=c.getString(11);
                banano4=c.getString(12);
                uvas4=c.getString(13);
                fresa4=c.getString(14);
                pinia4=c.getString(15);
            }
            int i4elefante=Integer.parseInt(elefante4);
            int i4conejo=Integer.parseInt(conejo4);
            int i4pato=Integer.parseInt(pato4);
            int i4mariposa=Integer.parseInt(mariposa4);
            int i4sarten=Integer.parseInt(sarten4);
            int i4estufa=Integer.parseInt(estufa4);
            int i4tenedor=Integer.parseInt(tenedor4);
            int i4jarra=Integer.parseInt(jarra4);
            int i4guante=Integer.parseInt(guante4);
            int i4zapato=Integer.parseInt(zapato4);
            int i4sombrero=Integer.parseInt(sombrero4);
            int i4panuelo=Integer.parseInt(panuelo4);
            int i4banano=Integer.parseInt(banano4);
            int i4uvas=Integer.parseInt(uvas4);
            int i4fresa=Integer.parseInt(fresa4);
            int i4pinia=Integer.parseInt(pinia4);

            int test4=i4elefante+i4conejo+i4pato+i4mariposa+i4sarten+i4estufa+i4tenedor+i4jarra+i4guante+i4zapato+i4sombrero+i4panuelo+i4banano+i4uvas+i4fresa+i4pinia;

            series1Numbers = new Number[]{test1, test2, test3, test4};

            int aciertos=0;
            int errores=0;
            int omisiones=0;
            int intrusiones=0;

            Cursor t=db.rawQuery("SELECT Aciertos ,Errores ,Omisiones ,Intrusion FROM LenguajeAuditivo WHERE Id='"+id+"'",null);
            if(t.moveToFirst()){
                aciertos=t.getInt(1);
                errores=t.getInt(2);
                omisiones=t.getInt(3);
                intrusiones=t.getInt(4);
            }
            serieLenguajeAuditivo= new Number[]{aciertos, errores, omisiones, intrusiones};

            int contador=0;
            int omision=0;
            int erroresvisual=0;

            Cursor p=db.rawQuery("SELECT Contador_a ,Contador_omision ,Errores  FROM LenguajeVisual WHERE Id='"+id+"'",null);
            if(t.moveToFirst()){
                contador=p.getInt(1);
                omision=p.getInt(2);
                erroresvisual=t.getInt(3);
            }
            serieLenguajeVisual= new Number[]{contador, omision, erroresvisual};
        }
    }


}
