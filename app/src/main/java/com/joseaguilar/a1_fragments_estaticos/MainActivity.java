package com.joseaguilar.a1_fragments_estaticos;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joseaguilar.a1_fragments_estaticos.Fragments.Fragment_Rojo;
import com.joseaguilar.a1_fragments_estaticos.Fragments.Fragment_Verde;
// Guia 1

//EN ESTE EJEMPLO ESTAMOS CONSUMIENDO 2 FRAGMENTS EN UNA ACTIVITY
//-------------------------------------------------------
// Paso 1: agregamos un implement los fragments
// Paso 2: implementamos el metodo " onFragmentInteraction "que solicita los implement
public class MainActivity extends AppCompatActivity implements Fragment_Rojo.OnFragmentInteractionListener,Fragment_Verde.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo onFragmentInteraction -- con este metodo ya bastara para poder visualizar los fragments estaticos dentro de un activity
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
