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
public class Latihan {
    public static void main(String[] args){
      Float ip1,ip2,ip3,ip4,ip5,ip6,ip7,ip8,ipk;
      Scanner scan = new Scanner(System.in);
      
        System.out.println("Masukan nilai ip1: ");
        ip1 = scan.nextFloat();
        System.out.println("Masukan nilai ip2: ");
        ip2 = scan.nextFloat();
        System.out.println("Masukan nilai ip3: ");
        ip3 = scan.nextFloat();
        System.out.println("Masukan nilai ip4: " );
        ip4 = scan.nextFloat();
        System.out.println("Masukan nilai ip5: ");
        ip5 = scan.nextFloat();
        System.out.println("Masukan nilai ip6: ");
        ip6 = scan.nextFloat();
        System.out.println("Masukan nilai ip7: ");
        ip7 = scan.nextFloat();
        System.out.println("Masukan nilai ip8: ");
        ip8 = scan.nextFloat();
        
        ipk = ((ip1+ip2+ip3+ip4+ip5+ip6+ip7+ip8)/8);
        System.out.println("ipk anda: "+ ipk);
        
        if (ipk >= 3.00 && ipk <= 3.19){
            System.out.println("Kategori ipk anda:"+"merit"+ ipk);
        }else if (ipk >= 3.20 && ipk <=3.39){
            System.out.println("Kategori ipk anda:"+"high merit"+ ipk);
                
        }
        else if (ipk >= 3.40 && ipk <=3.59){
            System.out.println("Kategori ipk anda:"+"Cum Laude"+ ipk);
                }
        else if (ipk >= 3.60 && ipk <=3.79){
            System.out.println("Kategori ipk anda:"+"Magna Cum Laude"+ ipk);
                }
        else if (ipk >= 3.80){
            System.out.println("Kategori ipk anda:"+"Summa Cum Laude"+ ipk);
                }
        }
        
        
        }
