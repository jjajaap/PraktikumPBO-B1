package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        if (isAdaPeluru()) {
            System.out.println("Siap menembak " + jumlah + " kali");
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru habis");
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        } else {
            System.out.println("Peluru habis");
        }
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Sedang menusuk");
        } else {
            System.out.println("Tidak sedang menusuk");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet dipasang");
    }
}
