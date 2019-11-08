/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118040.latihan54.koordinat;

/**
 *
 * @author asus
 */
public class PBO110118040Latihan54Koordinat {

    /**
     * @param args the command line arguments
     * NAMA  : Moch Yudha Rusdian
 * KELAS : IF 1
 * NIM   : 10118040
 * Deskripsi Program : Program ini untuk membuat Warna Sumbu.
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
         
        WarnaKoordinat wKoordinat = new WarnaKoordinat (10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wKoordinat.getX()+", y : "+wKoordinat.getY());
    }
    
}
