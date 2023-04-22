/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulThread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Huy1721
 */
public class song extends Thread {

    JButton ONorOFF;

//    public song(JButton ONorOFF){
//        this.ONorOFF = ONorOFF;
//    }
    public static void main(String[] args) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        String duongDan = "C:\\Users\\Huy1721\\Downloads\\uptownGirl.wav";
        File path = new File(duongDan);
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(path);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.start();
    }

    @Override
    public void run() {

    }
}
