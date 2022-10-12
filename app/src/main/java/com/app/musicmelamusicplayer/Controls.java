package com.app.musicmelamusicplayer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.Random;

public class Controls {


    int range = 10;
    int randomNumber = 0;
    private InterstitialAd mInterstitialAd;
    private int banner_Ad_Click_Count = 0;

    public Activity activity;


    public Controls(Activity activity) {
        this.activity = activity;
    }



    public boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }

    public void CustomDialog() {

        new AlertDialog.Builder(activity.getApplicationContext())
                .setTitle("Network Error!")
                .setMessage("Please Check Your Internet Connection!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                })
                .create()
                .show();
    }


    public void adInitialization(){

        //Initializing the Mobile Ads
        MobileAds.initialize(activity, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
        Log.d("TAG", "Initialized");

    }

    public void loadBannerAd(AdView bannerAdView){

        //Banner Ad Code Start......

        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAdView.loadAd(adRequest);
        Log.d("TAG", "Ad Request Successful");

        bannerAdView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                AdRequest adRequest = new AdRequest.Builder().build();
                bannerAdView.loadAd(adRequest);
                Log.d("TAG", "Ad Loaded Successfully");

            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
                banner_Ad_Click_Count++;
                if (banner_Ad_Click_Count >= 2) {
                    if (bannerAdView != null) bannerAdView.setVisibility(View.GONE);
                }
            }
        });
        //Banner Ad Code Finish........

    }

    public void  loadInterstitialAd(String interstitialAdId){

        AdRequest adRequest = new AdRequest.Builder().build();

        Random random = new Random();
        randomNumber = random.nextInt(range);

        //loading the Interstitial Ad
        InterstitialAd.load(activity.getApplicationContext(), interstitialAdId, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {

                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.

                        mInterstitialAd = interstitialAd;


                        if (randomNumber == 1 || randomNumber == 3 || randomNumber == 8) {

                            mInterstitialAd.show(activity);

                        }
                        else{
                            mInterstitialAd = null;
                        }
                    }
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i("TAG", loadAdError.getMessage());
                        mInterstitialAd = null;

                    }

                });


    }




}
