package com.artirigo.kontaktio;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import android.util.Log;

public class KontaktModule extends ReactContextBaseJavaModule {

    public KontaktModule(ReactApplicationContext reactAppContext) {
        super(reactAppContext);
    }

    @Override
    public String getName() {
        return "KontaktBeacons";
    }
}
