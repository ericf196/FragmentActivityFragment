package com.example.omega.fragmentactivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentBoton extends Fragment {

    Button boton;
    CommunicationChannel mCommChListner = null;


    public FragmentBoton() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_boton, container, false);
        Button buttonFragment = (Button) v.findViewById(R.id.buttonFragment);

        buttonFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                sendMessage("he cambiado");

            }
        });

        return v;
    }

    //create an interface which will help us to communicate with fragments by help of Activity
    interface CommunicationChannel {
        public void setCommunication(String msg);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof CommunicationChannel) {
            mCommChListner = (CommunicationChannel) activity;
        } else {
            throw new ClassCastException();
        }

    }

    public void sendMessage(String msg) {
        mCommChListner.setCommunication(msg);
    }

}
