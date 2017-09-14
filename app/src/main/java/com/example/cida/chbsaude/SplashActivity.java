package com.example.cida.chbsaude;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import com.example.cida.chbsaude.MainActivity;
import com.example.cida.chbsaude.R;

/**
 * Created by Alexsander on 08/08/2016.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }

    @Override
    protected void onResume() {
        super.onResume();
        new Espera().execute("");
    }

    class Espera extends AsyncTask<String, String, String>
    {

        @Override
        protected String doInBackground(String... params) {
            SystemClock.sleep(2000);
            return null;
        }

        @Override
        protected void onPostExecute(String result)
        {

            Intent i = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(i);
        }
    }
}
