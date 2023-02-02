package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Businessideas extends AppCompatActivity {

    ListView list1;
    Context ctx = this;
    String[] idea = {"ICE CREAM CONE MAKING",
            "ICE CREAM MAKING",
            "INVITATION CARD MAKING",
            "JUTE BAG MAKING",
            "LIQUID SOAP MAKING",
            "COCONUT OIL MANUFACTURING",
            "GROUND OIL MANUFACTURING",
            "RICE MILL PLANT",
            "MINI PAPER MILL",
            "NOODLES MAKING",
            "NUTS BOLTS MAKING",
            "PAPAD MAKING",
            "PAPER CUP MAKING",
            "RUBBER BAND MAKING",
            "SLIPPER MAKING",
            "T-SHIRT MAKING",
            "TISSUE PAPER MAKING",
            "BAKERY BUSINESS",
            "BIO-DIESEL PRODUCTION",
            "COTTON BUDS",
            "WEBSITE DEVELOPMENT",
            "APPLICATION DEVELOPMENT",
            "DELIVERY SERVICES",
            "EVENT PLANNING",
            "DJING",
            "HOUSE PANTING",
            "CAR WASH",
            "HIGH-TECH SALON",
            "COFFEE SHOP",
            "BLOG OR VLOG",
            "CAKE SHOP",
            "CHOCOLATE MAKING",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_businessideas);

        getSupportActionBar().setTitle("Business Idea's");
        list1 = findViewById(R.id.list1);



        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ctx , R.layout.listdesign,R.id.textlist,idea);
        list1.setAdapter(adapter1);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ii = new Intent(ctx , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","idea");
                ii.putExtra("position", position);
                startActivity(ii);
            }
        });
    }
}
