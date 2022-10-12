package com.app.musicmelamusicplayer.AllSections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.musicmelamusicplayer.Adapters.ArabicSongAdapter;
import com.app.musicmelamusicplayer.Controls;
import com.app.musicmelamusicplayer.MainActivity;
import com.app.musicmelamusicplayer.Models.DataSet;
import com.app.musicmelamusicplayer.R;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class ArabicSong extends AppCompatActivity {


    RecyclerView recyclerView;

    private AdView bannerAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_song);

        recyclerView = findViewById(R.id.ArabicSongRecyclerView);
        bannerAd = findViewById(R.id.adView);

        Controls adControls = new Controls(this);

        int Active_Code = MainActivity.Active_Code;


        ArrayList<DataSet> list = new ArrayList<>();

        int [] SongImages = { R.drawable.three_daqat,R.drawable.jassim,R.drawable.an_el_awan,R.drawable.malek_el_fabraka,R.drawable.adam_x_balti,R.drawable.anedni,R.drawable.gomari,R.drawable.lala_molati,R.drawable.ya_hmima,R.drawable.baddek_eih,
                            R.drawable.balti_haha,R.drawable.ya_lili,R.drawable.insaha,R.drawable.beddala,R.drawable.gaw_el_banat,R.drawable.madamti,R.drawable.mi_amor,R.drawable.yallah_habibti,R.drawable.amirati,R.drawable.li_fate,
                            R.drawable.casablanca,R.drawable.ghaltana,R.drawable.lmallem,R.drawable.mal_habibi,R.drawable.lewja_tani,R.drawable.enty_hayaty,R.drawable.ah_yani,R.drawable.ashq_mot,R.drawable.momken,R.drawable.van,
                            R.drawable.decapotable,R.drawable.favour,R.drawable.ghamza,R.drawable.muscas_gracias };

        String[] ArabicSongName = getResources().getStringArray(R.array.ArabicSongName);
        String[] ArabicSongSingerName = getResources().getStringArray(R.array.ArabicSongSingerName);
        String[] ArabicSongUrl = getResources().getStringArray(R.array.ArabicSongUrl);




        for (int i = 0; i<ArabicSongName.length; i++){
            list.add(new DataSet(SongImages[i],ArabicSongName[i],ArabicSongSingerName[i],ArabicSongUrl[i]));
        }

        ArabicSongAdapter adapter = new ArabicSongAdapter(this,list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);



        if (Active_Code == 100){
            adControls.adInitialization();
            adControls.loadBannerAd(bannerAd);
        }



    }


}