import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Array untuk menyimpan objek mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMahasiswa];

        // Menggunakan loop untuk membuat objek Mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan informasi untuk mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = input.next();

            System.out.print("NIM: ");
            String nim = input.next();

            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = input.next().charAt(0);

            System.out.print("IPK: ");
            double ipk = input.nextDouble();

            // Membuat objek Mahasiswa
            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        // Menampilkan informasi mahasiswa menggunakan foreach
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Jenis Kelamin: " + mahasiswa.getJenisKelamin());
            System.out.println("IPK: " + mahasiswa.getIpk());
            System.out.println();
        }

        // Menghitung rata-rata IPK
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("Rata-rata IPK: " + rataIpk);

        
    }
}

