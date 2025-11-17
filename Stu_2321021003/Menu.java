
/*
* @file Menu.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */

package Stu_2321021003;
import java.util.Scanner;


public class Menu {
    public static void calistir(KiralamaFirmasi KiralamaFirmasi,Kisi Kisi) {       
        Scanner var= new Scanner(System.in);
        System.out.println(KiralamaFirmasi.getFirmaAdi()+" MENU");
        int secim;
        boolean a=true;
        while (a) {            
            System.out.println("------------------------------------------------------");
            
            System.out.println("0. Araba Sil");
            System.out.println("------------------------------------------------------");
            System.out.println("1. Araba Kirala");
            System.out.println("2. Araba Iade Et");
            System.out.println("3. Firmaya Yeni Araba Ekle");
            System.out.println("4. Araba Bilgilerini Goruntule");
            System.out.println("5. "+Kisi.getAdi()+" "+Kisi.getSoyadi()+" Adina Kiralanan Arabalari Goruntule");
            System.out.println("6. Kiralanan Arabalari Goruntule");
            System.out.println("7. Firmanin bakiyesini goruntule");
            System.out.println("8. Araba guncelle");
            System.out.println("9. Cikis");
            System.out.println("indeks giriniz:");
            secim = var.nextInt();
            switch (secim) {
                case 0 ->{
                    System.out.println("silmek istediginiz araba adini giriniz.");
                    String k=var.next();
                    KiralamaFirmasi.arabaSil(k);
                } 
                case 1 -> {
                    KiralamaFirmasi.arabalariYazdir();
                    System.out.println("kiralamak istediginiz arabanin ismini giriniz");
                    String b=var.next();
                    KiralamaFirmasi.arabaKirala(Kisi, b);
                }
                case 2->{KiralamaFirmasi.guncelKiralananArabalariGoster(Kisi.getAdi(), Kisi.getSoyadi());
                    System.out.println("iade etmek istediginiz arabanin ismini giriniz");
                String b=var.next();
                KiralamaFirmasi.arabaiade(Kisi, b);
                }
                case 3->{
                    System.out.println("eklemek istediginiz arabinin turunu giriniz:");
                    System.out.println("Otomobil,Minibus,TicariArac");
                    String j=var.next();
                    System.out.println("eklemek istediginiz araba icin isim olusturun");
                    String k=var.next();
                    System.out.println("eklemek istediginiz arabanin fiyatini giriniz");
                    double e=var.nextDouble();
                    System.out.println("eklemek istediginiz arabanin adedini giriniz");
                    int d=var.nextInt();
                    switch (j) {
                        case "Otomobil" -> {
                            System.out.println("Otomobil icin yas limit giriniz.");
                            int u=var.nextInt();
                            Araba araba1= new Otomobil(u,k, e, d);
                            KiralamaFirmasi.yeniArabaEkle(araba1);
                        }
                        
                        case "Minibus" -> {System.out.println("Minibus icin yolcu kapasitesi giriniz.");
                        int u=var.nextInt();
                        Araba araba1= new Minibus(u,k, e, d);
                        KiralamaFirmasi.yeniArabaEkle(araba1);
                        }
                        case "TicariArac" -> {
                            System.out.println("Ticari arac icin yuk kapasitesi giriniz.");
                            int u=var.nextInt();
                            Araba araba1= new TicariArac(u,k, e, d);
                            KiralamaFirmasi.yeniArabaEkle(araba1);
                        
                        }
                        
                        default -> System.out.println("Hatali araba turu sectiniz");
                    }
                    
                    
                
                }
                case 4->{
                    System.out.println("bilgilerini goruntulemek istediginiz arabanin ismini giriniz");
                    String k=var.next();
                    KiralamaFirmasi.arabaYazdir(k);
                    
                }
                case 5->{
                KiralamaFirmasi.guncelKiralananArabalariGoster(Kisi.getAdi(), Kisi.getSoyadi());
                }
                case 6->{
                KiralamaFirmasi.guncelKiralananArabalariGoster();
                }
                case 7->{
                    System.out.println(KiralamaFirmasi.getFirmaAdi()+" firma bakiyesi:");
                    System.out.println(KiralamaFirmasi.firmaToplamBakiyeHesapla());
                }
                case 8->{
                    System.out.println("guncellemek istediginiz arabanin adini giriniz");
                    String k=var.next();
                    System.out.println("arabanin yeni fiyatini giriniz");
                    double e=var.nextDouble();
                    System.out.println("arabanin yeni adedini giriniz");
                    int d=var.nextInt();
                    
                    System.out.println("arabanin turune ozel ozelligi icin deger giriniz.");
                    int h=var.nextInt();
                   KiralamaFirmasi.arabaGuncelle(k, e, d, h );
                
                
                
                }
                
               case 9->{System.out.println("cikis yapiliyor...");
               a=false;
               }
                default -> System.out.println("Hatali secim..");
            }
             if (a) {
                
            
System.out.println("------------------------------------------------------");
            System.out.println("siradaki islem icin:");
            System.out.println("1. menuye don");
            System.out.println("2. cikis yap");
            int b=var.nextInt();
            if (b==2) {
                System.out.println("cikis yapiliyor...");
                a=false;
                
            }else if (b==1) {
                System.out.println("menuye donuluyor..");
                
            } else System.out.println("gecersiz giris, menuye donuluyor..");
        System.out.println("------------------------------------------------------");
        }}
}


}
