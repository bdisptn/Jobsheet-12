package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe07 {

    static Scanner sc = new Scanner(System.in);
    static int[][] penjualan = new int[5][7]; 
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    // Fungsi menginputkan data penjualan
    public static void inputData() {
        System.out.println("=== INPUT DATA PENJUALAN MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " pada hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // Fungsi menampilkan seluruh data dalam bentuk tabel
    public static void tampilData() {
        System.out.println("\n=== TABEL DATA PENJUALAN ===");
        System.out.print("Menu/Hari\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi menampilkan menu dengan total penjualan tertinggi
    public static void menuTerlaris() {
        int maxTotal = 0;
        int indexMenu = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\n=== MENU PENJUALAN TERTINGGI ===");
        System.out.println(menu[indexMenu] + " dengan total penjualan: " + maxTotal);
    }

    // Fungsi menampilkan rata-rata penjualan setiap menu
    public static void rataRataPenjualan() {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / 7;
            System.out.println(menu[i] + " = " + rata);
        }
    }

    // Main
    public static void main(String[] args) {
        inputData();
        tampilData();
        menuTerlaris();
        rataRataPenjualan();
    }
}
