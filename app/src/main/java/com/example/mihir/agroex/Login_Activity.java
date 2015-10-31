package com.example.mihir.agroex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.ibm.mobilefirstplatform.clientsdk.android.core.api.BMSClient;

import java.net.MalformedURLException;

/**
 * Created by Dharmesh-PC on 31/10/2015.
 */
public class Login_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        Log.d("blue","Started");
        try {
            BMSClient.getInstance().initialize(this, "http://AgroEx.mybluemix.net", "5de44166-52c2-454b-97a2-3597949df486");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        setContentView(R.layout.login_activity);
    }
}
