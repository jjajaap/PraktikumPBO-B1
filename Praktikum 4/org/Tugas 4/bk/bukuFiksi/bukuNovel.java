package bk.bukuFiksi;

public class BukuNovel extends BukuFiksi {

    public BukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Ini adalah sebuah novel.");
    }
}
