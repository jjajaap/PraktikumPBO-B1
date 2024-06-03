/**
 * NAMA : IZAZAVA PUTRI ASARI
 * NIM  : 24060122120038
 */

public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();

    public String toString() {
        return this.getClass().getSimpleName();
    }
}