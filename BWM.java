package car;

public class BWM implements Car {

    int speed;
    boolean power;

    public BWM() {
        speed = 0;
        power = false;
    }

    public void engineOn() {
        if (power) {
            System.out.println("Mobil sudah menyala");
        } else {
            power = true;
            System.out.println("Menyalakan mobil");
            System.out.println("Mobil telah menyala");
        }
    }

    public void engineOff() {
        if (power) {
            power = false;
            System.out.println("Mematikan mobil");

        } else {
            System.out.println("Mesin mobil telah mati");
        }
    }

    public void increaseSpd() {
        if (power) {
            if (speed == MaxSpeed) {
                System.out.println("Mobil berada di kecepatan maksimum");
                System.out.println("Kecepatan Sekarang");
            } else {
                speed += 10;
                System.out.println("Menambah kecepatan mobil;");
                System.out.println("Kecepatan Mobil sekarang = " + speed + "Km/h");
            }
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu!!");
        }
    }

    public void decreaseSpd() {
        if (power) {
            if (speed == MinSpeed) {
                System.out.println("Kecepatan sekarang 0 Km/h");
            } else {
                speed -= 10;
                System.out.println("Mengurangi kecepatan mobil;");
                System.out.println("Kecepatan Mobil sekarang = " + speed + "Km/h");
            }
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu!!");
        }
    }

}
