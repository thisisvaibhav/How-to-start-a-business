package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Entrepreneurship_Development extends AppCompatActivity {

    ListView list4;
    Context ctx = this;
    String[] development = {"ENTREPRENEURSHIP - INTRODUCTION",
            "MOTIVATION - AN IMPORTANT FACTOR",
            "WHY IS MOTIVATION REQUIRED",
            "RESULT OF MOTIVATION",
            "WHY START A BUSINESS",
            "HOW TO START A BUSINESS",
            "ENTREPRENEURSHIP DEVELOPMENT QUALITIES",
            "SKILLS OF AN ENTREPRENEURSHIP",
            "MIND Vs MONEY",
            "TEST YOUR IDEA",
            "DECISION MAKING STEPS",
            "PLANING STEPS",
            "IMPLEMENTATION STEPS",
            "MANAGERIAL STEPS",
            "GO BEYOUND BUSINESS PLANE",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrepreneurship__development);

        getSupportActionBar().setTitle("Entrepreneurship Development");

        list4 = findViewById(R.id.list4);




        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx, R.layout.listdesign, R.id.textlist, development);
        list4.setAdapter(adapter1);
        list4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_three, long id) {
                Intent ii = new Intent(ctx, com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile", "development");
                ii.putExtra("position_three", position_three);
                startActivity(ii);
            }
        });
    }
}
