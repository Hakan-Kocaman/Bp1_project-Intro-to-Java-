/*
* @file Minibus.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public class Minibus extends Araba {

    private String arabaMarkaModeli;
    private int kisiKapasite;
    
    public Minibus(int kisiKapasite, String arabaAdi, double fiyat, int adet) {
        super(arabaAdi, fiyat, adet);
        this.kisiKapasite = kisiKapasite;

    }

    public Minibus(int kisiKapasite, String arabaAdi, double fiyat, int adet, int modelYili, String renk) {
        super(arabaAdi, fiyat, adet, modelYili, renk);
        this.kisiKapasite = kisiKapasite;

    }

    public int getKisiKapasite() {
        return kisiKapasite;
    }

    public void setKisiKapasite(int kisiKapasite) {
        this.kisiKapasite = kisiKapasite;
    }
}
