package services.impl;

import services.AirplaneService;

public class AirplaneServiceImpl implements AirplaneService {

    @Override
    public void airRide(Integer speed) {
        System.out.println("Вы летите со скоростью " + speed);
    }

    @Override
    public void seatPlace(Integer seat) {
        System.out.println("Ваше посадочное место " + seat + ". Спасибо что выбираете нас!");
    }

    @Override
    public void name(String vehicleNumber) {
        System.out.println("Названия самолота "+vehicleNumber);
    }
}
