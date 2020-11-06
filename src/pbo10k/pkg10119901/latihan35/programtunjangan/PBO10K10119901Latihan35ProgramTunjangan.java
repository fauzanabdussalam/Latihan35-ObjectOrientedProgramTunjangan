/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menghitung Tunjangan
 *
 */
public class PBO10K10119901Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tjn = new Tunjangan();
        
        double gajiPokok;
        String status;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("============Program Tunjangan===========");
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        status = scanner.next();
        status = status.toLowerCase();
        
        System.out.println();
        
        tjn.hitungGaji(gajiPokok, status);
    }
    
}
