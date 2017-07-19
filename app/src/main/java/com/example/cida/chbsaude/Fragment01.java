package com.example.cida.chbsaude;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import java.util.ArrayList;

public class Fragment01 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment01, container, false);
    }



    public class Plano
    {
        public ArrayList<String> RetornarPlano;

        public Plano()
        {
            RetornarPlano = new ArrayList<String>();
            RetornarPlano.add("Individual");
            RetornarPlano.add("Odontológico");
            RetornarPlano.add("Familiar");
            RetornarPlano.add("Empresarial");
            RetornarPlano.add("Ambolatorial");
            RetornarPlano.add("Adesão Alfix");
            RetornarPlano.add("Adesão Allcare");
            RetornarPlano.add("Adesão Bem Benefícios");
            RetornarPlano.add("Adesão Qualicorp");

        }
    }

}