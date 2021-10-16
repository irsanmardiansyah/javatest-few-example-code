import java.util.Scanner;

public class GradeController {

    void calculateGrade() {

        //Input
        int finalScore, tp1Score, tp2Score,
                tk1Score, tk2Score, kuis1, kuis2, uas;

        Scanner inputTP1 = new Scanner(System.in);
        System.out.println("Masukan Nilai Tugas Personal 1: ");
        tp1Score = inputTP1.nextInt();

        Scanner inputTP2 = new Scanner(System.in);
        System.out.println("Masukan Nilai Tugas Personal 2: ");
        tp2Score = inputTP2.nextInt();

        Scanner inputTK1 = new Scanner(System.in);
        System.out.println("Masukan Nilai Tugas Kelompok 1: ");
        tk1Score = inputTK1.nextInt();

        Scanner inputTK2 = new Scanner(System.in);
        System.out.println("Masukan Nilai Tugas Kelompok 2: ");
        tk2Score = inputTK2.nextInt();

        Scanner inputKuis1 = new Scanner(System.in);
        System.out.println("Masukan Nilai Kuis 1: ");
        kuis1 = inputKuis1.nextInt();

        Scanner inputKuis2 = new Scanner(System.in);
        System.out.println("Masukan Nilai Kuis 2: ");
        kuis2 = inputKuis2.nextInt();

        Scanner inputUAS = new Scanner(System.in);
        System.out.println("Masukan Nilai UAS: ");
        uas = inputUAS.nextInt();

        finalScore = (int) ((0.15 * tp1Score) + (0.15 * tp2Score) + (0.10 * tk1Score) +
                (0.10 * tk2Score) + (0.10 * kuis1) + (0.10 * kuis2) + (0.30 * uas));

        System.out.println("Nilai akhir dari mahasiswa adalah " + finalScore);
        if (finalScore >= 85) {
            System.out.println("Dan berada di Grade A ");
        } else if (finalScore >= 75) {
            System.out.println("Dan berada di Grade B ");
        } else if (finalScore >= 65) {
            System.out.println("Dan berada di Grade C ");
        } else if (finalScore >= 50) {
            System.out.println("Dan berada di Grade D ");
        } else {
            System.out.println("Dan berada di Grade F ");
        }
    }
}
