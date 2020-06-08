package com.locationapp;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.huawei.hms.rn.location.RNHMSLocationPackage;
import com.huawei.hms.rn.location.helpers.HMSBroadcastReceiver;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "LocationApp";
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //HMSLocation Kit
    HMSBroadcastReceiver.init(this, getReactNativeHost()
            .getReactInstanceManager());
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    unregisterReceiver(HMSBroadcastReceiver.getInstance());
  }
  }
