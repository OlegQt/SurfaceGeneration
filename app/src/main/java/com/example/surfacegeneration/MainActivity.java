package com.example.surfacegeneration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

import com.example.surfacegeneration.UI.MySV;

public class MainActivity extends AppCompatActivity {
    protected TextView txtInfo;
    protected MySV gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInfo=findViewById(R.id.txtInfo);

        String strInfo = "Surface application \n created successfully";
        txtInfo.setText(strInfo);

        gameView = new MySV(this);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    @Override
    protected void onResume() {
        super.onResume();
        this.gameView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.gameView.pause();
    }
}