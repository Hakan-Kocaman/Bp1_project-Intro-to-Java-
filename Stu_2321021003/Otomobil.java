/*
* @file Otomobil.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public class Otomobil extends Araba {

    private int YasLimit;
    public Otomobil(int YasLimit, String arabaAdi, double fiyat, int adet) {
        super(arabaAdi, fiyat, adet);
        this.YasLimit = YasLimit;
    }

    public Otomobil(int YasLimit, String arabaAdi, double fiyat, int adet, int modelYili, String renk) {
        super(arabaAdi, fiyat, adet, modelYili, renk);
        this.YasLimit = YasLimit;
    }

    public int getYasLimit() {
        return YasLimit;
    }

    public void setYasLimit(int YasLimit) {
        this.YasLimit = YasLimit;
    }

}
