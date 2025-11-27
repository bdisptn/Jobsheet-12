package Pertemuan14;

import java.util.Scanner;

public class Kafe307 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - 12.000");
        System.out.println("5. Roti Bakar - 10.000");
        System.out.println("6. Mie Goreng - 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static double hitungTotalHarga07(String kodePromo, int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        double hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        double potongan = 0;

        if (kodePromo.equals("DISKON50")) {
            potongan = hargaTotal * 0.5;
            System.out.println("Selamat anda mendapatkan diskon 50%! Potongan: Rp" + potongan);
        } else if (kodePromo.equals("DISKON30")) {
            potongan = hargaTotal * 0.3;
            System.out.println("Selamat anda mendapatkan diskon 30%! Potongan: Rp" + potongan);
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon.");
        }

        return hargaTotal - potongan;
    }
    public static void main(String[] args) {
        Menu("Andi", true);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan kode promo (jika tidak ada tekan '-' ): ");
        String kodePromo = sc.nextLine();

        System.out.print("Berapa jenis menu yang ingin dipesan? ");
        int jumlahJenis = sc.nextInt();

        double totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            double totalHarga = hitungTotalHarga07(kodePromo, pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;

            System.out.println("Subtotal pesanan: Rp" + totalHarga);
        }

        System.out.println("\n====================================");
        System.out.println("Total keseluruhan pesanan: Rp" + totalKeseluruhan);
        System.out.println("Terima kasih sudah berbelanja");
        
        sc.close();
    }
}
