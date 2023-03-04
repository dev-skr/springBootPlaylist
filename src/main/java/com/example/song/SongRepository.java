// Write your code here
package com.example.song;

import com.example.song.SongService;
import com.example.song.Song;
import java.util.*;

public interface SongRepository{
    ArrayList<Song> getSongs();
    Song postSong(Song song);

    Song getSong(int id);

    Song putSong(int id, Song song);

    void deleteSong(int id);
}