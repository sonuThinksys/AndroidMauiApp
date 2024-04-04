package com.azure.android.communication.androidmauiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.azure.android.communication.mylibrary.CallComposite;

public class MainActivity extends AppCompatActivity {
    Button startCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         startCall=(Button)findViewById(R.id.startCall);
         startCall.setOnClickListener(v -> {
             callStart();
         });
    }

    void callStart(){
        CallComposite callComposite=new CallComposite();
        callComposite.launch(this);
    }
}