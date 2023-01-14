package com.example.surfacegeneration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

import com.example.surfacegeneration.UI.MySV;

public class MainActivity extends AppCompatActivity {
    protected TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInfo=findViewById(R.id.txtInfo);

        String strInfo = "Surface application \n created successfully";
        txtInfo.setText(strInfo);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        MySV gameView = new MySV(this);
    }

}