/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan35.programtunjangan;

/**
 *
 * @author User
 */
public class Tunjangan 
{
    public static void hitungGaji(double gajiPokok, String status)
    {
        double tunjangan, totalGaji;
        
        if (status.equals("menikah")) 
        {
            tunjangan = gajiPokok * 0.35;
        }
        else
        {
            tunjangan = 0;
        }

        totalGaji = gajiPokok + tunjangan;

        System.out.println("=======Hasil Penghitungan Gaji Anda========");
        System.out.printf("Gaji Pokok \t : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan \t : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji \t : Rp %.1f%n", totalGaji);
    }
}
