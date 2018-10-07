package com.fayaz.admob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private AdView a1,a2,a3,a4,a5,a6,a7,a8,a9;
    private AdRequest adRequest;
    private InterstitialAd i1,i2,i3,i4,i5,i6,i7,i8,i9;
    String si1 = "ca-app-pub-2362748331716930/8742697245", si2 = "ca-app-pub-2362748331716930/2061738829", si3 = "ca-app-pub-2362748331716930/6251183706";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this);
        //MobileAds.initialize(this,""); -- use this if you have app ID

        adRequest = new AdRequest.Builder().build();

        a1 = findViewById(R.id.adView);
        a2 = findViewById(R.id.adView2);
        a3 = findViewById(R.id.adView3);
        a4 = findViewById(R.id.adView4);
        a5 = findViewById(R.id.adView5);
        a6 = findViewById(R.id.adView6);
        a7 = findViewById(R.id.adView7);
        a8 = findViewById(R.id.adView8);
        a9 = findViewById(R.id.adView9);

        a1.loadAd(adRequest);
        a2.loadAd(adRequest);
        a3.loadAd(adRequest);
        a4.loadAd(adRequest);
        a5.loadAd(adRequest);
        a6.loadAd(adRequest);
        a7.loadAd(adRequest);
        a8.loadAd(adRequest);
        a9.loadAd(adRequest);

        i1 = new InterstitialAd(this);
        i2 = new InterstitialAd(this);
        i3 = new InterstitialAd(this);
        i4 = new InterstitialAd(this);
        i5 = new InterstitialAd(this);
        i6 = new InterstitialAd(this);
        i7 = new InterstitialAd(this);
        i8 = new InterstitialAd(this);
        i9 = new InterstitialAd(this);

        i1.setAdUnitId(si1);
        i2.setAdUnitId(si2);
        i3.setAdUnitId(si3);
        i4.setAdUnitId(si1);
        i5.setAdUnitId(si2);
        i6.setAdUnitId(si3);
        i7.setAdUnitId(si1);
        i8.setAdUnitId(si2);
        i9.setAdUnitId(si3);


        i1.setAdListener(adListener);
        i2.setAdListener(adListener);
        i3.setAdListener(adListener);
        i4.setAdListener(adListener);
        i5.setAdListener(adListener);
        i6.setAdListener(adListener);
        i7.setAdListener(adListener);
        i8.setAdListener(adListener);
        i9.setAdListener(adListener);

        i1.loadAd(adRequest);
        i2.loadAd(adRequest);
        i3.loadAd(adRequest);
        i4.loadAd(adRequest);
        i5.loadAd(adRequest);
        i6.loadAd(adRequest);
        i7.loadAd(adRequest);
        i8.loadAd(adRequest);
        i9.loadAd(adRequest);

        i1.show();
        i2.show();
        i3.show();
        i4.show();
        i5.show();
        i6.show();
        i7.show();
        i8.show();
        i9.show();
    }


    AdListener adListener = new AdListener(){
        @Override
        public void onAdLoaded() {
            super.onAdLoaded();
            if (i1.isLoaded()){
                i1.show();
            }if (i2.isLoaded()){
                i2.show();
            }if (i3.isLoaded()){
                i3.show();
            }if (i4.isLoaded()){
                i4.show();
            }if (i5.isLoaded()){
                i5.show();
            }if (i6.isLoaded()){
                i6.show();
            }if (i7.isLoaded()){
                i7.show();
            }if (i8.isLoaded()){
                i8.show();
            }if (i9.isLoaded()){
                i9.show();
            }
        }
    };
}
