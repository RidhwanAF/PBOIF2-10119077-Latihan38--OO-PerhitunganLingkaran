/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan38.oo.perhitunganlingkaran;

import hitung.rumus;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Perhitungan Lingkaran (OO)
 */
public class PBOIF210119077Latihan38OOPerhitunganLingkaran {

   
    public static void main(String[] args) {
        rumus hr = new rumus();
        
        hr.hitungan();
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-Jari Lingkaran = %.0f",hr.hitungJariJari());
        System.out.println(" cm");
        System.out.printf("Luas Lingkaran      = %.2f",hr.hitungLuas());
        System.out.println(" cm");
        System.out.printf("Keliling Lingkaran  = %.2f",hr.hitungKeliling());
        System.out.println(" cm");
    }
    
}
