/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 90553
 */
public class ilaclar {
    private int id, alisfiyati, satisfiyati, miktar;
    private String isim,tanim;

    public ilaclar() {
           this.id = 0;
        this.alisfiyati = 0;
        this.satisfiyati = 0;
        this.miktar = 0;
        this.isim = "";
        this.tanim = "";
        
    }
    

    public ilaclar(int id, int alisfiyati, int satisfiyati, int miktar, String isim, String tanim) {
        this.id = id;
        this.alisfiyati = alisfiyati;
        this.satisfiyati = satisfiyati;
        this.miktar = miktar;
        this.isim = isim;
        this.tanim = tanim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlisfiyati() {
        return alisfiyati;
    }

    public void setAlisfiyati(int alisfiyati) {
        this.alisfiyati = alisfiyati;
    }

    public int getSatisfiyati() {
        return satisfiyati;
    }

    public void setSatisfiyati(int satisfiyati) {
        this.satisfiyati = satisfiyati;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }

    @Override
    public String toString() {
        return "ilaclar{" + "id=" + id + ", alisfiyati=" + alisfiyati + ", satisfiyati=" + satisfiyati + ", miktar=" + miktar + ", isim=" + isim + ", tanim=" + tanim + '}';
    }

    void setsatisfiyati(int parseInt) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setalisfiyati(String string) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setmiktar(String string) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void settanim(String string) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   

    
    
    
    
}
