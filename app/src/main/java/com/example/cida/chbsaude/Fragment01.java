package com.example.cida.chbsaude;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
        categories.add("Adesão Alfix");
        categories.add("Adesão Allcare");
        categories.add("Adesão Bem beneficios");
        categories.add("Adesão Qualicorp");
        categories.add("Ambulatorial");
        categories.add("Empresarial");
        categories.add("Familiar");
        categories.add("Individual");
        categories.add("Odontológico");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
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
                    operadoras.add("Bradesco Qualicorp");
                    operadoras.add("SulAmérica");
                    operadoras.add("Caixa Seguradora");

                }

                if (position == 4) {
                    operadoras.add("Ambulatorial");


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
                    operadoras.add("Goodlife Saúde");
                    operadoras.add("Premium Saúde");
                    operadoras.add("Unimed");
                    operadoras.add("Vitallis");

                }
                if (position == 7) {
                    operadoras.add("Goodlife Saúde");
                    operadoras.add("Premium Saúde");
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



        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
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
                        myImageView1.setImageResource(R.drawable.samampla);
                    }
                    //SAUDE SISTEMA
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.samampla);
                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.samampla);

                    }
                }
                //PLANO ADESAO ACRE
                else if (planoSelecionado == 1) {

                    //BRADESCO SAUDE
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescosaude);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //SAMP
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);
                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //VITALIS
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                }
                //PLANO ADESAO BEM BENEFICIOS
                else if (planoSelecionado == 2) {

                    //Saude sistema
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);
                    }
                }
                //PLANO ADESAO QUALICORP
                else if (planoSelecionado == 3) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.amiladsemcopprem400);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.amiladsempatprem700);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.amiladsemcopsupr400);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.amiladsemcopsup700);

                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.amiladcompatprem400);

                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.amiladcompatprem700);

                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.amiladcompatsup400);

                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.amiladcompartsup700);

                        ImageView myImageView9 = (ImageView) v.findViewById(R.id.imageView10);
                        myImageView9.setImageResource(R.drawable.corparticipacaoamil);


                    }
                    //Bradesco seguros
                    else if (operadoraSelecionada == 1) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescoseguros);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //SulAmerica
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.sulamerica);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //Caixa
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.caixa);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);
                    }

                }
                //PLANO AMBULATORIAL
                else if (planoSelecionado == 4) {

                }
                //PLANO EMPRESARIAL
                else if (planoSelecionado == 5) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);
                    }
                    //Goodlife
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.goodlife);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //One Health
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.onehealth);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

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
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //Samp
                    else if (operadoraSelecionada == 5) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamedemp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);
                    }
                    //Saude sistema
                    else if (operadoraSelecionada == 6) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamedemp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //Unimed
                    else if (operadoraSelecionada == 7) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //Vitallis
                    else if (operadoraSelecionada == 8) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);

                    }
                    //Vivamed saude
                    else if (operadoraSelecionada == 9) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamedemp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);


                    }

                }
                //PLANO FAMILIAR
                else if (planoSelecionado == 6) {

                    //godlife
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.goodlife);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView2.setImageResource(R.drawable.goodlifeouro);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView3.setImageResource(R.drawable.goodlifebronze);


                    }
                    //premium
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);


                    }
                    //unimed
                    if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);


                    }
                    //vitallis
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);


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

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView3.setImageResource(R.drawable.goodlifebronze);

                    }
                    //premium
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);


                    }
                    //unimed
                    if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);


                    }
                    //vitallis
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);


                    }

                }
                //PLANO ODONTOLOGICO
                else if (planoSelecionado == 8) {

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        return v;

    }


}