package com.avion.hundrem;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    Context ctx = this;
    TextView sptxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splash);

        if (!isconnected(splash.this)) building(splash.this).show();
        else
        {
            pauseScreen();
        }

    }
    public boolean isconnected(Context context)
    {
        ConnectivityManager cm=(ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo= cm.getActiveNetworkInfo();

        if(netinfo !=null && netinfo.isConnectedOrConnecting())
        {
            NetworkInfo wifi=cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            NetworkInfo mobile=cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public AlertDialog.Builder building(Context c)
    {
        AlertDialog.Builder builder =new AlertDialog.Builder(c);
        builder.setCancelable(false);
        builder.setIcon(R.mipmap.off);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or Wifi to access this. Press OK to exit");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        return builder;
    }

    private void pauseScreen() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(ctx, com.avion.hundrem.New_Home.class));
                finish();
            }
        },3000);
    }
}


