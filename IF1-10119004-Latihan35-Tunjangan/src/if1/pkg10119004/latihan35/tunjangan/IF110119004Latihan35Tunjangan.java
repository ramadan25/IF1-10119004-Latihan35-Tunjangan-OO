/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan35.tunjangan;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan tunjangan
 */
public class IF110119004Latihan35Tunjangan {
    private static double gajiAwal;
    static Scanner scanner = new Scanner (System.in);
    private static String status;
    private static void inputTunjangan(){
              
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiAwal = scanner.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = scanner.next();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tunjangan = new Tunjangan();
        inputTunjangan();
        tunjangan.hitung(gajiAwal, status);
        
    }
    
}
