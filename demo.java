package com.poweron.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout ananthLayout = new RelativeLayout(this);
        ananthLayout.setBackgroundColor(Color.BLUE);

        RelativeLayout.LayoutParams buttondetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        Button yellowButton = new Button(this);
        yellowButton.setText("Click");
        yellowButton.setBackgroundColor(Color.YELLOW);


        buttondetails.addRule(RelativeLayout.CENTER_VERTICAL);
        buttondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        ananthLayout.addView( yellowButton, buttondetails);
        setContentView(ananthLayout);
    }
