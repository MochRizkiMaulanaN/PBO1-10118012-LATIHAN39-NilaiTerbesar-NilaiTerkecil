/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimaxmin;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nilai {
    
    public int mhs;
    public int maks,min;
    public int[] nilai;
    public String nama;
    
    public void hasil_cetak(){
        Scanner input =new Scanner(System.in);
        System.out.println("=== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ===");
        System.out.print("Masukkan Nama Petugas : ");
        nama = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        mhs = input.nextInt();
        int[] nilai = new int[mhs];
        System.out.println("");
        
        System.out.print("Masukkan Nilai Mahasiswa ke- 1 = " );
        nilai[0]= input.nextInt();
        maks=nilai[0];
        min =nilai[0];
        for (int i = 1; i < mhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke- "+(i+1)+" = ");
            nilai[i]=input.nextInt();
            if (nilai[i] > maks) {
                maks = nilai[i];
            }
            if(nilai[i] < min){
                min = nilai[i];
            }
        }
        System.out.println("");
        System.out.println("Nilai Terbesar = "+maks);
        System.out.println("Nilai Terkecil = "+min);

    }
        
            
}
