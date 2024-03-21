
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 90553
 */
public class FaturaBilgisi {
    
   private int hastaID;
   private ArrayList<Integer> ilacID;
   private String oneri,gun;
   private int ucret;

    public FaturaBilgisi() {
        this.hastaID = 0;
        this.ilacID = new ArrayList<>();
        this.oneri = "";
        this.gun = "";
        this.ucret = 0;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public ArrayList<Integer> getIlacID() {
        return ilacID;
    }

    public void setIlacID(int ilacID) {
        this.ilacID.add( ilacID);
    }
    
    public String getTavsiye() {
        return oneri;
    }

    public void setTavsiye(String tavsiye) {
        this.oneri = tavsiye;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "FaturaBilgisi{" + "hastaID=" + hastaID + ", ilacID=" + ilacID + ", oneri=" + oneri + ", gun=" + gun + ", ucret=" + ucret + '}';
    }

    

    void setilacID(String string) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setOneri(String text) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDate(String format) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getOneri() {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
