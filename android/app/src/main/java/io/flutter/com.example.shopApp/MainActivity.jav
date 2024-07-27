package com.arkitek.flutter.medisys;
import io.flutter.embedding.android.FlutterActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import android.os.Bundle;

public class MainActivity extends FlutterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCenter.start(getApplication(), "{"d99282a3-1aa6-4096-a7a8-3735e758b9b0"}", Distribute.class, Analytics.class, Crashes.class);
        AppCenter.setEnabled(true);
        Analytics.trackEvent("Application started");
        super.onCreate(savedInstanceState);
    }
}