package bk.main;

import bk.bukuFiksi.BukuNovel;
import bk.bukunonFiksi.BukuAkademik;

public class Main {
    public static void main(String[] args) {
        BukuNovel novel = new BukuNovel("Harry Potter", "J.K. Rowling", "2005", "Fantasy", 400, 25.0);
        novel.view();

        System.out.println();

        BukuAkademik akademik = new BukuAkademik("Introduction to Programming", "John Doe", "2022", "Computer Science", 300, 50.0);
        akademik.view();
    }
}