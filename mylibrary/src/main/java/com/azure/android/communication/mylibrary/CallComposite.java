package com.azure.android.communication.mylibrary;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import java.util.UUID;

public class CallComposite {
    private static int instanceId = 0;
    public CallComposite() {
    }
    public void launch(Context context, String callID,String acsToken) {
        Intent intent = new Intent(context, MyLibraryMainActivity.class);
        intent.putExtra("callID", callID);
        intent.putExtra("accessToken", acsToken);
        context.startActivity(intent);
    }

}

