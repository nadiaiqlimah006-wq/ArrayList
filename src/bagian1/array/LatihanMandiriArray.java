package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {

        // Soal 1: suhu tertinggi & terendah
        System.out.println("=== Soal 1: Suhu Harian ===");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double max = suhu[0], min = suhu[0];
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah : " + min);

        // Soal 2: nama hari lebih dari 5 huruf
        System.out.println("\n=== Soal 2: Nama Hari > 5 Huruf ===");
        String[] hariMinggu = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        for (String hari : hariMinggu) {
            if (hari.length() > 5) {
                System.out.println(hari);
            }
        }

        // Soal 3: hitung bilangan genap
        System.out.println("\n=== Soal 3: Hitung Bilangan Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah genap: " + genap);
    }
}