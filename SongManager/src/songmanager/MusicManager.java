/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songmanager;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Karl Cuaresma
 */
public class MusicManager {
    private LikedPL likedPL;
    private Map<String, GenrePL> genrePL;
    
    public MusicManager(){
        likedPL = new LikedPL();
        genrePL = new HashMap<>();
    }
    
    public LikedPL getLikedPL(){
        return likedPL;
    }
    
    public GenrePL setGenrePL(String genre){
        GenrePL playlist = new GenrePL(genre);
        genrePL.put(genre, playlist);
        return playlist;
    }
    
    public GenrePL getGenrePL(String genre){
        return genrePL.get(genre);
        
        
    }
    
    public void addSong(Song song){
        likedPL.add(song);
        
    }
    
    public boolean deleteSongLikedPL(Song song){
        return likedPL.delete(song);
    }
    
    public boolean deleteSongGenrePL(Song song, GenrePL playlist){
        if (playlist !=null && genrePL.containsValue(song)){
            return playlist.delete(song);
        }
        return false;
    }
    
    
}
