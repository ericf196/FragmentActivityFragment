package com.example.omega.fragmentactivity;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;



public class MainActivity extends AppCompatActivity implements FragmentBoton.CommunicationChannel{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void setCommunication(String msg) {
        // TODO Auto-generated method stub
        FragmentTexto FragmentTexto = (FragmentTexto)getFragmentManager().findFragmentById(R.id.fragment_texto);
        if(FragmentTexto!=null) {
            FragmentTexto.showMessage(msg);
        }else
            Log.v("Tag","el FragmentTexto es null ");
    }
}
