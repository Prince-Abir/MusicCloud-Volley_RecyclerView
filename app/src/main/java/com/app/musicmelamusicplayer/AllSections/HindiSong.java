package com.app.musicmelamusicplayer.AllSections;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.musicmelamusicplayer.R;

import java.io.IOException;


public class HindiSong extends AppCompatActivity implements View.OnClickListener {

    ImageView PlayButtonHindi1, PlayButtonHindi2, PlayButtonHindi3, PlayButtonHindi4, PlayButtonHindi5, PlayButtonHindi6,
            PlayButtonHindi7, PlayButtonHindi8, PlayButtonHindi9, PlayButtonHindi10, PlayButtonHindi11, PlayButtonHindi12,
            PlayButtonHindi13, PlayButtonHindi14, PlayButtonHindi15, PlayButtonHindi16, PlayButtonHindi17, PlayButtonHindi18,
            PlayButtonHindi19, PlayButtonHindi20, PlayButtonHindi21, PlayButtonHindi22, PlayButtonHindi23, PlayButtonHindi24,
            PlayButtonHindi25, PlayButtonHindi26, PlayButtonHindi27, PlayButtonHindi28, PlayButtonHindi29, PlayButtonHindi30,
            PlayButtonHindi31, PlayButtonHindi32, PlayButtonHindi33, PlayButtonHindi34, PlayButtonHindi35;


    MediaPlayer mediaPlayer;

    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }

    private void CustomDialog() {

        new AlertDialog.Builder(this)
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
        setContentView(R.layout.activity_hindi_song);

        PlayButtonHindi1 = findViewById(R.id.playButtonHindi1);
        PlayButtonHindi2 = findViewById(R.id.playButtonHindi2);
        PlayButtonHindi3 = findViewById(R.id.playButtonHindi3);
        PlayButtonHindi4 = findViewById(R.id.playButtonHindi4);
        PlayButtonHindi5 = findViewById(R.id.playButtonHindi5);
        PlayButtonHindi6 = findViewById(R.id.playButtonHindi6);
        PlayButtonHindi7 = findViewById(R.id.playButtonHindi7);
        PlayButtonHindi8 = findViewById(R.id.playButtonHindi8);
        PlayButtonHindi9 = findViewById(R.id.playButtonHindi9);
        PlayButtonHindi10 = findViewById(R.id.playButtonHindi10);
        PlayButtonHindi11 = findViewById(R.id.playButtonHindi11);
        PlayButtonHindi12 = findViewById(R.id.playButtonHindi12);
        PlayButtonHindi13 = findViewById(R.id.playButtonHindi13);
        PlayButtonHindi14 = findViewById(R.id.playButtonHindi14);
        PlayButtonHindi15 = findViewById(R.id.playButtonHindi15);
        PlayButtonHindi16 = findViewById(R.id.playButtonHindi16);
        PlayButtonHindi17 = findViewById(R.id.playButtonHindi17);
        PlayButtonHindi18 = findViewById(R.id.playButtonHindi18);
        PlayButtonHindi19 = findViewById(R.id.playButtonHindi19);
        PlayButtonHindi20 = findViewById(R.id.playButtonHindi20);
        PlayButtonHindi21 = findViewById(R.id.playButtonHindi21);
        PlayButtonHindi22 = findViewById(R.id.playButtonHindi22);
        PlayButtonHindi23 = findViewById(R.id.playButtonHindi23);
        PlayButtonHindi24 = findViewById(R.id.playButtonHindi24);
        PlayButtonHindi25 = findViewById(R.id.playButtonHindi25);
        PlayButtonHindi26 = findViewById(R.id.playButtonHindi26);
        PlayButtonHindi27 = findViewById(R.id.playButtonHindi27);
        PlayButtonHindi28 = findViewById(R.id.playButtonHindi28);
        PlayButtonHindi29 = findViewById(R.id.playButtonHindi29);
        PlayButtonHindi30 = findViewById(R.id.playButtonHindi30);
        PlayButtonHindi31 = findViewById(R.id.playButtonHindi31);
        PlayButtonHindi32 = findViewById(R.id.playButtonHindi32);
        PlayButtonHindi33 = findViewById(R.id.playButtonHindi33);
        PlayButtonHindi34 = findViewById(R.id.playButtonHindi34);
        PlayButtonHindi35 = findViewById(R.id.playButtonHindi35);


        PlayButtonHindi1.setOnClickListener(this);
        PlayButtonHindi2.setOnClickListener(this);
        PlayButtonHindi3.setOnClickListener(this);
        PlayButtonHindi4.setOnClickListener(this);
        PlayButtonHindi5.setOnClickListener(this);
        PlayButtonHindi6.setOnClickListener(this);
        PlayButtonHindi7.setOnClickListener(this);
        PlayButtonHindi8.setOnClickListener(this);
        PlayButtonHindi9.setOnClickListener(this);
        PlayButtonHindi10.setOnClickListener(this);
        PlayButtonHindi11.setOnClickListener(this);
        PlayButtonHindi12.setOnClickListener(this);
        PlayButtonHindi13.setOnClickListener(this);
        PlayButtonHindi14.setOnClickListener(this);
        PlayButtonHindi15.setOnClickListener(this);
        PlayButtonHindi16.setOnClickListener(this);
        PlayButtonHindi17.setOnClickListener(this);
        PlayButtonHindi18.setOnClickListener(this);
        PlayButtonHindi19.setOnClickListener(this);
        PlayButtonHindi20.setOnClickListener(this);
        PlayButtonHindi21.setOnClickListener(this);
        PlayButtonHindi22.setOnClickListener(this);
        PlayButtonHindi23.setOnClickListener(this);
        PlayButtonHindi24.setOnClickListener(this);
        PlayButtonHindi25.setOnClickListener(this);
        PlayButtonHindi26.setOnClickListener(this);
        PlayButtonHindi27.setOnClickListener(this);
        PlayButtonHindi28.setOnClickListener(this);
        PlayButtonHindi29.setOnClickListener(this);
        PlayButtonHindi30.setOnClickListener(this);
        PlayButtonHindi31.setOnClickListener(this);
        PlayButtonHindi32.setOnClickListener(this);
        PlayButtonHindi33.setOnClickListener(this);
        PlayButtonHindi34.setOnClickListener(this);
        PlayButtonHindi35.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {


        if (isConnected()) {

            if (v.getId() == PlayButtonHindi1.getId()) {

                PlayButtonHindi1.setImageResource(R.drawable.stop_button);


                if (PlayButtonHindi1.getTag() != null && PlayButtonHindi1.getTag().toString().contains("NotPlaying")) {


                    if (mediaPlayer != null) mediaPlayer.release();

                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Aashiqui%20Aa%20Gayi%20[LoFi%20Remake]-@GOURAV%20Mithoon%20%E2%80%A2%20Arijit%20Singh%20%20Textaud%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi1.setTag("Playing");
                    } catch (IOException e) {

                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();

                    }

                } else {

                    mediaPlayer.release();
                    PlayButtonHindi1.setImageResource(R.drawable.play_button);
                    PlayButtonHindi1.setTag("NotPlaying");

                }


                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi1.setImageResource(R.drawable.play_button);
                        PlayButtonHindi1.setTag("NotPlaying");
                    }
                });


            } else PlayButtonHindi1.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi2.getId()) {


                if (PlayButtonHindi2.getTag() != null && PlayButtonHindi2.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi2.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Baarish%20[LoFi]%20[Lyrics]-%20Cryptic%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi2.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi2.setImageResource(R.drawable.play_button);
                    PlayButtonHindi2.setTag("NotPlaying");

                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi2.setImageResource(R.drawable.play_button);
                        PlayButtonHindi2.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi2.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi3.getId()) {


                if (PlayButtonHindi3.getTag() != null && PlayButtonHindi3.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi3.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Banjaara%20-%20Ek%20Villain%20(slowed%20+%20reverb%20+%20rain)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi3.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi3.setImageResource(R.drawable.play_button);
                    PlayButtonHindi3.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi3.setImageResource(R.drawable.play_button);
                        PlayButtonHindi3.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi3.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi4.getId()) {


                if (PlayButtonHindi4.getTag() != null && PlayButtonHindi4.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi4.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Be%20Intehaan%20[LoFi]%20[Lyrics]-Atif%20Aslam%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi4.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi4.setImageResource(R.drawable.play_button);
                    PlayButtonHindi4.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi4.setImageResource(R.drawable.play_button);
                        PlayButtonHindi4.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi4.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi5.getId()) {


                if (PlayButtonHindi5.getTag() != null && PlayButtonHindi5.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi5.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Chale%20Aana%20[Slowed+Reverb]%20-%20Armaan%20Malik%20Kunaal%20Vermaa%20%20Ajay%20Devgan,%20%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi5.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi5.setImageResource(R.drawable.play_button);
                    PlayButtonHindi5.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi5.setImageResource(R.drawable.play_button);
                        PlayButtonHindi5.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi5.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi6.getId()) {


                if (PlayButtonHindi6.getTag() != null && PlayButtonHindi6.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi6.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Dil%20Ko%20Karaar%20Aaya%20[Slowed+Reverb]%20-%20Yasser%20Desai%20%20Shourov%20Rahman%20%20Tex%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi6.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi6.setImageResource(R.drawable.play_button);
                    PlayButtonHindi6.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi6.setImageResource(R.drawable.play_button);
                        PlayButtonHindi6.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi6.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi7.getId()) {


                if (PlayButtonHindi7.getTag() != null && PlayButtonHindi7.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi7.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Falak%20Tak%20Song%20%20[Reverb]%20%20Mood%2090's%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi7.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi7.setImageResource(R.drawable.play_button);
                    PlayButtonHindi7.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi7.setImageResource(R.drawable.play_button);
                        PlayButtonHindi7.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi7.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi8.getId()) {


                if (PlayButtonHindi8.getTag() != null && PlayButtonHindi8.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi8.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Hasi%20Ban%20Gaye%20[Slowed+Reverb]%20-%20Ami%20Mishra%20%20Hamari%20Adhuri%20Kahani%20%20Male%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi8.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi8.setImageResource(R.drawable.play_button);
                    PlayButtonHindi8.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi8.setImageResource(R.drawable.play_button);
                        PlayButtonHindi8.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi8.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi9.getId()) {


                if (PlayButtonHindi9.getTag() != null && PlayButtonHindi9.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi9.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Hawayein%20[LoFi]-Arijit%20Singh%20@JAZ%20Scape%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi9.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi9.setImageResource(R.drawable.play_button);
                    PlayButtonHindi9.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi9.setImageResource(R.drawable.play_button);
                        PlayButtonHindi9.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi9.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi10.getId()) {


                if (PlayButtonHindi10.getTag() != null && PlayButtonHindi10.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi10.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Hosanna%20[Slowed+Reverb]-%20Ekk%20Deewana%20Tha%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi10.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi10.setImageResource(R.drawable.play_button);
                    PlayButtonHindi10.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi10.setImageResource(R.drawable.play_button);
                        PlayButtonHindi10.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi10.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi11.getId()) {


                if (PlayButtonHindi11.getTag() != null && PlayButtonHindi11.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi11.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Ijazat%20[Slowed%20+%20Reverb]%20-%20Arijit%20Singh%20%20Meet%20Bros%20%20Indian%20Lofi%20Song%20C%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi11.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi11.setImageResource(R.drawable.play_button);
                    PlayButtonHindi11.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi11.setImageResource(R.drawable.play_button);
                        PlayButtonHindi11.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi11.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi12.getId()) {


                if (PlayButtonHindi12.getTag() != null && PlayButtonHindi12.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi12.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Ishq%20Sufiyana%20[Slowed+Reverb]-%20Sunidhi%20Chauhan%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi12.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi12.setImageResource(R.drawable.play_button);
                    PlayButtonHindi12.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi12.setImageResource(R.drawable.play_button);
                        PlayButtonHindi12.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi12.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi13.getId()) {


                if (PlayButtonHindi13.getTag() != null && PlayButtonHindi13.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi13.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Jeena%20Jeena%20-%20(%20Slowed%20+%20Reverb%20)%20%20Ear%20Candy%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi13.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi13.setImageResource(R.drawable.play_button);
                    PlayButtonHindi13.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi13.setImageResource(R.drawable.play_button);
                        PlayButtonHindi13.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi13.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi14.getId()) {


                if (PlayButtonHindi14.getTag() != null && PlayButtonHindi14.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi14.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Kal%20Ho%20Naa%20Ho%20[LoFi][Lyrics]-Harrlin%20Flip%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi14.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi14.setImageResource(R.drawable.play_button);
                    PlayButtonHindi14.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi14.setImageResource(R.drawable.play_button);
                        PlayButtonHindi14.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi14.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi15.getId()) {


                if (PlayButtonHindi15.getTag() != null && PlayButtonHindi15.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi15.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Kaun%20Tujhe%20[Lofi]-%20M.S.%20DHONI%20-THE%20UNTOLD%20STORY%20%20NEELESH%20%20Textaudio%20Ly%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi15.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi15.setImageResource(R.drawable.play_button);
                    PlayButtonHindi15.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi15.setImageResource(R.drawable.play_button);
                        PlayButtonHindi15.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi15.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi16.getId()) {


                if (PlayButtonHindi16.getTag() != null && PlayButtonHindi16.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi16.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Khamoshiyan%20-%20Arijit%20Singh%20(Slowed+Reverb+Lofi)%20Song%20%20Indian%20Lofi%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi16.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi16.setImageResource(R.drawable.play_button);
                    PlayButtonHindi16.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi16.setImageResource(R.drawable.play_button);
                        PlayButtonHindi16.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi16.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi17.getId()) {


                if (PlayButtonHindi17.getTag() != null && PlayButtonHindi17.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi17.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Kya%20mujhe%20pyar%20hai%20(Tum%20Kyu%20Chale%20Aate%20Ho)%20-%20Slow%20And%20Reverb%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi17.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi17.setImageResource(R.drawable.play_button);
                    PlayButtonHindi17.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi17.setImageResource(R.drawable.play_button);
                        PlayButtonHindi17.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi17.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi18.getId()) {


                if (PlayButtonHindi18.getTag() != null && PlayButtonHindi18.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi18.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Lag%20Jaa%20Gale%20[LoFi][Lyrics]-%20@p%20r%20a%20k%20h%20a%20r%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi18.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi18.setImageResource(R.drawable.play_button);
                    PlayButtonHindi18.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi18.setImageResource(R.drawable.play_button);
                        PlayButtonHindi18.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi18.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi19.getId()) {


                if (PlayButtonHindi19.getTag() != null && PlayButtonHindi19.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi19.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Main%20Rang%20Sharbaton%20Ka%20[Lofi]-@JAZ%20Scape%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi19.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi19.setImageResource(R.drawable.play_button);
                    PlayButtonHindi19.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi19.setImageResource(R.drawable.play_button);
                        PlayButtonHindi19.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi19.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi20.getId()) {


                if (PlayButtonHindi20.getTag() != null && PlayButtonHindi20.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi20.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Mast%20magan%20[Slowed+Reverb]-%20Arijit%20Singh%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi20.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi20.setImageResource(R.drawable.play_button);
                    PlayButtonHindi20.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi20.setImageResource(R.drawable.play_button);
                        PlayButtonHindi20.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi20.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi21.getId()) {


                if (PlayButtonHindi21.getTag() != null && PlayButtonHindi21.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi21.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Mera%20Mann%20[Lo-fi]-%20Nautanki%20Saala!%20@JAZ%20Scape%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi21.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi21.setImageResource(R.drawable.play_button);
                    PlayButtonHindi21.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi21.setImageResource(R.drawable.play_button);
                        PlayButtonHindi21.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi21.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi22.getId()) {


                if (PlayButtonHindi22.getTag() != null && PlayButtonHindi22.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi22.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Moh%20Moh%20Ke%20Dhaage%20[LoFi][Lyrics]-%20Papon(WORMONO)%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi22.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi22.setImageResource(R.drawable.play_button);
                    PlayButtonHindi22.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi22.setImageResource(R.drawable.play_button);
                        PlayButtonHindi22.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi22.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi23.getId()) {


                if (PlayButtonHindi23.getTag() != null && PlayButtonHindi23.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi23.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Phir%20le%20aya%20dil%20[LoFi][Lyrics]-Arijit%20Singh%20@p%20r%20a%20k%20h%20a%20r%20Textaudio%20L%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi23.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi23.setImageResource(R.drawable.play_button);
                    PlayButtonHindi23.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi23.setImageResource(R.drawable.play_button);
                        PlayButtonHindi23.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi23.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi24.getId()) {


                if (PlayButtonHindi24.getTag() != null && PlayButtonHindi24.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi24.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Piya%20O%20Re%20Piya%20[Slowed+Reverb]%20-%20Atif%20Aslam%20&%20Shreya%20Ghoshal%20%20Textaudi%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi24.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi24.setImageResource(R.drawable.play_button);
                    PlayButtonHindi24.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi24.setImageResource(R.drawable.play_button);
                        PlayButtonHindi24.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi24.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi25.getId()) {


                if (PlayButtonHindi25.getTag() != null && PlayButtonHindi25.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi25.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Raataan%20Lambhiyan%20[Slowed%20+%20Reverb]%20-%20Jubin%20Nautiyal%20%20Asees%20Kaur%20%20Indi%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi25.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi25.setImageResource(R.drawable.play_button);
                    PlayButtonHindi25.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi25.setImageResource(R.drawable.play_button);
                        PlayButtonHindi25.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi25.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi26.getId()) {


                if (PlayButtonHindi26.getTag() != null && PlayButtonHindi26.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi26.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Ranjha%20[Lo-fi]-%20Shershaah%20%20HIMANXU%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi26.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi26.setImageResource(R.drawable.play_button);
                    PlayButtonHindi26.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi26.setImageResource(R.drawable.play_button);
                        PlayButtonHindi26.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi26.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi27.getId()) {


                if (PlayButtonHindi27.getTag() != null && PlayButtonHindi27.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi27.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Saibo%20[Slowed+Reverb]-%20Shor%20In%20The%20City%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi27.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi27.setImageResource(R.drawable.play_button);
                    PlayButtonHindi27.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi27.setImageResource(R.drawable.play_button);
                        PlayButtonHindi27.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi27.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi28.getId()) {


                if (PlayButtonHindi28.getTag() != null && PlayButtonHindi28.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi28.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Srivalli%20(%20Slowed%20And%20Reverb%20)%20%20Pushpa%20%20Javed%20Ali%20%20Nexus%20Music%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi28.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi28.setImageResource(R.drawable.play_button);
                    PlayButtonHindi28.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi28.setImageResource(R.drawable.play_button);
                        PlayButtonHindi28.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi28.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi29.getId()) {


                if (PlayButtonHindi29.getTag() != null && PlayButtonHindi29.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi29.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Subhanallah%20[Slowed+Reverb]-%20Shreeram%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi29.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi29.setImageResource(R.drawable.play_button);
                    PlayButtonHindi29.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi29.setImageResource(R.drawable.play_button);
                        PlayButtonHindi29.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi29.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi30.getId()) {


                if (PlayButtonHindi30.getTag() != null && PlayButtonHindi30.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi30.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Teri%20Mitti%20(75th%20Independence%20Day)%20Lofi%20Mashup%20%20@JAZ%20Scape%20Textaudio%20l%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi30.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi30.setImageResource(R.drawable.play_button);
                    PlayButtonHindi30.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi30.setImageResource(R.drawable.play_button);
                        PlayButtonHindi30.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi30.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi31.getId()) {


                if (PlayButtonHindi31.getTag() != null && PlayButtonHindi31.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi31.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Tose%20Naina%20Arijit%20Singh%20%20Slowed%20and%20Reverb%20Song%20Lofi%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi31.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi31.setImageResource(R.drawable.play_button);
                    PlayButtonHindi31.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi31.setImageResource(R.drawable.play_button);
                        PlayButtonHindi31.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi31.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi32.getId()) {


                if (PlayButtonHindi32.getTag() != null && PlayButtonHindi32.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi32.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Tujhe%20Kitna%20Chahne%20Lage%20(Slow%20+%20Reverb)%20%20Textaudio%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi32.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi32.setImageResource(R.drawable.play_button);
                    PlayButtonHindi32.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi32.setImageResource(R.drawable.play_button);
                        PlayButtonHindi32.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi32.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi33.getId()) {


                if (PlayButtonHindi33.getTag() != null && PlayButtonHindi33.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi33.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Tujhse%20Naraaz%20Nahin%20Zindagi%20[LoFi]-%20@p%20r%20a%20k%20h%20a%20r%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi33.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi33.setImageResource(R.drawable.play_button);
                    PlayButtonHindi33.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi33.setImageResource(R.drawable.play_button);
                        PlayButtonHindi33.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi33.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi34.getId()) {


                if (PlayButtonHindi34.getTag() != null && PlayButtonHindi34.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi34.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Tum%20Jo%20Aaye%20[Lo-fi]-%20Himanxu%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi34.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi34.setImageResource(R.drawable.play_button);
                    PlayButtonHindi34.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi34.setImageResource(R.drawable.play_button);
                        PlayButtonHindi34.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi34.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonHindi35.getId()) {


                if (PlayButtonHindi35.getTag() != null && PlayButtonHindi35.getTag().toString().contains("NotPlaying")) {

                    PlayButtonHindi35.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Hindi/Tum%20Mile%20[Slowed+Reverb]%20-%20Javed%20Ali%20%20Textaudio%20Lyrics%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonHindi35.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonHindi35.setImageResource(R.drawable.play_button);
                    PlayButtonHindi35.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonHindi35.setImageResource(R.drawable.play_button);
                        PlayButtonHindi35.setTag("NotPlaying");
                    }
                });

            } else PlayButtonHindi35.setImageResource(R.drawable.play_button);

        } else {
            CustomDialog();
        }

    }


}

