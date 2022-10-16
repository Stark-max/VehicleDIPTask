package models;

import services.TrainService;
import services.impl.TrainServiceImpl;

public class Train extends Vehicle{
    private TrainService trainService = new TrainServiceImpl();

    public Train() {
    }
    public Train(String trainNumber, Integer seat, Integer speed) {
        super(trainNumber, seat, speed);
    }

    public void ride(){
        trainService.groundRide(getSpeed());
    }
    public void seat(){
        trainService.seatPlace(getSeat());
    }
    public void transportName(){
        trainService.name(getVehicleNumber());
    }
}
