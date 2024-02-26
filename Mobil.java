public class Mobil {
    String plat;
    String jenis;
    double harga;

    public Mobil(String plat, String jenis, double harga) {
        this.plat = plat;
        this.jenis = jenis;
        this.harga = harga;
    }

    public String platNomor() {
        return plat;
    }

    public String jenisMobil() {
        return jenis;
    }

    public double hargaMobil() {
        return harga;
    }
}
