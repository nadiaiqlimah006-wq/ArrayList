// Nama : Nadia Iqlimah
// NPM  : 2410010215

package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Array mata kuliah (ukuran tetap)
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek 1",
            "Struktur Data",
            "Basis Data"
        };
        System.out.println("== Daftar Mata Kuliah ==");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Buat kelas dan isi 5 mahasiswa
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi Pratama",   "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso",   "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Dewi",     "2301003", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Deni Kurniawan", "2301004", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Rahayu",     "2301005", 48.0));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.printf("Rata-rata nilai: %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus   : " + kelas.jumlahLulus());
        System.out.println();

        // Tambah 1 mahasiswa baru
        System.out.println("-- Menambah mahasiswa baru --");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Nugroho", "2301006", 78.0));
        System.out.println("Jumlah mahasiswa sekarang: " + kelas.jumlahMahasiswa());
        System.out.println();

        kelas.tampilkanSemua();
        System.out.printf("Rata-rata nilai (terbaru): %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    (terbaru): " + kelas.jumlahLulus());
    }
}