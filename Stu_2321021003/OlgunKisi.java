/*
* @file OlgunKisi.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public class OlgunKisi extends Kisi {

    private final int kiralamalimit = 10;

    public OlgunKisi(String adi, String soyadi, int bakiye, int kiralamalimit) {
        super(adi, soyadi, bakiye, kiralamalimit);
    }

    public void limitleriGoster() {
        System.out.println("kiralama limiti: " + kiralamalimit);
    }
//getter
    public int getKiralamalimit() {
        return kiralamalimit;
    }
}
