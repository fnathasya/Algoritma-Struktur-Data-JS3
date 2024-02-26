public class PersegiPanjang {
    public int panjang, lebar;
    
    public void cetakInfo() {
        PersegiPanjang[] myArrayOfPersegiPanjang = new PersegiPanjang[100];
        myArrayOfPersegiPanjang[5].panjang = 20;
    }

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public  int hitungKeliling() {
        return  2*(panjang + lebar);
    }

    // public void PersegiPanjang () {
    //     panjang = panjang;
    //     lebar = lebar;
    // }
}
