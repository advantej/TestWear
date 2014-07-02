package com.advantej.mobile.android.testwear;

import android.util.Log;

import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.WearableListenerService;

public class MyService extends WearableListenerService {
    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    public void onDataChanged(DataEventBuffer dataEvents) {
        super.onDataChanged(dataEvents);
        Log.d(TAG, "onDataChanged");
    }
}
