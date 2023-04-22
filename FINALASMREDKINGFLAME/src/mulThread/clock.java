/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulThread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;

/**
 *
 * @author Huy1721
 */
public class clock extends Thread {
    
    private String time;
    private JLabel box;
    
    public clock(JLabel box){
        this.box = box;
    }
        

    @Override
    public void run(){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {

            }
            LocalTime now = LocalTime.now();
            time = dtf.format(now);
            this.box.setText("time: "+time);
        }
        
    }
    
}
