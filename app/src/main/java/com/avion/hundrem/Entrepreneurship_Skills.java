package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Entrepreneurship_Skills extends AppCompatActivity {
    ListView list3;
    Context ctx = this;
    String[] skill = {"ENTREPRENEURSHIP SKILL'S - OVERVIEW",
            "WHAT IS ENTREPRENEURSHIP",
            "WHO IS ENTREPRENEURSHIP",
            "WHO IS TECHNOPRENEUR",
            "TYPE'S OF ENTREPRENEURS",
            "ROLES OF ENTREPRENEURS",
            "ENTREPRENEURIAL MOTIVATION",
            "NEED FOR ACHIVEMENT",
            "RISK TAKING PROPENSITY",
            "GOAL SETTING STRATEGIES",
            "SMART GOALS",
            "EFFECTIVE COMMUNICATION",
            "THE 17 SKILLS REQUIRED TO SUCCEED AS AN ENTREPRENEUR  "
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrepreneurship__skills);

        getSupportActionBar().setTitle("Entrepreneurship Skill's");


        list3 = findViewById(R.id.list3);



        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx, R.layout.listdesign, R.id.textlist, skill);
        list3.setAdapter(adapter1);
        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_two, long id) {
                Intent ii = new Intent(ctx, com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile", "skill");
                ii.putExtra("position_two", position_two);
                startActivity(ii);
            }
        });
    }
}
