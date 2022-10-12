package com.app.musicmelamusicplayer.Adapters;


import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.musicmelamusicplayer.Models.DataSet;
import com.app.musicmelamusicplayer.PlayingSong;
import com.app.musicmelamusicplayer.R;

import java.util.ArrayList;

public class HindiSongAdapter extends RecyclerView.Adapter<HindiSongAdapter.MyViewHolder> {

    public Activity activity;
    ArrayList<DataSet> list;

    public HindiSongAdapter(Activity activity, ArrayList<DataSet> list) {
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.sample_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.hindiSongImage.setImageResource(list.get(position).getImageId());
        holder.hindiSongName.setText(list.get(position).getSongName());
        holder.hindiSongSingersName.setText(list.get(position).getSingerName());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int ImageId = list.get(holder.getAdapterPosition()).getImageId();
                String SongName = list.get(holder.getAdapterPosition()).getSongName();
                String SingerName = list.get(holder.getAdapterPosition()).getSingerName();
                String SongUrl =  list.get(holder.getAdapterPosition()).getSongUrl();

                Intent intent = new Intent(activity, PlayingSong.class);
                intent.putExtra("link", SongUrl);
                intent.putExtra("ImageId", ImageId);
                intent.putExtra("SongName",SongName);
                intent.putExtra("SingerName",SingerName);
                activity.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView hindiSongImage;
        TextView hindiSongName, hindiSongSingersName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            hindiSongImage = itemView.findViewById(R.id.SongImage);
            hindiSongName = itemView.findViewById(R.id.SongName);
            hindiSongSingersName = itemView.findViewById(R.id.SingerName);
        }
    }
}
