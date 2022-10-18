package services.impl;

import services.CarService;

import java.util.Scanner;

public class CarServiceImpl implements CarService {
    @Override
    public void groundRide(Integer speed) {
        System.out.println("Вы едете со скоростью " + speed);
        try {
            Thread.sleep(10000);
            System.out.println("Вам нужно поменять колесо!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void seatPlace(Integer seat) {
        System.out.println("Ваше посадочное место " + seat + ". Спасибо что выбираете нас!");
    }

    @Override
    public void newWheel() {
        try {
            Thread.sleep(5000);
            System.out.println("Колесто успешно заменено!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void name(String vehicleNumber) {
        System.out.println("Номер машины "+vehicleNumber);
    }
}
