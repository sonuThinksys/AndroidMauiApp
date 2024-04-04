package com.azure.android.communication.mylibrary;
import android.content.Context;
import android.content.Intent;

public class CallComposite {
    private static int instanceId = 0;
    public CallComposite() {
    }
    public void launch(Context context) {
        Intent intent = new Intent(context, MyLibraryMainActivity.class);
        context.startActivity(intent);
    }

}

