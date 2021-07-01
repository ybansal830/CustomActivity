package com.myfirst.customactivityone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtSend;
    private TextView mTvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvData = findViewById(R.id.tvData);
        mBtSend = findViewById(R.id.btSend);
        mBtSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                String data = mTvData.getText().toString();
                intent.putExtra(Intent.EXTRA_TEXT,data);
                startActivity(intent);
            }
        });
    }
}