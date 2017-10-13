package com.joseaguilar.a1_fragments_estaticos.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.joseaguilar.a1_fragments_estaticos.R;

public class Fragment_Verde extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Fragment_Verde() {

    }
    //---------------------------------------------------------------------------------------------
    public static Fragment_Verde newInstance(String param1, String param2) {
        Fragment_Verde fragment = new Fragment_Verde();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    //---------------------------------------------------------------------------------------------
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    //---------------------------------------------------------------------------------------------
    //ESTE APARTADO ES EL MAS IMPORTANTE YA QUE SIRVE COMO PUENTE PARA PODER VINCULAR LOS ELEMENTOS DEL FRAGMENT Y ESTA CLASE
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Paso 1: crear view
        View view = inflater.inflate(R.layout.fragment_fragment__verde, container, false);
        //Paso 2: vincular elementos
        Button btngo = (Button)view.findViewById(R.id.btnverde);

        //Paso 3: Este paso es simbolico ya que aca ira todo lo que queramos realizar, se debe de poner antes del "return view"
        // en este ejemplo enviaremos un toast al precionar el boton
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(),"Fragment Verde",Toast.LENGTH_SHORT).show();
            }
        });

        //Paso 4: retornamos view
        return view;
    }
    //---------------------------------------------------------------------------------------------
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
    //---------------------------------------------------------------------------------------------
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    //---------------------------------------------------------------------------------------------
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    //---------------------------------------------------------------------------------------------

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    //---------------------------------------------------------------------------------------------
}
