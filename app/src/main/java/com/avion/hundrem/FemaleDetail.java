package com.avion.hundrem;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FemaleDetail extends AppCompatActivity {

    Context ctx = this;
    TextView one, txt2;
    private final String TAG = com.avion.hundrem.detailofall.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_detail);

        one = findViewById(R.id.one);
        txt2 = findViewById(R.id.txt2);


        if (getIntent().getExtras().getString("sfile").equals("one"))
            One();
        else if (getIntent().getExtras().getString("sfile").equals("two"))
            Two();
        else if (getIntent().getExtras().getString("sfile").equals("three"))
            Three();
        else if (getIntent().getExtras().getString("sfile").equals("four"))
            Four();
        else if (getIntent().getExtras().getString("sfile").equals("five"))
            Five();
        else if (getIntent().getExtras().getString("sfile").equals("six"))
            Six();

    }

    private void Six() {

        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.six);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void Five() {

        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.five);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void Four() {

        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.four);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }


    private void Two() {

        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.two);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }
    private void Three()
    {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.three);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    private void One()
    {
        int position = 0;
        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position_one");

        String FileContent = new String();

        if (position == 0)
            FileContent = ReadFileFromApp(R.raw.one);//done
        else
            FileContent = "File not available";
        one.setText(FileContent);
    }

    public String ReadFileFromApp(int FileId) {
        Resources r1 = ctx.getResources();
        InputStream is = r1.openRawResource(FileId);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer content = new StringBuffer(8192);
        String Line = new String();
        try {

            while ((Line = br.readLine()) != null)
                content.append(Line + "\n");

        } catch (IOException e) {
            content.append("File can not be read");
            Toast.makeText(ctx, "File Read Error " +
                    e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return content.toString();
    }

}
