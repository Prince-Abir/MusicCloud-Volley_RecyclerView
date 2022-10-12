package com.app.musicmelamusicplayer.AllSections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.musicmelamusicplayer.Adapters.EnglishSongAdapter;
import com.app.musicmelamusicplayer.Controls;
import com.app.musicmelamusicplayer.MainActivity;
import com.app.musicmelamusicplayer.Models.DataSet;
import com.app.musicmelamusicplayer.R;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class EnglishSong extends AppCompatActivity {


    RecyclerView recyclerView;

    private AdView bannerAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_song);

        recyclerView = findViewById(R.id.EnglishSongRecyclerView);
        bannerAd = findViewById(R.id.adView);


        Controls adControls = new Controls(this);


        adControls.adInitialization();

        int Active_Code = MainActivity.Active_Code;


        ArrayList<DataSet> list = new ArrayList<>();

        int [] SongImages = {R.drawable.adele_easy_on,R.drawable.adele_hello,R.drawable.adele_someone_like_you,R.drawable.alec_benjamin_let_me_down_slowly,R.drawable.ali_gatie_its_you,
                R.drawable.alice_merton_no_roots,R.drawable.anne_marie_ciao_adios,R.drawable.anne_marie_kiss_my,R.drawable.mia,R.drawable.banana_conkarah,R.drawable.bellyache,
                R.drawable.no_time_to_die,R.drawable.when_the_party_over,R.drawable.lovely,R.drawable.taking_to_the_moon,R.drawable.if_our_love_is_wrong,R.drawable.you_are_the_reason,
                R.drawable.attention,R.drawable.how_long,R.drawable.light_switch,R.drawable.we_dont_talk_anymore,R.drawable.rockabye,R.drawable.symphony,R.drawable.dharia,R.drawable.i_did_it,
                R.drawable.let_it_go,R.drawable.loco_contigo,R.drawable.a_different_way,R.drawable.con_calma,R.drawable.dura,R.drawable.shaky_shaky,R.drawable.sigueme_y_te_sigo,
                R.drawable.laugh_now_cry_later,R.drawable.bad_habits,R.drawable.beautiful_people,R.drawable.perfect,R.drawable.shape_of_you,R.drawable.bad_at_love,R.drawable.colors,
                R.drawable.without_me,R.drawable.halsey_you_should_be_sad,R.drawable.bad_boys,R.drawable.ruleta,R.drawable.yalla,R.drawable.up,R.drawable.alright,R.drawable.makeba,
                R.drawable.acapulco,R.drawable.take_you_dancing,R.drawable.love_not_war,R.drawable.ghost,R.drawable.peaches,R.drawable.bon_appetit,R.drawable.despacito,R.drawable.echame_la_culpa,
                R.drawable.calypso,R.drawable.lean_on,R.drawable.friends,R.drawable.ritual,R.drawable.leave_before_you_love_me,R.drawable.going_bad,R.drawable.muevelo,R.drawable.diamante,
                R.drawable.biloinera,R.drawable.rain_over_me,R.drawable.pitbull,R.drawable.ten_cuidado,R.drawable.stay_with_me,R.drawable.safari,R.drawable.unstopable,R.drawable.blank_space,
                R.drawable.come_back,R.drawable.the_moment_i_knew,R.drawable.we_are_never_ever_getting_back,R.drawable.pull_up,R.drawable.see_you_again,R.drawable.still_wiz,R.drawable.dusk_till_dawn};

        String[] EnglishSongName = getResources().getStringArray(R.array.EnglishSongName);
        String[] EnglishSongSingerName = getResources().getStringArray(R.array.EnglishSongSingerName);
        String[] EnglishSongUrl = getResources().getStringArray(R.array.EnglishSongUrl);




        for (int i = 0; i<EnglishSongName.length; i++){
            list.add(new DataSet(SongImages[i],EnglishSongName[i],EnglishSongSingerName[i],EnglishSongUrl[i]));
        }

        EnglishSongAdapter adapter = new EnglishSongAdapter(this,list);

        recyclerView.setLayoutManager(new LinearLayoutManager(EnglishSong.this));

        recyclerView.setAdapter(adapter);





        if (Active_Code == 100){
            adControls.adInitialization();
            adControls.loadBannerAd(bannerAd);
        }


    }


}