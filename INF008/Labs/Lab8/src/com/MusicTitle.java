package com;

public class MusicTitle {
    private String title;
    private String artist;

    public MusicTitle(){
        this.artist = "sem nome";
        this.title = "sem nome";
    }

// ------------------------ GET And SET ------------------------
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
