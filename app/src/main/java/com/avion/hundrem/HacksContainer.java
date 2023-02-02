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
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;




public class HacksContainer extends Fragment {

    LinearLayout stories;
    Context context = getContext();

    CardView one, two, three, four, five, six, seven, eight;
    ImageView star;
    RelativeLayout cc;
    ActionBar ab;
    public long backpresstime;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutInflater inflater1 = LayoutInflater.from(getActivity());
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        View convertView = inflater1.inflate(R.layout.hacks_container, null, false);
//        int images[] = {R.drawable.ic_launcher_background,R.mipmap.logo,R.mipmap.lifehackintro};
//        viewFlipper = convertView.findViewById(R.id.viewfliper);



        one = convertView.findViewById(R.id.one);
        two = convertView.findViewById(R.id.two);
        three = convertView.findViewById(R.id.three);
        four = convertView.findViewById(R.id.four);
        five = convertView.findViewById(R.id.five);
        six = convertView.findViewById(R.id.six);
        seven = convertView.findViewById(R.id.seven);
        eight = convertView.findViewById(R.id.eight);


        one.setOnClickListener((View.OnClickListener) context);
        two.setOnClickListener((View.OnClickListener) context);
        three.setOnClickListener((View.OnClickListener) context);
        four.setOnClickListener((View.OnClickListener) context);
        five.setOnClickListener((View.OnClickListener) context);
        six.setOnClickListener((View.OnClickListener) context);
        seven.setOnClickListener((View.OnClickListener) context);
        eight.setOnClickListener((View.OnClickListener) context);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Businessideas.class);
                startActivity(i);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Startup_Procedures.class);
                startActivity(i);
            }
        });three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Entrepreneurship_Skills.class);
                startActivity(i);
            }
        });four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Entrepreneurship_Development.class);
                startActivity(i);
            }
        });five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Business_Law.class);
                startActivity(i);
            }
        });six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Creative_Problem_Solving.class);
                startActivity(i);
            }
        });seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Business_Ethics.class);
                startActivity(i);
            }
        });eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), TEam_Bulding.class);
                startActivity(i);
            }
        });


        return convertView;

    }





}
