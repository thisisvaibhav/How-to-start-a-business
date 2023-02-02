package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Business_Law extends AppCompatActivity {

    ListView list5;
    Context ctx = this;
    String[] law = {"BUSINESS LAW OVERVIEW",
            "WHAT IS COMPANY",
            "MEANING AND NATURE OF COMPANY",
            "CLASIFICATION OF COMPANY",
            "CONVERSATION OF CLOSE COMPANY TO PRIVATE ",
            "PARTNERSHIP",
            "TRUST'S",
            "FORMATION OF COMPANY",
            "PRIVATE COMPANY AND PUBLIC COMPANY",
            "TYPE'S OF PREFERENCE SHARES",
            "EQUITY SHARES",
            "BUY-BACK OF SHARE",
            "GENERAL DUTIES OF DIRECTORS",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__law);

        getSupportActionBar().setTitle("Business Law");


        list5 = findViewById(R.id.list5);




        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx , R.layout.listdesign,R.id.textlist,law);
        list5.setAdapter(adapter1);
        list5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_four, long id) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","law");
                ii.putExtra("position_four", position_four);
                startActivity(ii);
            }
        });
    }
}
