public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    public double hitungLuasPermukaan() {
        return (2 * alas.hitungLuas()) + (3 * alas.getAlas() * tinggiPrisma);
    }
}