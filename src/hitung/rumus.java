/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

import java.util.Scanner;

/**
 *
 * @author RAF
 */
public class rumus {
    public int diameter;
    
    public  double hitungJariJari(){
        return diameter / 2;
    }
    
    public double hitungLuas(){
        return 3.14 * hitungJariJari() * hitungJariJari();
    }
    
    public double hitungKeliling(){
        return 2 * 3.14 * hitungJariJari();
    }
    
    public void hitungan(){
        Scanner input = new Scanner(System.in);
        String konversiAngka;
        boolean kondisi = true;
        
        System.out.println("=====Perhitungan Lingkaran=====");
        do{
        System.out.print("Masukkan nilai diameter lingkaran : ");
        konversiAngka = input.next();
        if(konversiAngka.matches("[0-9]*")){
            diameter = Integer.parseInt(konversiAngka);
            kondisi = true;
        }else{
            System.err.println("Nilai Diameter Tidak Sesuai");
            kondisi = false;
            }
        }while(!kondisi);
    }
}
