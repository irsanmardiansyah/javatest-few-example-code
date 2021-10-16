import java.util.Scanner;

public class TebakAngkaController {

    void doTebakAngka() {
        //Input
        int random, tebak, jumlah;
        random = (int) (Math.random() * 100);
        System.out.println("Tebaklah Angka Antara 1-100");
        Scanner masukan = new Scanner(System.in);
        jumlah = 0;

        //Proses
        do {
            jumlah++;
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = masukan.nextInt();

            //Output
            if (jumlah < 5) {
                if (tebak > random) {
                    System.out.println("Tebakan Terlalu Besar");
                } else if (tebak < random) {
                    System.out.println("Tebakan Terlalu Kecil");
                } else {
                    System.out.print("Tebakan Benar! Setelah " + jumlah + " Kali Menebak");
                }
            } else {
                System.out.print("Kesempatan menebak anda sudah habis, jawabannya adalah " + random);
                break;
            }
        } while (tebak != random);
    }
}
