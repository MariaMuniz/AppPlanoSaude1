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


public class Fragment01 extends Fragment {
    @Override
 //   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                    //         Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_fragment01, container, false);





    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragment01, container, false);

        String [] values =
                {"Familiar","Individual","Odontológico","Empresarial","Ambulatorial"};
        Spinner spinner = (Spinner) v.findViewById(R.id.spnPlano);
        ArrayAdapter<String> LTRadapter = new ArrayAdapter<String>(this.getActivity(),R.layout.support_simple_spinner_dropdown_item, values);
        LTRadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(LTRadapter);


        return v;


    }

}
