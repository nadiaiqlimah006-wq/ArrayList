package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {

        // Soal 1: daftar belanja
        System.out.println("=== Soal 1: Daftar Belanja ===");
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Nasi");
        belanja.add("Ayam");
        belanja.add("Sayur");
        belanja.add("Susu");
        System.out.println("Sebelum hapus: " + belanja);
        belanja.remove(1);
        System.out.println("Setelah hapus: " + belanja);
        System.out.println("Jumlah akhir : " + belanja.size());

        // Soal 2: nilai terbesar
        System.out.println("\n=== Soal 2: Nilai Terbesar ===");
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);
        int maks = nilai.get(0);
        for (int n : nilai) {
            if (n > maks) maks = n;
        }
        System.out.println("Data    : " + nilai);
        System.out.println("Terbesar: " + maks);

        // Soal 3: nama berawalan A
        System.out.println("\n=== Soal 3: Nama Berawalan A ===");
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) nama.add(d);
        for (String n : nama) {
            if (n.startsWith("A")) System.out.println(n);
        }
    }
}