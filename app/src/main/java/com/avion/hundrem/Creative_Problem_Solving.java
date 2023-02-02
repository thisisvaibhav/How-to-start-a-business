package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Creative_Problem_Solving extends AppCompatActivity {

    ListView list6;
    Context ctx = this;
    String[] problem = {"CREATIVE IN BUSINESS",
            "CREATIVE SKILLS OF A MANAGER",
            "CREATIVE PROBLEM SOLVING",
            "QUALITY OF A CREATIVE PERSON",
            "THE CPS PROCESS",
            "CPS STAGES",
            "BLOCKS TO INNOVATIVE IDEAS",
           };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative__problem__solving);

        getSupportActionBar().setTitle("Creative Problem Solving ");


        list6 = findViewById(R.id.list6);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx , R.layout.listdesign,R.id.textlist,problem);
        list6.setAdapter(adapter1);
        list6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_five, long id) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","problem");
                ii.putExtra("position_five", position_five);
                startActivity(ii);
            }
        });
    }
}
