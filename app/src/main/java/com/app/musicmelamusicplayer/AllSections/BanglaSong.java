package com.app.musicmelamusicplayer.AllSections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.musicmelamusicplayer.Adapters.BanglaSongAdapter;
import com.app.musicmelamusicplayer.Controls;
import com.app.musicmelamusicplayer.MainActivity;
import com.app.musicmelamusicplayer.Models.DataSet;
import com.app.musicmelamusicplayer.R;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class BanglaSong extends AppCompatActivity {



    RecyclerView recyclerView;

    private AdView bannerAd;

    int Active_Code;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_song);

        recyclerView = findViewById(R.id.BanglaRecyclerView);
        bannerAd = findViewById(R.id.adView);


        Controls adControls = new Controls(this);

        Active_Code = MainActivity.Active_Code;

        if (Active_Code == 100){
            adControls.adInitialization();
            adControls.loadBannerAd(bannerAd);
        }


        ArrayList<DataSet> list = new ArrayList<>();

        int [] SongImages = {R.drawable.abar_hahimukh, R.drawable.valobasha_tarpor, R.drawable.bhebe_dekhecho_ki, R.drawable.bindiya_re_bindiya,
                R.drawable.deyale_deyale, R.drawable.ekta_chele_moner_anginay, R.drawable.srotoshini, R.drawable.fire_ai_na,
                R.drawable.ghum_bhanga, R.drawable.raat_nirghum, R.drawable.jao_pakhi_bolo_tare, R.drawable.jontrona, R.drawable.kotodur,
                R.drawable.lal_sari, R.drawable.likhi_na_ar_toke_niye, R.drawable.majhe_majhe_tobo_dekhai_pai, R.drawable.tumi_chaile_bristy,
                R.drawable.mombati, R.drawable.monta_obaddho, R.drawable.aj_raate_kono_rupkotha_nei, R.drawable.oniket_prantor, R.drawable.oviman,
                R.drawable.rupkothar_jogote, R.drawable.she_ki_boshe_ache, R.drawable.sesh_kanna, R.drawable.she_ki_jane, R.drawable.shironamhin,
                R.drawable.bedona_shunno, R.drawable.utshorgo, R.drawable.tomar_ghore_bosot_kore_koyjona, R.drawable.tomay_hrid_majhare_rakhebo,
                R.drawable.tumi_akash_er_buke};

        String[] banglaSongName = getResources().getStringArray(R.array.BanglaSongName);
        String[] banglaSongSignersName = getResources().getStringArray(R.array.BanglaSongSingersName);
        String[] SongUrl = getResources().getStringArray(R.array.BanglaSongUrl);



        for (int i = 0; i<banglaSongName.length; i++){
            list.add(new DataSet(SongImages[i],banglaSongName[i],banglaSongSignersName[i],SongUrl[i]));
        }

        BanglaSongAdapter adapter = new BanglaSongAdapter(this,list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);





    }








}