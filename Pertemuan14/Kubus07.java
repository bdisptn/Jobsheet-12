package Pertemuan14;

public class Kubus07 {
    static int volumeKubus(int panjang, int lebar, int tinggi) {
        int vol = panjang * lebar * tinggi;
        return vol;
    }

    static int luasPermukaanKubus(int a, int b) {
        int luasPermukaan = a * b;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        int V = volumeKubus(3, 4, 2);
        int lP = luasPermukaanKubus(3, 4);

        System.out.println("Volume kubus adalah " + V);
        System.out.println("Luas permukaan kubus adalah " + lP);
    }
}
