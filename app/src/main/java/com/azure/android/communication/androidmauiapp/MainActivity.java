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
        callComposite.launch(this, "9d377f41-6fcf-0161-0000-000000000000","eyJhbGciOiJSUzI1NiIsImtpZCI6IjYwNUVCMzFEMzBBMjBEQkRBNTMxODU2MkM4QTM2RDFCMzIyMkE2MTkiLCJ4NXQiOiJZRjZ6SFRDaURiMmxNWVZpeUtOdEd6SWlwaGsiLCJ0eXAiOiJKV1QifQ.eyJza3lwZWlkIjoiYWNzOjExYzk1NjI4LWRhNzMtNDZmMi05NzY5LTgxOTkwMjdiMjFiZV8wMDAwMDAxZi02YmU4LTU1NWQtMzVmMy0zNDNhMGQwMDI3ZDkiLCJzY3AiOjE3OTIsImNzaSI6IjE3MTI4MTk5NzUiLCJleHAiOjE3MTI5MDYzNzUsInJnbiI6ImFtZXIiLCJhY3NTY29wZSI6InZvaXAiLCJyZXNvdXJjZUlkIjoiMTFjOTU2MjgtZGE3My00NmYyLTk3NjktODE5OTAyN2IyMWJlIiwicmVzb3VyY2VMb2NhdGlvbiI6InVuaXRlZHN0YXRlcyIsImlhdCI6MTcxMjgxOTk3NX0.mICH1aDTXYASgZLf1LJVUv8c4tMg9Pybix_RxRgm7J-fksfMvs2GPTraexEP51kDCEexWcnsLxguPOB0iKyuYZtS2HmYjef2MhGeqnV6AOvv69uoqtKlpAnVSZ_ry0C2zmZk6wuEwS_qdG05RGCzN8CPu0GgS9-FA95EBpb4cRSkw3_BtKQHD1EHfJCysbXrtgot_hXQI_o8-nhaDVFROP4xC58GSsBoeL1A5-gvmq3MSYAN22R-Mna98pSDlYy3mQrZRkR_TVn7uVU7Hh0KqiOJnyAURaeNEkvcTgBjxRl2gdJGVm8bstTA2IrUEvvedjP2GOjgTOGVrYxBz2cpmw");
    }
}