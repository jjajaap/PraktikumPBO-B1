/**
 * NAMA : IZAZAVA PUTRI ASARI
 * NIM  : 24060122120038
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProgramUtama {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);

        SeaPlane sPlane = new SeaPlane();
        System.out.println(sPlane);

        Helicopter copter = new Helicopter();
        System.out.println(copter);

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());
        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());

        ArmadaKendaraan<Vehicle> armadaKendaraan = new ArmadaKendaraan<>();

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}