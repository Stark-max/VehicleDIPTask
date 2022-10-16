package services.impl;

import services.TrainService;

public class TrainServiceImpl implements TrainService {
    @Override
    public void groundRide(Integer speed) {
        System.out.println("Вы едете со скоростью " + speed);
    }

    @Override
    public void seatPlace(Integer seat) {
        System.out.println("Ваше посадочное место " + seat + " забронировано. Спасибо что выбираете нас!");
    }

    @Override
    public void name(String vehicleNumber) {
        System.out.println("Номер машины "+vehicleNumber);
    }
}
