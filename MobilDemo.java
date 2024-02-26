import java.util.Scanner;

public class MobilDemo {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mobil: ");
        int jumlahMobil = input.nextInt();

        Mobil[] daftarMobil = new Mobil[jumlahMobil];

        for (int i = 0; i < jumlahMobil; i++) {
            System.out.println("Masukkan informasi untuk mobil ke-" + (i + 1));

            System.out.print("Plat: ");
            String plat = input.next();

            System.out.print("Jenis: ");
            String jenis = input.next();

            System.out.print("Harga: ");
            double harga = input.nextDouble();

            daftarMobil[i] = new Mobil(plat, jenis, harga);
        }

        System.out.println("=============");
        System.out.println("| DATA MOBIL |");
        System.out.println("==========================");
        for (Mobil mobil : daftarMobil) {
            System.out.println("Plat: " + mobil.platNomor());
            System.out.println("Jenis: " + mobil.jenisMobil());
            System.out.println("Harga: " + mobil.hargaMobil());
            System.out.println("==========================");
        }

    }
}
