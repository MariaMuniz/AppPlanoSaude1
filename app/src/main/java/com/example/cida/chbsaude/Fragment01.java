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
        categories.add("Adesão Affix");
        categories.add("Adesão Allcare");
        categories.add("Adesão Bem beneficios");
        categories.add("Adesão Qualicorp");
        categories.add("Ambulatorial");
        categories.add("Empresarial I");
        categories.add("Empresarial II");
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
        operadoras.add("Amil Premium");
        operadoras.add("Amil Supremo");
        operadoras.add("Amil Dental");
        operadoras.add("ANS");
        operadoras.add("Bradesco saúde allcare");
        operadoras.add("Bradesco Premium ");
        operadoras.add("Bradesco Supremo ");
        operadoras.add("Caixa Compulsório");
        operadoras.add("Caixa Voluntário");
        operadoras.add("Goodlife Saúde");
        operadoras.add("Odontoprev");
        operadoras.add("One Health");
        operadoras.add("Premium Saúde");
        operadoras.add("Premium Saúde Individual");
        operadoras.add("Prevident");
        operadoras.add("Promed");
        operadoras.add("Saúde Sistema");
        operadoras.add("Samp");
        operadoras.add("SulAmérica Premium");
        operadoras.add("SulAmérica Supremo");
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

                //PLANO ADESAO Affix
                if (planoSelecionado == 0) {
                    //SAMP
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.sampadesaoemp);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);
                    }
                    //SAUDE SISTEMA
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.saudesistemaallfixa);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.saudesistemaallfixmultia);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);
                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vivamedadesaoemp);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.vivamedadesaoidealemp);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini);


                    }
                }
                //PLANO ADESAO ALLCARE
                else if (planoSelecionado == 1) {

                    //BRADESCO SAUDE
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescosaude);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.bradescoflexalcare);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.bradescotopalcare2);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.bradescotopalcare30);

                    }
                    //SAMP
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.sampadesaoalcareemp);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);
                    }
                    //VIVAMED SAUDE
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vivamedadesaoemp);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.vivamedadesaoidealemp);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);

                    }
                    //VITALIS
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisadesao);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);

                    }
                }
                //PLANO ADESAO BEM BENEFICIOS
                else if (planoSelecionado == 2) {

                    //Saude sistema
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.saudesistemabembeneficio);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.saudesistemabembeneficioconsaude);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);

                    }
                }
                //PLANO ADESAO QUALICORP
                else if (planoSelecionado == 3) {
                    //Amil Premium
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.amiladsemcopprem400);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.amiladsempatprem700);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.amiladcompatprem400);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.amiladcompatprem700);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini);


                        //  ImageView myImageView9 = (ImageView) v.findViewById(R.id.imageView10);
                        //  myImageView9.setImageResource(R.drawable.corparticipacaoamil);


                    }
                    //Amil Supremo
                    else if (operadoraSelecionada == 1) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.amiladsemcopsupr400);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.amiladsemcopsup700);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.amiladcompatsup400);

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.amiladcompartsup700);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);



                    }


                    //Bradesco premium
                    else if (operadoraSelecionada == 2) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescoseguros);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.bradescopremiumflexcomcoparticip);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.bradescopremiumtopcomcoparticip);

                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.bradescopremiumtopplucomcoparticip);


                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.bradescopremiumsemcoparticip);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.bradescopremiumtopsemcoparticip);

                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.bradescopremiumtopplusemcoparticip);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini);

                    }
                    //Bradesco supremo
                    else if (operadoraSelecionada == 3) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.bradescoseguros);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.bradescosupremoperfilcomcoparticip);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.bradescosupremoflexcomcoparticip);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.bradescosupremotopcomcoparticip);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.bradescosupremonplus1);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.bradescosupremoperfilsemcoparticip);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.bradescosupremoflexsemcoparticip);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.bradescosupremotopsemcoparticip);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.bradescosupremotopnplusemcoparticip);
                        ImageView myImageView9 = (ImageView) v.findViewById(R.id.imageView10);
                        myImageView9.setImageResource(R.drawable.brancomini);


                    }

                    //Caixa Compulsoria
                    else if (operadoraSelecionada == 4) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.caixa);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.caixacomcopfundamentalcompulsoria1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.caixacomcopvitalcompulsoria2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.caixacomcopcompletocompulsoria3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.caixacomcopfundamentalcompulsoria4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.caixacomcopvitalcompulsoria5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.caixasemcompletocompulsoria6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);

                    }


                    //Caixa Voluntario
                    else if (operadoraSelecionada == 5) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.caixa);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.caixavoluntariofundamentalcomcop1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.caixavoluntariovitalcomcop2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.caixavoluntariocompletocomcop3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.caixavoluntariofundamentalsemcop4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.caixavoluntariovitalsemcop5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.caixavoluntariocompletosemcop6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);

                    }


                    //SulAmerica Premium
                    else if (operadoraSelecionada == 6) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.sulamerica);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.sulamericaexxatopremiumsemcorpa1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.sulamericaespecialpremiumsemcorpa2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.sulamericaespecialexecutivopremiumsemcorpa3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.sulamericaexecutivopremiumsemcorpa4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.sulamericaexxatopremiumcomcorpa5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.sulamericaespecialpremiumcomcorpa6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.sulamericaespecialexecutivopremiumcomcorpa7);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.sulamericaexecutivopremiumcomcorpa8);


                    }

                    //SulAmerica Supremo
                    else if (operadoraSelecionada == 7) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.sulamerica);


                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.sulamericaexatosupremosemcorpa1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.sulamericaespecialsupremosemcorpa2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.sulamericaespecialexecutivosupremosemcorpa3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.sulamericaexecutivosupremosemcorpa5);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini);

                    }
                }

                //PLANO AMBULATORIAL
                else if (planoSelecionado == 4) {
                    //premium
                    if (operadoraSelecionada == 0) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.premiumambulatorialemp);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.premiumambulatorialsemcopemp);
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
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);



                    }

                    if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.premium);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.premiumbronzeind1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.premiumbronzefamiliar2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.premiumouroind3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.premiumplatinafamiliar4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.premiumpratafamiliar5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.premiumourofamiliar6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);




                    }

                    //goodlife
                    if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.goodlife);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.brancomini1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.goodlifeambulatorialemp);
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
                        myImageView1.setImageResource(R.drawable.amil200comcoparticipemp1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.amil400comcoparticipemp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.amil700comcoparticipemp3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.amil200emp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.amil400emp5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.amil700emp6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);


                    }
                    //Goodlife
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.goodlife);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.googlifuniquegoodmp);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.googlifuniquemp);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini);

                    }

                    //One Health
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.onehealth);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.oneheathlincxempsemcop1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.oneheathlblackemp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.oneheathlblack2emp3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.oneheathlincxcopaticipaemp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.oneheathlblack1copaticipaemp5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.oneheathlblack2copaticipaemp6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini);


                    }

                    //Promed
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.promed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.promedcopartemp1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.promedcopartlifeemp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.promedcoparrtcomfortemp3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.promedselectupemp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.promedslifeupemp5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.promedslcomfortupemp6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);

                    }
                    //Samp
                    else if (operadoraSelecionada == 4) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.samp);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.samamplaemp);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.sampreferencialemp);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.sampsemobstetricia);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini);
                    }
                    //Saude sistema
                    else if (operadoraSelecionada == 5) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.saudesiscompartemp1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.saudesiscompart2emp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.saudesistmasteremp3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.saudesistessencialemp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);


                    }
                    //Unimed
                    else if (operadoraSelecionada == 6) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.unimed29plenoemp1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.unimed29unimaxemp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.unimeduniprt30emp3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.unimedunifacil50emp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.unimeduniprt50emp5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini);
                    }
                    //Vitallis
                    else if (operadoraSelecionada == 7) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisglobalemp);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.vitallispreferencialemp);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);

                    }
                    //Vivamed saude
                    else if (operadoraSelecionada == 8) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vivamed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vivamedemp);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);


                    }

                }

                //Empresarial II
                else if (planoSelecionado == 6) {
                    //Amil
                    if (operadoraSelecionada == 0) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.amil);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.amil2semcoparticip30emp1);

                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.amil4semcoparticip30emp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.amil7semcoparticip30emp3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.amil200comcoparticip30emp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.amil400comcoparticip30emp5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.amil7comcoparticip30emp6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini);


                    }
                    //One health
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.onehealth);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.onehealthlincxsemcop301);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.onehealthlincxsemcop302);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.onehealthlincxsemcop303);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.onehealthlincxcomcop304);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.onehealthlincxcomcop305);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.onehealthlincxcomcop306);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini);


                    }
                    //Promed
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.promed);


                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.promedselect30emp1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.promedslifet30emp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.promedslcomfort30emp3);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.promedslcomfortup30emp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.promedslifeup30emp5);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.promedcomfortup30emp6);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);


                    }

                    //Saude sistema
                    else if (operadoraSelecionada == 3) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.saudesistema);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.saudesistclassico30emp1);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.saudesist200classico30emp2);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.saudesistessencial30emp4);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.saudesistmaster30emp4);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);

                    }

                    //unimed
                    else if (operadoraSelecionada == 4) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.unimedplenoemp301);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.unifacilemp302);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.unimaxemp303);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.unipartflex30emp304);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.unipartflex50emp305);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.brancomini1);


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

                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView4.setImageResource(R.drawable.brancomini1);

                    }

                    //unimed
                    if (operadoraSelecionada == 1) {
                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.unimed);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.unimedpleno01);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.unipartflex0301);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.unipart1flex050);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.brancomini1);


                    }
                    //vitallis
                    else if (operadoraSelecionada == 2) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.vitallis);

                        ImageView myImageView1 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView1.setImageResource(R.drawable.vitallisindividual2);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.vitallisfamiliar);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
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
                        myImageView1.setImageResource(R.drawable.fisica);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView2.setImageResource(R.drawable.amilfamiliar1);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView3.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView4.setImageResource(R.drawable.noboletoamil);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView5.setImageResource(R.drawable.amilpme);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView6.setImageResource(R.drawable.empresa29);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView8);
                        myImageView7.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView8 = (ImageView) v.findViewById(R.id.imageView9);
                        myImageView8.setImageResource(R.drawable.empresarial99);



                    }
                    else if (operadoraSelecionada == 1) {

                        ImageView myImageView = (ImageView) v.findViewById(R.id.imageView);
                        myImageView.setImageResource(R.drawable.previdenticone);
                        ImageView myImageView2 = (ImageView) v.findViewById(R.id.imageView2);
                        myImageView2.setImageResource(R.drawable.previdentdiamond);
                        ImageView myImageView3 = (ImageView) v.findViewById(R.id.imageView3);
                        myImageView3.setImageResource(R.drawable.platinum);
                        ImageView myImageView4 = (ImageView) v.findViewById(R.id.imageView4);
                        myImageView4.setImageResource(R.drawable.previdenteouro);
                        ImageView myImageView5 = (ImageView) v.findViewById(R.id.imageView5);
                        myImageView5.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView6 = (ImageView) v.findViewById(R.id.imageView6);
                        myImageView6.setImageResource(R.drawable.brancomini1);
                        ImageView myImageView7 = (ImageView) v.findViewById(R.id.imageView7);
                        myImageView7.setImageResource(R.drawable.brancomini1);


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