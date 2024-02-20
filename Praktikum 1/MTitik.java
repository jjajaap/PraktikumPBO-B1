class MTitik {
    public static void main (String[] args){
    
    // deklarasi objek T1 dan T2 dari kelas Titik
    Titik T1  = new Titik();
    T1.setAbsis(1.0);
    T1.setOrdinat(2.0);

    Titik T2 = new Titik();
    T2.setAbsis(3.0);
    T2.setOrdinat(4.0);

    Titik T3 = new Titik(5,6);
//    T3.setAbsis(5.0);
//    T3.setOrdinat(6.0);

    System.out.println("Jumlah objek titik: " + T1.getCounterTitik());
    System.out.println("T1(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
    System.out.println("T1(" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
    System.out.println("T1(" + T3.getAbsis() + "," + T3.getOrdinat() + ")");
    }
}
