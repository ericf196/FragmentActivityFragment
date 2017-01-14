package com.example.omega.fragmentactivity;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTexto extends Fragment {

    TextView texto;

    public FragmentTexto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment_texto, container, false);
        texto= (TextView) v.findViewById(R.id.text);
        return v;


    }


    public void showMessage(String msg){
        texto.setText(msg);

    }

}
