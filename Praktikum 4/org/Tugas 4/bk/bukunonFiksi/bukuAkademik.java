package bk.bukunonFiksi;

public class BukuAkademik extends BukuNonFiksi {
    private String genre;

    public BukuAkademik(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit, "Akademik", jumlahHalaman, harga);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Genre: " + genre);
    }
}
