package com.example.omega.fragmentactivity;

import android.app.Fragment;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements FragmentBoton.CommunicationChannel{

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto= (TextView)findViewById(R.id.miTexto);
    }


    @Override
    public void setCommunication(String msg) {
        // TODO Auto-generated method stub
        if(!texto.getText().equals("he cambiado"))
            texto.setText(msg);
        else
            texto.setText(R.string.text_communication);

    }
}
