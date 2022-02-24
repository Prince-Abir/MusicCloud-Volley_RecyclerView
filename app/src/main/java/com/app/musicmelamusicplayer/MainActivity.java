package com.app.musicmelamusicplayer;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.musicmelamusicplayer.AllSections.BanglaSong;
import com.app.musicmelamusicplayer.AllSections.HindiSong;
import com.app.musicmelamusicplayer.Payment.PaymentActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout banglaSong, englishSong, hindiSong, arabicSongs;

    ImageView PaymentIcon;

    LinearLayout rateUsButton;


    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }

    private void CustomDialog() {

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

        PaymentIcon = findViewById(R.id.paymentIcon);

        rateUsButton = findViewById(R.id.rate_us_button);


        //Bangla Card View
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

        //Hindi Card View
        hindiSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isConnected()) {
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
                Toast.makeText(MainActivity.this, "Under Development\nWill be added in version 2.0", Toast.LENGTH_SHORT).show();
            }
        });


        //Arabic Card View
        arabicSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Under Development\nWill be added in version 2.0", Toast.LENGTH_SHORT).show();
            }
        });


        //Payment Section
        PaymentIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PaymentActivity.class));
            }
        });


        //Rate US Card View
        rateUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Under Development\nWill be added in version 2.0", Toast.LENGTH_SHORT).show();
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
                .setMessage("Do you want to close Music Mela?")
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



