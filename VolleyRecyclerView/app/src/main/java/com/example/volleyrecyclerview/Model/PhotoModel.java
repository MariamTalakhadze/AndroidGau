package com.example.volleyrecyclerview.Model;

import java.io.Serializable;

public class PhotoModel implements Serializable {

    private String Url, ThumblUrl, title;
    private int id, Albumid;

    public PhotoModel(String url, String thumblUrl, String title, int id, int albumid) {
        Url = url;
        ThumblUrl = thumblUrl;
        this.title = title;
        this.id = id;
        Albumid = albumid;
    }

    public String getUrl() {
        return Url;
    }

    public String getThumblUrl() {
        return ThumblUrl;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getAlbumid() {
        return Albumid;
    }
}
