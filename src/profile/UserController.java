package profile;

import java.util.Scanner;

public class UserController extends Profile{

    private Scanner input = new Scanner(System.in);

    public void input() {
        String decision;
        boolean yn = true;

        while (yn) {
            try {
                System.out.println("Silahkan input sata diri anda: ");
                System.out.print("Nama: ");
                name = input.nextLine();
                System.out.print("Tanggal Lahir: ");
                birthDay = input.nextLine();
                System.out.print("No Handphone: ");
                phoneNumber = input.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("===============================");
            System.out.println("           DATA DIRI           ");
            System.out.println("Nama: " + name);
            System.out.println("Tanggal Lahir: " + birthDay);
            System.out.println("No Handphone: " + phoneNumber);
            System.out.println(" ");
            System.out.println("===============================");

            System.out.println("Apakah Anda yakin dengan data tersebut? [Y|N]");
            System.out.print("Pilih: ");
            decision = input.nextLine();
            switch(decision){
                case "Y":
                    menu();
                case "y":
                    menu();
                case "N":
                    yn = true;
                    break;
                case "n":
                    yn = true;
                    break;
                default :
                    System.out.println("Silahkan ikuti default value [Y|N] ketika input.");
                    System.out.println(" ");
                    System.out.println("Apakah Anda yakin dengan data tersebut? [Y|N]");
                    System.out.print("Pilih: ");
                    boolean repeat = true;

                    while (repeat)
                    {
                        decision = input.nextLine();

                        switch (decision)
                        {
                            case "Y":
                                menu();
                            case "y":
                                menu();
                            case "N":
                                yn = true;
                                repeat = false;
                                break;
                            case "n":
                                yn = true;
                                repeat = false;
                                break;
                            default:
                                System.out.println("Silahkan ikuti default value [Y|N] ketika input.");
                                System.out.println(" ");
                                System.out.println("Apakah Anda yakin dengan data tersebut? [Y|N]");
                                System.out.print("Pilih: ");
                                repeat = true;
                        }
                    }
                    break;
            }
        }
    }

    private void menu() {
        boolean counter = true;
        while (counter) {
            int menu;
            System.out.println(" ");
            System.out.println("=====================================");
            System.out.println("********** SELAMAT DATANG ***********");
            System.out.println("             MENU UTAMA              ");
            System.out.println(" ");
            System.out.println("1. Lihat Data Diri");
            System.out.println(" ");
            System.out.println("2. Update Data Diri");
            System.out.println(" ");
            System.out.println("3. Keluar");
            System.out.println(" ");
            System.out.println("=====================================");
            try {
                System.out.println("Silahkan memilih menu.");
                System.out.print("Pilih: ");
                menu = input.nextInt();
                switch(menu){
                    case 1:
                        inputData();
                        break;
                    case 2:
                        updateData();
                        break;
                    case 3:
                        System.exit(3);
                        counter = false;
                        System.out.println("Terima kasih sudah berkunjung");
                        break;
                    default :
                        System.out.println("Menu tidak tersedia, silahkan input ulang");
                        boolean repeat = true;

                        while (repeat)
                        {
                            System.out.print("Pilih: ");
                            menu = input.nextInt();
                            switch (menu)
                            {
                                case 1:
                                    inputData();
                                    repeat = false;
                                    break;

                                case 2:
                                    updateData();
                                    repeat = false;
                                    break;
                                case 3:
                                    System.exit(3);
                                    counter = false;
                                    System.out.println("Terima kasih sudah berkunjung");
                                    break;
                                default:
                                    repeat = true;
                                    System.out.println("Menu tidak tersedia, silahkan input ulang");
                            }
                        }
                        break;
                }
            } catch (NumberFormatException n) {
                System.out.println(n);
            }
        }
    }

    private void inputData() {
        System.out.println("=====================================");
        System.out.println("              DATA DIRI              ");
        System.out.println(" ");
        System.out.println("Nama: " + (name != null || !"".equals(name) ? name : " -"));
        System.out.println("Alamat: " + (address != null || !"".equals(address) ? address : " -"));
        System.out.println("No Handphone: " + (phoneNumber != null || !"".equals(phoneNumber) ? phoneNumber : " -"));
        System.out.println("Tgl Lahir: " + (birthDay != null || !"".equals(birthDay) ? birthDay : " -"));
        System.out.println("Status: " + (status != null || !"".equals(status) ? status : " -"));
        System.out.println("No KTP: " + (id != null || !"".equals(id) ? id : " -"));
    }

    private void updateData() {
        Scanner update = new Scanner(System.in);
        int data;
        System.out.println("=====================================");
        System.out.println("    PILIH DATA YANG AKAN DIUPDATE    ");
        System.out.println(" ");
        System.out.println("1. Nama");
        System.out.println("2. Alamat");
        System.out.println("3. No Handphone");
        System.out.println("4. Tgl Lahir");
        System.out.println("5. Status ");
        System.out.println("6. No Ktp ");
        System.out.println("7. Cancel ");
        System.out.println(" ");
        System.out.println("=====================================");
        try {
            System.out.println("Silahkan pilih data yang akan diupdate.");
            System.out.print("Pilih: ");
            data = input.nextInt();
            switch(data){
                case 1:
                    System.out.println("Silahkan masukan data Nama yang baru.");
                    System.out.print("Nama: ");
                    name = update.nextLine();
                    System.out.println("Data Berhasil Disimpan");
                    break;
                case 2:
                    System.out.println("Silahkan masukan data Alamat yang baru.");
                    System.out.print("Alamat: ");
                    address = update.nextLine();
                    System.out.println("Data Berhasil Disimpan");
                    break;
                case 3:
                    System.out.println("Silahkan masukan data No Handphone yang baru.");
                    System.out.print("No Handphone: ");
                    phoneNumber = update.nextLine();
                    System.out.println("Data Berhasil Disimpan");
                    break;
                case 4:
                    System.out.println("Silahkan masukan data Tgl Lahir yang baru.");
                    System.out.print("Tgl Lahir: ");
                    birthDay = update.nextLine();
                    System.out.println("Data Berhasil Disimpan");
                    break;
                case 5:
                    System.out.println("Silahkan masukan data Status yang baru.");
                    System.out.print("Status: ");
                    status = update.nextLine();
                    System.out.println("Data Berhasil Disimpan");
                    break;
                case 6:
                    System.out.println("Silahkan masukan data No KTP yang baru.");
                    System.out.print("No KTP: ");
                    id = update.nextLine();
                    System.out.println("Data Berhasil Disimpan");
                    break;
                case 7:
                    break;
                default :
                    System.out.println("Data tidak tersedia, silahkan input ulang");
                    boolean repeat = true;

                    while (repeat)
                    {
                        System.out.println("Silahkan pilih data yang akan diupdate.");
                        System.out.print("Pilih: ");
                        data = input.nextInt();
                        switch (data)
                        {
                            case 1:
                                System.out.println("Silahkan masukan data Nama yang baru.");
                                System.out.print("Nama: ");
                                name = input.nextLine();
                                System.out.println("Data Berhasil Disimpan");
                                repeat = false;
                                break;

                            case 2:
                                System.out.println("Silahkan masukan data Alamat yang baru.");
                                System.out.print("Alamat: ");
                                address = input.nextLine();
                                System.out.println("Data Berhasil Disimpan");
                                repeat = false;
                                break;
                            case 3:
                                System.out.println("Silahkan masukan data No Handphone yang baru.");
                                System.out.print("No Handphone: ");
                                phoneNumber = input.nextLine();
                                System.out.println("Data Berhasil Disimpan");
                                repeat = false;
                                break;
                            case 4:
                                System.out.println("Silahkan masukan data Tgl Lahir yang baru.");
                                System.out.print("Tgl Lahir: ");
                                birthDay = input.nextLine();
                                System.out.println("Data Berhasil Disimpan");
                                repeat = false;
                                break;
                            case 5:
                                System.out.println("Silahkan masukan data Status yang baru.");
                                System.out.print("Status: ");
                                status = input.nextLine();
                                System.out.println("Data Berhasil Disimpan");
                                repeat = false;
                                break;
                            case 6:
                                System.out.println("Silahkan masukan data No KTP yang baru.");
                                System.out.print("No KTP: ");
                                id = input.nextLine();
                                System.out.println("Data Berhasil Disimpan");
                                repeat = false;
                                break;
                            case 7:
                                repeat = false;
                                break;
                            default:
                                repeat = true;
                                System.out.println("Data tidak tersedia, silahkan input ulang");
                                System.out.println(" ");
                        }
                    }
                    break;
            }
        } catch (Exception n) {
            System.out.println(n);
        }
    }

}

