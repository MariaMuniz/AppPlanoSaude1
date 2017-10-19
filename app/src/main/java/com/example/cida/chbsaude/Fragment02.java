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

public class Fragment02 extends Fragment {
    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2;
    public Activity activity;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        getActivity().setTitle("Consultar cobertura");
        final View v = inflater.inflate(R.layout.fragment_fragment01, container, false);

        String [] values =
                {"2014","2015","2016"};
        final Spinner spinner = (Spinner) v.findViewById(R.id.spnPlano);

/*        ArrayAdapter<String> LTRadapter = new ArrayAdapter<String>(this.getActivity(),R.layout.support_simple_spinner_dropdown_item, values);
        LTRadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(LTRadapter);*/


        List<String> categories = new ArrayList<String>();
        categories.add("Adesão Alfix");
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
                                operadoras.add("Amil Premium");
                                operadoras.add("Amil Supremo");
                                operadoras.add("Bradesco Premium ");
                                operadoras.add("Bradesco Supremo ");
                                operadoras.add("Caixa Compulsória");
                                operadoras.add("Caixa Voluntário");
                                operadoras.add("SulAmérica Premium");
                                operadoras.add("SulAmérica Supremo");

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
                                operadoras.add("Goodlife");


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
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                    }
                    //SAUDE SISTEMA
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafixxsaudesistemaem3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                }
                //PLANO ADESAO ACRE
                else if (planoSelecionado == 1) {

                    //BRADESCO SAUDE
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescosaude);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //SAMP
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //VITALIS
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                }
                //PLANO ADESAO BEM BENEFICIOS
                else if (planoSelecionado == 2) {

                    //Saude sistema
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                    }
                }
                //PLANO ADESAO QUALICORP
                else if (planoSelecionado == 3) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //Bradesco seguros
                    else if (operadoraSelecionada == 1) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescoseguros);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturahospitalar);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);

                    }
                    //SulAmerica
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.sulamerica);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturahospitalar);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);


                    }
                    //Caixa
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.caixa);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }

                }

                //PLANO AMBULATORIAL
                else if (planoSelecionado == 4) {
                    if (operadoraSelecionada == 0) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.miniespace);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.miniespace);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.miniespace);
                    }
                    if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.miniespace);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.miniespace);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.miniespace);
                    }

                    if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.goodlife);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem1);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.miniespace);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.miniespace);

                    }

                }
                //PLANO EMPRESARIAL I
                else if (planoSelecionado == 5) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Goodlife
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.goodlife);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //One Health
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.onehealth);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }
                    //Premium saude
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //Promed
                    else if (operadoraSelecionada == 4) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.promed);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Samp
                    else if (operadoraSelecionada == 5) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }

                    //Saude sistema
                    else if (operadoraSelecionada == 6) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Unimed
                    else if (operadoraSelecionada == 7) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Vitallis
                    else if (operadoraSelecionada == 8) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Vivamed saude
                    else if (operadoraSelecionada == 9) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }

                }
                //Epresaria II
                else if (planoSelecionado == 6) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }

                    //One health
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.onehealth);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Promed
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.promed);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //Saude sistema
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //unimed
                    else if (operadoraSelecionada == 4) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }


                }

                //PLANO INDIVIDUAL
                else if (planoSelecionado == 7) {
                    //godlife
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView2.setImageResource(R.drawable.goodlife);


                    }

                    //unimed
                    if (operadoraSelecionada == 1) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //vitallis
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturafixxsaudesistemaem1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturafixxsaudesistemaem02);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.coberturafinal);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }

                }
                //PLANO ODONTOLOGICO

                else if (planoSelecionado == 8) {
                    if (operadoraSelecionada == 0) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amildental);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturaamil);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView7.setImageResource(R.drawable.brancomini1);


                    } else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.previdenticone);
                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.coberturaprev1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.coberturaprev2);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView4.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView7.setImageResource(R.drawable.brancomini1);


                    } else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.goodlife);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView3.setImageResource(R.drawable.brancomini1);
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










