/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Program Tunjangan
 */
public class PBOIF210119048Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String status;
        int gaji, tunjangan;
        
        System.out.println("=======Program Tunjangan======");
        System.out.println("Berapa gaji pokok anda perbulan?: Rp.");
        gaji = input.nextInt();
        System.out.println("Status anda? (Menikah/Belum)    : ");
        status = input.next();
            if("Menikah".equals(status)){
                tunjangan = (int) (0.35*gaji);
            }
            else {
                tunjangan = 0;
            }
        int gajiTotal = gaji + tunjangan;
        System.out.println("");
        System.out.println("=======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok\t\t : Rp " + gaji);
        System.out.println("Tunjangan\t\t : Rp " + tunjangan);
        System.out.println("Gaji Total\t\t : Rp " + gajiTotal);
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
    
}
