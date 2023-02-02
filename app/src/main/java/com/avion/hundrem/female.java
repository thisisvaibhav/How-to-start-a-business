package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class female extends AppCompatActivity {

    Context ctx = this;
    CardView one, two,three,four,five,six;

   /* private AdView adView;
    LinearLayout banner_container;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);
        allocatememory();
        SetEvent();

        //AudienceNetworkAds.initialize(this);

        //ads start*-----
       /* adView = new AdView(this, "404930963811641_404932797144791", AdSize.RECTANGLE_HEIGHT_250);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();*/

        //---*** ads end ***---//

    }

    private void SetEvent()
    {
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.FemaleDetail.class);
                ii.putExtra("sfile","one");
                startActivity(ii);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.FemaleDetail.class);
                ii.putExtra("sfile","two");
                startActivity(ii);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.FemaleDetail.class);
                ii.putExtra("sfile","three");
                startActivity(ii);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.FemaleDetail.class);
                ii.putExtra("sfile","four");
                startActivity(ii);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.FemaleDetail.class);
                ii.putExtra("sfile","five");
                startActivity(ii);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.FemaleDetail.class);
                ii.putExtra("sfile","six");
                startActivity(ii);
            }
        });
    }

    private void allocatememory()
    {

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six  = findViewById(R.id.six);
    }
}
