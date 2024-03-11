import java.util.Scanner;

public class MPrismaSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan nilai tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        System.out.print("Masukkan nilai tinggi prisma: ");
        double tinggiPrisma = scanner.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi);
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(segitiga, tinggiPrisma);

        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
        System.out.println("Luas permukaan prisma: " + prismaSegitiga.hitungLuasPermukaan());
        System.out.println("Volume prisma: " + prismaSegitiga.hitungVolume());

        scanner.close();
    }
}