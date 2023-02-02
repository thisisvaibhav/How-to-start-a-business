package com.avion.hundrem;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class bottomsheet extends BottomSheetDialogFragment {

    ImageView rate, sendff, more;
    TextView su;

    Context context = getContext();
    EditText topic, message, hh;
    LinearLayout raate, share, dm, policy, us, content;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutInflater inflater1 = LayoutInflater.from(getActivity());
        final View convertView = inflater1.inflate(R.layout.bottomsheet, null, false);

        more = convertView.findViewById(R.id.moreapp);
        rate = convertView.findViewById(R.id.rate);
        su = convertView.findViewById(R.id.su);


        // new

        sendff = convertView.findViewById(R.id.sendff);
        rate = convertView.findViewById(R.id.rate);
        share = convertView.findViewById(R.id.share);
        dm = convertView.findViewById(R.id.dm);
        policy = convertView.findViewById(R.id.policy);
        us = convertView.findViewById(R.id.us);
        content = convertView.findViewById(R.id.content);
        topic = convertView.findViewById(R.id.title);
        message = convertView.findViewById(R.id.message);


        // new end



        //new click

        sendff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strUserName = topic.getText().toString();
                String mm = message.getText().toString();

                if (TextUtils.isEmpty(strUserName) && TextUtils.isEmpty(mm)) {
                    topic.setError("");
                    message.setError("");
                    return;
                } else {

                    Intent im = new Intent(Intent.ACTION_SEND);
                    im.setData(Uri.parse("mailto"));

                    String[] to = {"purohitvaibhav17"};
                    im.putExtra(Intent.EXTRA_EMAIL, to);

                    String text = topic.getText().toString();
                    im.putExtra(Intent.EXTRA_TEXT, text);

                    String subject = message.getText().toString();
                    im.putExtra(Intent.EXTRA_SUBJECT, subject);

                    im.setType("message/rfc822");
                    startActivity(Intent.createChooser(im, "Select Mail App"));
                }
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String AppUrl = "market://details?id=com.illusion.motivation";
                Intent is = new Intent(Intent.ACTION_VIEW, Uri.parse(AppUrl));
                startActivity(is);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_SEND);
                final String appPackageNAme = getActivity().getPackageName();
                String strAppLink = "";


                try {
                    strAppLink = "http://play.google.com/store/apps/details?id=" + appPackageNAme;
                } catch (android.content.ActivityNotFoundException anfe) {
                    strAppLink = "https:/play.google.com/store/apps/details?id=" + appPackageNAme;
                }
                a.setType("text/link");
                String sharebody = "To Get the best Motivation , With More then 100 Quotes and  life-learning lesson " +
                        "  Download this App and enjoy the reading and motivational Knowladge" + "\n" + "" + strAppLink;
                String sharesub = "APP NAME ";
                a.putExtra(Intent.EXTRA_SUBJECT, sharesub);
                a.putExtra(Intent.EXTRA_TEXT, sharebody);
                startActivity(Intent.createChooser(a, "Share Using"));
            }
        });

        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Appinsta = "https://instagram.com/thisisvaibhavpurohit?igshid=aful4f1dkgyd";
                Intent is = new Intent(Intent.ACTION_VIEW, Uri.parse(Appinsta));
                startActivity(is);
            }
        });

        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pageurl = "https://privacypolicyforstartup.blogspot.com/2022/10/privacy-policy-avion-built-startup-idea.html";
                Intent isp = new Intent(Intent.ACTION_VIEW, Uri.parse(pageurl));
                startActivity(isp);
            }
        });

        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pageurl = "https://play.google.com/store/apps/dev?id=8974886575470276226";
                Intent isp = new Intent(Intent.ACTION_VIEW, Uri.parse(pageurl));
                startActivity(isp);
            }
        });

        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                ViewGroup viewGroup = convertView.findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.contentdetail, viewGroup, false);
                builder.setView(dialogView);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


        //new clicks end

        su.setPaintFlags(su.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);


        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pageurl = "https://play.google.com/store/apps/dev?id=8974886575470276226";
                Intent isp = new Intent(Intent.ACTION_VIEW, Uri.parse(pageurl));
                startActivity(isp);

                //Toast.makeText(getContext(), "Currently, We are working on this function :)", Toast.LENGTH_SHORT).show();
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String AppUrl = "market://details?id=com.avion.hundrem";
                Intent is = new Intent(Intent.ACTION_VIEW, Uri.parse(AppUrl));
                startActivity(is);
                Toast.makeText(getContext(), "Rate Us Five Star", Toast.LENGTH_SHORT).show();
            }
        });




        return convertView;
    }
}
