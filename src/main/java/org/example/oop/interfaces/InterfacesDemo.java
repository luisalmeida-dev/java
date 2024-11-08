package org.example.oop.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);

        System.out.println("Gear is: " + mountainBike.getGear());
        System.out.println("Seat height is: " + mountainBike.getSeatHeight());
        System.out.println("Bike Speed is: " + mountainBike.getSpeed());

        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brake is: " + mountainBike.getSpeed());

        mountainBike.speedUp(12);
        System.out.println("Bike speed after applying brake is: " + mountainBike.getSpeed());
    }
}
