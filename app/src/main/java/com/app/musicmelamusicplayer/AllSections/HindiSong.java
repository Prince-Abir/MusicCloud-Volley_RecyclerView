package com.app.musicmelamusicplayer.AllSections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.musicmelamusicplayer.Adapters.HindiSongAdapter;
import com.app.musicmelamusicplayer.Controls;
import com.app.musicmelamusicplayer.MainActivity;
import com.app.musicmelamusicplayer.Models.DataSet;
import com.app.musicmelamusicplayer.R;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class HindiSong extends AppCompatActivity {


    RecyclerView recyclerView;

    private AdView bannerAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_song);

        recyclerView = findViewById(R.id.HindiRecyclerView);
        bannerAd = findViewById(R.id.adView);


        Controls adControls = new Controls(this);


        adControls.adInitialization();

        int Active_Code = MainActivity.Active_Code;


        ArrayList<DataSet> list = new ArrayList<>();

        int [] SongImages = {R.drawable.aashiqui_aa_gayi,R.drawable.banjaara,R.drawable.barrish,R.drawable.be_intehaan,R.drawable.chale_aana,
                            R.drawable.dil_ko_karar_aaya,R.drawable.falak_tak,R.drawable.hasi_ban_gaye,R.drawable.hawayein,R.drawable.hosanna,
                            R.drawable.ijazat,R.drawable.ishq_sufiyana,R.drawable.jeena_jeena,R.drawable.kal_ho_na_hoo,R.drawable.kaun_tujhe,
                            R.drawable.khamoshiyan,R.drawable.kya_mujhe_pyaar_hai,R.drawable.lag_ja_gale,R.drawable.main_rang_sharbaton_ka,R.drawable.mast_magan,
                            R.drawable.mera_mann,R.drawable.moh_moh_ke_dhaage,R.drawable.phir_le_aaya_dil,R.drawable.piya_o_re_piya,R.drawable.raatan_lambiyan,
                            R.drawable.ranjha,R.drawable.saibo,R.drawable.srivalli,R.drawable.subhanallah,R.drawable.teri_mitti,R.drawable.tose_naina,
                            R.drawable.tujhe_kitna_chahne_lage,R.drawable.tujhse_naraz_nahi,R.drawable.tum_jo_aaye,R.drawable.tum_mile};

        String[] hindiSongName = getResources().getStringArray(R.array.HindiSongName);
        String[] hindiSongSingersName = getResources().getStringArray(R.array.HindiSongSignerName);

        String[] hindiSongUrl = getResources().getStringArray(R.array.HindiSongUrl);




        for (int i = 0; i<hindiSongName.length; i++){
            list.add(new DataSet(SongImages[i],hindiSongName[i],hindiSongSingersName[i],hindiSongUrl[i]));
        }

        HindiSongAdapter adapter = new HindiSongAdapter(this,list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

        if (Active_Code == 100){
            adControls.adInitialization();
            adControls.loadBannerAd(bannerAd);
        }





    }


}