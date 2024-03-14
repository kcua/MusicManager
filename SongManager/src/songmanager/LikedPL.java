/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songmanager;

import java.util.ArrayList;

/**
 *
 * @author Karl Cuaresma
 */
public class LikedPL implements PLinterface{
    ArrayList<Song> songs;

    public LikedPL() {
        songs = new ArrayList<>();
    }
    @Override
      public int size(){
          return songs.size();
      }
      
      @Override
   public void add(Song song){
       songs.add(song);
   }
   
   @Override
    public boolean searchT(String title){
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)){
                return true;
            }
            
        }
        return false;
    }
    
    @Override
public boolean searchA(String artist){
    for (Song song : songs){
        if (song.getArtist().equalsIgnoreCase(artist)){
            return true;
        }
    }
    return false;
}

@Override
   public boolean delete(Song song){
       return songs.remove(song);
   }
@Override
            
        public boolean move(Song song, PLinterface playlist){
            if (playlist instanceof GenrePL) {
            if (songs.contains(song)){
                playlist.add(song);
                songs.remove(song);
                return true;
            }
        }
            return false;
        }
}
