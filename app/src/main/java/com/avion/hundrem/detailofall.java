package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class detailofall extends AppCompatActivity {

    TextView one, txt2;
    LinearLayout lin;
    Context ctx = this;


    // Full screen & Banner ads start ************

   /* private AdView adViewidea;
    LinearLayout banner_container;

    private InterstitialAd interstitialAd;
    private final String TAG = detailofall.class.getSimpleName();*/

    // Full screen & Banner ads end ************

    int txtsize;
    //SwitchCompat sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailofall);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        AllocoateMemory();

        FullScreenADS();

        SetEvent();

       // AudienceNetworkAds.initialize(this);

        //ads start*----- banner ads

       /* adViewidea = new AdView(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_90);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adViewidea);

        // Request an ad
        adViewidea.loadAd();*/

        // ads End**----------------


        if (getIntent().getExtras().getString("sfile").equals("idea"))
            idea();
        else if (getIntent().getExtras().getString("sfile").equals("india"))
            india();
        else if (getIntent().getExtras().getString("sfile").equals("skill"))
            skill();
        else if (getIntent().getExtras().getString("sfile").equals("development"))
            development();
        else if (getIntent().getExtras().getString("sfile").equals("law"))
            law();
        else if (getIntent().getExtras().getString("sfile").equals("problem"))
            problem();
        else if (getIntent().getExtras().getString("sfile").equals("ethics"))
            ethics();
        else if (getIntent().getExtras().getString("sfile").equals("bulding"))
            bulding();
        else if (getIntent().getExtras().getString("sfile").equals("skills"))
            law();


        else if (getIntent().getExtras().getString("sfile").equals("m"))
            m();
        else if (getIntent().getExtras().getString("sfile").equals("exp"))
            exp();
        else if (getIntent().getExtras().getString("sfile").equals("hr"))
            hr();
        else if (getIntent().getExtras().getString("sfile").equals("Sales"))
            Sales();
        else if (getIntent().getExtras().getString("sfile").equals("mm"))
            mm();

        else if (getIntent().getExtras().getString("sfile").equals("s1"))
            s1();
        else if (getIntent().getExtras().getString("sfile").equals("s2"))
            s2();
        else if (getIntent().getExtras().getString("sfile").equals("s3"))
            s3();
        else if (getIntent().getExtras().getString("sfile").equals("s4"))
            s4();
        else if (getIntent().getExtras().getString("sfile").equals("s5"))
            s5();
        else if (getIntent().getExtras().getString("sfile").equals("s6"))
            s6();




        else
            Toast.makeText(ctx, "No Card ", Toast.LENGTH_SHORT).show();

    }

    private void AllocoateMemory() {
        one = findViewById(R.id.one);
        txt2 = findViewById(R.id.txt2);
        lin = findViewById(R.id.lin);
        //sc = findViewById(R.id.sc);
    }

    private void SetEvent() {

    }


    private void m() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.m);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }
    private void exp() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.exp);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void hr() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.hr);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void Sales() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.sales);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void mm() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.mm);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }




    private void s1() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.s1);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }
    private void s2() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.s2);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }
    private void s3() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.s3);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }
    private void s4() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.s4);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }
    private void s5() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.s5);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }
    private void s6() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.s6);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }













    private void idea() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.a0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.a1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.a2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.a3);//done
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.a4);//done
        else if (position == 5)
            FileContent = ReadFileFromApp(R.raw.a5);//done
        else if (position == 6)
            FileContent = ReadFileFromApp(R.raw.a6);//done
        else if (position == 7)
            FileContent = ReadFileFromApp(R.raw.a7);//done
        else if (position == 8)
            FileContent = ReadFileFromApp(R.raw.a8);//done
        else if (position == 9)
            FileContent = ReadFileFromApp(R.raw.a9);//done
        else if (position == 10)
            FileContent = ReadFileFromApp(R.raw.a10);//done
        else if (position == 11)
            FileContent = ReadFileFromApp(R.raw.a11);
        else if (position == 12)
            FileContent = ReadFileFromApp(R.raw.a12);
        else if (position == 13)
            FileContent = ReadFileFromApp(R.raw.a13);
        else if (position == 14)
            FileContent = ReadFileFromApp(R.raw.a14);
        else if (position == 15)
            FileContent = ReadFileFromApp(R.raw.a15);
        else if (position == 16)
            FileContent = ReadFileFromApp(R.raw.a16);
        else if (position == 17)
            FileContent = ReadFileFromApp(R.raw.a17);
        else if (position == 18)
            FileContent = ReadFileFromApp(R.raw.a18);
        else if (position == 19)
            FileContent = ReadFileFromApp(R.raw.a19);
        else if (position == 20)
            FileContent = ReadFileFromApp(R.raw.a20);
        else if (position == 21)
            FileContent = ReadFileFromApp(R.raw.a21);
        else if (position == 22)
            FileContent = ReadFileFromApp(R.raw.a22);
        else if (position == 23)
            FileContent = ReadFileFromApp(R.raw.a23);
        else if (position == 24)
            FileContent = ReadFileFromApp(R.raw.a24);
        else if (position == 25)
            FileContent = ReadFileFromApp(R.raw.a25);
        else if (position == 26)
            FileContent = ReadFileFromApp(R.raw.a26);
        else if (position == 27)
            FileContent = ReadFileFromApp(R.raw.a27);
        else if (position == 28)
            FileContent = ReadFileFromApp(R.raw.a28);
        else if (position == 29)
            FileContent = ReadFileFromApp(R.raw.a29);
        else if (position == 30)
            FileContent = ReadFileFromApp(R.raw.a30);
        else if (position == 31)
            FileContent = ReadFileFromApp(R.raw.a31);

        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void india() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.b0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.b1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.b2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.b3);
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.b4);
        else if (position == 5)
            FileContent = ReadFileFromApp(R.raw.b5);
        else if (position == 6)
            FileContent = ReadFileFromApp(R.raw.b6);
        else if (position == 7)
            FileContent = ReadFileFromApp(R.raw.b7);
        else if (position == 8)
            FileContent = ReadFileFromApp(R.raw.b8);
        else if (position == 9)
            FileContent = ReadFileFromApp(R.raw.b9);
        else if (position == 10)
            FileContent = ReadFileFromApp(R.raw.b10);
        else if (position == 11)
            FileContent = ReadFileFromApp(R.raw.b11);
        else if (position == 12)
            FileContent = ReadFileFromApp(R.raw.b12);
        else if (position == 13)
            FileContent = ReadFileFromApp(R.raw.b13);
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void skill() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_two");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.c0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.c1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.c2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.c3);
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.c4);
        else if (position == 5)
            FileContent = ReadFileFromApp(R.raw.c5);
        else if (position == 6)
            FileContent = ReadFileFromApp(R.raw.c6);
        else if (position == 7)
            FileContent = ReadFileFromApp(R.raw.c7);
        else if (position == 8)
            FileContent = ReadFileFromApp(R.raw.c8);
        else if (position == 9)
            FileContent = ReadFileFromApp(R.raw.c9);
        else if (position == 10)
            FileContent = ReadFileFromApp(R.raw.c10);
        else if (position == 11)
            FileContent = ReadFileFromApp(R.raw.c11);
        else if (position == 12)
            FileContent = ReadFileFromApp(R.raw.c12);

        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void development() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_three");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.d0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.d1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.d2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.d3);
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.d4);
        else if (position == 5)
            FileContent = ReadFileFromApp(R.raw.d5);
        else if (position == 6)
            FileContent = ReadFileFromApp(R.raw.d6);
        else if (position == 7)
            FileContent = ReadFileFromApp(R.raw.d7);
        else if (position == 8)
            FileContent = ReadFileFromApp(R.raw.d8);
        else if (position == 9)
            FileContent = ReadFileFromApp(R.raw.d9);
        else if (position == 10)
            FileContent = ReadFileFromApp(R.raw.d10);
        else if (position == 11)
            FileContent = ReadFileFromApp(R.raw.d11);
        else if (position == 12)
            FileContent = ReadFileFromApp(R.raw.d12);
        else if (position == 13)
            FileContent = ReadFileFromApp(R.raw.d13);
        else if (position == 14)
            FileContent = ReadFileFromApp(R.raw.d14);

        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void law() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_four");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.e0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.e1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.e2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.e3);
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.e4);
        else if (position == 5)
            FileContent = ReadFileFromApp(R.raw.e5);
        else if (position == 6)
            FileContent = ReadFileFromApp(R.raw.e6);
        else if (position == 7)
            FileContent = ReadFileFromApp(R.raw.e7);
        else if (position == 8)
            FileContent = ReadFileFromApp(R.raw.e8);
        else if (position == 9)
            FileContent = ReadFileFromApp(R.raw.e9);
        else if (position == 10)
            FileContent = ReadFileFromApp(R.raw.e10);
        else if (position == 11)
            FileContent = ReadFileFromApp(R.raw.e11);
        else if (position == 12)
            FileContent = ReadFileFromApp(R.raw.e12);


        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void problem() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_five");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.f0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.f1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.f2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.f3);
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.f4);
        else if (position == 5)
            FileContent = ReadFileFromApp(R.raw.f5);
        else if (position == 6)
            FileContent = ReadFileFromApp(R.raw.f6);
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void ethics() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_six");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.g0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.g1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.g2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.g3);
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.g4);
        else if (position == 5)
            FileContent = ReadFileFromApp(R.raw.g5);
        else if (position == 6)
            FileContent = ReadFileFromApp(R.raw.g6);
        else if (position == 7)
            FileContent = ReadFileFromApp(R.raw.g7);
        else if (position == 8)
            FileContent = ReadFileFromApp(R.raw.g8);
        else if (position == 9)
            FileContent = ReadFileFromApp(R.raw.g9);
        else if (position == 10)
            FileContent = ReadFileFromApp(R.raw.g10);
        else if (position == 11)
            FileContent = ReadFileFromApp(R.raw.g11);
        else if (position == 12)
            FileContent = ReadFileFromApp(R.raw.g12);
        else if (position == 13)
            FileContent = ReadFileFromApp(R.raw.g13);
        else if (position == 14)
            FileContent = ReadFileFromApp(R.raw.g14);


        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void bulding() {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_seven");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.h0);//done
        else if (position == 1)
            FileContent = ReadFileFromApp(R.raw.h1);//done
        else if (position == 2)
            FileContent = ReadFileFromApp(R.raw.h2);//done
        else if (position == 3)
            FileContent = ReadFileFromApp(R.raw.h3);
        else if (position == 4)
            FileContent = ReadFileFromApp(R.raw.h4);

        else
            FileContent = "File not available";
        one.setText(FileContent);
    }



    @Override
    public void onBackPressed()
    {
        //FullScreenADS();
        super.onBackPressed();
    }







    public String ReadFileFromApp(int FileId) {
        Resources r1 = ctx.getResources();
        InputStream is = r1.openRawResource(FileId);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer content = new StringBuffer(8192);
        String Line = new String();
        try {

            while ((Line = br.readLine()) != null)
                content.append(Line + "\n");

        } catch (IOException e) {
            content.append("File can not be read");
            Toast.makeText(ctx, "File Read Error " +
                    e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return content.toString();
    }

    private void FullScreenADS() {
        //---** fullscreen ads ---**//
        /*interstitialAd = new InterstitialAd(this, "YOUR_PLACEMENT_ID");
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                Log.d(TAG, "Interstitial ad impression logged!");
            }
        });

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd.loadAd();
*/

        //---** fullscreens ads over --**//
    }





}
