/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class tugasgagas {
    public static void main(String[] args) {
       
        String st1 = "Gagas Jarang Keluar Rumah";
        String st2 = "Gagas Jarang Keluar Rumah";
        String st3 = "Gagas Jarang";
        String st4 = " Keluar";
        String st5 = " Rumah";
        String st6 = st3 + st4 + st5;
        
        System.out.println("");
        System.out.println("Pernyataan 1 : " + st1);
        System.out.println("Pernyataan 2 : " + st2);
        System.out.println("Pernyataan 3 : " + st3);
        System.out.println("Pernyataan 4 : " + st4);
        System.out.println("Pernyataan 5 : " + st5);
        System.out.println("Pernyataan 6 : " + st6);
        System.out.println("");
        System.out.println("Menggunakan Operator (==) :");
        System.out.println("Pernyataan 1 == Pernyataan 6 : " + (st1==st6));
        System.out.println("Pernyataan 1 == Pernyataan 2 : " + (st1==st2));
        System.out.println("Pernyataan 6 == Pernyataan 2 : " + (st6==st2));
        System.out.println("");
        System.out.println("Menggunakan Equals : ");
        System.out.println("Pernyataan 1 equals Pernyataan 6 : " + (st1.equals(st6)));
        System.out.println("Pernyataan 1 equals Pernyataan 2 : " + (st1.equals(st2)));
        System.out.println("Pernyataan 6 equals Pernyataan 2 : " + (st6.equals(st2)));
        
        
    }
    
}
