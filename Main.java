package car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car GTR = new BWM();
        Car R8 = new Supra();

        CarUser razor = new CarUser(GTR);
        CarUser pablo = new CarUser(R8);

        while (true) {
            int pilih;
            System.out.println("[1] BMW GTR\n"
                    + "[2] Supra R8\n"+
                      "[0] Exit");
            System.out.print("Pilih Mobil>");
            pilih = input.nextInt();

            int aksi;
            if (pilih == 1) {
                System.out.println("<=== BMW ===>");
                while (true) {
                    System.out.println("=== APLIKASI INTERFACE ===");
                    System.out.println("[1] Nyalakan Mobil");
                    System.out.println("[2] Matikan Mobil");
                    System.out.println("[3] Menambah Kecepatan Mobil");
                    System.out.println("[4] Mengurangi Kecepatan Mobil");
                    System.out.println("[0] Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi> ");
                    aksi = input.nextInt();

                    if (aksi == 1) {
                        razor.turnOnEngine();
                    } else if (aksi == 2) {
                        razor.turnOffEngine();
                    } else if (aksi == 3) {
                        razor.increaseSpeed();
                    } else if (aksi == 4) {
                        razor.decreaseSpeed();
                    } else if (aksi == 0 ) {
                        System.exit(0);
                    } else {
                        System.out.println("Kamu memilih aksi yang salah!");
                    }
                }
            } else if (pilih == 2) {
                System.out.println("<=== SUPRA ===>");
                while (true) {
                    System.out.println("=== APLIKASI INTERFACE ===");
                    System.out.println("[1] Nyalakan Mobil");
                    System.out.println("[2] Matikan Mobil");
                    System.out.println("[3] Menambah Kecepatan Mobil");
                    System.out.println("[4] Mengurangi Kecepatan Mobil");
                    System.out.println("[0] Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi> ");
                    aksi = input.nextInt();

                    if (aksi == 1) {
                        pablo.turnOnEngine();
                    } else if (aksi == 2) {
                        pablo.turnOffEngine();
                    } else if (aksi == 3) {
                        pablo.increaseSpeed();
                    } else if (aksi == 4) {
                        pablo.decreaseSpeed();
                    } else if (aksi == 0) {
                        System.exit(0);
                    } else {
                        System.out.println("Kamu memilih aksi yang salah!");
                    }
                }
            }
            else if (pilih == 0){
                System.exit(0);
            }
            else {
                System.out.println("Mobil tidak tersedia");
            }
        }

        
        
        
        
        
    }
}
