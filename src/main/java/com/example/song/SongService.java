/*

 * You can use the following import statements
  
 * import org.springframework.http.HttpStatus;
 * import org.springframework.web.server.ResponseStatusException;

 */

package com.example.song;

import java.util.*;

import com.example.song.Song;
import com.example.song.SongRepository;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

// Don't modify the below code
public class SongService implements SongRepository {
    private static HashMap<Integer, Song> playlist = new HashMap<>();

    public SongService() {
        playlist.put(1, new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman S"));
        playlist.put(2, new Song(2, "Kathari Poovazhagi", "Vijay", "Benny Dayal, Swetha Mohan", "A.R. Rahman"));
        playlist.put(3, new Song(3, "Tum Hi Ho", "Mithoon", "Arijit Singh", "Mithoon"));
        playlist.put(4, new Song(4, "Vizhiyil", "Vairamuthu", "Unni Menon", "A.R. Rahman"));
        playlist.put(5, new Song(5, "Nenjame", "Panchu Arunachalam", "S.P.Balasubrahmanyam", "Ilaiyaraaja"));
    }

    // Don't modify the above code

    // Write your code here
    @Override
    public ArrayList<Song> getSongs(){
        ArrayList<Song> list=new ArrayList<>(playlist.values());
        return list;
    }

    @Override
    public Song postSong(Song song){
        int lastIndex=playlist.size();
        lastIndex+=1;
        song.setId(lastIndex);
        playlist.put(lastIndex,song);
        return song;
    }

    @Override
    public Song getSong(int id){
        Song song=playlist.get(id);
        if(song==null)
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return song;
    }

    @Override
    public Song putSong(int id, Song song){
        Song exist=playlist.get(id);

        if(exist==null)
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        if(song.getSongName()!=null)
        exist.setSongName(song.getSongName());

        if(song.getLyricist()!=null)
        exist.setLyricist(song.getLyricist());

        if(song.getSinger()!=null)
        exist.setSinger(song.getSinger());

        if(song.getMusicDirector()!=null)
        exist.setMusicDirector(song.getMusicDirector());

        return exist;

    }

    @Override
    public void deleteSong(int id){
        Song song=playlist.get(id);
        if(song==null)
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        else{
            playlist.remove(id);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }
    
}