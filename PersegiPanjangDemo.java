import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Persegi Panjang : ");
        int jumlahPersegiPanjang = sc.nextInt();

        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        int panjang,lebar;

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang(i, i);

            System.out.println("Persegi Panjang ke-" + (i+1));
            System.out.print("Masukkan Panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("Persegi Panjang ke-" + (i+1) + ", Panjang : "
            + arrayOfPersegiPanjang[i].panjang + ", Lebar : " + arrayOfPersegiPanjang[i].lebar 
            + ", Luas : " + arrayOfPersegiPanjang[i].hitungLuas() + ", Keliling : " 
            + arrayOfPersegiPanjang[i].hitungKeliling());
        }

    }

}
