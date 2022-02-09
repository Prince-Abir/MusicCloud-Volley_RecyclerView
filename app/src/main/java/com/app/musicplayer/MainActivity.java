package com.app.musicplayer;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.musicplayer.AllSections.BanglaSong;
import com.app.musicplayer.AllSections.HindiSong;

public class MainActivity extends AppCompatActivity {

    LinearLayout banglaSong, englishSong, hindiSong, arabicSongs;


    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }

    private void CustomDialog(){

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Network Error!")
                .setMessage("Please Check Your Network Connection!")
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


        banglaSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isConnected()) {
                    startActivity(new Intent(MainActivity.this, BanglaSong.class));
                } else {
                    CustomDialog();
                }

            }

        });

        englishSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Under Development", Toast.LENGTH_SHORT).show();
            }
        });
        hindiSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isConnected()) {
                    startActivity(new Intent(MainActivity.this, BanglaSong.class));
                } else {
                    CustomDialog();
                }
            }
        });
        arabicSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Under Development", Toast.LENGTH_SHORT).show();
            }
        });


    }


}



