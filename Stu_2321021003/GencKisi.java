/*
* @file GencKisi.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public class  GencKisi extends Kisi {

    private final double bakiyelimiti = 50000;
    private final int kiralamalimiti = 10;
    

    public GencKisi(String adi, String soyadi, int bakiye, int kiralamalimiti) {
        super(adi, soyadi, bakiye, kiralamalimiti);

    }

    public void limitleriGoster() {
        System.out.println("bakiye limiti: " + bakiyelimiti);
        System.out.println("kiralama limiti: " + kiralamalimiti);
    }
//getterlar
    public double getBakiyelimiti() {
        return bakiyelimiti;
    }

    @Override
    public int getKiralamalimiti() {
        return kiralamalimiti;
    }

}