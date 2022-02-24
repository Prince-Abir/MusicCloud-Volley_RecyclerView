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

public class BanglaSong extends AppCompatActivity implements View.OnClickListener {

    ImageView PlayButtonBangla1, PlayButtonBangla2, PlayButtonBangla3, PlayButtonBangla4, PlayButtonBangla5, PlayButtonBangla6,
            PlayButtonBangla7, PlayButtonBangla8, PlayButtonBangla9, PlayButtonBangla10, PlayButtonBangla11, PlayButtonBangla12,
            PlayButtonBangla13, PlayButtonBangla14, PlayButtonBangla15, PlayButtonBangla16, PlayButtonBangla17, PlayButtonBangla18,
            PlayButtonBangla19, PlayButtonBangla20, PlayButtonBangla21, PlayButtonBangla22, PlayButtonBangla23, PlayButtonBangla24,
            PlayButtonBangla25, PlayButtonBangla26, PlayButtonBangla27, PlayButtonBangla28, PlayButtonBangla29, PlayButtonBangla30,
            PlayButtonBangla31, PlayButtonBangla32;


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

        setContentView(R.layout.activity_bangla_song);

        PlayButtonBangla1 = findViewById(R.id.playButtonBangla1);
        PlayButtonBangla2 = findViewById(R.id.playButtonBangla2);
        PlayButtonBangla3 = findViewById(R.id.playButtonBangla3);
        PlayButtonBangla4 = findViewById(R.id.playButtonBangla4);
        PlayButtonBangla5 = findViewById(R.id.playButtonBangla5);
        PlayButtonBangla6 = findViewById(R.id.playButtonBangla6);
        PlayButtonBangla7 = findViewById(R.id.playButtonBangla7);
        PlayButtonBangla8 = findViewById(R.id.playButtonBangla8);
        PlayButtonBangla9 = findViewById(R.id.playButtonBangla9);
        PlayButtonBangla10 = findViewById(R.id.playButtonBangla10);
        PlayButtonBangla11 = findViewById(R.id.playButtonBangla11);
        PlayButtonBangla12 = findViewById(R.id.playButtonBangla12);
        PlayButtonBangla13 = findViewById(R.id.playButtonBangla13);
        PlayButtonBangla14 = findViewById(R.id.playButtonBangla14);
        PlayButtonBangla15 = findViewById(R.id.playButtonBangla15);
        PlayButtonBangla16 = findViewById(R.id.playButtonBangla16);
        PlayButtonBangla17 = findViewById(R.id.playButtonBangla17);
        PlayButtonBangla18 = findViewById(R.id.playButtonBangla18);
        PlayButtonBangla19 = findViewById(R.id.playButtonBangla19);
        PlayButtonBangla20 = findViewById(R.id.playButtonBangla20);
        PlayButtonBangla21 = findViewById(R.id.playButtonBangla21);
        PlayButtonBangla22 = findViewById(R.id.playButtonBangla22);
        PlayButtonBangla23 = findViewById(R.id.playButtonBangla23);
        PlayButtonBangla24 = findViewById(R.id.playButtonBangla24);
        PlayButtonBangla25 = findViewById(R.id.playButtonBangla25);
        PlayButtonBangla26 = findViewById(R.id.playButtonBangla26);
        PlayButtonBangla27 = findViewById(R.id.playButtonBangla27);
        PlayButtonBangla28 = findViewById(R.id.playButtonBangla28);
        PlayButtonBangla29 = findViewById(R.id.playButtonBangla29);
        PlayButtonBangla30 = findViewById(R.id.playButtonBangla30);
        PlayButtonBangla31 = findViewById(R.id.playButtonBangla31);
        PlayButtonBangla32 = findViewById(R.id.playButtonBangla32);


        PlayButtonBangla1.setOnClickListener(this);
        PlayButtonBangla2.setOnClickListener(this);
        PlayButtonBangla3.setOnClickListener(this);
        PlayButtonBangla4.setOnClickListener(this);
        PlayButtonBangla5.setOnClickListener(this);
        PlayButtonBangla6.setOnClickListener(this);
        PlayButtonBangla7.setOnClickListener(this);
        PlayButtonBangla8.setOnClickListener(this);
        PlayButtonBangla9.setOnClickListener(this);
        PlayButtonBangla10.setOnClickListener(this);
        PlayButtonBangla11.setOnClickListener(this);
        PlayButtonBangla12.setOnClickListener(this);
        PlayButtonBangla13.setOnClickListener(this);
        PlayButtonBangla14.setOnClickListener(this);
        PlayButtonBangla15.setOnClickListener(this);
        PlayButtonBangla16.setOnClickListener(this);
        PlayButtonBangla17.setOnClickListener(this);
        PlayButtonBangla18.setOnClickListener(this);
        PlayButtonBangla19.setOnClickListener(this);
        PlayButtonBangla20.setOnClickListener(this);
        PlayButtonBangla21.setOnClickListener(this);
        PlayButtonBangla22.setOnClickListener(this);
        PlayButtonBangla23.setOnClickListener(this);
        PlayButtonBangla24.setOnClickListener(this);
        PlayButtonBangla25.setOnClickListener(this);
        PlayButtonBangla26.setOnClickListener(this);
        PlayButtonBangla27.setOnClickListener(this);
        PlayButtonBangla28.setOnClickListener(this);
        PlayButtonBangla29.setOnClickListener(this);
        PlayButtonBangla30.setOnClickListener(this);
        PlayButtonBangla31.setOnClickListener(this);
        PlayButtonBangla32.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        if (isConnected()) {


            if (v.getId() == PlayButtonBangla1.getId()) {


                PlayButtonBangla1.setImageResource(R.drawable.stop_button);

                if (PlayButtonBangla1.getTag() != null && PlayButtonBangla1.getTag().toString().contains("NotPlaying")) {


                    if (mediaPlayer != null) mediaPlayer.release();

                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Abar%20Hashimukh%20-%20Shironamhin%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla1.setTag("Playing");
                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();
                    }

                } else {

                    mediaPlayer.release();
                    PlayButtonBangla1.setImageResource(R.drawable.play_button);
                    PlayButtonBangla1.setTag("NotPlaying");

                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonBangla1.setImageResource(R.drawable.play_button);
                        PlayButtonBangla1.setTag("NotPlaying");
                    }
                });


            } else PlayButtonBangla1.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla2.getId()) {


                if (PlayButtonBangla2.getTag() != null && PlayButtonBangla2.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla2.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();


                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Bhalobasha%20Tarpor%20-%20Arnob%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla2.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla2.setImageResource(R.drawable.play_button);
                    PlayButtonBangla2.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonBangla2.setImageResource(R.drawable.play_button);
                        PlayButtonBangla2.setTag("NotPlaying");
                    }
                });

            } else PlayButtonBangla2.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla3.getId()) {


                if (PlayButtonBangla3.getTag() != null && PlayButtonBangla3.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla3.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Bhebe%20Dekhecho%20Ki%20-%20Mohiner%20Ghoraguli%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla3.setTag("Playing");

                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla3.setImageResource(R.drawable.play_button);
                    PlayButtonBangla3.setTag("NotPlaying");

                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonBangla3.setImageResource(R.drawable.play_button);
                        PlayButtonBangla3.setTag("NotPlaying");
                    }
                });


            } else PlayButtonBangla3.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla4.getId()) {


                if (PlayButtonBangla4.getTag() != null && PlayButtonBangla4.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla4.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Bindiya%20Re%20Bindiya%20NUR%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla4.setTag("Playing");

                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla4.setImageResource(R.drawable.play_button);
                    PlayButtonBangla4.setTag("NotPlaying");

                }
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla4.setImageResource(R.drawable.play_button);
                                PlayButtonBangla4.setTag("NotPlaying");
                            }
                        });

            } else PlayButtonBangla4.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla5.getId()) {


                if (PlayButtonBangla5.getTag() != null && PlayButtonBangla5.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla5.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Deyale%20Deyale(Lyrics)%20%20Minar%20Rahman%20Bangla%20Song%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla5.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Please Re-Open the App", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla5.setImageResource(R.drawable.play_button);
                    PlayButtonBangla5.setTag("NotPlaying");

                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonBangla5.setImageResource(R.drawable.play_button);
                        PlayButtonBangla5.setTag("NotPlaying");
                    }
                });

            } else PlayButtonBangla5.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla6.getId()) {


                if (PlayButtonBangla6.getTag() != null && PlayButtonBangla6.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla6.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Ekta%20Chele%20By%20Sahana%20Bajpaie%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla6.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla6.setImageResource(R.drawable.play_button);
                                PlayButtonBangla6.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla6.setImageResource(R.drawable.play_button);
                    PlayButtonBangla6.setTag("NotPlaying");

                }

            } else PlayButtonBangla6.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla7.getId()) {


                if (PlayButtonBangla7.getTag() != null && PlayButtonBangla7.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla7.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Encore%20-%20Srotoshinni%20%20Official%20Audio%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla7.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla7.setImageResource(R.drawable.play_button);
                                PlayButtonBangla7.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla7.setImageResource(R.drawable.play_button);
                    PlayButtonBangla7.setTag("NotPlaying");

                }

            } else PlayButtonBangla7.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla8.getId()) {


                if (PlayButtonBangla8.getTag() != null && PlayButtonBangla8.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla8.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/FIRE%20AY%20NA%20%20Official%20Lyrical%20Video%20%20Eemce%20Mihad%20%20Tuhin%20%20Ba%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla8.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla8.setImageResource(R.drawable.play_button);
                                PlayButtonBangla8.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla8.setImageResource(R.drawable.play_button);
                    PlayButtonBangla8.setTag("NotPlaying");

                }

            } else PlayButtonBangla8.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla9.getId()) {


                if (PlayButtonBangla9.getTag() != null && PlayButtonBangla9.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla9.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Ghum%20Bhanga%20(Lyrics)%20%20Minar%20Rahman%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla9.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla9.setImageResource(R.drawable.play_button);
                                PlayButtonBangla9.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla9.setImageResource(R.drawable.play_button);
                    PlayButtonBangla9.setTag("NotPlaying");

                }

            } else PlayButtonBangla9.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla10.getId()) {


                if (PlayButtonBangla10.getTag() != null && PlayButtonBangla10.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla10.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Habib%20Wahid%20-%20Raat%20Nirghum%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla10.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla10.setImageResource(R.drawable.play_button);
                                PlayButtonBangla10.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla10.setImageResource(R.drawable.play_button);
                    PlayButtonBangla10.setTag("NotPlaying");

                }

            } else PlayButtonBangla10.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla11.getId()) {


                if (PlayButtonBangla11.getTag() != null && PlayButtonBangla11.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla11.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Jao%20Pakhi%20Bolo%20Tare%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla11.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla11.setImageResource(R.drawable.play_button);
                                PlayButtonBangla11.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla11.setImageResource(R.drawable.play_button);
                    PlayButtonBangla11.setTag("NotPlaying");

                }

            } else PlayButtonBangla11.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla12.getId()) {


                if (PlayButtonBangla12.getTag() != null && PlayButtonBangla12.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla12.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Jontrona%20-%20Mohon%20Sharif%20(LofiChillhop%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla12.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla12.setImageResource(R.drawable.play_button);
                                PlayButtonBangla12.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla12.setImageResource(R.drawable.play_button);
                    PlayButtonBangla12.setTag("NotPlaying");

                }

            } else PlayButtonBangla12.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla13.getId()) {


                if (PlayButtonBangla13.getTag() != null && PlayButtonBangla13.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla13.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Kotodur%20%20Tahsan%20%20Lofi%20Remix%20%20Lyrics%20Video%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla13.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla13.setImageResource(R.drawable.play_button);
                                PlayButtonBangla13.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla13.setImageResource(R.drawable.play_button);
                    PlayButtonBangla13.setTag("NotPlaying");

                }

            } else PlayButtonBangla13.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla14.getId()) {


                if (PlayButtonBangla14.getTag() != null && PlayButtonBangla14.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla14.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Lal%20Shari%20Lofi%20Remix%20%20Bangla%20Song%20%20Sohag%20%20Sakib%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla14.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla14.setImageResource(R.drawable.play_button);
                                PlayButtonBangla14.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla14.setImageResource(R.drawable.play_button);
                    PlayButtonBangla14.setTag("NotPlaying");

                }

            } else PlayButtonBangla14.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla15.getId()) {


                if (PlayButtonBangla15.getTag() != null && PlayButtonBangla15.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla15.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Likhi%20Na%20Ar%20Toke%20Niye%20Kobita(Lyrics)%20-Shitom%20Ahmed%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla15.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla15.setImageResource(R.drawable.play_button);
                                PlayButtonBangla15.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla15.setImageResource(R.drawable.play_button);
                    PlayButtonBangla15.setTag("NotPlaying");

                }

            } else PlayButtonBangla15.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla16.getId()) {


                if (PlayButtonBangla16.getTag() != null && PlayButtonBangla16.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla16.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Majhe%20Majhe%20Tobo%20Dekha%20Pai%20(Lofi%20Remix)%20Mashuq%20Haque%20%C3%97%20NO%20MAN%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla16.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla16.setImageResource(R.drawable.play_button);
                                PlayButtonBangla16.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla16.setImageResource(R.drawable.play_button);
                    PlayButtonBangla16.setTag("NotPlaying");

                }

            } else PlayButtonBangla16.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla17.getId()) {


                if (PlayButtonBangla17.getTag() != null && PlayButtonBangla17.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla17.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Minar%20Rahman%20-%20Tumi%20Chaile%20Bristi%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla17.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla17.setImageResource(R.drawable.play_button);
                                PlayButtonBangla17.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla17.setImageResource(R.drawable.play_button);
                    PlayButtonBangla17.setTag("NotPlaying");

                }

            } else PlayButtonBangla17.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla18.getId()) {


                if (PlayButtonBangla18.getTag() != null && PlayButtonBangla18.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla18.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Mombati(Lyrics)%20%20Anika%20%20Mohon%20Sharif%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla18.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla18.setImageResource(R.drawable.play_button);
                                PlayButtonBangla18.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla18.setImageResource(R.drawable.play_button);
                    PlayButtonBangla18.setTag("NotPlaying");

                }

            } else PlayButtonBangla18.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla19.getId()) {


                if (PlayButtonBangla19.getTag() != null && PlayButtonBangla19.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla19.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Monta%20Obaddho(Lyrics)%20%20Lofi%20Remix%20%20Mahtim%20Shakib%20%20Prottoy%20Heron%20%20Mahim%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla19.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla19.setImageResource(R.drawable.play_button);
                                PlayButtonBangla19.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla19.setImageResource(R.drawable.play_button);
                    PlayButtonBangla19.setTag("NotPlaying");

                }

            } else PlayButtonBangla19.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla20.getId()) {


                if (PlayButtonBangla20.getTag() != null && PlayButtonBangla20.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla20.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Old%20School%20-%20Aaj%20Raate%20Kono%20Rupkotha%20Nei%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla20.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla20.setImageResource(R.drawable.play_button);
                                PlayButtonBangla20.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla20.setImageResource(R.drawable.play_button);
                    PlayButtonBangla20.setTag("NotPlaying");

                }

            } else PlayButtonBangla20.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla21.getId()) {


                if (PlayButtonBangla21.getTag() != null && PlayButtonBangla21.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla21.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Oniket%20Prantor%20(Lofi%20Remix)%20%20Lyrics%20Video%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla21.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla21.setImageResource(R.drawable.play_button);
                                PlayButtonBangla21.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla20.setImageResource(R.drawable.play_button);
                    PlayButtonBangla20.setTag("NotPlaying");

                }

            } else PlayButtonBangla21.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla22.getId()) {


                if (PlayButtonBangla22.getTag() != null && PlayButtonBangla22.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla22.setImageResource(R.drawable.stop_button);


                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Oviman%20%20Lofi%20Tanveer%20Evan%20Lofi%20%20Piran%20Khan%20%20Best%20Friend%203%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla22.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla22.setImageResource(R.drawable.play_button);
                                PlayButtonBangla22.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla22.setImageResource(R.drawable.play_button);
                    PlayButtonBangla22.setTag("NotPlaying");

                }

            } else PlayButtonBangla22.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla23.getId()) {


                if (PlayButtonBangla23.getTag() != null && PlayButtonBangla23.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla23.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Rupkothar%20Jogote(Lyrics)%20%20Networker%20baire%20%20Chorki%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla23.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla23.setImageResource(R.drawable.play_button);
                                PlayButtonBangla23.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla23.setImageResource(R.drawable.play_button);
                    PlayButtonBangla23.setTag("NotPlaying");

                }

            } else PlayButtonBangla23.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla24.getId()) {


                if (PlayButtonBangla24.getTag() != null && PlayButtonBangla24.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla24.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/She%20Je%20Boshe%20Ache%20(Lofi%20Remix)%20%20Arnob%20%20Rishi%20Panda%20%20Mashuq%20Haque%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla24.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla24.setImageResource(R.drawable.play_button);
                                PlayButtonBangla24.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla24.setImageResource(R.drawable.play_button);
                    PlayButtonBangla24.setTag("NotPlaying");

                }

            } else PlayButtonBangla24.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla25.getId()) {


                if (PlayButtonBangla25.getTag() != null && PlayButtonBangla25.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla25.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Shesh%20Kanna(Lyrics)%20%20Lofi%20Remix%20Tanveer%20Evan%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla25.setTag("Playing");

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla25.setImageResource(R.drawable.play_button);
                    PlayButtonBangla25.setTag("NotPlaying");

                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonBangla25.setImageResource(R.drawable.play_button);
                        PlayButtonBangla25.setTag("NotPlaying");
                    }
                });

            } else PlayButtonBangla25.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla26.getId()) {


                if (PlayButtonBangla26.getTag() != null && PlayButtonBangla26.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla26.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Shey%20Ki%20Jane%20-%20Lofi%20Remix%20%20Piran%20Khan%20%20Raz%20Dee%20%20New%20Bangla%20Song%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla26.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla26.setImageResource(R.drawable.play_button);
                                PlayButtonBangla26.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla26.setImageResource(R.drawable.play_button);
                    PlayButtonBangla26.setTag("NotPlaying");

                }

            } else PlayButtonBangla26.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla27.getId()) {


                if (PlayButtonBangla27.getTag() != null && PlayButtonBangla27.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla27.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Shironamhin%20-%20Ei%20Obelay%20Lofi%20Remix%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla27.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla27.setImageResource(R.drawable.play_button);
                                PlayButtonBangla27.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla27.setImageResource(R.drawable.play_button);
                    PlayButtonBangla27.setTag("NotPlaying");

                }

            } else PlayButtonBangla27.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla28.getId()) {


                if (PlayButtonBangla28.getTag() != null && PlayButtonBangla28.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla28.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Shunno%20-%20Bedona%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla28.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla28.setImageResource(R.drawable.play_button);
                                PlayButtonBangla28.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla28.setImageResource(R.drawable.play_button);
                    PlayButtonBangla28.setTag("NotPlaying");

                }

            } else PlayButtonBangla28.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla29.getId()) {


                if (PlayButtonBangla29.getTag() != null && PlayButtonBangla29.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla29.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Tasnif%20-%20Utshorgo%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla29.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla29.setImageResource(R.drawable.play_button);
                                PlayButtonBangla29.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla29.setImageResource(R.drawable.play_button);
                    PlayButtonBangla29.setTag("NotPlaying");

                }

            } else PlayButtonBangla29.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla30.getId()) {


                if (PlayButtonBangla30.getTag() != null && PlayButtonBangla30.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla30.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Tomar%20Ghore%20Bosot%20Kore%20-%20Anirban%20Sur%20(Lofi%20Remix)%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla30.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla30.setImageResource(R.drawable.play_button);
                                PlayButtonBangla30.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla30.setImageResource(R.drawable.play_button);
                    PlayButtonBangla30.setTag("NotPlaying");

                }

            } else PlayButtonBangla30.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla31.getId()) {


                if (PlayButtonBangla31.getTag() != null && PlayButtonBangla31.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla31.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Tomay%20Hrid%20Majhare%20Rakhbo%20(Lofi%20Remix)%20%20Ahmed%20Shakib%20%20Bangla%20New%20Song%20%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        PlayButtonBangla31.setTag("Playing");

                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                PlayButtonBangla31.setImageResource(R.drawable.play_button);
                                PlayButtonBangla31.setTag("NotPlaying");
                            }
                        });

                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla31.setImageResource(R.drawable.play_button);
                    PlayButtonBangla31.setTag("NotPlaying");

                }

            } else PlayButtonBangla31.setImageResource(R.drawable.play_button);

            if (v.getId() == PlayButtonBangla32.getId()) {


                if (PlayButtonBangla32.getTag() != null && PlayButtonBangla32.getTag().toString().contains("NotPlaying")) {

                    PlayButtonBangla32.setImageResource(R.drawable.stop_button);

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = new MediaPlayer();

                    try {
                        mediaPlayer.setDataSource("https://princetechsoft.000webhostapp.com/Songs/Bangla/Tumi%20Akasher%20Buke%20Bishalotar%20Upoma%20128%20kbps.mp3");
                        mediaPlayer.prepare();
                        mediaPlayer.start();

                        PlayButtonBangla32.setTag("Playing");


                    } catch (IOException e) {
                        Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    mediaPlayer.release();
                    PlayButtonBangla32.setImageResource(R.drawable.play_button);
                    PlayButtonBangla32.setTag("NotPlaying");

                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        PlayButtonBangla32.setImageResource(R.drawable.play_button);
                        PlayButtonBangla32.setTag("NotPlaying");
                    }
                });

            } else PlayButtonBangla32.setImageResource(R.drawable.play_button);

        } else {
            CustomDialog();
        }

    }

}