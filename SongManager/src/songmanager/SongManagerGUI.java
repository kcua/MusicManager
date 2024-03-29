/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package songmanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Karl Cuaresma
 */
public class SongManagerGUI extends javax.swing.JFrame {
    ArrayList<Song> popsongs; //declaration of pop songs arrayList
    ArrayList<Song> rocksongs; //declaration  of the rock song ArrayList
    ArrayList<Song> hiphopsongs; //declaration of the hiphop song ArrayList
    ArrayList<Song> countrysongs; //declaration  of the country song ArrayList

    /**
     * Creates new form SongManagerGUI
     */
    public SongManagerGUI() {
        initComponents();
    popsongs = new ArrayList<>();
    rocksongs = new ArrayList<>();
    hiphopsongs = new ArrayList<>();
    countrysongs = new ArrayList<>();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genreBtnGrp = new javax.swing.ButtonGroup();
        exitBTN = new javax.swing.JButton();
        musicManagerLBL = new javax.swing.JLabel();
        titleLBL = new javax.swing.JLabel();
        titleTF = new javax.swing.JTextField();
        artistLBL = new javax.swing.JLabel();
        artistTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        searchTF = new javax.swing.JTextField();
        searchLBL = new javax.swing.JLabel();
        addBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        moveBTN = new javax.swing.JButton();
        rockRB = new javax.swing.JRadioButton();
        hiphopRB = new javax.swing.JRadioButton();
        countryRB = new javax.swing.JRadioButton();
        PopRB = new javax.swing.JRadioButton();
        genreLBL = new javax.swing.JLabel();
        popPLBTN = new javax.swing.JButton();
        saveBTN = new javax.swing.JButton();
        rockPLBTN = new javax.swing.JButton();
        HipHopPLBTN = new javax.swing.JButton();
        countryPLBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        musicManagerLBL.setText("Music Manager");

        titleLBL.setText("Title:");

        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });

        artistLBL.setText("Artist:");

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        searchLBL.setText("Search:");

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");

        searchBTN.setText("Search");

        moveBTN.setText("Move");

        genreBtnGrp.add(rockRB);
        rockRB.setText("Rock");

        genreBtnGrp.add(hiphopRB);
        hiphopRB.setText("Hip-Hop");

        genreBtnGrp.add(countryRB);
        countryRB.setText("Country");

        genreBtnGrp.add(PopRB);
        PopRB.setText("Pop");

        genreLBL.setText("Genre:");

        popPLBTN.setText("Pop Playlist");
        popPLBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popPLBTNActionPerformed(evt);
            }
        });

        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        rockPLBTN.setText("Rock Playlist");
        rockPLBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockPLBTNActionPerformed(evt);
            }
        });

        HipHopPLBTN.setText("Hip-Hop Playlist");
        HipHopPLBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HipHopPLBTNActionPerformed(evt);
            }
        });

        countryPLBTN.setText("Country Playlist");
        countryPLBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryPLBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(musicManagerLBL)
                        .addGap(364, 364, 364))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PopRB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchLBL)
                                .addGap(24, 24, 24)
                                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBTN)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(genreLBL)
                                .addComponent(artistLBL)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(rockRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(hiphopRB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titleTF, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(artistTF))))
                        .addGap(39, 39, 39)
                        .addComponent(countryRB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(exitBTN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBTN)
                                .addGap(72, 72, 72)
                                .addComponent(saveBTN)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(moveBTN)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBTN))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(popPLBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rockPLBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HipHopPLBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countryPLBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(musicManagerLBL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN)
                    .addComponent(searchLBL))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLBL)
                    .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistLBL)
                    .addComponent(artistTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PopRB)
                    .addComponent(rockRB)
                    .addComponent(hiphopRB)
                    .addComponent(countryRB)
                    .addComponent(genreLBL))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(saveBTN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(popPLBTN)
                        .addGap(18, 18, 18)
                        .addComponent(rockPLBTN)
                        .addGap(18, 18, 18)
                        .addComponent(HipHopPLBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countryPLBTN)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBTN)
                    .addComponent(moveBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(exitBTN)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0); // when the users click this button, it will close the program.
    }//GEN-LAST:event_exitBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        
        //POP SONGS
        if(PopRB.isSelected()){
        Song song = new Song();
        String title = titleTF.getText(); //gets the title of the song
       song.setTitle(title); 
        String artist = artistTF.getText(); // gets the artist name
       song.setArtist(artist);
        popsongs.add(song);
        
        
      //the code below displays the users input and the size of the playlist.
        displayTA.setText("Song has been added to the Pop Playlist!" + "\n Title: " + song.getTitle() + "\n Artist: "+ song.getArtist()+ "\n Genre: " + PopRB.getText() + "\n Size of Playlist: " +popsongs.size());
        }
        
        
        //ROCK SONGS
        if(rockRB.isSelected()){
        Song song = new Song();
        String title = titleTF.getText(); //gets the title of the song
       song.setTitle(title); 
        String artist = artistTF.getText(); // gets the artist name
       song.setArtist(artist);
        rocksongs.add(song);
        displayTA.setText("Song has been added to the Rock Playlist!" + "\n Title: " + song.getTitle() + "\n Artist: "+ song.getArtist()+ "\n Genre: " +rockRB.getText() + "\n Size of Playlist: " +rocksongs.size());
        }
        
        
        //COUNTRY SONGS
        if(countryRB.isSelected()){
        Song song = new Song();
        String title = titleTF.getText(); //gets the title of the song
       song.setTitle(title); 
        String artist = artistTF.getText(); // gets the artist name
       song.setArtist(artist);
        countrysongs.add(song);
        displayTA.setText("Song has been added to the Country Playlist!" + "\n Title: " + song.getTitle() + "\n Artist: "+ song.getArtist()+ "\n Genre: " + countryRB.getText() +"\n Size of Playlist: " +countrysongs.size());
        }
        
        
        //HIPHOP SONGS
        if(hiphopRB.isSelected()){
        Song song = new Song();
        String title = titleTF.getText(); //gets the title of the song
       song.setTitle(title); 
        String artist = artistTF.getText(); // gets the artist name
       song.setArtist(artist);
        hiphopsongs.add(song);
        displayTA.setText("Song has been added to the Hip-Hop Playlist!" + "\n Title: " + song.getTitle() + "\n Artist: "+ song.getArtist()+ "\n Genre: " + hiphopRB.getText() + "\n Size of Playlist: " +hiphopsongs.size());
        }
        
    }//GEN-LAST:event_addBTNActionPerformed

    private void popPLBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popPLBTNActionPerformed
        // TODO add your handling code here:
        File f;
        FileInputStream fs;
        ObjectInputStream os;
        
        try{
            f = new File("popsongs.dat"); //create
            fs = new FileInputStream(f);
            os = new ObjectInputStream(fs);
            popsongs = (ArrayList<Song>)os.readObject();
            os.close();
        }catch(IOException e){
            displayTA.setText("Error Reading from the file" +e);
        }catch(ClassNotFoundException c){
            displayTA.setText("Class not found error" + c);
      
                    }  
    }//GEN-LAST:event_popPLBTNActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
        
        
        if(PopRB.isSelected()){ //To Save Song in the Pop Playlist
        File f;
        FileOutputStream fs;
        ObjectOutputStream os;
        
        try{
            f = new File("popsongs.dat");
            fs = new FileOutputStream(f);
            os = new ObjectOutputStream(fs);
            
            os.writeObject(popsongs); //writes the object into the popsongs arraylist
            os.close();
            displayTA.setText("Song has been written to the Pop playlist!"); //if the save is successful, it will say say the text written on this line
            }
        
        catch(IOException e){
            displayTA.setText("Error Writing to File:" +e);
        }
                if(rockRB.isSelected()){
        File r;
        FileOutputStream fsr;
        ObjectOutputStream osr;
        
        try{
            r = new File("rocksongs.dat"); 
            fsr = new FileOutputStream(r);
            osr = new ObjectOutputStream(fsr);
            
            osr.writeObject(rocksongs);
            osr.close();
            displayTA.setText("Song has been written to the Rock playlist!");
            }
        
        catch(IOException e){
            displayTA.setText("Error Writing to File:" +e);
        }
        if(hiphopRB.isSelected()){ // To save Song in the Hiphop playlist
            File h;
            FileOutputStream hsh;
            ObjectOutputStream osh;
            
            try{
                h = new File("hiphopsongs.dat");
                hsh = new FileOutputStream(h);
                osh = new ObjectOutputStream(hsh);
                
                osh.writeObject(hiphopsongs);
                osh.close();
                displayTA.setText("Song has been added to the HipHop Playlist");
               }
            catch(IOException e){
            displayTA.setText("Error Writing to File:" +e);
        }
            
            if(countryRB.isSelected()){
                File c;
                FileOutputStream csh;
                ObjectOutputStream och;
                
                try{
                    c = new File("countrysongs.dat");
                    csh = new FileOutputStream(c);
                    och = new ObjectOutputStream(csh);
                    
                    och.writeObject(countrysongs);
                    och.close();
                    
                    displayTA.setText("Song has been added to the Country Playlist");
                  }
                catch(IOException e){
            displayTA.setText("Error Writing to File:" +e);
        }
            }
           
        }
        }
        }
    }//GEN-LAST:event_saveBTNActionPerformed

    private void countryPLBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryPLBTNActionPerformed
        // TODO add your handling code here:
        
        //Displays all the songs in the country playlist
        File c;
        FileInputStream chs;
        ObjectInputStream och;
        
        try{
            c = new File("popsongs.dat"); //create
            chs = new FileInputStream(c);
            och = new ObjectInputStream(chs);
            countrysongs = (ArrayList<Song>)och.readObject();
            och.close();
        }catch(IOException e){
            displayTA.setText("Error Reading from the file" +e);
        }catch(ClassNotFoundException h){
            displayTA.setText("Class not found error" + h);
        }
    }//GEN-LAST:event_countryPLBTNActionPerformed

    private void rockPLBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockPLBTNActionPerformed
        // TODO add your handling code here:
        File r;
        FileInputStream fsr;
        ObjectInputStream osr;
        
        try{
            r = new File("popsongs.dat"); //create
            fsr = new FileInputStream(r);
            osr = new ObjectInputStream(fsr);
            rocksongs = (ArrayList<Song>)osr.readObject();
            osr.close();
        }catch(IOException e){
            displayTA.setText("Error Reading from the file" +e);
        }catch(ClassNotFoundException c){
            displayTA.setText("Class not found error" + c);
        }
        
    }//GEN-LAST:event_rockPLBTNActionPerformed

    private void HipHopPLBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HipHopPLBTNActionPerformed
        // TODO add your handling code here:
        
        File h;
        FileInputStream hsh;
        ObjectInputStream osh;
        
        try{
            h = new File ("hiphongsongs.dat");
            hsh = new FileInputStream(h);
            osh = new ObjectInputStream(hsh);
            
            hiphopsongs = (ArrayList<Song>)osh.readObject();
            osh.close();
            
        }catch(IOException e){
            displayTA.setText("Error Reading from the file" + e);
        }catch(ClassNotFoundException c){
            displayTA.setText("Class not found error" + c);
         
            
        }
    }//GEN-LAST:event_HipHopPLBTNActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SongManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SongManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SongManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SongManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SongManagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HipHopPLBTN;
    private javax.swing.JRadioButton PopRB;
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel artistLBL;
    private javax.swing.JTextField artistTF;
    private javax.swing.JButton countryPLBTN;
    private javax.swing.JRadioButton countryRB;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.ButtonGroup genreBtnGrp;
    private javax.swing.JLabel genreLBL;
    private javax.swing.JRadioButton hiphopRB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton moveBTN;
    private javax.swing.JLabel musicManagerLBL;
    private javax.swing.JButton popPLBTN;
    private javax.swing.JButton rockPLBTN;
    private javax.swing.JRadioButton rockRB;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel searchLBL;
    private javax.swing.JTextField searchTF;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JTextField titleTF;
    // End of variables declaration//GEN-END:variables
}
