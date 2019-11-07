/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg41.massajenis;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana caranya menghitung volume dan massa
 * jenis kubus dalam suatu program
 */
public class PBO210118060LatihanKe41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : "+ kubus.getSisi());
        System.out.println("Massa : "+ kubus.getMassa());
        System.out.println();
        
        int volume = kubus.hitungVolume(kubus.getSisi());
        int massaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+volume);
        System.out.println("Massa Jenis : "+massaJenis);
    }
    
}
