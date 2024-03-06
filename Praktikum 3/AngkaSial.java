/**
 * File             : AngkaSial.java
 * Deskripsi        : Program penggunaan exception buatan sendiri
 *                    Pengenalan klausa 'throw' and 'throws'
 */
public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* Jawaban:

 *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 Baris 12 tidak dieksekusi. Pada contoh di atas, output yang dieksekusi hanya pada baris 18 karena inputan setelahnya yaitu angka 13 yang membuat baris 10 dieksekusi.
 Jadi, selama inputan yang dimasukkan dalam block try bukan 13 maka program akan terus mengeksekusi baris 12.

 *Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 Ya, baris 21 dieksekusi. Karena pada inputan kedua yang dimasukkan dalam block try adalah angka 13 sehingga program mengeksekusi baris 21 dan mengeluarkan message yang sesuai ditulis dalam program untuk mengeksekusi jika berada dalam condition baris 10.

 */