/*
* @file Kisi.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public abstract class  Kisi {

    private String adi;
    private String soyadi;
    private int bakiye;
    private Araba[] kiralamaGecmisi = new Araba[100];
    private int kiralamalimiti;
    private Araba[] guncelKiraladiğiArac = new Araba[100];
    

    public Kisi(String adi, String soyadi, int bakiye, int kiralamalimiti) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.bakiye = bakiye;
        this.kiralamalimiti = kiralamalimiti;
    }

    public void KiralamaGecmisiniGoster() {
        System.out.println("Kiralama Geçmişi:");
        for (Araba araba : kiralamaGecmisi) {
            if (araba != null) {
                araba.arabaGoster();
            }
        }
    }

    public void KiralamaGecmisiniGoster(String arabaTipi) {
        System.out.println(arabaTipi + "Kiralama Geçmişi:");
        for (Araba araba : kiralamaGecmisi) {
            if (araba != null) {
                araba.arabaGoster();
            }
        }
    }
    
    
     public Araba getGuncelKiraladiğiArac(int i) {
        return guncelKiraladiğiArac[i];
    }
    public void setGuncelKiraladiğiArac(Araba guncelKiraladiğiArac,int i) {
        this.guncelKiraladiğiArac[i] = guncelKiraladiğiArac;
    }
    
    //setter getterlar

    public String getAdi() {
        return adi;
    }

    public int getKiralamalimiti() {
        return kiralamalimiti=100;
    }

    public void setKiralamalimiti(int kiralamalimiti) {
        this.kiralamalimiti = kiralamalimiti;
    }


    public String getSoyadi() {
        return soyadi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public Araba[] getKiralamaGecmisi() {
        return kiralamaGecmisi;
    }
   

    public Araba[] getGuncelKiraladiğiArac() {
        return guncelKiraladiğiArac;
    }
    

    public void setGuncelKiraladiğiArac(Araba[] guncelKiraladiğiArac) {
        this.guncelKiraladiğiArac = guncelKiraladiğiArac;
    }

    
}


