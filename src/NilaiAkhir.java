import java.util.Scanner;

public class NilaiAkhir {
    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai praktikum : ");
        double praktikum = scanner.nextDouble();
        System.out.print("Nilai tugas     : ");
        double tugas = scanner.nextDouble();
        System.out.print("Nilai MID       : ");
        double mid = scanner.nextDouble();
        System.out.print("Nilai final     : ");
        double finalNilai = scanner.nextDouble(); // "final" reserved word

        double akhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;
        akhir += finalNilai * BOBOT_FINAL;

        int praktikumInt = (int) praktikum;
        int tugasInt = (int) tugas;
        int midInt = (int) mid;
        int finalInt = (int) finalNilai;
        int akhirInt = praktikumInt * 30 / 100 + tugasInt * 20 / 100
                + midInt * 20 / 100 + finalInt * 30 / 100;

        int dipotong = (int) akhir;
        long dibulatkan = Math.round(akhir);
        double selisih = akhir - dipotong;
        boolean lulus = akhir >= 60;

        System.out.println();
        System.out.println("Nilai akhir         : " + akhir);
        ...
        scanner.close();
    }
}