/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan21.programratarataniliai;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Kelas    : PBO2
 * Nim      : 10118078
 * Deskripsi Program : Program Rata-rata Nilai
 */
public class PBO2_10118078_Latihan21_ProgramRatarataNilai {
    public static int mahasiswa;
    public static double rata, nilai=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa = scanner.nextInt();
        for (int i=1; i<=mahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke- " + i + ":");
            nilai = nilai + scanner.nextInt();
        }
        rata = nilai/mahasiswa;
        System.out.printf("Maka, Rata-rata Nilainya adalah %.1f", rata);
    } 

}
