package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TEam_Bulding extends AppCompatActivity {
    ListView list8;
    Context ctx = this;
    String[] team = {"WHAT IS TEAM BULDING",
            "TEAM LEADERSHIP",
            "REWARDING GROUP SUCESS",
            "TEAM IN A WORKING ENVIROMENT",
            "DEFINING SUCESS CRITERIA",
           };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team__bulding);

        getSupportActionBar().setTitle("Team Bulding");

        list8 = findViewById(R.id.list8);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx , R.layout.listdesign,R.id.textlist,team);
        list8.setAdapter(adapter1);
        list8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_seven, long id) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","bulding");
                ii.putExtra("position_seven", position_seven);
                startActivity(ii);
            }
        });
    }
}
