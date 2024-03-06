/**
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
/* Jawaban : Secara konsep, ada yang kurang tepat pada program Asersi2 di atas tersebut. Contohnya, jika nilai inputan yang dimasukan bernilai negatif seharusnya output yang di keluarkan adalah "jari-jari tidak boleh nol!!!" bukan mengeluarkan output berupa nilai negatif dimana seharusnya ada penanganan kesalahan yang sesuai jika asersi gagal seperti memberikan pesan yang sudah dicontohnya di atas.
 */
