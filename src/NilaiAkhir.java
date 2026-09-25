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
        double finalNilai = scanner.nextDouble(); // dipakai "finalNilai" karena "final" sudah dipakai Java

        // ===== VERSI DOUBLE (bukan int) =====
        // Hitung nilai akhir, tanpa kurung. Bisa gitu karena perkalian (*)
        // memang dikerjakan duluan sebelum penjumlahan (+) di Java.
        double akhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;
        akhir += finalNilai * BOBOT_FINAL; // tambah nilai final pakai +=

        // ===== VERSI INT =====
        // Coba pakai int. Karena int dibagi int hasilnya dibulatkan ke
        // bawah (desimalnya hilang di tiap komponen), hasil totalnya jadi
        // lebih kecil: 78, bukan 79.1 kayak versi double.
        int praktikumInt = (int) praktikum;
        int tugasInt = (int) tugas;
        int midInt = (int) mid;
        int finalInt = (int) finalNilai;
        int akhirInt = praktikumInt * 30 / 100 + tugasInt * 20 / 100
                + midInt * 20 / 100 + finalInt * 30 / 100;

        // (int) = motong angka di belakang koma, ga dibulatin
        // Math.round = beneran dibulatin ke angka terdekat
        int dipotong = (int) akhir;
        long dibulatkan = Math.round(akhir);

        // Selisih buat nunjukin double gak 100% presisi nyimpen desimal
        double selisih = akhir - dipotong;

        // Coba input 85, 78, 70, 80 -> dipotong = dibulatkan = 79 (sama)
        // Coba input 85, 80, 75, 90 -> dipotong = 83, dibulatkan = 84 (beda)

        // Status lulus, tanpa pakai if
        boolean lulus = akhir >= 60;

        // ===== TAMPILKAN HASIL =====
        System.out.println();
        System.out.println("===== VERSI DOUBLE (bukan int) =====");
        System.out.println("Nilai akhir         : " + akhir);
        System.out.println("Dipotong (int)      : " + dipotong);
        System.out.println("Dibulatkan (round)  : " + dibulatkan);
        System.out.println("Selisih             : " + selisih);
        System.out.println("Lulus (>=60)        : " + lulus);

        System.out.println();
        System.out.println("===== VERSI INT =====");
        System.out.println("Nilai akhir (int)   : " + akhirInt);

        System.out.println();
        System.out.println("Catatan: versi double = " + akhir + ", versi int = " + akhirInt
                + " -> beda karena int/int dibulatkan ke bawah di tiap komponen.");

        scanner.close();
    }
}