/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Latihan2 {
    public static void main(String[] args){
        String hari ;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Hari: ");
        hari = keyboard.nextLine();
        
        String harii = hari.toUpperCase();
        
        switch (harii){
            case "SENIN":
                System.out.println("PEMDAS");
                System.out.println("ORKOM");
                System.out.println("PBD");
           
                break;
            case "SELASA":
                System.out.println("PCD");
                System.out.println("OOP");
                System.out.println("RPL");
        break;
            case "KAMIS":
                System.out.println("OLAHRAGA");
                System.out.println("PCD");
                System.out.println("INTEROP");
                break;
            default: 
                    System.out.println("Tidak Ada Mata Kuliah");
            
        }
        }
        
}
