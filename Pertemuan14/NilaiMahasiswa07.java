package Pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa07 {
    static int n;
    static int[] nilaiMhs = new int[n];
    public static void main(String[] args) {
        isianNilai();
        tampilArray();
        hotTol();
    }

    static void isianNilai() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        n = sc.nextInt();

        nilaiMhs = new int[n];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();

        }
        
        sc.close();
    }

    static void tampilArray() {
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + ": " + nilaiMhs[i]);
        }
    }

    static int hotTol() {
        int total = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            
        }
        System.out.println("Total nilai seluruh mahasiswa: " + total);
        return total;
    }
}
