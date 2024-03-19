import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}

// apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar akan terjadi eror, karena metode abstrak pada kelas BangunDatar yang seharusnya diimplementasikan di subclass atau inheritancenya yaitu pada kelas BujurSangkar tidak ada.