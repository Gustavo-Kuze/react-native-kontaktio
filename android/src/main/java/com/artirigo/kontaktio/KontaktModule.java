package com.artirigo.kontaktio;

import android.Manifest;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class KontaktModule extends ReactContextBaseJavaModule {

    KontaktModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "KontaktModule";
    }
}
