/*
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.err.println("Keliling Lingkaran : " + bdg.hitungKeliling());
        System.err.println("Tipe Generic : " + bdg.get().getClass().getName());
    }
}

/**
 * Setelah melakukan perubahan pada parameter Generik 'T' menjadi 'T1', 'T2', atau 'T123, program tetap berfungsi dan berjalan dengan baik tanpa error. 
 * Nama untuk paramater Generik tidak berpengaruh terhadap perilaku program selama penggunaan paramater tersebut konsisten di seluruh source code.
 */