package com.myfirst.customactivitytwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReceiveActivity extends AppCompatActivity {

    private TextView mTvReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        mTvReceive = findViewById(R.id.tvReceive);
        Intent intent = getIntent();
            String dataReceive = intent.getStringExtra(Intent.EXTRA_TEXT);
            mTvReceive.setText(dataReceive);
    }
}