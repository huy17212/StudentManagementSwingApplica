/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulThread;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;

/**
 *
 * @author Huy1721
 */
public class Daate extends Thread{
    
    private JLabel box;
    String DDMMYYYY;
    @Override 
    public void run(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {

            }
            LocalDate now = LocalDate.now();
            DDMMYYYY = dtf.format(now);
            this.box.setText("date: "+DDMMYYYY);
        }
    }
    
    public Daate(JLabel box){
        this.box = box;
    }
}
