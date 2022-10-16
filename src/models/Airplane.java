package models;

import services.AirplaneService;
import services.impl.AirplaneServiceImpl;

public class Airplane extends Vehicle{
    private AirplaneService airplaneService = new AirplaneServiceImpl();
    public Airplane() {
    }

    public Airplane(String airplaneNumber, Integer seat, Integer speed) {
        super(airplaneNumber, seat, speed);
    }

    public void ride(){
        airplaneService.airRide(getSpeed());
    }
    public void seat(){
        airplaneService.seatPlace(getSeat());
    }
    public void transportName(){
        airplaneService.name(getVehicleNumber());
    }
}
