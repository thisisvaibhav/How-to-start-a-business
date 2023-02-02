package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Startup_Procedures extends AppCompatActivity {

    ListView list2;
    Context ctx = this;
    String[] process = {"SMALL BUSINESS MANUFACTURING",
            "GST REGISTRATION PROCESS IN INDIA",
            "CLEARANCE FOR SMALL BUSINESS MANUFACTURING",
            "LOAN AGAINST PROPERTY | HOW TO APPLY",
            "FACTORY LOACTION SELECTION",
            "OBTAIN PROFESSIONAL TAX REGISTRATION",
            "FOOD BUSINESS STARTUP",
            "10 THING TO CONSIDER IN STARTING PRODUCT BASED BUSINESS",
            "ONE PERSON COMPANY IN INDIA",
            "10 CHARACTERISTICS OF SUCESSFUL ENTREPRENEURS",
            "HOW TO RAIS SMALL BUSINESS CAPITAL FROM INVESTOR",
            "REASON WHY STARTUP ENTREPRENEURS MUST HAVE A BUSINESS PLAN",
            "TIPS TO ATTRACT CUSTOMER IN INDIA",
            "HOW TO START A ONLINE CLOTH STORE IN INDIA"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian__startup__procedures);

        getSupportActionBar().setTitle("Indian StartUp Procedures");

        list2 = findViewById(R.id.list2);



        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx , R.layout.listdesign,R.id.textlist,process);
        list2.setAdapter(adapter1);
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_one, long id) {
                Intent ip = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ip.putExtra("sfile","india");
                ip.putExtra("position_one", position_one);
                startActivity(ip);
            }
        });
    }
}
