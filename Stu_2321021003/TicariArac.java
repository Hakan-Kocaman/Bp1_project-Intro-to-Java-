/*
* @file TicariArac.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public class TicariArac extends Araba {

    private int YukKapasitesi;
    

    public TicariArac(int YukKapasitesi, String arabaAdi, double fiyat, int adet, int modelYili, String renk) {
        super(arabaAdi, fiyat, adet, modelYili, renk);
        this.YukKapasitesi = YukKapasitesi;
    }
    public TicariArac(int YukKapasitesi, String arabaAdi, double fiyat, int adet) {
        super(arabaAdi, fiyat, adet);
        this.YukKapasitesi = YukKapasitesi;
    }

    public int getYukKapasitesi() {
        return YukKapasitesi;
    }

    public void setYukKapasitesi(int YukKapasitesi) {
        this.YukKapasitesi = YukKapasitesi;
    }
}
