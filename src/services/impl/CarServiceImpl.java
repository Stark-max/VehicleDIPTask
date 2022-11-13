package services.impl;

import models.Airplane;
import models.Car;
import models.Train;
import services.CarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl implements CarService {


    @Override
    public void displayCar(ArrayList<Car> carArrayList) {
        for (Car car : carArrayList) {
            System.out.println("Номер машины: " + car.getNumber() + "\nПосадочные места: " + car.getSeat() + "\nМакс. скорость: " + car.getSpeed() + "\nВес машины: " + car.getWeight() + "\nЦвет машины: " + car.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        }
    }

    @Override
    public Car reserveCar(ArrayList<Car> carArrayList) {
        Scanner sc =new Scanner(System.in);
        for (Car car : carArrayList) {
            System.out.println("Номер машины: " + car.getNumber() + "\nПосадочные места(" + car.getSeat() + "): " + "0" + "\nМакс. скорость: " + car.getSpeed() + "\nВес машины: " + car.getWeight() + "\nЦвет машины: " + car.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");

        }
        System.out.println("Выберите машину: ");
        int transportChoose = sc.nextInt();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("Выберите посадочное место: ");
        int seatPlace = sc.nextInt();
        for (Car cars : carArrayList) {
            if (transportChoose == 1) {
                cars.setSeat(seatPlace);
                return cars;
            } else if (transportChoose == 2) {
                cars.setSeat(seatPlace);
                return cars;
            }
        }
        return null;
    }

    @Override
    public void displayReservationCar(Car car) {
        if (car != null) {
            System.out.println("Номер машины: " + car.getNumber() + "\nПосадочные места: " + car.getSeat() + "\nМакс. скорость: " + car.getSpeed() + "\nВес машины: " + car.getWeight() + "\nЦвет машины: " + car.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        } else {
            System.out.println("Вы не резервировали место в машине!");
        }
    }
}
