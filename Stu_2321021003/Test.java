/*
* @file Test.java
* @description CarRenting
* @date 18.05.2024
* @author Hakan Kocaman, hakan.kocaman@stu.fsm.edu.tr
 */
package Stu_2321021003;
public class Test {
    public static void main(String[] args) {
    KiralamaFirmasi RENTCAR= new KiralamaFirmasi("RENTCAR", null, 50);
    Kisi MehmetYilmaz=new GencKisi("Mehmet", "Yilmaz", 5000, 30);
    Menu.calistir(RENTCAR, MehmetYilmaz);
  
   
    }
    
}
