package models;

public abstract class Vehicle {
    private String vehicleNumber;
    private Integer seat;
    private Integer speed;

    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, Integer seat, Integer speed) {
        this.vehicleNumber = vehicleNumber;
        this.seat = seat;
        this.speed = speed;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
