package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.avion.hundrem.R;

public class Investment extends Fragment {

    ListView lists;
    Context context = getContext();
    CardView Marketing , exp , hr,Sales,mm;
    CardView s1,s2,s3,s4,s5,s6;
    LinearLayout linbha;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutInflater inflater1 = LayoutInflater.from(getActivity());
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        View convertView = inflater1.inflate(R.layout.investment_container, null, false);

        // allocatememory

        Marketing = convertView.findViewById(R.id.Marketing);
        exp = convertView.findViewById(R.id.exp);
        hr = convertView.findViewById(R.id.hr);
        Sales = convertView.findViewById(R.id.Sales);
        mm = convertView.findViewById(R.id.mm);
        linbha  = convertView.findViewById(R.id.linbha);


        //set event

        Marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getContext() , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","m");
                startActivity(ii);
            }
        });

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getContext() , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","exp");
                startActivity(ii);
            }
        });

        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getContext() , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","hr");
                startActivity(ii);
            }
        });

        Sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getContext() , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","Sales");
                startActivity(ii);
            }
        });

        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getContext() , com.avion.hundrem.detailofall.class);
                ii.putExtra("sfile","mm");
                startActivity(ii);
            }
        });

        linbha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getContext() , female.class);
                startActivity(ii);
            }
        });



        return convertView;

    }
}
