/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Huy1721
 */
abstract public class DAO<D> {
    protected ArrayList<D> dsNV = new ArrayList<D>();

    public ArrayList<D> getDsNV() {
        return dsNV;
    }
    
    public void Save(D data, int sign, int luuY){    
        if(luuY == 0){
            dsNV.add(data);
        }else{
            dsNV.set(sign, data);
        }
            
    }    
    
    
    public void store(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream FIS = new FileInputStream(path);
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        dsNV = (ArrayList<D>) OIS.readObject();
        OIS.close();
        FIS.close();
        System.out.println(dsNV);
    }
    
    public void load(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileOutputStream FOS = new FileOutputStream(path);
        ObjectOutputStream OOS = new ObjectOutputStream(FOS);
        OOS.writeObject(dsNV);
        OOS.close();
        FOS.close();     
    }
}
