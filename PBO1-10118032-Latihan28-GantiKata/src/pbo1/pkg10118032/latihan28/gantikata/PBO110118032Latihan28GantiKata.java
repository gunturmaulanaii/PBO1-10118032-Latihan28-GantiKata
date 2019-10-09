/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Merubah Kata ke Kalimat
 */
public class PBO110118032Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
	System.out.println("*****Program Mengganti Kata*****");
	System.out.print("Masukkan Kalimat : ");
	String a = sc.nextLine();
	System.out.print("Ganti Kata : ");
	String awal = sc.next();
	System.out.print("Menjadi Kata : ");
	String baru = sc.next();
	String aa = a.replace(awal, baru);
	System.out.println("\n");
	System.out.println("*****Hasil Formatting*****");
	System.out.println("Kalimat Awal : " + a );
	System.out.println("Kalimat Baru : " + aa);
    }
    
}
