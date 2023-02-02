package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Skills extends AppCompatActivity {

    ListView lists;
    Context ctx = this;
    CardView Marketing , exp , hr,Sales,mm;
    CardView s1,s2,s3,s4,s5,s6;
    LinearLayout linbha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        allocoatememory();
        setevent();

    }

    private void allocoatememory()
    {
        Marketing = findViewById(R.id.Marketing);
        exp = findViewById(R.id.exp);
        hr = findViewById(R.id.hr);
        Sales = findViewById(R.id.Sales);
        mm = findViewById(R.id.mm);
        linbha  = findViewById(R.id.linbha);
//        s2 = findViewById(R.id.s2);
//        s3 = findViewById(R.id.s3);
//        s4 = findViewById(R.id.s4);
//        s5 = findViewById(R.id.s5);
//        s6 = findViewById(R.id.s6);

    }

    private void setevent() {


        Marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","m");
                startActivity(ii);
            }
        });

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","exp");
                startActivity(ii);
            }
        });

        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","hr");
                startActivity(ii);
            }
        });

        Sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","Sales");
                startActivity(ii);
            }
        });

        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","mm");
                startActivity(ii);
            }
        });

        linbha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(ctx , female.class);
                startActivity(ii);
            }
        });
//
//        s2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent ii = new Intent(ctx , detailofall.class);
//                ii.putExtra("sfile","s2");
//                startActivity(ii);
//            }
//        });
//
//        s3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent ii = new Intent(ctx , detailofall.class);
//                ii.putExtra("sfile","s3");
//                startActivity(ii);
//            }
//        });
//
//        s4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent ii = new Intent(ctx , detailofall.class);
//                ii.putExtra("sfile","s4");
//                startActivity(ii);
//            }
//        });
//
//        s5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent ii = new Intent(ctx , detailofall.class);
//                ii.putExtra("sfile","s5");
//                startActivity(ii);
//            }
//        });
//
//        s6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent ii = new Intent(ctx , detailofall.class);
//                ii.putExtra("sfile","s6");
//                startActivity(ii);
//            }
//        });



    }
}
