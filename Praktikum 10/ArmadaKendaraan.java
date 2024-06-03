/**
 * NAMA : IZAZAVA PUTRI ASARI
 * NIM  : 24060122120038
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan<T extends Vehicle> {
    private List<T> list = new ArrayList<>();

    // Menambahkan armada ke dalam daftar
    public void tambahArmada(Collection<? extends T> armada) {
        list.addAll(armada);
    }

    // Mengambil semua armada
    public List<T> getAllArmada() {
        return list;
    }
}