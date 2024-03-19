// public class MLingkaran {
//     public static void main(String[] args) {
//         Lingkaran l = new Lingkaran(10.2);
//         System.out.println("Luas lingkaran dengan " + " jejari 10.2 satuan adalah " + l.hitungLuas());
//     }
// }

// Buatlah MLingkaran sedemikian hingga dapat menerima input jejari dari pengguna!
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan " + jejari + " satuan adalah " + l.hitungLuas());
    }
}