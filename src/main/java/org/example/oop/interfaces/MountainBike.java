package org.example.oop.interfaces;

public class MountainBike implements Bicycle {
    private Integer seatHeight;
    private Integer gear;
    private Integer speed;

    public MountainBike(Integer seatHeight, Integer gear, Integer speed) {
        this.seatHeight = seatHeight;
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public Integer getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(Integer seatHeight) {
        this.seatHeight = seatHeight;
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
