/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package songmanager;

/**
 *
 * @author Karl Cuaresma
 */
public interface PLinterface {
    int size();
    void add(Song song);
    boolean searchT(String title);
    boolean searchA(String artist);
    boolean delete(Song song);
    boolean move(Song song, PLinterface playlist);
}
