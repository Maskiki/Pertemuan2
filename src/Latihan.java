/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Latihan {
   
    public static void main(String[] args){
        
        int nilai = 10;
        String pesan="", jumlah="";
         if (nilai>3.80){
            jumlah = "Summa Cum Laude";
            if (nilai>3.60){
                pesan = "Magna Cum Laude";
            }else {
                pesan = "Bilangan Ganjil";
                }
                System.out.println(jumlah +"dan"+pesan);
        }
}
}