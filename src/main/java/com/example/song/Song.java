// Write your code here
package com.example.song;
public class Song{
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    Song(int songId, String songName, String lyricist, String singer, String musicDirector){
        this.songId=songId;
        this.songName=songName;
        this.lyricist=lyricist;
        this.singer=singer;
        this.musicDirector=musicDirector;
    }

    public void setId(int songId){
        this.songId=songId;
    }

    public int getId(){
        return songId;
    }

    public void setSongName(String songName){
        this.songName=songName;
    }

    public String getSongName(){
        return songName;
    }

    public void setLyricist(String name){
        this.lyricist=name;
    }

    public String getLyricist(){
        return lyricist;
    }

    public void setSinger(String name){
        this.singer=name;
    }

    public String getSinger(){
        return singer;
    }

    public void setMusicDirector(String name){
        this.musicDirector=name;
    }

    public String getMusicDirector(){
        return musicDirector;
    }
}