package com.azure.android.communication.androidmauiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.azure.android.communication.mylibrary.CallComposite;
import java.util.UUID;

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
        EditText accessTokenView = findViewById(R.id.accessToken);
        String userToken = accessTokenView.getText().toString();
        EditText callIdView = findViewById(R.id.call_id);
        String callId = callIdView.getText().toString();
        CallComposite callComposite=new CallComposite();
        callComposite.launch(this, "9d377f41-6fcf-0161-0000-000000000000","eyJhbGciOiJSUzI1NiIsImtpZCI6IjYwNUVCMzFEMzBBMjBEQkRBNTMxODU2MkM4QTM2RDFCMzIyMkE2MTkiLCJ4NXQiOiJZRjZ6SFRDaURiMmxNWVZpeUtOdEd6SWlwaGsiLCJ0eXAiOiJKV1QifQ.eyJza3lwZWlkIjoiYWNzOjExYzk1NjI4LWRhNzMtNDZmMi05NzY5LTgxOTkwMjdiMjFiZV8wMDAwMDAxZi03MGQ4LTA4YWMtMzVmMy0zNDNhMGQwMDZmZWUiLCJzY3AiOjE3OTIsImNzaSI6IjE3MTI5MDI3OTMiLCJleHAiOjE3MTI5ODkxOTMsInJnbiI6ImFtZXIiLCJhY3NTY29wZSI6InZvaXAiLCJyZXNvdXJjZUlkIjoiMTFjOTU2MjgtZGE3My00NmYyLTk3NjktODE5OTAyN2IyMWJlIiwicmVzb3VyY2VMb2NhdGlvbiI6InVuaXRlZHN0YXRlcyIsImlhdCI6MTcxMjkwMjc5M30.hVutZw1RGeUWmq-7nxr45VPBZUKZldzIBhyA__b4STvUJY9h4ECPniWFbdoHnAtly1b15rVFpMOxwIQHBEPfb4CzHiGNCeINFaokQyDR8nK5xIsTNKwXo-fHpAsfaNbtf30zlcbUysmkjh3mIF1b6H8dBVV8uF_zq77OfzNUG_dWafnkqjnhTpdR9yc8mH3uHz2Xadguab1m8UNYVATdaKigsSlVUyJ3R1M2WT_UIhNties6aSS8TDfUjLrhksVBXtZ28uFwkQAM8tGCRC66HCkVTHOLQOX3mAHt1lrH_uza6bxjwiPsYrSBLHnhoCBlMhSEoDyZ6fXF0NyLSjDnog");
    }
}