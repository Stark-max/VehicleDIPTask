package services.impl;

import models.Airplane;
import services.AirplaneService;

import java.util.ArrayList;
import java.util.Scanner;

public class AirplaneServiceImpl implements AirplaneService {

    @Override
    public void displayAirplane(ArrayList<Airplane> airplaneArrayList) {
        for (Airplane airplane : airplaneArrayList) {
            System.out.println("Название самолета: " + airplane.getNumber() + "\nПосадочные места: " + airplane.getSeat() + "\nМакс. скорость: " + airplane.getSpeed() + "\nВес самолета: " + airplane.getWeight() + "\nЦвет самолета: " + airplane.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        }
    }

    @Override
    public Airplane reserveAirplane(ArrayList<Airplane> airplaneArrayList) {
        Scanner sc = new Scanner(System.in);
        for (Airplane airplane : airplaneArrayList) {
            System.out.println("Название самолета: " + airplane.getNumber() + "\nПосадочные места(" + airplane.getSeat() + "): " + "0" + "\nМакс. скорость: " + airplane.getSpeed() + "\nВес самолета: " + airplane.getWeight() + "\nЦвет самолета: " + airplane.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        }
        System.out.println("Выберите самолет: ");
        int transportChoose = sc.nextInt();
        System.out.println("Выберите посадочное место: ");
        int seatPlace = sc.nextInt();
        for (Airplane airplanes : airplaneArrayList) {
            if (transportChoose == 1) {
                airplanes.setSeat(seatPlace);
                return airplanes;
            } else if (transportChoose == 2) {
                airplanes.setSeat(seatPlace);
                return airplanes;
            }
        }
        return null;
    }

    @Override
    public void displayReservationAirplane(Airplane airplane) {
        if (airplane != null) {
            System.out.println("Название самолета: " + airplane.getNumber() + "\nПосадочные места: " + airplane.getSeat() + "\nМакс. скорость: " + airplane.getSpeed() + "\nВес самолета: " + airplane.getWeight() + "\nЦвет самолета: " + airplane.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        } else {
            System.out.println("Вы не резервировали место в самолете!");
        }
    }
}
