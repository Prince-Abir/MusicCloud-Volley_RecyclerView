package com.app.musicmelamusicplayer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PlayingSong extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ImageView SongImage;
    String SongUrl;
    TextView SongName;
    TextView SingerName;
    TextView SongDurationTextView, SongCurrentTimeTextView;
    ImageView PlayPauseButton;
    ImageView StopButton;
    SeekBar seekBar;
    ImageView loopButton;
    ImageView rightArrow, leftArrow;

    LottieAnimationView Lottie;

    Handler handler = new Handler();
    Runnable runnable;
    Controls controls;
    int Active_Code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_playing_song);

        SongImage = findViewById(R.id.songImage);
        SongName = findViewById(R.id.songName);
        SingerName = findViewById(R.id.singerName);
        PlayPauseButton = findViewById(R.id.playButton);
        StopButton = findViewById(R.id.stopButton);
        seekBar = findViewById(R.id.SeekBar);
        loopButton = findViewById(R.id.loop_button);
        rightArrow = findViewById(R.id.right_arrow);
        leftArrow = findViewById(R.id.left_arrow);

        SongDurationTextView = findViewById(R.id.SongDurationTextView);
        SongCurrentTimeTextView = findViewById(R.id.SongCurrentTimeTextView);

        Lottie = findViewById(R.id.LottieSound);

        Active_Code = MainActivity.Active_Code;

        Intent intent = getIntent();
        SongUrl = intent.getStringExtra("link");
        int ImageId = intent.getIntExtra("ImageId", 0);
        String songName = intent.getStringExtra("SongName");
        String singerName = intent.getStringExtra("SingerName");


        PlayMusic();
        SongImage.setImageResource(ImageId);
        SongName.setText(songName);
        SingerName.setText(singerName);

        controls = new Controls(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


    public void PlayMusic() {


        if (mediaPlayer != null) mediaPlayer.release();


        try {
            mediaPlayer = new MediaPlayer();
            Uri uri = Uri.parse(SongUrl);
            mediaPlayer.setDataSource(getApplicationContext(), uri);
            mediaPlayer.prepareAsync();

        } catch (IOException e) {

            e.printStackTrace();
        }


        runnable = new Runnable() {
            @Override
            public void run() {
                seekBar.setProgress(mediaPlayer.getCurrentPosition());
                SongCurrentTimeTextView.setText(convertFormat(mediaPlayer.getCurrentPosition()));

                handler.postDelayed(this, 300);
            }
        };


        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                mediaPlayer.start();
                seekBar.setMax(mediaPlayer.getDuration());

                SongDurationTextView.setText(convertFormat(mediaPlayer.getDuration()));

                handler.postDelayed(runnable, 400);


                PlayPauseButton.setTag("Playing");
                PlayPauseButton.setImageResource(R.drawable.pause_button);
                Lottie.playAnimation();

            }
        });


        PlayPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer.getCurrentPosition() == 0 && mediaPlayer != null) {

                    mediaPlayer.start();
                    Lottie.playAnimation();
                    PlayPauseButton.setImageResource(R.drawable.pause_button);
                    PlayPauseButton.setTag("Playing");

                } else if (mediaPlayer == null) {


                    try {
                        mediaPlayer = new MediaPlayer();
                        Uri uri = Uri.parse(SongUrl);
                        mediaPlayer.setDataSource(getApplicationContext(), uri);
                        mediaPlayer.prepareAsync();

                    } catch (IOException e) {

                        e.printStackTrace();
                    }


                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {

                            mediaPlayer.start();
                            seekBar.setMax(mediaPlayer.getDuration());

                            SongDurationTextView.setText(convertFormat(mediaPlayer.getDuration()));

                            handler.postDelayed(runnable, 400);


                            PlayPauseButton.setTag("Playing");
                            PlayPauseButton.setImageResource(R.drawable.pause_button);
                            Lottie.playAnimation();

                        }
                    });

                } else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        handler.removeCallbacks(runnable);
                        PlayPauseButton.setImageResource(R.drawable.play_button);
                        PlayPauseButton.setTag("NotPlaying");
                        Lottie.pauseAnimation();

                    } else {
                        mediaPlayer.start();
                        handler.postDelayed(runnable, 400);
                        PlayPauseButton.setImageResource(R.drawable.pause_button);
                        PlayPauseButton.setTag("Playing");
                        Lottie.playAnimation();
                    }
                }


                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.seekTo(0);
                        seekBar.setProgress(mediaPlayer.getCurrentPosition());
                        PlayPauseButton.setImageResource(R.drawable.play_button);
                        PlayPauseButton.setTag("NotPlaying");
                        Lottie.pauseAnimation();

                    }
                });

            }


        });


        StopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer == null) {


                    try {
                        mediaPlayer = new MediaPlayer();
                        Uri uri = Uri.parse(SongUrl);
                        mediaPlayer.setDataSource(getApplicationContext(), uri);
                        mediaPlayer.prepareAsync();

                    } catch (IOException e) {

                        e.printStackTrace();
                    }


                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {

                            mediaPlayer.start();
                            seekBar.setMax(mediaPlayer.getDuration());

                            SongDurationTextView.setText(convertFormat(mediaPlayer.getDuration()));

                            handler.postDelayed(runnable, 400);


                            PlayPauseButton.setTag("Playing");
                            PlayPauseButton.setImageResource(R.drawable.pause_button);
                            Lottie.playAnimation();

                        }
                    });

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            mediaPlayer.seekTo(0);
                            seekBar.setProgress(mediaPlayer.getCurrentPosition());
                            PlayPauseButton.setImageResource(R.drawable.play_button);
                            PlayPauseButton.setTag("NotPlaying");
                            Lottie.pauseAnimation();
                        }
                    });

                } else if (mediaPlayer.getCurrentPosition() == 0 && mediaPlayer != null) {

                    mediaPlayer.start();
                    Lottie.playAnimation();
                    PlayPauseButton.setImageResource(R.drawable.pause_button);
                    PlayPauseButton.setTag("Playing");
                } else {

                    Lottie.pauseAnimation();
                    handler.removeCallbacks(runnable);
                    mediaPlayer.seekTo(0);
                    seekBar.setProgress(mediaPlayer.getCurrentPosition());
                    mediaPlayer.start();
                    Lottie.playAnimation();
                    handler.postDelayed(runnable, 400);
                    PlayPauseButton.setImageResource(R.drawable.pause_button);
                    PlayPauseButton.setTag("Playing");
                }
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer.seekTo(progress);
                    seekBar.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });


        loopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isLooping()) {
                    mediaPlayer.setLooping(false);
                    Toast.makeText(PlayingSong.this, "Looping Stopped", Toast.LENGTH_SHORT).show();
                } else {
                    mediaPlayer.setLooping(true);
                    Toast.makeText(PlayingSong.this, "Looping Started..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long Duration = mediaPlayer.getDuration();
                int Position = mediaPlayer.getCurrentPosition();
                if (Position <= (Duration - 10000)) {
                    Position = Position + 10000;
                    mediaPlayer.seekTo(Position);
                    seekBar.setProgress(mediaPlayer.getCurrentPosition());
                }
            }
        });


        leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Position = mediaPlayer.getCurrentPosition();
                if (Position >= 11000) {
                    Position = Position - 10000;
                    mediaPlayer.seekTo(Position);
                    seekBar.setProgress(mediaPlayer.getCurrentPosition());
                }
            }
        });

    }

    @SuppressLint("DefaultLocale")
    private String convertFormat(long duration) {

        long minutes = TimeUnit.MINUTES.convert(duration, TimeUnit.MILLISECONDS);
        long seconds = TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS) - minutes * TimeUnit.SECONDS.convert(1, TimeUnit.MINUTES);

        return String.format("%02d:%02d", minutes, seconds);

    }

    @Override
    public void onBackPressed() {

        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }

        if (Active_Code == 100) {
            controls.loadInterstitialAd(getResources().getString(R.string.interstitialAdId));
        }
        super.onBackPressed();


    }


    @Override
    public boolean onSupportNavigateUp() {
        if (mediaPlayer != null) {

            mediaPlayer.stop();
        }

        if (Active_Code == 100) {
            controls.loadInterstitialAd(getResources().getString(R.string.interstitialAdId));
        }
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }
}