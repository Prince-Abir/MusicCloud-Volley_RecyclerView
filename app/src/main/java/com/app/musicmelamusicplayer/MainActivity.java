package com.app.musicmelamusicplayer;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.app.musicmelamusicplayer.AllSections.ArabicSong;
import com.app.musicmelamusicplayer.AllSections.BanglaSong;
import com.app.musicmelamusicplayer.AllSections.EnglishSong;
import com.app.musicmelamusicplayer.AllSections.HindiSong;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    LinearLayout banglaSong, englishSong, hindiSong, arabicSongs;


    LinearLayout rateUsButton;
    public static int Active_Code = 0;
    Controls adControls;


    public void ShowAd(){

        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        String url = "https://princetechsoft.000webhostapp.com/Music%20Mela/AdsControllerForMusicMela/adscontroller.php";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.contains("ShowAd")){

                            Active_Code = 100;
                            adControls = new Controls(MainActivity.this);
                            AdView bannerAd = findViewById(R.id.adView);
                            adControls.adInitialization();
                            adControls.loadBannerAd(bannerAd);

                        }
                        else{
                            Active_Code = 0;
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error","Volly Error Occured! Reason = "+error.getMessage());
            }
        });
        queue.add(stringRequest);

    }

    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


        return networkInfo != null && networkInfo.isConnected() && !networkInfo.isFailover();
    }

    private void CustomDialog() {

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Network Error!")
                .setMessage("Please check your internet connection")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                })
                .create()
                .show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banglaSong = findViewById(R.id.bangla_songs);
        englishSong = findViewById(R.id.english_songs);
        hindiSong = findViewById(R.id.hindi_songs);
        arabicSongs = findViewById(R.id.arabic_songs);


        rateUsButton = findViewById(R.id.rate_us_button);


        ShowAd();







        //Bangla Card View
        banglaSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isConnected()) {

                    if (Active_Code == 100){

                        adControls.loadInterstitialAd(getResources().getString(R.string.interstitialAdId));
                        //changing activity...

                    }
                    startActivity(new Intent(MainActivity.this, BanglaSong.class));


                } else {
                    CustomDialog();
                }

            }

        });


        //Hindi Card View
        hindiSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isConnected()) {

                    if (Active_Code == 100){

                        adControls.loadInterstitialAd(getResources().getString(R.string.interstitialAdId));
                        //changing activity...

                    }
                    startActivity(new Intent(MainActivity.this, HindiSong.class));


                } else {
                    CustomDialog();
                }
            }
        });

        //English Card View
        englishSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isConnected()) {

                    if (Active_Code == 100){

                        adControls.loadInterstitialAd(getResources().getString(R.string.interstitialAdId));
                        //changing activity...

                    }
                    startActivity(new Intent(MainActivity.this, EnglishSong.class));

                } else {
                    CustomDialog();
                }
            }
        });


        //Arabic Card View
        arabicSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isConnected()) {

                    if (Active_Code == 100){

                        adControls.loadInterstitialAd(getResources().getString(R.string.interstitialAdId));
                        //changing activity...

                    }
                    startActivity(new Intent(MainActivity.this, ArabicSong.class));

                } else {
                    CustomDialog();
                }
            }
        });




        //Rate US Card View
        rateUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.app.musicmelamusicplayer");

                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
    }



    //Alert Dialog
    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        new AlertDialog.Builder(this)
                .setIcon(R.drawable.exit_two)
                .setTitle("Exit")
                .setMessage("Do you want to close Music Cloud?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAndRemoveTask();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create()
                .show();

    }
}



