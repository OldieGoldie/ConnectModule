package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.myapplication.R.id.tvIsConnected;

public class SignUpActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final TextView tvIsConnected  = (TextView) findViewById(R.id.tvIsConnected);
        checkNetworkConnection(tvIsConnected);
        Intent intent = getIntent();
       /* checkNetworkConnection();*/

        /*final TextView tvIsConnected  = (TextView) findViewById(R.id.tvIsConnected);
        new AsynctaskRunner().execute("startar asynctask");*/
    }
    // Metod för att testa om nätverk finns.
    public boolean checkNetworkConnection(TextView text) {
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        boolean isConnected = false;
        if (networkInfo != null && (isConnected = networkInfo.isConnected())) {
            // show "Connected" & type of network "WIFI or MOBILE"
            text.setText("Connected "+networkInfo.getTypeName());
            // change background color to red
            text.setBackgroundColor(0xFF7CCC26);


        } else {
            // show "Not Connected"
            text.setText("Not Connected");
            // change background color to green
            text.setBackgroundColor(0xFFFF0000);
        }

        return isConnected;
    }

    public void testGithub(){

        int sommar = 1+1;
    }


    private class AsynctaskRunner extends AsyncTask<String, Integer, String>{
        //ladda en progressbar
        @Override
        protected void onPreExecute(){
            super.onPreExecute();


        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //TextView txt = (TextView) findViewById(R.id.output);
            //txt.setText("Executed");


        }

        @Override
        protected String doInBackground(String... params) {
            return null;
        }
    }
    // Slut på AsynctaskRunnerclass
}// Slut på Signupactivityclass
