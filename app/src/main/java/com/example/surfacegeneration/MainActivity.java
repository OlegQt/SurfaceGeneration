package com.example.surfacegeneration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInfo=findViewById(R.id.txtInfo);

        String strInfo = "Surface application \n created successfully";
        txtInfo.setText(strInfo);
    }
}