package com.app.musicmelamusicplayer.Models;

public class DataSet {

    int ImageId;
    String SongName;
    String SingerName;
    String SongUrl;

    public DataSet(int imageId, String songName, String singerName,String url) {
        this.ImageId = imageId;
        this.SongName = songName;
        this.SingerName = singerName;
        this.SongUrl = url;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public String getSingerName() {
        return SingerName;
    }

    public void setSingerName(String singerName) {
        SingerName = singerName;
    }

    public String getSongUrl() {
        return SongUrl;
    }

    public void setSongUrl(String songUrl) {
        SongUrl = songUrl;
    }
}
