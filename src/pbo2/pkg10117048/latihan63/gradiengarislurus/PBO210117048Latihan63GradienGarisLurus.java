/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan63.gradiengarislurus;

/**
 *
 * @author
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang menghitung nilai gradien.
 */
public class PBO210117048Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat kdt1 = new Koordinat(2, 10, 5, 7);
        Koordinat kdt2 = new Koordinat(5, 1, 3, 12);

        System.out.println("Garis yang melalui titik (2,10) dan titik (5,7) memiliki gradien sebesar "
                + kdt1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan titik (3,12) memiliki gradien sebesar "
                + kdt2.hitungGradien());

    }

}
