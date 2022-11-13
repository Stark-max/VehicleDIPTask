package services.impl;

import models.Train;
import services.TrainService;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainServiceImpl implements TrainService {
    @Override
    public void displayTrain(ArrayList<Train> trainArrayList) {
        for (Train train : trainArrayList) {
            System.out.println("Номер поезда: " + train.getNumber() + "\nПосадочные места: " + train.getSeat() + "\nМакс. скорость: " + train.getSpeed() + "\nВес поезда: " + train.getWeight() + "\nЦвет поезда: " + train.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        }
    }

    @Override
    public Train reserveTrain(ArrayList<Train> trainArrayList) {
        Scanner sc = new Scanner(System.in);
        for (Train train : trainArrayList) {
            System.out.println("Номер поезда: " + train.getNumber() + "\nПосадочные места(" + train.getSeat() + "): " + "0" + "\nМакс. скорость: " + train.getSpeed() + "\nВес поезда: " + train.getWeight() + "\nЦвет поезда: " + train.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");

        }
        System.out.println("Выберите поезд: ");
        int transportChoose = sc.nextInt();
        System.out.println("Выберите посадочное место: ");
        int seatPlace = sc.nextInt();
        for (Train trains : trainArrayList) {
            if (transportChoose == 1) {
                trains.setSeat(seatPlace);
                return trains;
            } else if (transportChoose == 2) {
                trains.setSeat(seatPlace);
                return trains;
            }
        }
        return null;
    }

    @Override
    public void displayReservationTrain(Train train) {
        if (train != null) {
            System.out.println("Номер поезда: " + train.getNumber() + "\nПосадочные места: " + train.getSeat() + "\nМакс. скорость: " + train.getSpeed() + "\nВес поезда: " + train.getWeight() + "\nЦвет поезда: " + train.getColor());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        } else {
            System.out.println("Вы не резервировали место в поезде!");
        }
    }
}
