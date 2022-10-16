package models;

import services.CarService;
import services.impl.CarServiceImpl;

public class Car extends Vehicle{
    private CarService carService = new CarServiceImpl();
    public Car() {
    }

    public Car(String carNumber, Integer seat, Integer speed) {
        super(carNumber, seat, speed);
    }

    public void ride(){
        carService.groundRide(getSpeed());
    }
    public void seat(){
        carService.seatPlace(getSeat());
    }
    public void wheel(){
        carService.newWheel();
    }
    public void transportName(){
        carService.name(getVehicleNumber());
    }
}
