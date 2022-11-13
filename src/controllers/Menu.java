package controllers;

import models.Airplane;
import models.Car;
import models.Train;
import services.AirplaneService;
import services.CarService;
import services.TrainService;
import services.impl.AirplaneServiceImpl;
import services.impl.CarServiceImpl;
import services.impl.TrainServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private AirplaneService airplaneService = new AirplaneServiceImpl();
    private CarService carService = new CarServiceImpl();
    private TrainService trainService = new TrainServiceImpl();
    private Car car;
    private Train train;
    private Airplane airplane;

    private ArrayList<Car> carArrayList = new ArrayList<>();
    private ArrayList<Train> trainArrayList = new ArrayList<>();
    private ArrayList<Airplane> airplaneArrayList = new ArrayList<>();

    public void console() {
        Scanner sc = new Scanner(System.in);
        Loading loading = new Loading();
        carArrayList.addAll(loading.initializeCar());
        trainArrayList.addAll(loading.initializeTrain());
        airplaneArrayList.addAll(loading.initializeAirplane());
        boolean active = true;
        while (active) {
            System.out.println("1.Вывод информации\n2.Резервирование посадочного места\n3.Удаление резервации\n4.Резервированный транспорт\n0.Выход");
            switch (sc.nextInt()) {
                case 1:
                    displayInfo();
                    break;
                case 2:
                    reserve();
                    textIndent();
                    break;
                case 3:
                    deleteReserve();
                    break;
                case 4:
                    displayReservation();
                    textIndent();
                    break;
                case 0:
                    active = false;
                    break;
                default:
                    System.out.println("Введите все повторно!");
                    console();
                    break;
            }
        }
    }

    public void displayReservation() {
        carService.displayReservationCar(car);
        trainService.displayReservationTrain(train);
        airplaneService.displayReservationAirplane(airplane);
    }


    public void deleteReserve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Машина\n2.Поезд\n3.Самолет\nВыберите транспорт: ");
        switch (sc.nextInt()) {
            case 1:
                this.car = null;
                break;
            case 2:
                this.train = null;
                break;
            case 3:
                this.airplane = null;
                break;
        }
    }


    public void reserve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Можно бранировать только по одному транспорту!");
        System.out.println("1.Машина\n2.Поезд\n3.Самолет\nВыберите транспорт: ");
        switch (sc.nextInt()) {
            case 1:
                this.car = carService.reserveCar(carArrayList);
                break;
            case 2:
                this.train = trainService.reserveTrain(trainArrayList);
                break;
            case 3:
                this.airplane = airplaneService.reserveAirplane(airplaneArrayList);
                break;
        }
    }


    public void displayInfo() {
        carService.displayCar(carArrayList);
        trainService.displayTrain(trainArrayList);
        airplaneService.displayAirplane(airplaneArrayList);
    }


    public void textIndent() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
    }
}


