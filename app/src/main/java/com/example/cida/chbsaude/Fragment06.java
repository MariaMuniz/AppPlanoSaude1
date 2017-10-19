package com.example.cida.chbsaude;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Fragment06 extends Fragment {
    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2;
    public Activity activity;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        getActivity().setTitle("Simular preco");
        final View v = inflater.inflate(R.layout.fragment_fragment06, container, false);






        return v;

    }


}