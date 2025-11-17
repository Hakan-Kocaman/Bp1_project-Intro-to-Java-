/*
* @file KiralamaFirmasi.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;

public class KiralamaFirmasi {

    private String firmaAdi;
    private int arabaSayisi;
    private Kisi sahibi;
    private int kiralamaLimiti;
    private Araba[] arabaListesi = new Araba[100];
    private Araba[] kiralananArabalar = new Araba[100];
    private double gelir;
    private Kisi[] kisiler = new Kisi[50];

    public KiralamaFirmasi(String firmaAdi, Kisi sahibi, int kiralamaLimiti) {
        this.firmaAdi = firmaAdi;
        this.sahibi = sahibi;
        this.kiralamaLimiti = kiralamaLimiti;
    }

    public boolean arabaKirala(Kisi kisi, String arabaAdi) {
        if (kisi.getKiralamalimiti() <= 0) {
            System.out.println("Kiralama limiti asildi,islem basarisiz");
            return false;
        }

        if (kisi instanceof GencKisi && ((GencKisi) kisi).getBakiyelimiti() <= 0) {
            System.out.println("Bakiye limiti asildi,islem basarisiz");
            return false;
        }

        boolean a = false;
        boolean b = false;
        boolean c = false;
        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equals(arabaAdi)) {
                a = true;
                if (arabaListesi[i].getSahibi() != null) {
                    b = true;

                }
                if (arabaListesi[i].getAdet() <= 0) {
                    c = true;
                }
                break;
            }
        }

        if (!a) {
            System.out.println(arabaAdi + " adinda bir araba bulunamadi");
            return false;
        }

        if (b) {
            System.out.println("Bu araba zaten kiralanmis.");
            return false;
        }

        if (c) {
            System.out.println("Bu araba icin stok bitmis.");
            return false;

        }

        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equals(arabaAdi)) {
                if (kisi.getBakiye() < arabaListesi[i].getFiyat()) {
                    System.out.println("Bakiye yetersiz.");
                    return false;
                }

                for (int j = 0; j < kiralananArabalar.length; j++) {
                    if (kiralananArabalar[j] == null) {
                        kiralananArabalar[j] = arabaListesi[i];
                        for (int k = 0; k < kisiler.length; k++) {
                            if (kisiler[k] == null) {
                                kisiler[k] = kisi;
                            }
                        }
                        kisi.setKiralamalimiti(kisi.getKiralamalimiti() - 1);
                        kisi.setBakiye((int) (kisi.getBakiye() - arabaListesi[i].getFiyat()));
                        arabaListesi[i].setSahibi(kisi);
                        arabaListesi[i].setAdet(arabaListesi[i].getAdet() - 1);
                        System.out.println(arabaAdi + " adli arabayi basarili bir sekilde kiralandi");
                        return true;
                    }
                }

            }
        }

        System.out.println("kiralama limiti asildi,islem basarisiz");
        return true;
    }

    public boolean arabaiade(Kisi kisi, String arabaAdi) {
        for (int i = 0; i < kiralananArabalar.length; i++) {
            if (kiralananArabalar[i] != null && kiralananArabalar[i].getSahibi() == kisi) {
                if (kiralananArabalar[i] != null && kiralananArabalar[i].getArabaAdi().equals(arabaAdi)) {
                    for (int j = 0; j < arabaListesi.length; j++) {
                        if (arabaListesi[j] != null && arabaListesi[j] == kiralananArabalar[i]) {
                            arabaListesi[j].setAdet(arabaListesi[j].getAdet()+1);
                        }
                    }
                    kiralananArabalar[i].setSahibi(null);
                    kiralananArabalar[i] = null;

                    System.out.println(arabaAdi + " basariyla iade edildi");

                    return true;

                }

            }
        }
        System.out.println("araba bulunamadi");
        return false;

    }

    public double firmaToplamBakiyeHesapla() {
        double toplam = 0;
        for (int i = 0; i < kiralananArabalar.length; i++) {
            if (kiralananArabalar[i] != null) {
                toplam += kiralananArabalar[i].getFiyat();

            }
        }
        return toplam;
    }

    public void guncelKiralananArabalariGoster() {
        System.out.println("Guncel kiralanmis arabalar:");
        for (int i = 0; i < kiralananArabalar.length; i++) {
            if (kiralananArabalar[i] != null) {
                System.out.println(kiralananArabalar[i].getArabaAdi());
            }
        }
    }

    public void guncelKiralananArabalariGoster(String adi, String soyadi) {
        System.out.println(adi + " " + soyadi + " adli musterinin guncel kiralanan arabalari:");
        for (int i = 0; i < kiralananArabalar.length; i++) {

            if (kiralananArabalar[i] != null && kiralananArabalar[i].getSahibi().getAdi() == adi && kiralananArabalar[i].getSahibi().getSoyadi() == soyadi) {
                System.out.println(kiralananArabalar[i].getArabaAdi());

            }
        }

    }

    public void arabalariYazdir() {
        System.out.println("Arabalar:");
        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null) {
                System.out.println(arabaListesi[i].getArabaAdi());

            }
        }
    }

    public void arabaYazdir(String arabaAdi) {
        boolean a = true;
        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equals(arabaAdi)) {
                System.out.println("Arabanin:");
                System.out.println("adi: " + arabaListesi[i].getArabaAdi());

                if (arabaListesi[i] instanceof Otomobil) {
                    System.out.println("yas limiti: " + ((Otomobil) arabaListesi[i]).getYasLimit());
                }
                if (arabaListesi[i] instanceof Minibus) {
                    System.out.println("yolcu kapasitesi: " + ((Minibus) arabaListesi[i]).getKisiKapasite());
                }
                if (arabaListesi[i] instanceof TicariArac) {
                    System.out.println("yuk kapasitesi: " + ((TicariArac) arabaListesi[i]).getYukKapasitesi());
                }

                System.out.println("fiyati: " + arabaListesi[i].getFiyat());
                System.out.println("adedi: " + arabaListesi[i].getAdet());
                System.out.println("model yili: " + arabaListesi[i].getModelYili());
                System.out.println("rengi: " + arabaListesi[i].getRenk());
                a = false;

            }
        }
        if (a) {
            System.out.println(arabaAdi + " adli araba bulunamadi");
        }
    }

    public boolean yeniArabaEkle(Araba araba) {
        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equals(araba.getArabaAdi())) {
                arabaListesi[i].setAdet(araba.getAdet() + 1);
                System.out.println("bu arabadan zaten bulunmakta, adedi bir artirildi");
                return true;
            } else if (arabaListesi[i] == null) {
                arabaListesi[i] = araba;
                System.out.println(araba.getArabaAdi() + " adli araba listeye eklendi");
                return true;
            }
        }
        System.out.println("liste zaten dolu oldugu icin eklenemedi");
        return false;
    }

    public boolean arabaGuncelle(String arabaAdi, double yeniFiyat, int yeniAdet, int a) {
        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equals(arabaAdi)) {
                if (arabaListesi[i] instanceof Otomobil) {
                    ((Otomobil) arabaListesi[i]).setYasLimit(a);
                } else if (arabaListesi[i] instanceof Minibus) {
                    ((Minibus) arabaListesi[i]).setKisiKapasite(a);
                } else if (arabaListesi[i] instanceof TicariArac) {
                    ((TicariArac) arabaListesi[i]).setYukKapasitesi(a);
                }
                arabaListesi[i].setFiyat(yeniFiyat);
                arabaListesi[i].setAdet(yeniAdet);
                System.out.println(arabaAdi + " basarili bir sekilde guncellendi");
                return true;
            }

        }
        System.out.println(arabaAdi + " adinda bir araba bulunamadi");
        return false;
    }

    public void arabaSil(String arabaAdi) {
        boolean a = false;

        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equals(arabaAdi)) {

                for (int j = 0; j < kiralananArabalar.length; j++) {
                    if (kiralananArabalar[j] != null && kiralananArabalar[j] == arabaListesi[i]) {

                        kiralananArabalar[j] = null;

                    }
                }
                arabaListesi[i] = null;
                System.out.println(arabaAdi + " adli araba basariyla silindi");
                a = true;
                break;
            }
        }
        if (a) {

        } else {
            System.out.println(arabaAdi + " adinda bir araba bulunamadi");
        }

    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

}
