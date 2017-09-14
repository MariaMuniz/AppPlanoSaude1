package com.example.cida.chbsaude;


import android.app.Activity;
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
import java.util.List;


public class Fragment03 extends Fragment {


    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2,spinner;
    public Activity activity;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        final View v = inflater.inflate(R.layout.fragment_fragment01, container, false);

        String[] values =
                {"2014", "2015", "2016"};
        spinner = (Spinner) v.findViewById(R.id.spnPlano);

/*        ArrayAdapter<String> LTRadapter = new ArrayAdapter<String>(this.getActivity(),R.layout.support_simple_spinner_dropdown_item, values);
        LTRadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(LTRadapter);*/


        List<String> categories = new ArrayList<String>();
        categories.add("Adesão Affix");
        categories.add("Adesão Allcare");
        categories.add("Adesão Bem beneficios");
        categories.add("Adesão Qualicorp");
        categories.add("Ambulatorial");
        categories.add("Empresarial I");
        categories.add("Empresarial II");
        categories.add("Individual");
        categories.add("Odontológico");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        ///////




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                List<String> operadoras = new ArrayList<String>();
                if (position == 0) {
                    operadoras.add("Samp");

                    operadoras.add("Saúde Sistema");

                    operadoras.add("Vivamed Saúde");

                }
                if (position == 1) {

                    operadoras.add("Bradesco Saúde");
                    operadoras.add("Samp");
                    operadoras.add("Vivamed Saúde");
                    operadoras.add("Vitallis");

                }
                if (position == 2) {

                    operadoras.add("Saúde Sistema");

                }
                if (position == 3) {
                    operadoras.add("Amil");
                    operadoras.add("Bradesco");
                    operadoras.add("SulAmérica");
                    operadoras.add("Caixa");


                }

                if (position == 4) {
                    operadoras.add("Premium Saúde");
                    operadoras.add("Premium Saúde Individual");
                    operadoras.add("Goodlife Saúde ");


                }

                if (position == 5) {
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


                if (position == 6) {
                    operadoras.add("Amil");
                    operadoras.add("One Health");
                    operadoras.add("Promed");
                    operadoras.add("Saúde Sistema");
                    operadoras.add("Unimed");

                }


                if (position == 7) {
                    operadoras.add("Goodlife Saúde");
                    operadoras.add("Unimed");
                    operadoras.add("Vitallis");

                }

                if (position == 8) {
                    operadoras.add("Amil Dental");
                    operadoras.add("Prevident");

                }

                ArrayAdapter adp = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item, operadoras);
                adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(adp);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        String[] values2 = {"1", "2", "3", "4", "5"};
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


        LTRadapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, operadoras);
        LTRadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(LTRadapter2);



        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int planoSelecionado = spinner.getSelectedItemPosition();
                int operadoraSelecionada = position;

                //PLANO ADESAO ALFIX
                if (planoSelecionado == 0) {
                    //SAMP
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadaaffixsamp10);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadaaffixsamp20);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadaaffixsamp30);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadaaffixsamp40);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                    }
                    //SAUDE SISTEMA
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredeenciadasaudesisad10);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredeenciadasaudesisad20);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredeenciadasaudesisad30);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredeenciadasaudesisead40);

                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.redecredeenciadasaudesisad50);

                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.redecredeenciadasaudesisad60);

                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.redecredeenciadasaudesisad70);

                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.redecredeenciadasaudesisad80);
                        ImageView myImageView9 = (ImageView) v.findViewById(R.id.imageView10);
                        myImageView9.setImageResource(R.drawable.redecredeenciadasaudesisad90);


                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadaaffixvivamed10);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadaaffixvivamed20);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadaaffixvivamed30);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadaaffixvivamed41);

                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);


                    }
                }
                //PLANO ADESAO Alcare
                else if (planoSelecionado == 1) {

                    //BRADESCO SAUDE
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescosaude);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadabradescoempresa1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadabradescoempresa2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadabradescoempresa4);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadabradescoempresa5);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);

                    }
                    //SAMP
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredalcaresamp1a);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredalcaresamp2a);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredalcaresamp3a);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredalcaresamp4a);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);


                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredalcaarevivamed1a);


                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredalcaarevivamed2a);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredalcaarevivamed3a);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredalcaarevivamed4a);

                    }
                    //VITALIS
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredencvitalisalcare1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredencvitalisalcare2);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredencvitalisalcare3);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredencvitalisalcare4);

                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.redecredencvitalisalcare5);

                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.redecredencvitalisalcare6);

                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.redecredencvitalisalcare7);


                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.redecredencvitalisalcare8);


                        ImageView myImageView9 = (ImageView) v.findViewById(R.id.imageView10);
                        myImageView9.setImageResource(R.drawable.redecredencvitalisalcare9);
                        /*

                        ImageView myImageView10= (ImageView) v.findViewById(R.id.imageView11);
                        myImageView10.setImageResource(R.drawable.redecredencvitalisalcare10); /*

                        ImageView myImageView11 = (ImageView) v.findViewById(R.id.imageView12);
                        myImageView11.setImageResource(R.drawable.redecredencvitalisalcare11);
                        */


                    }
                }
                //PLANO ADESAO BEM BENEFICIOS
                else if (planoSelecionado == 2) {

                    //Saude sistema
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadabembsaudsitema1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadabembsaudsitema2);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadabembsaudsitema3);
                    }
                }
                //PLANO ADESAO QUALICORP
                else if (planoSelecionado == 3) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);

                    }
                    //Bradesco seguros
                    else if (operadoraSelecionada == 1) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescoseguros);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);

                    }
                    //SulAmerica
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.sulamerica);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);

                    }
                    //Caixa
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.caixa);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadacaixabh1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadacaixabh2);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadacaixabarbaccena3);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadacaixaformiga4);

                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.redecredenciadacaixaourobranco5);

                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.redecredenciadacaixauberlandia6);
                    }

                }
                //PLANO AMBULATORIAL
                else if (planoSelecionado == 4) {
                    if (operadoraSelecionada == 0) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redepremiumfamiliar01);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redepremiumfamiliar02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redepremiumfamiliar03);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redepremiumfamiliar04);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);

                    }


                    if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redepremiumfamiliar01);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redepremiumfamiliar02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redepremiumfamiliar03);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redepremiumfamiliar04);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                    }
                    if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.goodlife);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);

                    }


                }
                //PLANO EMPRESARIAL I
                else if (planoSelecionado == 5) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadamil1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadamil2a);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadamil3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadamil4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                    }
                    //Goodlife
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.goodlife);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.googlifuniquegoodmp);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.googlifuniquemp);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //One Health
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.onehealth);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //Premium saude
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //Promed
                    else if (operadoraSelecionada == 4) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.promed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadapromed1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadapromed2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //Samp
                    else if (operadoraSelecionada == 5) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                    }
                    //Saude sistema
                    else if (operadoraSelecionada == 6) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadasaudesistema1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadasaudesistema2);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadasaudesistema3);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Unimed
                    else if (operadoraSelecionada == 7) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadaunimedempresa1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadaunimedempresa02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadaunimedempresa03);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadaunimedempresa4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                    }

                    //Vitallis
                    else if (operadoraSelecionada == 8) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadavitallis1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadavitallis2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadavitallis3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadavitallis4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);

                    }
                    //Vivamed saude
                    else if (operadoraSelecionada == 9) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredvivamedempresa);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredvivamedempresa2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredvivamedempresa3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredvivamedempresa4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);


                    }
                }

                //Empresarial II
                else if (planoSelecionado == 6) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadamil1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadamil2a);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadamil3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadamil4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);

                    }
                    //one health
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.onehealth);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //promed
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.promed);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadapromed1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadapromed2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);



                    }

                    //saude sistema
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadasaudesistema1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadasaudesistema2);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadasaudesistema3);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }

                    //unimed
                    else if (operadoraSelecionada == 4) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.redecredenciadaunimedempresa1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.redecredenciadaunimedempresa02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.redecredenciadaunimedempresa03);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.redecredenciadaunimedempresa4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);


                    }
                }


                //PLANO INDIVIDUAL
                else if (planoSelecionado == 7) {
                    //godlife
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.goodlife);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView2.setImageResource(R.drawable.goodlifeouro);


                    }
                    //premium
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);


                    }
                    //unimed
                    if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);


                    }
                    //vitallis
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);


                    }

                }
                //PLANO ODONTOLOGICO
                    else if (planoSelecionado == 9) {
                        if (operadoraSelecionada == 0) {

                            ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                            myImageView.setImageResource(R.drawable.amildental);

                            ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                            myImageView1.setImageResource(R.drawable.coberturaamil);
                            ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                            myImageView2.setImageResource(R.drawable.brancomini1);

                        }
                        else if (operadoraSelecionada == 1) {

                            ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                            myImageView.setImageResource(R.drawable.previdenticone);

                            ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView2);
                            myImageView2.setImageResource(R.drawable.coberturaprev1);
                            ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView3);
                            myImageView3.setImageResource(R.drawable.coberturaprev2);
                            ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView4);
                            myImageView4.setImageResource(R.drawable.brancomini1);

                        }

                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        return v;

    }


}