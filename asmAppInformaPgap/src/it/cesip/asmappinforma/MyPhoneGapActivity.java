package it.cesip.asmappinforma;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MyPhoneGapActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setIntegerProperty("splashscreen", R.drawable.splash);
		// ritardo di 5 secondi
		super.loadUrl("file:///android_asset/www/index.html", 5000);

	}
}
