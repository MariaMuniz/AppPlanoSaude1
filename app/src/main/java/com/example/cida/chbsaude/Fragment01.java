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
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Fragment01 extends Fragment {


    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2;
    public Activity activity;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        final View v = inflater.inflate(R.layout.fragment_fragment01, container, false);

        String [] values =
                {"2014","2015","2016"};
        Spinner spinner = (Spinner) v.findViewById(R.id.spnPlano);

/*        ArrayAdapter<String> LTRadapter = new ArrayAdapter<String>(this.getActivity(),R.layout.support_simple_spinner_dropdown_item, values);
        LTRadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(LTRadapter);*/


        List<String> categories = new ArrayList<String>();
        categories.add("Adesão Alfix");
        categories.add("Adesão Allcare");
        categories.add("Adesão Bem beneficios");
        categories.add("Adesão Qualicorp");
        categories.add("Ambulatorial");
        categories.add("Empresarial");
        categories.add("Familiar");
        categories.add("Individual");
        categories.add("Odontológico");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        ///////


        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                List<String> operadoras = new ArrayList<String>();
                if(position == 0)
                {
                    operadoras.add("Samp");
                    operadoras.add("Saúde Sistema");
                    operadoras.add("Vivamed Saúde");
                    ImageView myImageView = (ImageView)v.findViewById(R.id.imageView);
                    myImageView.setImageResource(R.drawable.topoapp4);
                }



                if(position == 1)
                {

                    operadoras.add("Bradesco Saúde");
                    operadoras.add("Samp");
                    operadoras.add("Vivamed Saúde");
                    operadoras.add("Vitallis");
                    ImageView myImageView = (ImageView)v.findViewById(R.id.imageView);
                    myImageView.setImageResource(R.drawable.cobert);

                }

                if(position == 2)
                {

                    operadoras.add("Saúde Sistema");
                    ImageView myImageView = (ImageView)v.findViewById(R.id.imageView);
                    myImageView.setImageResource(R.drawable.capa);

                }
                if(position == 3)
                {
                    operadoras.add("Amil");
                    operadoras.add("Bradesco Qualicorp");
                    operadoras.add("SulAmérica");
                    operadoras.add("Caixa Seguradora");

                }

                if(position == 4)
                {
                    operadoras.add("Ambulatorial");


                }

                if(position == 5)
                {
                    operadoras.add("Amil");
                    operadoras.add("Goodlife Saúde");
                    operadoras.add("One Health");
                    operadoras.add("Premium Saúde");
                    operadoras.add("Promed");
                    operadoras.add("Samp");
                    operadoras.add("Saúde Sistema");
                    operadoras.add("Unimed");
                    operadoras.add("Vitallis");
                    operadoras.add("Vivamed Saúde");

                }
                if(position == 6)
                {
                    operadoras.add("Godlife Saúde");
                    operadoras.add("Premium Saúde");
                    operadoras.add("Unimed");
                    operadoras.add("Vitallis");

                }
                if(position == 7)
                {
                    operadoras.add("Godlife Saúde");
                    operadoras.add("Premium Saúde");
                    operadoras.add("Unimed");
                    operadoras.add("Vitallis");

                }
                if(position == 8)
                {
                    operadoras.add("Amil Dental");
                    operadoras.add("Prevident");

                }

                ArrayAdapter adp = new ArrayAdapter<String>(activity,android.R.layout.simple_spinner_item, operadoras);
                adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(adp);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        String [] values2 = {"1","2","3","4","5"};
         spinner2 = (Spinner) v.findViewById(R.id.spnOperadora);


        List<String> operadoras = new ArrayList<String>();
        operadoras.add("Amil");
        operadoras.add("Amil Dental");
        operadoras.add("ANS");
        operadoras.add("Bradesco saúde allcare");
        operadoras.add("Bradesco Saúde Qualicorp");
        operadoras.add("Caixa Seguradora");
        operadoras.add("Goodlife Saúde");
        operadoras.add("Odontoprev");
        operadoras.add("One Health");
        operadoras.add("Premium Saúde");
        operadoras.add("Prevident");
        operadoras.add("Promed");
        operadoras.add("Saúde Sistema");
        operadoras.add("Samp");
        operadoras.add("SulAmérica");
        operadoras.add("Unimed");
        operadoras.add("Vitallis");
        operadoras.add("Vivamed Saúde");



        LTRadapter2 = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item, operadoras);
        LTRadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(LTRadapter2);








        return v;






    }
}