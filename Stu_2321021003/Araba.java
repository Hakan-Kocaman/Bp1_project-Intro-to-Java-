/*
* @file Araba.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public abstract class Araba {

    private String arabaAdi;
    private double fiyat;
    private int adet;
    private int modelYili;
    private String renk;
    private Kisi sahibi;
    

    public Araba(String arabaAdi, double fiyat, int adet) {
        this.arabaAdi = arabaAdi;
        this.fiyat = fiyat;
        this.adet = adet;
    }

    public Araba(String arabaAdi, double fiyat, int adet, int modelYili, String renk) {
        this.arabaAdi = arabaAdi;
        this.fiyat = fiyat;
        this.adet = adet;
        this.modelYili = modelYili;
        this.renk = renk;
    }

    public void arabaGoster() {
        
        System.out.println("Araba adi: " + this.arabaAdi);
        System.out.println("Araba fiyati: " + this.fiyat);
        System.out.println("Araba adeti: " + this.adet);
        System.out.println("Araba modelyili: " + this.modelYili);
        System.out.println("Araba rengi: " + this.renk);

    }
    //setter getterlar

    public String getArabaAdi() {
        return arabaAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getModelYili() {
        return modelYili;
    }
    public String getRenk() {
        return renk;
    }

    public Kisi getSahibi() {
        return sahibi;
    }

    public void setSahibi(Kisi sahibi) {
        this.sahibi = sahibi;
    }
}


