import java.util.Scanner;

public class NilaiAkhir {
    // Bobot nilai, disimpan biar gampang dipakai berulang di rumus
    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4 nilai
        System.out.print("Nilai praktikum : ");
        double praktikum = scanner.nextDouble();

        System.out.print("Nilai tugas     : ");
        double tugas = scanner.nextDouble();

        System.out.print("Nilai MID       : ");
        double mid = scanner.nextDouble();

        System.out.print("Nilai final     : ");
        double finalNilai = scanner.nextDouble();
        // dipakai "finalNilai" karena "final" sudah dipakai Java


        // ===== VERSI DOUBLE (bukan int) =====
        // Hitung nilai akhir menggunakan double.
        // Karena double bisa menyimpan angka desimal,
        // hasil perhitungan tidak langsung membuang angka di belakang koma.
        //
        // Tanpa kurung juga bisa karena perkalian (*)
        // dikerjakan lebih dulu sebelum penjumlahan (+) di Java.
        double akhir = praktikum * BOBOT_PRAKTIKUM
                + tugas * BOBOT_TUGAS
                + mid * BOBOT_MID;

        // Tambah nilai final menggunakan +=
        akhir += finalNilai * BOBOT_FINAL;


        // ===== VERSI INT =====
        // Coba pakai int.
        // Karena int tidak bisa menyimpan angka desimal,
        // bagian desimal akan hilang pada setiap perhitungan.
        //
        // Contoh:
        // 85 * 30 / 100 = 25.5
        // Tetapi karena menggunakan int, hasilnya menjadi 25.
        int praktikumInt = (int) praktikum;
        int tugasInt = (int) tugas;
        int midInt = (int) mid;
        int finalInt = (int) finalNilai;

        int akhirInt = praktikumInt * 30 / 100
                + tugasInt * 20 / 100
                + midInt * 20 / 100
                + finalInt * 30 / 100;


        // ===== PEMOTONGAN DAN PEMBULATAN =====
        // (int) = memotong angka di belakang koma, bukan membulatkan.
        //
        // Contoh:
        // 79.9 menjadi 79
        // 79.1 menjadi 79
        int dipotongDouble = (int) akhir;

        // Math.round = membulatkan ke angka terdekat.
        //
        // Contoh:
        // 79.4 menjadi 79
        // 79.5 menjadi 80
        // 79.9 menjadi 80
        long dibulatkanDouble = Math.round(akhir);


        // ===== SELISIH DOUBLE =====
        // Selisih dihitung dari nilai double asli
        // dikurangi nilai yang sudah dipotong menjadi int.
        //
        // Contoh:
        // 79.1 - 79 = 0.1
        double selisihDouble = akhir - dipotongDouble;


        // ===== PEMBULATAN VERSI INT =====
        // Karena akhirInt sudah berupa int,
        // sebenarnya tidak ada angka desimal yang perlu dibulatkan.
        // Math.round tetap digunakan untuk menunjukkan cara pembulatan.
        int dibulatkanInt = Math.round(akhirInt);


        // ===== SELISIH INT DAN DOUBLE =====
        // Menunjukkan perbedaan antara hasil double dan hasil int.
        //
        // Contoh:
        // Double = 79.1
        // Int    = 78
        //
        // Selisih = 79.1 - 78
        //         = 1.1
        double selisihInt = akhir - akhirInt;


        // ===== STATUS LULUS =====
        // Status lulus menggunakan boolean.
        // Jika nilai akhir >= 60 maka hasilnya true.
        // Jika nilai akhir < 60 maka hasilnya false.
        boolean lulus = akhir >= 60;


        // ===== TAMPILKAN HASIL =====
        System.out.println();
        System.out.println("===== NILAI AKHIR =====");

        System.out.println("Praktikum : " + praktikum + " (30%)");
        System.out.println("Tugas     : " + tugas + " (20%)");
        System.out.println("MID       : " + mid + " (20%)");
        System.out.println("Final     : " + finalNilai + " (30%)");


        // ===== HASIL DOUBLE =====
        System.out.println();
        System.out.println("===== VERSI DOUBLE =====");

        System.out.println("Nilai akhir        : " + akhir);
        System.out.println("Dipotong (int)     : " + dipotongDouble);
        System.out.println("Dibulatkan (round) : " + dibulatkanDouble);
        System.out.println("Selisih             : " + selisihDouble);


        // ===== HASIL INT =====
        System.out.println();
        System.out.println("===== VERSI INT =====");

        System.out.println("Nilai akhir (int)  : " + akhirInt);
        System.out.println("Dibulatkan (round) : " + dibulatkanInt);
        System.out.println("Selisih             : " + selisihInt);


        // ===== STATUS =====
        System.out.println();
        System.out.println("Lulus (>=60)       : " + lulus);

        scanner.close();
    }
}