package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class Business_Ethics extends AppCompatActivity {

    ListView list7;
    Context ctx = this;
    String[] ethics = {"WHAT IS BUSINESS ETHICS",
            "CODE OF ETHICS",
            "FEATURES OF BUSINESS ETHICS",
            "WHAT IS MORALITY",
            "WHERE DOES MORALITY COME FROM",
            "MORAL DECISION MAKING",
            "KEEPING CUSTOMERS ON TOP",
            "ETHICAL ISSUES IN MARKETING",
            "TARGETING THE MARKET AUIDENCE",
            "PRICING ETHICS",
            "LOYALTY TO THE COMPANY",
            "TAKING CREADIT OF OTHER WORK",
            "SECURITY CONCERNS",
            "RISK PRONE AREA",
            "TYPE OF AGRESSIVE BEHAVIOURS",
           };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__ethics);

        getSupportActionBar().setTitle("Business Ethic's ");


        list7 = findViewById(R.id.list7);



        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx , R.layout.listdesign,R.id.textlist,ethics);
        list7.setAdapter(adapter1);
        list7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_six, long id) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","ethics");
                ii.putExtra("position_six", position_six);
                startActivity(ii);
            }
        });
    }
}
