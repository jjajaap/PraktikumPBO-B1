package bk.bukunonFiksi;

public class BukuNonFiksi {
    private String judul;
    private String penulis;
    private String tahunTerbit;
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public BukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek() {
        return subjek;
    }

    public void setSubjek(String subjek) {
        this.subjek = subjek;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void view() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Subjek: " + subjek);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
    }
}
