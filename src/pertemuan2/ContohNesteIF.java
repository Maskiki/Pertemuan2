/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Asus
 */
public class ContohNesteIF {
    
    public static void main(String[] args) {
        int nilai = 1;
        String pesan="", jumlah="";
        
        if (nilai>2){
            jumlah = "Lebih besar dari 2";
            int nilai2 = 0;
            if (nilai2==0){
                pesan = "Bilangan Genap";
            }else {
                pesan = "Bilangan Ganjil";
                }
                System.out.println(jumlah +"dan"+pesan);
        }else{
            jumlah = "Lebih kecil dari 2";
            System.out.println(jumlah);
            }
            
        }
    }
