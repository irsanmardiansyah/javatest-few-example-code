import profile.UserController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*TebakAngkaController tebakAngkaController = new TebakAngkaController();
        tebakAngkaController.doTebakAngka();*/

        /*PerusahaanController perusahaanController = new PerusahaanController();
        perusahaanController.hitungListrik();*/

        /*GradeController gradeController = new GradeController();
        gradeController.calculateGrade();*/

        /*UserController userController = new UserController();
        userController.input();*/

        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukan angka x: ");
        try {
            angka = input.nextInt();
            operasiPangkat(angka);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void operasiPangkat(int angka) {
        int hasil = (int) Math.pow(2, angka);
        System.out.println("Hasil pemangkatan 2 pangkat " + angka + " adalah " + hasil);
        int jumlah = penjumlahanAngka(hasil);
        System.out.println("Hasil penjumlahan dari hasil pemangkatan adalah "+jumlah);
    }

    private static int penjumlahanAngka(int hasil) {
        int penjumlahanChar = 0;
        char[] charAngkas = String.valueOf(hasil).toCharArray();
        for (char index : charAngkas) penjumlahanChar += Character.getNumericValue(index);
        return penjumlahanChar;
    }
}